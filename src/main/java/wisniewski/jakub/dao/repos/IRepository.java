package wisniewski.jakub.dao.repos;

import wisniewski.jakub.domain.IHaveId;
import java.util.List;

/**
 * Created by Kuba on 27.11.2017.
 */
public interface IRepository<TEntity extends IHaveId> {
    public void add(TEntity entity);
    public List<TEntity> getPage(int offset, int limit);
    public TEntity get(int id);
    public void update(TEntity entity);
    public void delete(TEntity entity);
    public int count();
    public int lastId();
    public void createTable();
}
