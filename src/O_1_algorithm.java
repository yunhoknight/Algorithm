public class O_1_algorithm {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int index = 1;
        int result = O_1_algorithm(arr, index);

        System.out.println(result);
    }

    public static int O_1_algorithm(int[] arr, int index) {
        return arr[index];
    }
}