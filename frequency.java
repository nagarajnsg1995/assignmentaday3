import java.util.*;
public class Frequency {

    public static void main(String[] args) {

            int [] a= new int [] {21, 3, 8, 3, 10, 2, 2, 35, 21};
            int [] f = new int [a.length];
            int visited = -1;

            for(int i = 0; i < a.length; i++)
            {
                int count = 1;
                for(int j = i+1; j < a.length; j++)
                {
                    if(a[i] == a[j])
                    {
                        count++;

                        f[j] = visited;
                    }
                }
                if(f[i] != visited)
                    f[i] = count;
            }

            System.out.println(" Element Frequency");
            for(int i = 0; i < f.length; i++)
            {
                if(f[i] != visited)
                    System.out.println(a[i] + " occurs " + f[i]);
            }
        }
    }
