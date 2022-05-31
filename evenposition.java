public class Evenposition
{
    public static void main(String[] args)
    {

            int[] a = new int[]{10, 12, 26, 39, 18,21};

            System.out.println("Elements of given array present on even position: ");

            for (int i = 1; i < a.length; i = i + 2) {
                System.out.println(a[i]);
            }
        }
    }