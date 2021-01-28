package com.bztda.service.portal.employee.service;

import com.bztda.service.portal.employee.entity.Hobbies;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class HobbiesService {

	public List<Hobbies> editMassHobbiesList(String[] hobbies) {
		List<Hobbies> hobbiesList = new ArrayList<>();
		for (String hobby : hobbies) {
			hobbiesList.add(Hobbies.builder()
					.hobby(hobby)
					.build());
		}
		return hobbiesList;
	}

}
