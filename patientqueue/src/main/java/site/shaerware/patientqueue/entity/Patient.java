package site.shaerware.patientqueue.entity;


import org.hibernate.annotations.Subselect;
import org.springframework.data.annotation.Immutable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Immutable
@Subselect("select * from VIEW_INF_PANEL")
@IdClass(PatientId.class)
public class Patient {

	@Id
	@Column(name = "PATIENTS_ID")
	private Long id;
	@Id
	@Column(name = "TIME")
	@Temporal(TemporalType.TIME)
	private String time;
	@Column(name = "FIO")
	private String fio;
	@Column(name = "LABEL")
	private String label;
	@Column(name = "MED_NOM")
	private String medNom;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "STATE")
	private String state;
	
	public String getTime() {
		String hms = time.split(" ")[1];
		String hh = hms.split(":")[0];
		String mm = hms.split(":")[1];
		return hh + ":" + mm;
	}
	
}
