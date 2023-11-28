package com.example.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationDto {
    private Long id;
    private  String organizationName;
    private String organizationDescription;
    private String organizationCode;
    private String getOrganizationCreatedDate;
}
