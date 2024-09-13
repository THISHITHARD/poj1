import java.util.Scanner;
import java.util.Arrays;

public class lbArrayActThree_MANALOTOa 
{
    public static int searchElement(float[] arr, float value) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == value) 
            {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static float[] removeElement(float[] arr, int indexToRemove) 
    {
        float[] newArray = new float[arr.length - 1];

        for (int i = 0; i < indexToRemove; i++) 
        {
            newArray[i] = arr[i];
        }

        for (int i = indexToRemove; i < newArray.length; i++) 
        {
            newArray[i] = arr[i + 1];
        }

        return newArray;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float[] fValues = new float[10];

        System.out.println("Enter 10 float values:");
        for (int i = 0; i < fValues.length; i++) 
        {
            System.out.print("Value " + (i + 1) + ": ");
            fValues[i] = sc.nextFloat();
        }

        String continueSearch = "YES";
    
        while (continueSearch.equalsIgnoreCase("YES")) 
        {
            System.out.print("\nEnter a value to search: ");
            float searchValue = sc.nextFloat();
            int index = searchElement(fValues, searchValue);

            if (index != -1) 
            {
                System.out.println("FOUND!");

                fValues = removeElement(fValues, index);

                System.out.println("Updated Array: " + Arrays.toString(fValues));
            } 
            else 
            {
                System.out.println("NOT FOUND!");
            }

            System.out.print("Do you want to search for another value? (YES/NO): ");
            continueSearch = sc.next();
        }

        sc.close();
    }
}
