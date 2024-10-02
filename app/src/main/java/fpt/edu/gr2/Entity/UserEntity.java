package fpt.edu.gr2.Entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user_table")
public class UserEntity {

    @PrimaryKey(autoGenerate = true)
    private int user_id;

    private String user_name;
    private String password;
    private String security_question;
    private String answer;
    private String language;
    private boolean notification_settings; // Changed to boolean

    // Constructor
    public UserEntity(String user_name, String password, String security_question, String answer, String language, boolean notification_settings) {
        this.user_name = user_name;
        this.password = password;
        this.security_question = security_question;
        this.answer = answer;
        this.language = language;
        this.notification_settings = notification_settings;
    }

    // Getters and Setters
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurity_question() {
        return security_question;
    }

    public void setSecurity_question(String security_question) {
        this.security_question = security_question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isNotification_settings() {  // Boolean field
        return notification_settings;
    }

    public void setNotification_settings(boolean notification_settings) {
        this.notification_settings = notification_settings;
    }
}
