package AF;

public class Bengaluru implements Cities{
    public void getPrice(int op)
    {
        if(op==1)
            System.out.println("price for Micro cab in Bengaluru is:1000");
        else if(op==2)
            System.out.println("price for mini cab in Bengaluru is:1600");
        else if(op==3)
            System.out.println("price for sedan cab in Bengaluru is:1600");
        else if(op==4)
            System.out.println("price for suv cab in Bengaluru is:1500");
    }
}
