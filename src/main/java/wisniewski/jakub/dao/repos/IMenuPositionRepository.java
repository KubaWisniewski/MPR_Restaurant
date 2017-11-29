package wisniewski.jakub.dao.repos;

import wisniewski.jakub.domain.Menu;
import wisniewski.jakub.domain.MenuPosition;

import java.util.List;

/**
 * Created by Kuba on 29.11.2017.
 */
public interface IMenuPositionRepository extends IRepository<MenuPosition> {
    List<MenuPosition> withIdMenu(int id);
    List<MenuPosition> sortPrice();
    List<MenuPosition> getAll();
}
