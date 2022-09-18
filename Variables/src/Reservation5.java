public class Reservation5 {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
    
    public Reservation5(int count, int capacity, boolean open) {
      if (count < 1 || count > 8) {
        System.out.println("Invalid reservation!");
      }
      guestCount = count;
          restaurantCapacity = capacity;
          isRestaurantOpen = open;
    }  
    
    public void confirmReservation() {
      if (restaurantCapacity >= guestCount && isRestaurantOpen) {
        System.out.println("Reservation confirmed");
        isConfirmed = true;
      } else {
        System.out.println("Reservation denied");
              isConfirmed = false;
      }
    }
    
    public void informUser() {
      if (!isConfirmed) {
        System.out.println("Unable to confirm reservation, please contact restaurant.");
      } else {
        System.out.println("Please enjoy your meal!");
      }
    }
    
    public static void main(String[] args) {
      // Create instances here
      Reservation5 partyOfSeven = new Reservation5(7, 12, true);
      System.out.println("Reservation confirmed!");
      System.out.println("Come and have some fun with us!");
    }
  }