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
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
@Entity
@Table(name = "educations", schema = "portal_storage")
public class Education extends BaseEntity<Long> {

    @Column(name = "education")
    private String education;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Employee> employees;

}
