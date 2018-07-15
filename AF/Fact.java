package AF;

public class Fact {
    public static AbstractFactory getFactory(String s)
    {
        if(s.equalsIgnoreCase("cabs"))
            return new CabFactory();
        else if(s.equalsIgnoreCase("cities"))
            return new CityFactory();
        return null;
    }
}
