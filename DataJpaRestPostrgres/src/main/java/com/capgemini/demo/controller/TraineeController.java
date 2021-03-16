package com.capgemini.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.demo.entity.Trainee;
import com.capgemini.demo.service.TraineeServiceImpl;

@RestController
@RequestMapping("/trainee")//optional
public class TraineeController {//http://localhost:1234/trainee/getTrainee/123

	@Autowired
	TraineeServiceImpl service;
	@GetMapping("/getTrainee/{tid}")//mand//json
	public Optional<Trainee> getTraineeById(@PathVariable("tid") int traineeId)
		{
		System.out.println(service.getTraineeById(traineeId));
			return service.getTraineeById(traineeId);
		}
	//@RequestMapping(value="/addTrainee",method =RequestMethod.POST)//mand//json
	@PostMapping("/addTrainee")//http://localhost:1234/trainee/addTrainee
	public Trainee addTrainee(@RequestBody Trainee trainee)//get,post,put,delete
		{
		return service.addTrainee(trainee);
			
		}
	@PutMapping("/updateTrainee")//http://localhost:1234/trainee/updateTrainee
	public Trainee updateTrainee(@RequestBody Trainee trainee)//get,post,put,delete
		{
		return service.updateTrainee(trainee);
			
		}
	@DeleteMapping("/deleteTrainee/{tid}")//http://localhost:1234/trainee/updateTrainee
	public String deleteTrainee(@PathVariable("tid") int traineeId)//get,post,put,delete
		{
		 service.removeTrainee(traineeId);
		 return "deleted successfully";
		}
	@GetMapping("/getAllTrainees")//http://localhost:1234/trainee/updateTrainee
	public List<Trainee> fetchAllTrainees()//get,post,put,delete
		{
		return service.getAllTrainees();
		}
	@GetMapping("/getAllBatchName/{batchName}")//http://localhost:1234/trainee/updateTrainee
	public List<Trainee> fetchAllTraineesByBatchName(@PathVariable("batchName") String batchName )//get,post,put,delete
		{
		return service.getAllTraineesByBatchName(batchName);
		}
	@GetMapping("/getAllByName/{traineeName}")//http://localhost:1234/trainee/updateTrainee
	public List<Trainee> fetchAllTraineesByName(@PathVariable("traineeName") String traineeName )//get,post,put,delete
		{
		return service.getAllTraineesByName(traineeName);
		}
	@GetMapping("/getByBetween/{intialid}/{finalid}")
	public List<Trainee> getidbetween(@PathVariable("intialid")Integer initialid,@PathVariable("finalid")Integer finalid)
	{
		return service.getIdBetween(initialid, finalid);
	}
	@GetMapping("/getByGreaterID/{traineeId}")
	public List<Trainee> getByGreaterId(@PathVariable("traineeId") int traineeId)
	{
		return service.getByIdGreater(traineeId);
	}
	@GetMapping("/getByNameLike/{traineeName}")
	public List<Trainee> getByNameLike(@PathVariable("traineeName") String traineeName)
	{
		return service.getByNameLike(traineeName);
	}
}
