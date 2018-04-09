package wisniewski.jakub.dao.repos.impl;

import wisniewski.jakub.dao.mappers.MenuMapper;
import wisniewski.jakub.dao.mappers.MenuPositionMapper;
import wisniewski.jakub.dao.mappers.RestaurantMapper;

import wisniewski.jakub.dao.repos.IDatabaseCatalog;
import wisniewski.jakub.dao.repos.IMenuPositionRepository;
import wisniewski.jakub.dao.repos.IMenuRepository;
import wisniewski.jakub.dao.repos.IRestaurantRepository;

import wisniewski.jakub.dao.uow.IUnitOfWork;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Kuba on 27.11.2017.
 */
public class DatabaseCatalog implements IDatabaseCatalog {
    Connection connection;
    IUnitOfWork uow;

    public DatabaseCatalog(Connection connection, IUnitOfWork uow){
        this.connection = connection;
        this.uow = uow;
    }

    public IRestaurantRepository restaurants() {
        try {
            return new RestaurantRepository(connection, new RestaurantMapper(), uow);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public IMenuRepository menus() {
        try {
            return new MenuRepository(connection, new MenuMapper(), uow);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public IMenuPositionRepository menuPositions() {
        try {
            return new MenuPositionRepository(connection, new MenuPositionMapper(), uow);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
