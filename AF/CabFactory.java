package AF;

public class CabFactory extends AbstractFactory{
    @Override
    public Cabs getCabs(String cab)
    {
        if(cab==null)
            return null;
        else if(cab.equalsIgnoreCase("micro"))
        {
            return new Micro();
        }
        else if(cab.equalsIgnoreCase("mini"))
        {
            return new Mini();
        }
        else if(cab.equalsIgnoreCase("sedan"))
        {
            return new Sedan();
        }
        else if(cab.equalsIgnoreCase("suv"))
        {
            return new Suv();
        }
        else
            return null;
    }
    @Override
    public Cities getCities(String city)
    {
        return null;
    }
}
