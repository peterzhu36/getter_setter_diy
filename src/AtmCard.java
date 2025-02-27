public class SliceoHeaven {
 
  private String orderID;
  private String pizzaIngredients;
  private double orderTotal;
  private String sides;
  private String drinks;


  public final String DEF_ORDER_ID = "DEF-SOH-099";
  public final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
  public final double DEF_ORDER_TOTAL = 15.00;

  
  public SliceoHeaven() {
      this.orderID = DEF_ORDER_ID;
      this.pizzaIngredients = DEF_PIZZA_INGREDIENTS;
      this.orderTotal = DEF_ORDER_TOTAL;
      this.sides = "";
      this.drinks = "";
  }

  
  public SliceoHeaven(String orderID, String pizzaIngredients, double orderTotal, String sides, String drinks) {
      this.orderID = orderID;
      this.pizzaIngredients = pizzaIngredients;
      this.orderTotal = orderTotal;
      this.sides = sides;
      this.drinks = drinks;
  }

  
  public String getOrderID() {
      return orderID;
  }

  public void setOrderID(String orderID) {
      this.orderID = orderID;
  }

  public String getPizzaIngredients() {
      return pizzaIngredients;
  }

  public void setPizzaIngredients(String pizzaIngredients) {
      this.pizzaIngredients = pizzaIngredients;
  }

  public double getOrderTotal() {
      return orderTotal;
  }

  public void setOrderTotal(double orderTotal) {
      this.orderTotal = orderTotal;
  }

  public String getSides() {
      return sides;
  }

  public void setSides(String sides) {
      this.sides = sides;
  }

  public String getDrinks() {
      return drinks;
  }

  public void setDrinks(String drinks) {
      this.drinks = drinks;
  }

  
  private void printReceipt() {
      System.out.println("Order ID: " + orderID);
      System.out.println("Pizza Ingredients: " + pizzaIngredients);
      System.out.println("Sides: " + sides);
      System.out.println("Drinks: " + drinks);
      System.out.println("Order Total: $" + orderTotal);
  }


  public void displayReceipt() {
      printReceipt();
  }
}