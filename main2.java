class main2 {
    static int summation(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int result = summation(arr);
        System.out.println(result);
    }
}