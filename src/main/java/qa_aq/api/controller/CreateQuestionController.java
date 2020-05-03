package qa_aq.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import qa_aq.api.controller.request.CreateQuestionRequest;
import qa_aq.api.controller.response.QuestionTagResponse;
import qa_aq.api.controller.response.QuestionTypeResponse;
import qa_aq.api.domain.QuestionData;
import qa_aq.api.domain.QuestionTag;
import qa_aq.api.domain.QuestionType;
import qa_aq.api.service.CreateQuestionService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CreateQuestionController {

    private final CreateQuestionService createQuestionService;

    @GetMapping("/questionTag")
    public ResponseEntity<QuestionTagResponse> getQuestionTag() {
        List<QuestionTag> questionTagList = createQuestionService.getAllQuestionTag();
        QuestionTagResponse questionTagResponse= QuestionTagResponse.builder()
                .questionTag(questionTagList)
                .build();
        return new ResponseEntity<>(questionTagResponse, HttpStatus.OK);
    }

    @GetMapping("/questionType")
    public ResponseEntity<QuestionTypeResponse> getQuestionType() {
        List<QuestionType> questionTypeList = createQuestionService.getAllQuestionType();
        QuestionTypeResponse questionTypeResponse= QuestionTypeResponse.builder()
                .questionType(questionTypeList)
                .build();
        return new ResponseEntity<>(questionTypeResponse, HttpStatus.OK);
    }

     @PostMapping("/addQuestion")
    public ResponseEntity<HttpStatus> save(@RequestBody CreateQuestionRequest request) {
        QuestionData questionData = new QuestionData();
        BeanUtils.copyProperties(request, questionData);
//         LocalDateTime localDateTime = LocalDateTime.now();
//        questionData.setCreateDate(localDateTime);
         questionData.setUserId(1L);
        createQuestionService.createQuestion(questionData);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
