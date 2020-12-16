package com.bztda.service.portal.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Data
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
@Entity
@Table(name = "criteria", schema = "portal_storage")
public class Criteria extends BaseEntity<Long> {

    @Column(name = "criteria")
    private String criteria;

    @ManyToOne
    @JoinColumn(name = "overall_criteria_id")
    private OverallCriteria overallCriteria;

}
