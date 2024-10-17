import java.io.InputStreamReader;
import java.io.BufferedReader;

class test1 {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input_from_question = Integer.parseInt(br.readLine());
        System.out.println(input_from_question);
        int[] arr = new int[input_from_question+1];

        for(int i = 1 ; i <= input_from_question; i++ )
        {
            if (i%6==0)
            {
                arr[i] = 0;
            }

            else if(i%2 == 0)
            {
                arr[i] = -1*i;
            }
            else if(i%3 == 0)
            {
                arr[i] = 2;
            }
            else
            {
                arr[i] = i;
            }
        }

        for(int j = 1; j <= input_from_question; j++)
        {
            if(arr[j]==2)
            {
                continue;
            }
            else
            {
                System.out.print(arr[j]+" ");
            }
        }
        
    }
}