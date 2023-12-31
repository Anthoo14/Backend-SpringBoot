package com.example.RojasMarket.Repository;

import com.example.RojasMarket.Model.ERole;
import com.example.RojasMarket.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByName(ERole role);
}
