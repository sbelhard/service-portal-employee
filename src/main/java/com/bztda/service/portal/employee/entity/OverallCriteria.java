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
@Builder
@Component
@Entity
@Table(name = "overall_criteria", schema = "portal_storage")
public class OverallCriteria extends BaseEntity<Long> {

    @Column(name = "overall_criteria")
    private String overallCriteria;

    @OneToMany(mappedBy = "criteria", cascade = CascadeType.ALL)
    private List<Criteria> criteria;
}
