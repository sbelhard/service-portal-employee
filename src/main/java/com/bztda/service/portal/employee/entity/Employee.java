package com.bztda.service.portal.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
@Entity
@Table(name = "employee", schema = "portal_storage")
public class Employee extends BaseEntity<Long> {

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "position")
    private String position;

    @Column(name = "birth_day")
    private LocalDate birthDay;

    @Column(name = "number_pass")
    private String numberPass;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email")
    private String email;

    @Column(name = "trainig")
    private boolean training;

    @Column(name = "date_end_contract")
    private LocalDate dateEndContract;

    @Column(name = "date_start_contract")
    private LocalDate dateStartContract;

    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "education_id")
    private Education education;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "employee_hobbies", schema = "portal_storage",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "hobbies_id"))
    private List<Hobbies> hobbies = new ArrayList<>();
}
