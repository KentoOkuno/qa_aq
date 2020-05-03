package qa_aq.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import qa_aq.api.domain.QuestionDetailData;

import java.util.List;

@Repository
public interface QuestionDetailDataRepository extends JpaRepository<QuestionDetailData, Long> {
    @Query("from QuestionDetailData where questionDataId = :ID")
    public List<QuestionDetailData> findByQuestionDataId(@Param("ID")Long questionDataId);
}
