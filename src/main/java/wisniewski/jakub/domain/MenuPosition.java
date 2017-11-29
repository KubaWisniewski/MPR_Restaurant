package wisniewski.jakub.domain;

/**
 * Created by Kuba on 29.11.2017.
 */
public class MenuPosition implements IHaveId{
    private int id;
    private int idMenu;
    private String nameMeal;
    private String description;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public String getNameMeal() {
        return nameMeal;
    }

    public void setNameMeal(String nameMeal) {
        this.nameMeal = nameMeal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuPosition{" +
                "id=" + id +
                ", idMenu=" + idMenu +
                ", nameMeal='" + nameMeal + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
