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
public class QuestionType {

    /** 自動採番ID */
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionTypeId;

    /** 問題タイプ */
    private String questionType;
}
