import java.util.ArrayList;
import java.util.List;

public class Patient {
    private static int counter = 0;
    private int id = counter++;
    private String name;
    private boolean isLoyal;
    private static int visit = 0;
    private int visitTime = visit++;
    private TypeOfProc type;


    public int getId() {
        return id;
    }

    public Patient(int id, String name, boolean isLoyal, int visitTime, TypeOfProc type) {
        this.name = name;
        this.isLoyal = isLoyal;
        //this.visitTime = visitTime;
        this.type = type;
    }

    /*public void displayPatient() {
        for (Patient patient : patients) {
            System.out.println(patient.toString());
        }

    }*/
    public void biggerThanThree(){
        if (visitTime> 3) {
            setLoyal(true);

        }else {
            setLoyal(false);
        }
    }

    public TypeOfProc getType() {
        return type;
    }

    public void setType(TypeOfProc type) {
        this.type = type;
    }
    /*public int discount() {
        if(counter> 3 && counter< 5){


        }else if(counter> 5){

        }else {
            isLoyal = false;
        }

    }*/

    public boolean isLoyal() {
        return isLoyal;
    }

    public void setLoyal(boolean loyal) {
        isLoyal = loyal;
    }

    /*@Override
    public String toString(){
        return name + " " + String.valueOf(id) + " " + String.valueOf(isLoyal) + " " + String.valueOf(counter);

    }*/


}
