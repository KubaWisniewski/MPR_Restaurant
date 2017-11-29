package wisniewski.jakub.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Kuba on 27.11.2017.
 */
public interface IMapper<TEntity> {
    public TEntity map(ResultSet rs) throws SQLException;
}
