package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.Answer;
import com.bztda.service.portal.employee.entity.Result;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface AnswerRepository extends PagingAndSortingRepository<Answer, Long> {

    List<Answer> findAllByQuestionId(Long id);

    List<Answer> findAllByResult(Result result);

    List<Answer> findAllByQuestionIdAndResult(Long id, Result result);

    Answer findByAnswerText(String answerText);

}
