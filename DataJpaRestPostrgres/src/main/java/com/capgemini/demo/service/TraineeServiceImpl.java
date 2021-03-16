package com.capgemini.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.demo.entity.Trainee;
import com.capgemini.demo.repository.TraineeDao;

/**
 * @author AKASH
 *
 */
@Service("service") // TraineeServiceImpl service=new TraineeServiceImpl()
@Transactional
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	TraineeDao dao;

	public Trainee addTrainee(Trainee trainee) {
		return dao.save(trainee);
	}

	public Trainee updateTrainee(Trainee trainee) {
		return dao.save(trainee);
	}

	public void removeTrainee(int traineeId) {
		dao.deleteById(traineeId);
	}

	public Optional<Trainee> getTraineeById(int traineeId) {
		return dao.findById(traineeId);
	}

	public List<Trainee> getAllTrainees() {

		return dao.findAll();
	}

	public List<Trainee> getAllTraineesByBatchName(String batchName) {

		return dao.findByTraineeBatch(batchName);
	}

	public List<Trainee> getAllTraineesByName(String traineeName) {
		return dao.findByTraineeName(traineeName);
	}

	@Override
	public List<Trainee> getIdBetween(Integer initialid, Integer finalid) {
		// TODO Auto-generated method stub
		return dao.findByTraineeIdBetween(initialid, finalid);
	}

	@Override
	public List<Trainee> getByIdGreater(int trainneId) {
		// TODO Auto-generated method stub
		return dao.findByTraineeIdGreaterThan(trainneId);
	}

	@Override
	public List<Trainee> getByNameLike(String traineeName) {
		// TODO Auto-generated method stub
		return dao.findByTraineeNameLike(traineeName);
	}


}
