/**
 * Created By Radhwen Kacem
 * Date: 25/05/2024
 * Time : 14:05
 * Project Name : NourCenterBack
 */
package tn.esprit.benromdhaneahmed.entities.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {
    @NotBlank(message = "username must not be blank")
    private String username;

    @NotBlank(message = "Password must not be blank")
    private String password;
}
