import java.util.Scanner;

public class FuelCosts
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        double tankCapacity = 0;
        double mpg = 0;
        double pricePerGallon = 0;
        double cost100 = 0;
        double totalMiles = 0;
        boolean done = false;
        String trash = "";
        do
        {
            IO.print("Enter the tank capacity in gallons: ");

            if(in.hasNextDouble())
            {
                tankCapacity = in.nextDouble();
                in.nextLine(); //clears the newline from buffer
                done = true;
            }
            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid copacity not " + trash);
            }
        }
        while (!done);

        IO.println("The capacity is " + tankCapacity);

        done = false;

        do
        {
            IO.print("Enter the tank miles per gallon: ");

            if(in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine(); //clears the newline from buffer
                done = true;
            }
            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid mgp not " + trash);
            }
        }while (!done);

        IO.println("The mgp is " + mpg);

        done = false;

        do
        {
            IO.print("Enter the tank price per gallon: ");

            if(in.hasNextDouble())
            {
                pricePerGallon = in.nextDouble();
                in.nextLine(); //clears the newline from buffer
                done = true;
            }
            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid price per gallon not " + trash);
            }
        }while (!done);

        IO.println("The price per gallon is is " + pricePerGallon);
        done = false;

        //given size of tank, cost per gallon, and miles per gallon
        //Cost to go 100 miles
        //100 / mpg * pricePerGallon

        cost100 = 100 / mpg * pricePerGallon;
        totalMiles = tankCapacity * mpg;

        IO.println("The cost to go 100 miles is " + cost100);
        IO.println("The total miles on a full tank is " + totalMiles);

    }
}
