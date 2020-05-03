package qa_aq.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import qa_aq.api.controller.response.QuestionListResponse;
import qa_aq.api.domain.QuestionData;
import qa_aq.api.service.QuestionListService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class QuestionListController {

    private final QuestionListService questionListService;

//    @GetMapping("/")
//    public ResponseEntity<QuestionListResponse> getAllQuestionList() {
//        List<QuestionData> questionData = questionListService.getAllQuestionList();
//        QuestionListResponse questionListResponse = QuestionListResponse.builder()
//                .questionData(questionData)
//                .build();
//        return new ResponseEntity<>(questionListResponse, HttpStatus.OK);
//    }

    @GetMapping("/questionDataList")
    public ResponseEntity<QuestionListResponse> getQuestionList() {
        List<QuestionData> questionData = questionListService.getAllQuestionList();
        QuestionListResponse questionListResponse = QuestionListResponse.builder()
                .questionData(questionData)
                .build();
        return new ResponseEntity<>(questionListResponse, HttpStatus.OK);
    }
//    @PostMapping("/")
//    public ResponseEntity<HttpStatus> save(@RequestBody QuestionListRequest questionListRequest) {
//        QuestionData questionData = new QuestionData();
//        BeanUtils.copyProperties(questionData, questionListRequest);
//        questionListService.save(questionData);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }
}
