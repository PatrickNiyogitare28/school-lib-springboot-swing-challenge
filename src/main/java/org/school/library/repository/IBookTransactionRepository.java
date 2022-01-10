package org.school.library.repository;

import org.school.library.domain.BookTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IBookTransactionRepository extends JpaRepository<BookTransaction, UUID> {
}
