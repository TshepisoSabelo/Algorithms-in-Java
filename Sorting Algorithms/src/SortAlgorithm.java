import java.util.Scanner; //Importing scanner
import java.util.Random;

public abstract class SortAlgorithm{
    protected int[] set; //Array of integeres
    protected int numElements;

    SortAlgorithm(int num){
        numElements = num;
    }

    public void SetArray(){
        set = new int[numElements];
        //Manually setting the number and entering elements in an array
        for(int i = 0; i<numElements; i++)
        {
            Scanner Scan = new Scanner(System.in);
            System.out.println("insert element " +  String.valueOf(i+1));
            String entry = Scan.nextLine();
            set[i] = Integer.parseInt(entry);
        }
    }

    public void RandomizeArray(){
        set = new int[numElements];

        Random rand = new Random();
        
        //Generating random numbers for n number of elements
        for(int i = 0; i< numElements; i++){
            set[i] = rand.nextInt(50);    
        }
    }

    public abstract void sort(); //Abstract method for sorting algorithms to be inherited by specific classes.
}