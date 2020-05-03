package qa_aq.api.controller.request;

import lombok.Data;

@Data
public class CreateQuestionRequest {
    public String questionName;
    public Long tagMasterId;
    public Long questionTypeId;
    public String questionStatement;
}