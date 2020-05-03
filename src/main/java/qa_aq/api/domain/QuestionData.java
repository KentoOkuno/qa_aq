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
public class QuestionData {

    /** 自動採番ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionDataId;

    /** 問題名称 */
    private String questionName;

    /** 問題文 */
    private String questionStatement;

    /** タグID */
    private Long tagMasterId;

    /** 種類ID */
    private Long questionTypeId;

    /** ユーザーID */
    private Long userId;

    /** 作成日時 */
    private String createDate;

    /** 更新日時 */
    private String updateDate;
}
