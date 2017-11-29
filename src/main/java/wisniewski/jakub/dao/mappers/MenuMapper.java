package wisniewski.jakub.dao.mappers;

import wisniewski.jakub.domain.Menu;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Kuba on 29.11.2017.
 */
public class MenuMapper implements IMapper<Menu> {
    public Menu map(ResultSet rs) throws SQLException {
        Menu menu =new Menu();
        menu.setId(rs.getInt("id"));
        menu.setIdRestaurant(rs.getInt("idRestaurant"));
        menu.setType(rs.getString("type"));
        return menu;
    }
}
