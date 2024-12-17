public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (arr.length > 0 && 5 < arr.length) { //Check before accessing
            System.out.println(arr[4]); // Access the last element
        } else {
            System.out.println("Array is empty or index is out of bounds");
        }
    }
}