public class Ascendingarray {
    public static void main(String[] args) {


                int [] a = new int [] {10, 6, 18, 17, 19};
                int temp = 0;

                for (int i = 0; i < a.length; i++)
                {
                    for (int j = i+1; j < a.length; j++)
                    {
                        if(a[i] > a[j])
                        {
                            temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                        }
                    }
                }

                System.out.println("Elements of array sorted in ascending order: ");
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i] + " ");
                }
            }
        }

