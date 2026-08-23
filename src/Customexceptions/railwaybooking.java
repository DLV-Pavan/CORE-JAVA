package Customexceptions;

class seatunavailability extends Exception
{
    seatunavailability(String message)
    {
        super(message);
    }
}

public class railwaybooking
{
    public static void availableSeats(int availableSeats) throws seatunavailability
    {
        if(availableSeats == 0)
        {
            throw new seatunavailability("No seats are available. Ticket booking cannot be completed.");
        }
        else
        {
            System.out.println("Ticket booked successfully.");
        }
    }

    public static void main(String args[])
    {
        int availableSeats = 0;

        try
        {
            availableSeats(availableSeats);
        }
        catch(seatunavailability e)
        {
            System.out.println(e.getMessage());
        }
    }
}