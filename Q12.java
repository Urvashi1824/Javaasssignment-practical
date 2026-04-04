import temperature.Temperature;

public class Q12
{
    public static void main(String[] args) {

        Temperature t = new Temperature();

       
        t.convert(25);        
        t.convert(-300);      

        System.out.println("----------------");

        
        t.convert(98.6, 1);  
        t.convert(-500, 1);   
    }
}