package site.shaerware.patientqueue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import site.shaerware.patientqueue.entity.Patient;
import site.shaerware.patientqueue.service.PatientService;

@Controller
public class PatientController {

	private final PatientService patientService;
	
	@GetMapping("/queue")
	public String getPatients(Model model) {
		List<Patient> patients = patientService.findAll();
		model.addAttribute("patients", patients);
		return "queue";
	}

	@Autowired
	public PatientController(PatientService patientService) {
		this.patientService = patientService;
	}
	
}
