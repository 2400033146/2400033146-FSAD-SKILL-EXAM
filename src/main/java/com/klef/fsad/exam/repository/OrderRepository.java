package com.klef.fsad.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.klef.fsad.exam.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}