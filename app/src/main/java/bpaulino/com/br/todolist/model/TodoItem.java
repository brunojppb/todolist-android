package bpaulino.com.br.todolist.model;

import java.util.UUID;

/**
 * Created by bruno on 12/9/15.
 */
public class TodoItem {

    private UUID mId;
    private String mTitle;
    private String mDueDate;

    public TodoItem() {
        mId = UUID.randomUUID();
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDueDate() {
        return mDueDate;
    }

    public UUID getId() {
        return mId;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setDueDate(String dueDate) {
        mDueDate = dueDate;
    }
}
