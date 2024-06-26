package com.baturin.quickbuy.repository;

import com.baturin.quickbuy.model.Cart;
import com.baturin.quickbuy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Integer> {

    List<Cart> findAllByUserOrderByCreatedDateDesc(User user);
}
