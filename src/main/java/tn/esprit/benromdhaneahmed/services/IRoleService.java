/**
 * Created By Radhwen Kacem
 * Date: 13/07/2024
 * Time : 12:48
 * Project Name : backend
 */
package tn.esprit.benromdhaneahmed.services;

import tn.esprit.benromdhaneahmed.entities.Role;

import java.util.List;

public interface IRoleService {
    List<Role> findAll();
    public Role findById(Long id);
    public Role save(Role role);
    public void delete(Long id);
}
