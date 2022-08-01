package com.example.account.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity // 객체 처럼 보이지만 설정임
public class Account {
    //Account table에 Id를 pk로 쓸 것이다.
    @Id
    @GeneratedValue
    private Long id;

    private String accountNumber;

    @Enumerated(EnumType.STRING) // enum 값의 실제 문자열을 DB에 저장하게 됨 
    private AccountStatus accountStatus;
}
