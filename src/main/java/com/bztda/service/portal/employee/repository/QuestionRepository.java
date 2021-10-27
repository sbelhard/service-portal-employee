package com.bztda.service.portal.employee.repository;


import com.bztda.service.portal.employee.entity.Question;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;


@Repository
public interface QuestionRepository extends PagingAndSortingRepository<Question, Long> {

    Optional<Question> findById(Long id);

    Question findByQuestion(String textQuestion);

}
