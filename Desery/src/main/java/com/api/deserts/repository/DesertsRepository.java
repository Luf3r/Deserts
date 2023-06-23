package com.api.deserts.repository;

import com.api.deserts.entity.DesertEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesertsRepository extends JpaRepository<DesertEntity, Long> {
}
