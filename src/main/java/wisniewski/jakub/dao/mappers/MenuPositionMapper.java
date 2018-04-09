package wisniewski.jakub.dao.mappers;

import wisniewski.jakub.domain.MenuPosition;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Kuba on 29.11.2017.
 */
public class MenuPositionMapper implements IMapper<MenuPosition> {
    public MenuPosition map(ResultSet rs) throws SQLException {
        MenuPosition menuPosition=new MenuPosition();
        menuPosition.setId(rs.getInt("id"));
        menuPosition.setIdMenu(rs.getInt("idMenu"));
        menuPosition.setNameMeal(rs.getString("nameMeal"));
        menuPosition.setDescription(rs.getString("description"));
        menuPosition.setPrice(rs.getDouble("price"));
        return menuPosition;
    }
}
