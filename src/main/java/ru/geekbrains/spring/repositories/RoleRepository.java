package ru.geekbrains.spring.repositories;


import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.spring.entities.Role;

@Repository
@Profile("dao")
public interface RoleRepository extends JpaRepository<Role, Long> {
}
