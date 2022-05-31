public class Rversarray {

        public static void main(String[] args) {
            int [] a= new int [] {1, 22, 38, 68, 97};

            System.out.println("Array in reverse order: ");

            for (int i = a.length-1; i >= 0; i--)
            {
                System.out.print(a[i] + " ");
            }
        }
    }
