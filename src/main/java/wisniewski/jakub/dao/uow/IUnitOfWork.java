package wisniewski.jakub.dao.uow;

/**
 * Created by Kuba on 27.11.2017.
 */
public interface IUnitOfWork {
    public void saveChanges();
    public void rollback();
    public void markAsNew(Entity entity);
    public void markAsChanged(Entity entity);
    public void markAsDeleted(Entity entity);

}
