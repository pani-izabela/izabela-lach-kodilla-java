package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional //Dzięki tej adnotacji nie musisz samodzielnie dbać o zatwierdzanie i wycofywanie transakcji bazodanowych (COMMIT oraz ROLLBACK wykonywane są przez Springa).
@Repository //nasz interfejs powinien być użyty do utworzenia Beana, który będzie kontrolerem repozytorium
public interface TaskDao extends CrudRepository<Task, Integer>{
    List<Task> findByDuration(int duration);

    @Query
    List<Task> retrieveLongTasks();

    @Query
    List<Task> retrieveShortTasks();

    @Query(nativeQuery = true)
    List<Task> retrieveTasksWithEnoughTime();

    @Query
    List<Task> retrieveTasksWithDurationLongerThan(@Param("DURATION") int duration);

}
