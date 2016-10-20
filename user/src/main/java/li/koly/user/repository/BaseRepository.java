package li.koly.user.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends Repository<T, ID>, JpaSpecificationExecutor<T> {
    T findOne(ID id);

    T save(T entity);
}
