package qa_aq.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import qa_aq.api.domain.QuestionTag;

@Repository
public interface QuestionTagRepository extends JpaRepository<QuestionTag, Long> {
}
