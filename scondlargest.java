public class Secondlargarray {
    public static void main(String[] args) {



                int b, position;
                int a[] = {10, 20, 25, 63, 96, 57};
                position = a.length;

                for(int i = 0; i<position; i++ )
                {
                    for(int j = i+1; j<position; j++)
                    {
                        if(a[i]>a[j])
                        {
                            b = a[i];
                            a[i] = a[j];
                            a[j] = b;
                        }
                    }
                }
                System.out.println("second largest number is: "+a[position-2]);
            }
        }


