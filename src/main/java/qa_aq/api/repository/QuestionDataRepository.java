package qa_aq.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import qa_aq.api.domain.QuestionData;

import java.util.List;

@Repository
public interface QuestionDataRepository extends JpaRepository<QuestionData, Long> {

    @Query(name="QuestionData.findAll")
    public List<QuestionData> findAll();
//    @Query(name="QuestionData.findByQuestionDataId")
    @Query("from QuestionData where questionDataId = :ID")
    public QuestionData findByQuestionDataId(@Param("ID")Long id);
}
