public class Warteschlange {
    public static void main(String[] args) {
        // this is a queue
        // it is a first in first out data structure
        enqueue(new Patient("John"));
    }
    private Patient head;
    private Patient tail;
    public Warteschlange() {
        head = null;
        tail = null;
    }
    public void enqueue(Patient p) {
        if (head == null) {
            head = p;
            tail = p;
        } else {
            tail = p;
        }


    }
    public Patient dequeue() {
        if (head == null) {
            return null;
        } else {
            Patient p = head;
            head = head.getNextPatient();
            return p;
        }
    }
    public boolean isEmpty() {
        return head == null;
    }

}
