/**
 * Created By Radhwen Kacem
 * Date: 13/07/2024
 * Time : 12:42
 * Project Name : backend
 */
package tn.esprit.benromdhaneahmed.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.benromdhaneahmed.entities.Role;
import tn.esprit.benromdhaneahmed.entities.UserRole;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRole(UserRole role);
}
