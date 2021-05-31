package ma.emsi.ProjetSpringMVC.web;

import ma.emsi.ProjetSpringMVC.dao.PatientRepository;
import ma.emsi.ProjetSpringMVC.entities.Patient;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestPatientController{
	
	@Autowired
	private PatientRepository patientRepository;
	
	@GetMapping(path = "/listPatients")
	public List<Patient> list(){
		return patientRepository.findAll();
	}
	@GetMapping(path = "/patients/{id}")
	public Patient getOne(@PathVariable Long id){
		return patientRepository.findById(id).get();
	}
}
