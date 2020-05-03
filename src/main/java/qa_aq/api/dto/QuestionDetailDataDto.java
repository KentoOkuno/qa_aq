package qa_aq.api.dto;

import lombok.Getter;
import lombok.Setter;
import qa_aq.api.domain.QuestionDetailData;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Setter
@Getter
public class QuestionDetailDataDto {

    /** 自動採番ID */
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long questionListId;

    /** 問題名称 */
    private String questionName;

    /** 問題文 */
    private String questionStatement;

    /** タグID */
    private Long tagMasterId;

    /** タグ名 */
    private Long tagMasterName;

    /** 種類ID */
    private Long questionTypeId;

    /** 種類ID */
    private Long questionTypeName;

    /** ユーザーID */
    private Long userId;

    /** 作成日時 */
    private String createDate;

    /** 更新日時 */
    private String updateDate;

    /** 回答文_子クラス */
    List<QuestionDetailData> questionDetailDataList;
}
