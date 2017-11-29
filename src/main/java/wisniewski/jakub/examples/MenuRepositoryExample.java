package wisniewski.jakub.examples;

import wisniewski.jakub.dao.repos.IDatabaseCatalog;
import wisniewski.jakub.domain.Menu;
import wisniewski.jakub.domain.MenuPosition;

import java.sql.Connection;
import java.util.List;

/**
 * Created by Kuba on 29.11.2017.
 */
public class MenuRepositoryExample {
    public static void run(Connection connection, IDatabaseCatalog catalog){
        catalog.menus().createTable();
/*
        Menu menu=new Menu();
        menu.setIdRestaurant(3);
        menu.setType("Dania obiadowe");
        catalog.menus().add(menu);

        Menu menuId=new Menu();
        menuId.setIdRestaurant(2);
        menuId.setType("Dania obiadowe");
        catalog.menus().add(menuId);

        Menu menuType=new Menu();
        menuType.setIdRestaurant(3);
        menuType.setType("Wege");
        catalog.menus().add(menuType);
*/

        //Menu menuDelete= catalog.menus().get(3);
        //catalog.menus().delete(menuDelete);
        //Menu menuUpdate=catalog.menus().get(4);
        //menuUpdate.setType("Zupy");
        //catalog.menus().update(menuUpdate);

        List<Menu>menuListId=catalog.menus().withIdRestaurant(2);
        List<Menu>menuListType=catalog.menus().withType("Wege");

        System.out.println("--------------------");
        System.out.println(menuListId);
        System.out.println("====================");
        System.out.println(menuListType);

        int lastId = catalog.menuPositions().lastId();
        int count = catalog.menuPositions().count();
    }
}
