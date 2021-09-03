import java.util.List;

public class Doctor {
    private static int counter = 0;
    private int id = counter++;
    private TypeOfDoctor type;
    private int fee;

    public Doctor(int id, TypeOfDoctor type, int fee) {
        this.id = id;
        this.type = type;
        this.fee = fee;
    }

}
