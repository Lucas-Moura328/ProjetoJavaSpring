package com.api.projetojavaspring.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    @NotBlank
    private String name;

    @NotBlank
    private String email;

    @NotBlank
    @Size(min = 8, max = 9)
    private String numberPhone;

    @NotBlank
    @Size(min = 2,max = 2)
    private String dddPhone;

    @NotBlank
    @Size(min = 8, max = 50)
    private String password;
}
