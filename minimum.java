public class Smallest {
    public static void main(String[] args){

        int[] a = new int[]{58, 67, 36, 48, 16};

        int min = a[0];

        for (int i = 0; i< a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println("Largest element  in given array: " + min);
    }

}
