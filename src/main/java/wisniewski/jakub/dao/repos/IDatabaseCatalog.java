package wisniewski.jakub.dao.repos;

/**
 * Created by Kuba on 27.11.2017.
 */
public interface IDatabaseCatalog{
        public IRestaurantRepository restaurants();
        public IMenuRepository menus();
        public IMenuPositionRepository menuPositions();
}
