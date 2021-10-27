package com.bztda.service.portal.employee.service;

import com.bztda.service.portal.employee.dto.AnswerDto;
import com.bztda.service.portal.employee.dto.QuestionDto;
import com.bztda.service.portal.employee.entity.Answer;
import com.bztda.service.portal.employee.entity.Question;
import com.bztda.service.portal.employee.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Service
public class AnswerService {

	@Autowired
	private AnswerRepository answerRepository;

	public void save(Answer answer) {
		answerRepository.save(answer);
	}

	public List<Answer> findAll() {
		return StreamSupport.stream(answerRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}

	public void delete(Answer answer) {
		answerRepository.delete(answer);
	}

	public Page<Answer> findByPaginated(Pageable pageable, List<Answer> answers) {
		return null;
	}

	public List<AnswerDto> editAnswerAnswerDto(List<Question> questions, int numberQuestion) {
		List<AnswerDto> listAnswerDto = new ArrayList<>();
		List<Answer> answersQuestion = answerRepository.findAllByQuestionId(questions.get(numberQuestion).getId());
		for (Answer answer : answersQuestion) {
			AnswerDto answerDto = AnswerDto.builder()
					.id(answer.getId())
					.answer(answer.getAnswerText())
					.result(answer.getResult())
					.build();
			listAnswerDto.add(answerDto);
		}
		return listAnswerDto;
	}

	public void editAnswerDtoAnswerAndSave(QuestionDto questionDto, Question question) {
		for (AnswerDto answerDto : questionDto.getListAnswerDto()) {
			answerRepository.save(Answer.builder()
					.answerText(answerDto.getAnswer())
					.result(answerDto.getResult())
					.question(question)
					.build());
		}
	}
}