package org.school.library.domain;

import org.school.library.enums.ETransactionType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class BookTransaction {
    @Id
    @GeneratedValue
    private UUID id;

    private  UUID book;

    private UUID client;

    private LocalDate transactionDate;

    private LocalDate returnDate;

    private ETransactionType transactionType;

    public BookTransaction() {
    }

    public BookTransaction(UUID id, UUID book, UUID client, LocalDate transactionDate, LocalDate returnDate, ETransactionType transactionType) {
        this.id = id;
        this.book = book;
        this.client = client;
        this.transactionDate = transactionDate;
        this.returnDate = returnDate;
        this.transactionType = transactionType;
    }

    public BookTransaction(UUID book, UUID client, LocalDate transactionDate, LocalDate returnDate, ETransactionType transactionType) {
        this.book = book;
        this.client = client;
        this.transactionDate = transactionDate;
        this.returnDate = returnDate;
        this.transactionType = transactionType;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getBook() {
        return book;
    }

    public void setBook(UUID book) {
        this.book = book;
    }

    public UUID getClient() {
        return client;
    }

    public void setClient(UUID client) {
        this.client = client;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public ETransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(ETransactionType transactionType) {
        this.transactionType = transactionType;
    }
}
