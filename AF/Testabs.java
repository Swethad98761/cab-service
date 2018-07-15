package AF;
import java.util.*;
public class Testabs {
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
        System.out.println("Enter cab name:");
        AbstractFactory a=Fact.getFactory("cabs");
        String cab=sc.nextLine();
        Cabs c=a.getCabs(cab) ;
        System.out.println("Enter city name:");
        AbstractFactory b=Fact.getFactory("cities");
        String city=sc.nextLine();
        Cities ci=b.getCities(city);
        ci.getPrice(c.getCabNo());
    }
}
