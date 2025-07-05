/**

cuisine
Mexican
Italian
Chinese
Japanese

*/

public class Main {

  public abstract class Cuisine {
    public abstract String servingFood();
  }

  public class UnservibleCuisine extends Exception {
    public UnservibleCuisine(String message) {
      super(message);
    }
  }

  public static void main(String[] args) {
    String[] cuisines = {"Mexican/mexfood", "Italian/italfood", "Chinese/chinefood", "Japanese/japanfood",
            "Portuguese/portugeseFood"};
    int count = 0;
    private static final FOOD_FACTORY = FoodFactory.getInstanceFactory();


    FoodFactory foodFactory = FoodFactory.getInstanceFactory();

    if(FOOD_FACTORY.equals(foodFactory)) {
      FoodFactory mexicanFactory = foodFactory.createFood(new MexicanCuisine());
      FoodFactory chineseFactory = foodFactory.createFood(new ChineseCuisine());
      FoodFactory italianFactory = foodFactory.createFood(new ItalianCuisine());
      FoodFactory japaneseFactory = foodFactory.createFood(new JapaneseCuisine());


      switch (mexicanFactory.getDish()) {
        case "Mexican":
          System.out.println("Serving Mexican food: " + mexicanFactory.servingFood());
          break;
        case "Italian":
          count++;
          System.out.println("Serving Italian food: " + mexicanFactory.servingFood());
          break;
        case "Chinese":
          System.out.println("Serving Chinese food: " + mexicanFactory.servingFood());
          break;
        case "Japanese":
          System.out.println("Serving Japanese food: " + mexicanFactory.servingFood());
          break;
      }

    }


    System.out.println("The number of times 'Italian' appears is: " + count);

  }

}
