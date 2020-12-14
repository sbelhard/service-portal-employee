package com.bztda.service.portal.employee.service;

import com.bztda.service.portal.employee.dto.QuestionDto;
import com.bztda.service.portal.employee.entity.Question;
import com.bztda.service.portal.employee.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private AnswerService answerService;

	public void save(Question question) {
		questionRepository.save(question);
	}

	public List<Question> findAll() {
		return StreamSupport.stream(questionRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}

	public void delete(Question question) {
		questionRepository.delete(question);
	}

	public Page<Question> findByPaginated(Pageable pageable, List<Question> questions) {
		return null;
	}

	public void updateQuestion(String oldTextQuestion, String newTextQuestion) {
		Question question = questionRepository.findByQuestion(oldTextQuestion);
		question.setQuestion(newTextQuestion);
		questionRepository.save(question);
	}

	public List<QuestionDto> getQuestionRound() {
		List<QuestionDto> questionDtoList = new ArrayList<>();
		List<Question> questions = (List<Question>) questionRepository.findAll();
		Set<Integer> randomNumberQuestion = getRandomNumberQuestion();
		int numberQuestion;
		while (randomNumberQuestion.iterator().hasNext()) {
			numberQuestion = randomNumberQuestion.iterator().next();
			randomNumberQuestion.remove(numberQuestion);
			questionDtoList.add(editQuestionQuestionDto(questions, numberQuestion));
		}
		return questionDtoList;
	}

	public Set<Integer> getRandomNumberQuestion() {
		int number;
		Set<Integer> randomNumberQuestions = new HashSet<>();
		int qualityQuestion = 3;
		List<Question> questionsList = findAll();
		for (int i = 0; i < qualityQuestion; i++) {
			number = (int) (Math.random() * ((questionsList.size() - 1) + 1) + 0);
			boolean resultAddRandomNumber = randomNumberQuestions.add(number);
			if (!resultAddRandomNumber) {
				i--;
			}
		}
		return randomNumberQuestions;
	}

	public QuestionDto editQuestionQuestionDto(List<Question> questions, int numberQuestion) {
		return QuestionDto.builder()
				.id(questions.get(numberQuestion).getId())
				.question(questions.get(numberQuestion).getQuestion())
				.listAnswerDto(answerService.editAnswerAnswerDto(questions, numberQuestion))
				.build();
	}
}