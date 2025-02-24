
public class BubbleSort extends SortAlgorithm{
    BubbleSort(int num){
        super(num);
    };

    public void sort(){
        System.out.println("Initial List");
        for(int i = 0; i <= numElements - 1; i++)
        {
            System.out.println(String.valueOf(set[i]));
        }
        
        boolean Swapped;

        do{
            Swapped = false;
            //Implement bubble sort
            for(int i = 0; i< numElements - 1; i++)
            {
                if(set[i+1] < set[i])
                {
                    int temp = set[i];
                    set[i] = set[i+1];
                    set[i+1] = temp;
                    Swapped = true;
                }
            }

        }while(Swapped);

        System.out.println("Sorted List");
        for(int i = 0; i <= numElements - 1; i++)
        {
            System.out.println(String.valueOf(set[i]));
        }
    }
}