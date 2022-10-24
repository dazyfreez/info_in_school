public class Patient {
    private String name;
    private Patient nextPatient;
    public Patient(String name) {
        this.name = name;
        this.nextPatient = null;
    }
    public void setNextPatient(Patient p) {
        this.nextPatient = p;
    }
    public Patient getNextPatient() {
        return this.nextPatient;
    }
    public String getName() {
        return this.name;
    }
    public static void main(String[] args) {
        Patient p1 = new Patient("John");
        Patient p2 = new Patient("Jane");
        Patient p3 = new Patient("Jack");
        p1.setNextPatient(p2);
        p2.setNextPatient(p3);
        System.out.println(p1.getNextPatient().getName());
        System.out.println(p2.getNextPatient().getName());
    }
    public String toString() {
        return this.name;
    }
}
