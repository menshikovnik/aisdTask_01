public class Deque {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public Deque(int size) {
        arr = new int[size];
        front = 0;
        rear = 0;
        this.size = arr.length - 1;
    }

    public void addFront(int value) {
        if (!isFull()) {
            if (front == 0 && arr[front] != 0) {
                front = size;
                arr[front] = value;
                return;
            }
            if (front != 0) front--;
            if (isEmpty(front)) {
                arr[front] = value;
            }
        } else System.err.println("Переполнение");
    }

    public void addRear(int value) {
        if (!isFull()) {

            if (isEmpty(rear)) {
                arr[rear] = value;
                if (rear != size) {
                    rear++;
                } else if (isEmpty(0)) {
                    rear = 0;
                }
            }
        } else System.err.println("Переполнение");
    }

    public void deleteFront() {
        if (!isEmpty(front)) {
            arr[front] = 0;
            if (front != size) {
                front++;
            } else front = 0;
        }
    }

    public void deleteRear() {
        if (!isEmpty(rear)) {
            arr[rear] = 0;
            rear--;
        }
        if (rear == 0) {
            rear = size - 1;
            arr[rear] = 0;
            rear--;
        }
    }

    private boolean isEmpty(int x) {
        return arr[x] == 0;
    }

    private boolean isFull() {
        for (int value : arr) {
            if (value == 0) {
                return false;
            }
        }
        return true;
    }
}
