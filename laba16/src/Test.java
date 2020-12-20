public class Test {
    public static void main(String[] args) {
        RestaurantOrder restaurantOrder = new RestaurantOrder() {
            @Override
            public boolean add(Item dish) {
                return super.add(dish);
            }
        };

        restaurantOrder.add(new Drink("CocaCola", "drink"));
        restaurantOrder.add(new Drink(2.5,"Pepsi", "drink"));
        restaurantOrder.add(new Dish("Soup", "dish"));
        restaurantOrder.add(new Dish(3.7,"Burger", "dish"));

        TablesOrderManager tablesOrderManager = new TablesOrderManager(restaurantOrder);
        tablesOrderManager.printTable();
        System.out.println("Restaurant total cost: " + restaurantOrder.costTotal() + "$\n");

        InternetOrder internetOrder = new InternetOrder();

        internetOrder.add(new Dish("Cake", "dish"));
        internetOrder.add(new Dish(2.5,"Pilaf", "dish"));
        internetOrder.add(new Drink(2.2,"Fanta", "drink"));
        internetOrder.add(new Drink(2.4,"Gorilla", "drink"));

        for(Item i : internetOrder.getOrdersArray()){
            System.out.println(i.getDescription() + ":  " + i.getTitle() + " " + i.getCost() + "$");
        }

        System.out.println("Internet total cost: " + internetOrder.costTotal() + "$");

    }
}