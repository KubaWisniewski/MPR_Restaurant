package wisniewski.jakub;
import static org.junit.Assert.*;

import org.junit.Test;
import wisniewski.jakub.dao.repos.IDatabaseCatalog;
import wisniewski.jakub.dao.repos.impl.DatabaseCatalog;
import wisniewski.jakub.dao.uow.IUnitOfWork;
import wisniewski.jakub.dao.uow.UnitOfWork;
import wisniewski.jakub.domain.Checker.SortChecker;
import wisniewski.jakub.domain.MenuPosition;
import wisniewski.jakub.examples.MenuPositionRepositoryExample;
import wisniewski.jakub.examples.MenuRepositoryExample;
import wisniewski.jakub.examples.RestaurantRepositoryExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Kuba on 29.11.2017.
 */
public class SortTestChecker {
    @Test
    public void test_sort() throws SQLException{
        SortChecker sortChecker = new SortChecker();
        String url = "jdbc:hsqldb:hsql://localhost/workdb";

        Connection connection = DriverManager.getConnection(url);
        IUnitOfWork uow = new UnitOfWork(connection);

        IDatabaseCatalog catalog = new DatabaseCatalog(connection, uow);


        List<MenuPosition> menuPositionListAll=catalog.menuPositions().getAll();
        menuPositionListAll.sort(Comparator.comparing(MenuPosition::getPrice));
        List<MenuPosition>menuPositionListMethod=catalog.menuPositions().sortPrice();

        boolean isSortValid=sortChecker.isSortValid(menuPositionListMethod,menuPositionListAll);
        assertTrue(isSortValid);
        uow.saveChanges();
        connection.close();
    }

}
