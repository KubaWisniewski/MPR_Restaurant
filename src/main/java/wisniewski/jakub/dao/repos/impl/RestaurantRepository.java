package wisniewski.jakub.dao.repos.impl;

import wisniewski.jakub.dao.mappers.IMapper;
import wisniewski.jakub.dao.repos.IRestaurantRepository;
import wisniewski.jakub.dao.uow.IUnitOfWork;
import wisniewski.jakub.domain.Restaurant;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Kuba on 29.11.2017.
 */
public class RestaurantRepository extends RepositoryBase<Restaurant> implements IRestaurantRepository {
    public RestaurantRepository(Connection connection, IMapper<Restaurant> mapper, IUnitOfWork uow) throws SQLException {
        super(connection, mapper, uow);
    }

    @Override
    protected String createTableStatementSql() {
        return "CREATE TABLE restaurant("
                + "id bigint GENERATED BY DEFAULT AS IDENTITY,"
                + "name varchar(50),"
                + "address varchar(50),"
                + "phoneNumber varchar(50)"
                + ")";
    }

    @Override
    protected String getUpdateQuerySql() {
        return "UPDATE restaurant SET (name,address,phoneNumber) = (?,?,?) WHERE id=? ";
    }

    @Override
    protected String getInsertQuerySql() {
        return "INSERT INTO restaurant (name,address,phoneNumber) VALUES (?,?,?)";
    }

    @Override
    protected String getTableName() {
        return "restaurant";
    }

    @Override
    protected void setUpdate(Restaurant restaurant) throws SQLException {
        update.setString(1, restaurant.getName());
        update.setString(2, restaurant.getAddress());
        update.setString(3,restaurant.getPhoneNumber());
        update.setInt(4,restaurant.getId());
    }

    @Override
    protected void setInsert(Restaurant restaurant) throws SQLException {
        insert.setString(1, restaurant.getName());
        insert.setString(2, restaurant.getAddress());
        insert.setString(3,restaurant.getPhoneNumber());
    }
}
