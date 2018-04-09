package wisniewski.jakub.dao.mappers;

import wisniewski.jakub.domain.Restaurant;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Kuba on 29.11.2017.
 */
public class RestaurantMapper implements IMapper<Restaurant> {
    public Restaurant map(ResultSet rs) throws SQLException {
        Restaurant restaurant= new Restaurant();
        restaurant.setId(rs.getInt("id"));
        restaurant.setName(rs.getString("name"));
        restaurant.setAddress(rs.getString("address"));
        restaurant.setPhoneNumber(rs.getString("phoneNumber"));
        return restaurant;
    }
}
