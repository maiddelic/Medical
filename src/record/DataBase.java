package record;

import java.util.ArrayList;
import java.util.HashMap;

import Authorities.Doctor;
import Authorities.Patient;

public class DataBase {
	private HashMap<String ,ArrayList<MedicalRecord>> map;
	
	
	public DataBase(){
	map = new HashMap<String, ArrayList<MedicalRecord>>();
	
	}
	
	public void addMedicalRecord(MedicalRecord record){
		if(record.getPatient() == null){
			System.out.println("Patienten kan inte hittas");
			return;
		}
		String id = record.getPatient().getId();
		if(map.get(id) == null){
			ArrayList<MedicalRecord> newArray = new ArrayList<MedicalRecord>();
			newArray.add(record); //sätter in medicalrecord i array
			map.put(id, newArray);
		}else{
		map.get(id).add(record);
		}
	}
	public MedicalRecord getMedicalRecord(Patient patient, Doctor doctor){
		if(map.get(patient.getId()) == null){
			System.out.println("Patienten finns ej");
			return null;
		}else{
			ArrayList<MedicalRecord> temp = map.get(patient);
			for(int i = 0; i < temp.size(); i++){
				if(temp.get(i).getDoctor().equals(doctor)){
					System.out.println("returnerar record");
					return temp.get(i);
				}
			}
			System.out.println("Journalen finns ej");
			return null;
		}
			
	}
	
}
