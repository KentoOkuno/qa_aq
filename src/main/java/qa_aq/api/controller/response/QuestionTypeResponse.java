package qa_aq.api.controller.response;

import lombok.Builder;
import lombok.Getter;
import qa_aq.api.domain.QuestionType;

import java.util.List;

@Getter
@Builder
public class QuestionTypeResponse {
    private List<QuestionType> questionType;
}
