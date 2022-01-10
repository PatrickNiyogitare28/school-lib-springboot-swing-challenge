package org.school.library.repository;

import org.school.library.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IClientRepository extends JpaRepository<Client, UUID> {
  boolean existsByPhone(String phone);
}
