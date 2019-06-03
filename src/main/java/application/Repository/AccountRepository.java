package application.Repository;

import application.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Cirus on 02-June-19.
 */
@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {


}
