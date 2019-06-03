package application.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import application.Entity.Client;

/**
 * Created by Cirus on 02-June-19.
 */
@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
    Client findByName(String name);

}
