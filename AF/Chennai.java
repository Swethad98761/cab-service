package AF;

public class Chennai implements Cities{
    public void getPrice(int op)
    {
        if(op==1)
            System.out.println("price for Micro cab in Chennai is:800");
        else if(op==2)
            System.out.println("price for mini cab in Chennai is:1100");
        else if(op==3)
            System.out.println("price for sedan cab in Chennai is:1200");
        else if(op==4)
            System.out.println("Suv cab service is not in Chennai");
    }
}
