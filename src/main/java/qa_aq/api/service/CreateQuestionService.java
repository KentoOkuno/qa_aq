package qa_aq.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import qa_aq.api.domain.*;
import qa_aq.api.repository.*;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CreateQuestionService {

    private final QuestionDataRepository questionListRepository;
    private final QuestionTagRepository questionTagRepository;
    private final QuestionTypeRepository questionTypeRepository;


    public List<QuestionTag> getAllQuestionTag() {
        return questionTagRepository.findAll();
    }
    public List<QuestionType> getAllQuestionType() {
        return questionTypeRepository.findAll();
    }
    public QuestionData createQuestion(QuestionData questionData) {
        return questionListRepository.save(questionData);
    }
}
