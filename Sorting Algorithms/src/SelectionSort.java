import java.util.Scanner; //Importing scanner
import java.util.Random;

public class SelectionSort extends SortAlgorithm{
    SelectionSort(int num){
        super(num);
    };

    public void sort(){
        System.out.println("Initial List");
        for(int i = 0; i <= numElements - 1; i++)
        {
            System.out.println(String.valueOf(set[i]));
        }
        int temp;

        for(int i = 0; i <= numElements - 1; i++)
        {
            int index = i;
            temp = set[i];
            for( int j = i+1; j <= numElements - 1; j++)
            {
                if(set[j] < temp)
                {
                    temp = set[j];
                    index = j;
                }
            }
            set[index] = set[i];
            set[i] = temp;
        }

        System.out.println("Sorted List");
        for(int i = 0; i <= numElements - 1; i++)
        {
            System.out.println(String.valueOf(set[i]));
        }
    }
}