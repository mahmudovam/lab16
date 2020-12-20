import java.lang.IllegalArgumentException;

public final class Drink implements Item{
    private Double cost;
    private String title;
    private String description;

    public Drink(String title, String description) {
        this.title = title;
        this.description = description;
        this.cost = 0.;
    }

    public Drink(Double cost, String title, String description) {
        try{
            if(cost < 0){
                throw new IllegalArgumentException("Цена не можеть быть отрецательной");
            }
            else {
                this.cost = cost;
                this.title = title;
                this.description = description;
            }
        }catch (IllegalArgumentException err){
            System.out.println("Цена не можеть быть отрецательной");
        }
    }

    @Override
    public Double getCost() {
        return this.cost;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setCost(double cost){
        try {
            if(cost < 0){
                throw new IllegalArgumentException("Цена не можеть быть отрецательной");
            }
            else {
                this.cost = cost;
            }
        }catch (IllegalAccessError err){
            System.out.println("Цена не можеть быть отрецательной");
        }
    }

    @Override
    public void setTitle(String title){
        this.title = title;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}