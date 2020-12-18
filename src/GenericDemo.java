class Maximum {
    public static < E extends Comparable < E >> E max(E[] list) {
        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(max) > 0) {
                max = list[i];
            }
        }
        return max;
    }
}
public class GenericDemo {
    public static void main(String[] a) {
        Integer[] arr = {10,9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Max:" + Maximum.max(arr));
        Float[] arr1 = {1.1f, 10.4f, 3.5f, 5.5f};
        System.out.println("Max:" + Maximum.max(arr1));
    }
}