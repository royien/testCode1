import java.util.*;

public class anArrayOfList
{
    ArrayList<Integer> intArray = new ArrayList<Integer>();
    Scanner userIn= new Scanner(System.in);

    boolean shouldPrint=false;
    private int classGetArrayListNumber()
    {
        System.out.println("How much would you like to add in the ArrayList? (MAX: 20)");
        int returnNumber=0;
        try{
            int x = userIn.nextInt();
            if((x>20) || (x<1))
            {
                System.out.println("Please enter a valid number that is between 1-20.");
                setArray();
            }
            else{returnNumber = x; shouldPrint=true;}
        }
        catch(Exception e){
            System.out.println("Unknown error occured. Please Try again");
        }
        return returnNumber;
    }

    private void setArray()
    {
        int counter= classGetArrayListNumber();
        for(int x=0; x<counter; x++)
        {
            System.out.println("element of ["+x+"] = ");
            int numberUserInput = userIn.nextInt();
            intArray.add(numberUserInput);

        }
        if(shouldPrint!=false)
        {
            System.out.println("The numbers within the arrays are: " + intArray);
        }
    }

    void start()
    {
        setArray();
    }

    public static void main(String[] args)
    {
        anArrayOfList caller = new anArrayOfList();
        caller.start();

    }
}
