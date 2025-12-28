package com.javatraining.jenkins_practice.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CalculatorDTO {

    // response 와 request 를 둘 다 처리하는 DTO
    // 원래는 둘이 분리하는게 맞다
    private int num1;   // 요청 된 숫자
    private int num2;   // 요청 된 숫자
    private int sum;    // 응답 할 합계

    public CalculatorDTO(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
}
