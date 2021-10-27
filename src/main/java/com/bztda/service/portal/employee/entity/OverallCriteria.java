package com.bztda.service.portal.employee.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;


@Data
@ToString(exclude = "criterias")
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

    @JsonIgnore
    @OneToMany(mappedBy = "overallCriteriaCriteria")
    private List<Criteria> criterias = new ArrayList<>();
}
