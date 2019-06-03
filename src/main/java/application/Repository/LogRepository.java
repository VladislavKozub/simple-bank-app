package application.Repository;

import application.Entity.Log;
import application.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by Cirus on 02-June-19.
 */
@Repository
public interface LogRepository extends JpaRepository<Log,Long> {
    Log findByUser(User user);

    List<Log> findByUserAndTimestampBetween(User user,Date from, Date to);
}
