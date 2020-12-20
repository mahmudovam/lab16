public class ToOrder extends RestaurantOrder{
    public ToOrder(String title, String description) {
        super(title, description);
    }

    public ToOrder(Double cost, String title, String description) {
        super(cost, title, description);
    }
}