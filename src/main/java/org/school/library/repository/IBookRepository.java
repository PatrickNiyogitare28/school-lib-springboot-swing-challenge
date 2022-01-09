package org.school.library.repository;

import org.school.library.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface IBookRepository extends JpaRepository<Book, UUID> {
    Optional<Book> existsByTitle(String title);
}
