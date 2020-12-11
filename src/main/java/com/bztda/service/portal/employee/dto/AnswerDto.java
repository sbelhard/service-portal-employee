package com.bztda.service.portal.employee.dto;


import com.bztda.service.portal.employee.entity.Result;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnswerDto {

    private Long id;
    private String answer;
    private Result result;

}
