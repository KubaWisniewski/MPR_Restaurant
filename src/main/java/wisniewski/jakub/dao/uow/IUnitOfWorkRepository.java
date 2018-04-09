package wisniewski.jakub.dao.uow;

/**
 * Created by Kuba on 27.11.2017.
 */
public interface IUnitOfWorkRepository{
        public void persistAdd(Entity entity);
        public void persistUpdate(Entity entity);
        public void persistDelete(Entity entity);
}
