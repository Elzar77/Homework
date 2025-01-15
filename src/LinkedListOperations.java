//import java.util.LinkedList;
//public class LinkedListExample {
//    public static void main(String[] args) {
//        LinkedList<String> fruits = new LinkedList<>();
//        fruits.add("Яблоко");
//        fruits.add("Банан");
//        fruits.add("Вишня");
//        String firstElement = fruits.peekFirst();
//        System.out.println("Первый элемент: " + firstElement);
//import java.util.LinkedList;
//public class LinkedListOperations {
//    public String getLastElement(LinkedList<String> list) {
//        return list.peekLast();
//    }
//    public static void main(String[] args) {
//        LinkedList<String> fruits = new LinkedList<>();
//        fruits.add("Яблоко");
//        fruits.add("Банан");
//        fruits.add("Вишня");
//        LinkedListOperations operations = new LinkedListOperations();
//        String lastElement = operations.getLastElement(fruits);
//        System.out.println("Последний элемент: " + lastElement);
//import java.util.LinkedList;
//
//public class LinkedListOperations {
//
//    public boolean containsElement(LinkedList<String> list, String element) {
//        return list.contains(element);
//    }
//
//    public static void main(String[] args) {
//        LinkedList<String> fruits = new LinkedList<>();
//        fruits.add("Яблоко");
//        fruits.add("Банан");
//        fruits.add("Вишня");
//
//        LinkedListOperations operations = new LinkedListOperations();
//        boolean containsBanana = operations.containsElement(fruits, "Банан");
//        System.out.println(containsBanana ? "Элемент найден." : "Элемент не найден.");
//import java.util.LinkedList;
//
//public class LinkedListOperations {
//
//    public String[] convertToArray(LinkedList<String> list) {
//        return list.toArray(new String[0]);
//    }
//
//    public static void main(String[] args) {
//        LinkedList<String> fruits = new LinkedList<>();
//        fruits.add("Яблоко");
//        fruits.add("Банан");
//        fruits.add("Вишня");
//
//        LinkedListOperations operations = new LinkedListOperations();
//        String[] fruitsArray = operations.convertToArray(fruits);
//
//        System.out.println("Массив фруктов:");
//        for (String fruit : fruitsArray) {
//            System.out.println(fruit);
//        }
//import java.util.LinkedList;
//public class LinkedListOperations {
//    public boolean compareLists(LinkedList<String> list1, LinkedList<String> list2) {
//        return list1.equals(list2);
//    }
//    public static void main(String[] args) {
//        LinkedList<String> list1 = new LinkedList<>();
//        list1.add("Яблоко");
//        list1.add("Банан");
//        LinkedList<String> list2 = new LinkedList<>();
//        list2.add("Яблоко");
//        list2.add("Банан");
//        LinkedListOperations operations = new LinkedListOperations();
//        boolean areEqual = operations.compareLists(list1, list2);
//        System.out.println(areEqual ? "Списки одинаковые." : "Списки различаются.");
//import java.util.LinkedList;
//
//public class LinkedListOperations {
//
//    public boolean isEmpty(LinkedList<String> list) {
//        return list.isEmpty();
//    }
//
//    public static void main(String[] args) {
//        LinkedList<String> fruits = new LinkedList<>();
//
//        LinkedListOperations operations = new LinkedListOperations();
//        boolean empty = operations.isEmpty(fruits);
////        System.out.println(empty ? "Список пуст." : "Список не пуст.");
//import java.util.LinkedList;
//public class LinkedListOperations {
//    public void replaceElement(LinkedList<String> list, int index, String newElement) {
//        if (index >= 0 && index < list.size()) {
//            list.set(index, newElement);
//        }
//    }
//    public static void main(String[] args) {
//        LinkedList<String> fruits = new LinkedList<>();
//        fruits.add("Яблоко");
//        fruits.add("Банан");
//        fruits.add("Вишня");
//        LinkedListOperations operations = new LinkedListOperations();
//        operations.replaceElement(fruits, 2, "Апельсин");
//        System.out.println("Обновленный список:");
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
//    }
//}

