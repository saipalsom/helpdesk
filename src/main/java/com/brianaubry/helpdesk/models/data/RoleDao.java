package com.brianaubry.helpdesk.models.data;

import com.brianaubry.helpdesk.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface RoleDao extends JpaRepository<Role, Integer> {
    Role findByrole(String role);
}