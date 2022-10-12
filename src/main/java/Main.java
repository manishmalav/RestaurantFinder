import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

      //  Restaurant restaurant = new Restaurant("abc","kota",LocalTime.now().minusHours(11),LocalTime.now().minusHours(1));

        RestaurantService restaurantService = new RestaurantService();
        restaurantService.addRestaurant("abc","kota",LocalTime.now().minusHours(11),LocalTime.now().minusHours(1));
       Restaurant restaurant= restaurantService.findRestaurantByName("abc");
       if(restaurant != null)
       {
           restaurant.displayDetails();
       }
       else {
           System.out.println("No resturant found with name"+ "ABC");
       }


    }
}
