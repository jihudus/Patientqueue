package site.shaerware.patientqueue.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PatientId implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String time;
}
