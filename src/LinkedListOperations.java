//import java.util.LinkedList;
//public class LinkedListExample {
//    public static void main(String[] args) {
//        LinkedList<String> fruits = new LinkedList<>();
//        fruits.add("Яблоко");
//        fruits.add("Банан");
//        fruits.add("Вишня");
//        String firstElement = fruits.peekFirst();
//        System.out.println("Первый элемент: " + firstElement);
        import java.util.LinkedList;

        public class LinkedListOperations {
            public String getLastElement(LinkedList<String> list) {
                return list.peekLast();
            }
            public static void main(String[] args) {
                LinkedList<String> fruits = new LinkedList<>();
                fruits.add("Яблоко");
                fruits.add("Банан");
                fruits.add("Вишня");
                LinkedListOperations operations = new LinkedListOperations();
                String lastElement = operations.getLastElement(fruits);
                System.out.println("Последний элемент: " + lastElement);

    }
}
