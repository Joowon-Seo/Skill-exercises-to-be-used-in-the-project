package com.example.account.repository;

import com.example.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// Account table에 접속하기 위한 repository, class가 아닌 interface
public interface AccountRepository extends JpaRepository<Account, Long> {

}
