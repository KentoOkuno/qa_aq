package qa_aq.api.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class QuestionDetailData {
    /** ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionDetailDataId;
    /** 質問データテーブルID */
    private Long questionDataId;
    /** 回答文 */
        private String answerStatement;
    /** 正解フラグ */
    private Long correctFlag;
}
