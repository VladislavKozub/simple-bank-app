package application.Repository;

import application.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Cirus on 02-June-19.
 */
public interface RoleRepository extends JpaRepository<Role,Integer> {
    Role findByRole(String role);
}
