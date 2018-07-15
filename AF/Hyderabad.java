package AF;

public class Hyderabad implements Cities{
    public void getPrice(int op)
    {
        if(op==1)
        System.out.println("price for Micro cab in Hyderabad is:600");
        else if(op==2)
        System.out.println("price for mini cab in Hyderabad is:1000");
        else if(op==3)
            System.out.println("Sedan cab service is not in hyderabad");
        else if(op==4)
            System.out.println("price for suv cab in Hyderabad is:1500");
    }

}
