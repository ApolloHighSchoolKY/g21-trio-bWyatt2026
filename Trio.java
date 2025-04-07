//Write your answer here
public Trio
{
    Sandwhich sand = "";
    Salad salad = "";
    Drink drink = "";
    public Trio(String s, String sal, String dr)
    {
        sand = s;
        salad = sal;
        drink = dr

    }

    public String toString()
    {
        return  "" + sand.getName() + "/ " + salad.getName() + "/ " + drink.getName() + " Trio.";
    }
    public double trioCost()
    {
        double price = 0;
        if(sand.getPrice() > salad.getPrice())
        {
          if(sand.getPrice() > drink.getPrice())
          {
            price = sand.getPrice() + drink.getPrice();
          }
        }

    }
}
