package qa_aq.api.controller.response;

import lombok.Builder;
import lombok.Getter;
import qa_aq.api.domain.QuestionTag;

import java.util.List;

@Getter
@Builder
public class QuestionTagResponse {
    private List<QuestionTag> questionTag;
}
