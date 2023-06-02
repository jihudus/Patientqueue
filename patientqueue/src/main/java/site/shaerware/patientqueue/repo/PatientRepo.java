package site.shaerware.patientqueue.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import site.shaerware.patientqueue.entity.Patient;
import site.shaerware.patientqueue.entity.PatientId;

public interface PatientRepo extends JpaRepository<Patient, PatientId> {

	
}
