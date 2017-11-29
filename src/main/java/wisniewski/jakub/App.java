package wisniewski.jakub;

import wisniewski.jakub.dao.repos.IDatabaseCatalog;
import wisniewski.jakub.dao.repos.impl.DatabaseCatalog;
import wisniewski.jakub.dao.uow.IUnitOfWork;
import wisniewski.jakub.dao.uow.UnitOfWork;
import wisniewski.jakub.domain.Menu;
import wisniewski.jakub.domain.Restaurant;
import wisniewski.jakub.examples.MenuPositionRepositoryExample;
import wisniewski.jakub.examples.MenuRepositoryExample;
import wisniewski.jakub.examples.RestaurantRepositoryExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {


        String url = "jdbc:hsqldb:hsql://localhost/workdb";

        Connection connection = DriverManager.getConnection(url);
        IUnitOfWork uow = new UnitOfWork(connection);

        IDatabaseCatalog catalog = new DatabaseCatalog(connection, uow);
        MenuRepositoryExample.run(connection,catalog);
        RestaurantRepositoryExample.run(connection, catalog);
        MenuPositionRepositoryExample.run(connection,catalog);
        uow.saveChanges();
        connection.close();
    }
}
