package AF;

public class CityFactory extends AbstractFactory{
    public Cabs getCabs(String cab)
    {
        return null;
    }
    @Override
    public Cities getCities(String city)
    {
        if(city==null)
            return null;
        else if(city.equalsIgnoreCase("Hyderabad"))
            return new Hyderabad();
        else if(city.equalsIgnoreCase("Bengaluru"))
            return new Bengaluru();
        else if(city.equalsIgnoreCase("chennai"))
            return new Chennai();
return null;
    }
}
