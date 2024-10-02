package fpt.edu.gr2.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import fpt.edu.gr2.DAO.CategoryDAO;
import fpt.edu.gr2.DAO.NotificationDAO;
import fpt.edu.gr2.DAO.StatisticDAO;
import fpt.edu.gr2.DAO.TransactionDAO;
import fpt.edu.gr2.DAO.UserDAO;
import fpt.edu.gr2.Entity.CategoryEntity;
import fpt.edu.gr2.Entity.NotificationEntity;
import fpt.edu.gr2.Entity.StatisticEntity;
import fpt.edu.gr2.Entity.TransactionEntity;
import fpt.edu.gr2.Entity.UserEntity;

@Database(entities = {UserEntity.class, TransactionEntity.class, CategoryEntity.class, NotificationEntity.class, StatisticEntity.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDAO UserDAO();
    public abstract TransactionDAO TransactionDAO();
    public abstract CategoryDAO CategoryDAO();
    public abstract NotificationDAO NotificationDAO();
    public abstract StatisticDAO StatisticDAO();
}
