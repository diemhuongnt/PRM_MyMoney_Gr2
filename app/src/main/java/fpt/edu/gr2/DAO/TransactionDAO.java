package fpt.edu.gr2.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

import fpt.edu.gr2.Entity.TransactionEntity;

@Dao
public interface TransactionDAO {

    // Insert a new transaction
    @Insert
    void insertTransaction(TransactionEntity transaction);

    // Update an existing transaction
    @Update
    void updateTransaction(TransactionEntity transaction);

    // Delete a transaction by id
    @Query("DELETE FROM transactions WHERE transactionId = :transactionId")
    void deleteTransaction(int transactionId);

    // Get all transactions ordered by date
    @Query("SELECT * FROM transactions ORDER BY date DESC")
    List<TransactionEntity> getAllTransactions();

    // Get a transaction by id
    @Query("SELECT * FROM transactions WHERE transactionId = :transactionId")
    TransactionEntity getTransactionById(int transactionId);
}