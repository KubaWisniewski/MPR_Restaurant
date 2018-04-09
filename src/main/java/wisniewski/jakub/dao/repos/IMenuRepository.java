package wisniewski.jakub.dao.repos;

import wisniewski.jakub.domain.Menu;
import java.util.List;

/**
 * Created by Kuba on 29.11.2017.
 */
public interface IMenuRepository extends IRepository<Menu> {
    List<Menu> withType(String type);
    List<Menu> withIdRestaurant(int id);
}
