package qa_aq.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import qa_aq.api.controller.request.CreateQuestionRequest;
import qa_aq.api.controller.response.QuestionListResponse;
import qa_aq.api.controller.response.QuestionListResponse;
import qa_aq.api.domain.QuestionData;
import qa_aq.api.dto.QuestionDetailDataDto;
import qa_aq.api.service.QuestionListService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AnswerViewController {

    private final QuestionListService questionListService;

    @GetMapping("/getDetailQuestionData/{id}")
    public ResponseEntity<QuestionListResponse> getDetailQuestion(@PathVariable("id") Long id) {
        QuestionDetailDataDto questionDetailDataDto = questionListService.getQuestionDetailById(id);
        QuestionListResponse questionListResponse = QuestionListResponse.builder()
                .questionDetailDataDto(questionDetailDataDto)
                .build();
        return new ResponseEntity<>(questionListResponse, HttpStatus.OK);
    }

    @PostMapping("/answer")
    public ResponseEntity<HttpStatus> save(@RequestBody CreateQuestionRequest request) {
        QuestionData questionData = new QuestionData();
        BeanUtils.copyProperties(request, questionData);
//         LocalDateTime localDateTime = LocalDateTime.now();
//        questionData.setCreateDate(localDateTime);
        questionData.setUserId(1L);
//        questionListService.createQuestion(questionData);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
