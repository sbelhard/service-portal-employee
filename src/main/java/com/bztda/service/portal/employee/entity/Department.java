package com.bztda.service.portal.employee.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Component
@Builder
@Entity
@Table(name = "departments", schema = "portal_storage")
public class Department extends BaseEntity<Long> {

    @Column(name = "department")
    private String department;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Employee> employees;
}
