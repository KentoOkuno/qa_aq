package qa_aq.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import qa_aq.api.domain.QuestionData;
import qa_aq.api.domain.QuestionDetailData;
import qa_aq.api.repository.*;
import qa_aq.api.dto.QuestionDetailDataDto;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionListService {

    private final QuestionDataRepository questionListRepository;
    private final QuestionDetailDataRepository questionDetailDataRepository;

    public List<QuestionData> getAllQuestionList() {
        return questionListRepository.findAll();
    }
    public QuestionData save(QuestionData questionData) {
        return questionListRepository.save(questionData);
    }
    public QuestionDetailDataDto getQuestionDetailById(Long id) {
        QuestionData questionData= questionListRepository.findByQuestionDataId(id);
        List<QuestionDetailData> questionDetailDataList = questionDetailDataRepository.findByQuestionDataId(id);

        QuestionDetailDataDto questionDetailDataDto = new QuestionDetailDataDto();
        BeanUtils.copyProperties(questionData, questionDetailDataDto);
        questionDetailDataDto.setQuestionDetailDataList(questionDetailDataList);
        return questionDetailDataDto;
    }
}
