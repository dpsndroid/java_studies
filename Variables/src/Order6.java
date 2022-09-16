public class Order6 {
    boolean isFilled;
    double billAmount;
    String shipping;
    
    public Order6(boolean filled, double cost, String shippingMethod) {
          if (cost > 24.00) {
        System.out.println("High value item!");
      } else {
        System.out.println("Low value item!");
      }
      isFilled = filled;
      billAmount = cost;
      shipping = shippingMethod;
    }
    
    public void ship() {
      if (isFilled) {
        System.out.println("Shipping");
      } else {
        System.out.println("Order not ready");
      }
      
      double shippingCost = calculateShipping();
      
      System.out.println("Shipping cost: ");
      System.out.println(shippingCost);
    }
    
    public double calculateShipping() {
      double shippingCost;
      switch (shipping) {
        case "Regular":
          shippingCost = 0;
          break;
        case "Express":    
          shippingCost = 1.75;
          break;
        default:
          shippingCost = .50; 
      }
      return shippingCost;
       }
    
    public static void main(String[] args) {
      // create instances and call methods here!
      Order6 skate = new Order6(true, 16.99, "Regular");
      Order6 shirtsCombo = new Order6(false, 105.50, "Regular");
      
      skate.ship();
      shirtsCombo.ship();
    }
  }
  
