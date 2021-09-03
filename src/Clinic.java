import java.util.List;

public class Clinic {
    private List<Patient> patients;
    private List<Doctor> doctors;


    public Clinic(List<Patient> patients) {
        this.patients = patients;
        this.doctors = doctors;

    }

    public void addPatient(String name, boolean isLoyal, TypeOfProc type) {
        Patient patient = new Patient(patients.size() + 1, "teszt", isLoyal, TypeOfProc.SURGERY);
        patient.biggerThanThree();
        patients.add(patient);

    }
    public void addDoctors(int id, TypeOfDoctor type, int fee){
        Doctor doctor = new Doctor(doctors.size()+1, TypeOfDoctor.DENTIST, 2000);
        doctors.add(doctor);
    }

    public void addProcToPatient(){


    }

    public void addPatientToDoc(){

    }


}
