package com.capgemini.demo.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.demo.entity.Trainee;

public interface TraineeService {

		Trainee addTrainee(Trainee trainee);

		Trainee updateTrainee(Trainee trainee);

		void removeTrainee(int traineeId);

		Optional<Trainee> getTraineeById(int traineeId);

		List<Trainee> getAllTrainees();
		
		List<Trainee> getIdBetween(Integer initialid, Integer finalid);
		
		List<Trainee> getByIdGreater(int trainneId);
		
		List<Trainee> getByNameLike(String traineeName);

	
}
