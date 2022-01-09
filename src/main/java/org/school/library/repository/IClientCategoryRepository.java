package org.school.library.repository;

import org.school.library.domain.ClientCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientCategoryRepository extends JpaRepository<ClientCategory, Long> {
    boolean existsByName(String name);
}
