public class A2Q1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{2, 8, 52, 10, 80, 45, 12, 55, 15, 88};
        int[] array2 = array1;
        for (int element: array1){
            System.out.println(element);
        }
        array1[2] = 32;
        // Changing 3rd element of the first array will change the same element of second array because second array is
        // defined as the reference of the first array. At the bottom layer, both arrays point to same memory addresses.
        for (int element: array2){
            System.out.println(element);
        }
    }
}
