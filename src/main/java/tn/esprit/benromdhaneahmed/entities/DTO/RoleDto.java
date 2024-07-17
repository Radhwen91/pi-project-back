/**
 * Created By Radhwen Kacem
 * Date: 13/07/2024
 * Time : 13:09
 * Project Name : backend
 */
package tn.esprit.benromdhaneahmed.entities.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto {

    protected Long id;
    private String role;
}
