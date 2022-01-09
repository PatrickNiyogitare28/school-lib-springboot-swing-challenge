package org.school.library.repository;

import org.school.library.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepository extends JpaRepository<Client, Long> {
  boolean existsByPhone(String phone);
}
