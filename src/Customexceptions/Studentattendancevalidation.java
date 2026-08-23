package Customexceptions;
class AttendanceException extends Exception
{
    AttendanceException(String message)
    {
        super(message);
    }
}

public class Studentattendancevalidation
{
    public static void checkAttendance(double attendance) throws AttendanceException
    {
        if(attendance < 75)
        {
            throw new AttendanceException("Attendance must be at least 75% to write the final exam.");
        }
        else
        {
            System.out.println("Student is eligible to write the final exam.");
        }
    }

    public static void main(String[] args)
    {
        double attendance = 70;   // Change the attendance and test

        try
        {
            checkAttendance(attendance);
        }
        catch(AttendanceException e)
        {
            System.out.println(e.getMessage());
        }
    }
}