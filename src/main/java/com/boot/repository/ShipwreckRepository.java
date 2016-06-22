package com.boot.repository;

import com.boot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wang_rui on 6/22/16.
 */

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {


}
