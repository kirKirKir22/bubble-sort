public class Main {
    public static void main(String[] args) {

        ArrayBubble array= new ArrayBubble(5);

        array.into(100);
        array.into(90);
        array.into(80);
        array.into(70);
        array.into(60);

        array.printer();
        array.bubbleSort();
        array.printer();

    }
}