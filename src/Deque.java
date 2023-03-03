public class Deque {
    private final int[] arr;
    private int front;
    private int rear;
    private final int size;

    public Deque(int size) {
        arr = new int[size];
        front = 0;
        rear = -1;
        this.size = arr.length - 1;
    }

    public void addFront(int value) {
        if (!isFull()) {
            if (front == 0 && arr[front] != 0 && isEmpty(size)) {
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
            if (rear == 0 && isEmpty(0)) {
                arr[rear] = value;
                return;
            }
            if (rear != size) {
                rear++;
            } else if (isEmpty(0)) {
                rear = 0;
            }
            if (isEmpty(rear)) {
                arr[rear] = value;
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
        if (rear == 0 && !isEmpty(rear)) {
            arr[rear] = 0;
            if (!isEmpty(size)) {
                rear = size;
                return;
            }
        }
        if (!isEmpty(rear)) {
            arr[rear] = 0;
            rear--;
        }
        if (rear == -1) {
            rear = size;
        }
    }

    private boolean isEmpty(int x) {
        return x >= 0 && arr[x] == 0;
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
