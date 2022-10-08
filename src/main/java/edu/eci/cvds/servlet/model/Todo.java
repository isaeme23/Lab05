package edu.eci.cvds.servlet.model;

public class Todo {

    private int userId;
    private int id;
    private String title;
    private boolean completed;

    public Todo(int userId, int id, int title, boolean completed){

    }

    public void setUserId(int userId){
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
