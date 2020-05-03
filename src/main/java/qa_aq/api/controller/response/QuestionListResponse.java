package qa_aq.api.controller.response;

import lombok.Builder;
import lombok.Getter;
import qa_aq.api.domain.QuestionData;
import qa_aq.api.dto.QuestionDetailDataDto;

import java.util.List;

@Getter
@Builder
public class QuestionListResponse {
    private List<QuestionData> questionData;
    private QuestionDetailDataDto questionDetailDataDto;
}
