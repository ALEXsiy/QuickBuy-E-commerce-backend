package com.baturin.quickbuy.repository;

import com.baturin.quickbuy.model.AuthenticationToken;
import com.baturin.quickbuy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<AuthenticationToken, Integer> {

    AuthenticationToken findByUser(User user);
    AuthenticationToken findByToken(String token);
}
