package com.unir.roleapp.repository;
import com.unir.roleapp.entity.CharacterEntity;
import com.unir.roleapp.entity.RoleClass;
import com.unir.roleapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoleClassRepository extends JpaRepository<RoleClass, Long> {
    List<RoleClass> findByName(String name);
}
