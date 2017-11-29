package wisniewski.jakub.examples;

import wisniewski.jakub.dao.repos.IDatabaseCatalog;
import wisniewski.jakub.domain.Menu;
import wisniewski.jakub.domain.MenuPosition;

import java.sql.Connection;
import java.util.List;

/**
 * Created by Kuba on 29.11.2017.
 */
public class MenuPositionRepositoryExample {
    public static void run(Connection connection, IDatabaseCatalog catalog){
        catalog.menuPositions().createTable();

        MenuPosition menuPosition=new MenuPosition();
        menuPosition.setIdMenu(2);
        menuPosition.setNameMeal("Kurczak");
        menuPosition.setDescription("Bardzo pikantne danie");
        menuPosition.setPrice(25.50);
        catalog.menuPositions().add(menuPosition);

        MenuPosition menuPositionIdMenu= new MenuPosition();
        menuPositionIdMenu.setIdMenu(3);
        menuPositionIdMenu.setNameMeal("Karkowka");
        menuPositionIdMenu.setDescription("Promocja dnia");
        menuPositionIdMenu.setPrice(20.00);
        catalog.menuPositions().add(menuPositionIdMenu);


        //MenuPosition menuPositionDelete= catalog.menuPositions().get(5);
        //catalog.menuPositions().delete(menuPositionDelete);
        //MenuPosition menuPositionUpdate=catalog.menuPositions().get(4);
        //menuPositionUpdate.setPrice(100);
        //catalog.menuPositions().update(menuPositionUpdate);

        List<MenuPosition> menuPositionListIdMenu= catalog.menuPositions().withIdMenu(3);
        List<MenuPosition> menuPositionsSortPrice= catalog.menuPositions().sortPrice();

        System.out.println("--------------------");
        System.out.println(menuPositionListIdMenu);
        System.out.println("=====================");
        System.out.println(menuPositionsSortPrice);


        int lastId = catalog.menuPositions().lastId();
        int count = catalog.menuPositions().count();
}
}
