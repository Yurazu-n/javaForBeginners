public class Meal
{
    //Instance attributes//
    private String name;
    private double cost;

    //Class constructor//
    public Meal(String food, double price)
    {
        name = food;
        cost = price;
    }

    //Instance methods//
   public void makeItACombo(){
       name += " with fries and soda";
       cost += 3;
   }

    public String getBill(){
        return name + ", $" + cost;
    }

}