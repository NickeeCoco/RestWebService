package com.nickeecoco.restws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.nickeecoco.restws.data.Patient;

@Path("/patientservice")
public interface PatientService {
	
	@Path("/patients")
	@GET
	List<Patient> getPatients();
	
}
