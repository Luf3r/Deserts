package com.api.deserts.repository;

import com.api.deserts.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<OrderEntity, Long> {
}
