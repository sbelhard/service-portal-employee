package com.bztda.service.portal.employee.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;


@Data
@ToString(exclude = "staffEvaluate")
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

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "overall_criteria_id")
    private OverallCriteria overallCriteriaCriteria;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "evaluation", schema = "portal_storage",
            joinColumns = @JoinColumn(name = "criteria_id"),
            inverseJoinColumns = @JoinColumn(name = "staff_evaluate_id"))
    private List<StaffEvaluate> staffEvaluate = new ArrayList<>();

}
