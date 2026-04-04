import library.Library;

public class Q15
{
    public static void main(String args[])
    {
        Library l = new Library("The power of now","Mahi");
        l.showBookInfo();
        System.out.println("fine per day = 10");
        System.out.println("calculated fine =" + l.calculateFine(7));

    }
}