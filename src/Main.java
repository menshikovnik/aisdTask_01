public class Main {
    public static void main(String[] args) {
        Deque dq = new Deque(5);
        dq.addRear(1);
        dq.addRear(2);
        dq.addRear(7);
        dq.deleteFront();
        dq.addRear(7);
        dq.deleteFront();
        dq.addRear(7);
        dq.deleteFront();
        dq.addRear(7);
        dq.deleteFront();
        dq.addRear(7);
        dq.deleteFront();

        dq.addRear(5);
        dq.addRear(5);
        dq.addFront(10);
        dq.addRear(5);
        dq.deleteFront();
        dq.deleteFront();
        dq.addRear(5);
        dq.addRear(15);
        dq.addFront(11);
        dq.deleteRear();
        dq.addRear(5);
        dq.addRear(5);
        dq.addRear(5);
        dq.addRear(5);
    }
}