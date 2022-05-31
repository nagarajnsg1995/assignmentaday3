public class Largest {
    public static void main(String[] args) {
        int[] a = new int[]{10, 67, 6, 48, 16};

        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("Largest element  in given array: " + max);
    }
}