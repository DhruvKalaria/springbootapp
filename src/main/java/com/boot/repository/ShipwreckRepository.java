package com.boot.repository;

import com.boot.model.Shipwreck;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

/**
 * Created by dhruvkalaria on 8/13/17.
 */
@Repository
public interface ShipwreckRepository extends JpaRepository<Shipwreck,Long> {

}
