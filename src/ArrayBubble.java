public class ArrayBubble {

    private long[] a;
    private int elements;

    public ArrayBubble(int max) {
        a = new long[max];
        elements = 0;
    }

    public void into(long value) {

        a[elements] = value;
        elements++;
    }

    public void printer() {

        for (int i = 0; i < elements; i++) {
            System.out.print(a[i] + " ");
            System.out.println(" ");

        }
        System.out.println("----Окончание вывода массива----");
    }

    private void toSwap(int first, int second) {
        long dummy = a[first];
        a[first] = a[second];
        a[second] = dummy;

    }

    public void bubbleSort() {
        for (int out = elements - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (a[in] > a[in + 1])
                    toSwap(in, in + 1);
            }
        }
    }

}
