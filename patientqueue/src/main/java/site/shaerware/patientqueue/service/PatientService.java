package site.shaerware.patientqueue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import site.shaerware.patientqueue.entity.Patient;
import site.shaerware.patientqueue.repo.PatientRepo;

@Service
public class PatientService {
	
	private final PatientRepo patientRepo;

	public List<Patient> findAll() {
		return patientRepo.findAll(Sort.by("time"));
	}

	@Autowired
	public PatientService(PatientRepo patientRepo) {
		this.patientRepo = patientRepo;
	}
}
