package wisniewski.jakub.examples;

import wisniewski.jakub.dao.repos.IDatabaseCatalog;
import wisniewski.jakub.domain.Menu;
import wisniewski.jakub.domain.Restaurant;

import java.sql.Connection;

/**
 * Created by Kuba on 29.11.2017.
 */
public class RestaurantRepositoryExample {
    public static void run(Connection connection, IDatabaseCatalog catalog){
        catalog.restaurants().createTable();
/*
        Restaurant restaurant=new Restaurant();
        restaurant.setName("PJATK");
        restaurant.setAddress("Brzegi");
        restaurant.setPhoneNumber("111-222-333");
        catalog.restaurants().add(restaurant);
*/

        //Restaurant restaurantDelete= catalog.restaurants().get(3);
        //catalog.restaurants().delete(restaurantDelete);
        //Restaurant restaurantUpdate=catalog.restaurants().get(4);
        //restaurantUpdate.setName("AAA");
        //catalog.restaurants().update(restaurantUpdate);

        int lastId = catalog.menuPositions().lastId();
        int count = catalog.menuPositions().count();
    }
}
