package wisniewski.jakub.domain;

/**
 * Created by Kuba on 29.11.2017.
 */
public class Menu implements IHaveId{
    private int id;
    private int idRestaurant;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(int idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", idRestaurant=" + idRestaurant +
                ", type='" + type + '\'' +
                '}';
    }
}
