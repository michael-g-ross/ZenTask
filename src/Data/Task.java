package src.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Task implements Serializable {
	String mTitle;
	Date mDueDate;
	Date mNotes;
	Boolean mHasNoDate;
	Boolean mIsComplete;
	Task mParentTask;
	ArrayList<Task> subTaskList;
	ArrayList<Tag> tagList;
	
	public Task() {
		super();
	}

	public String getmTitle() {
		return mTitle;
	}

	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	public Date getmDueDate() {
		return mDueDate;
	}

	public void setmDueDate(Date mDueDate) {
		this.mDueDate = mDueDate;
	}

	public Date getmNotes() {
		return mNotes;
	}

	public void setmNotes(Date mNotes) {
		this.mNotes = mNotes;
	}

	public Boolean getmHasNoDate() {
		return mHasNoDate;
	}

	public void setmHasNoDate(Boolean mHasNoDate) {
		this.mHasNoDate = mHasNoDate;
	}

	public Boolean getmIsComplete() {
		return mIsComplete;
	}

	public void setmIsComplete(Boolean mIsComplete) {
		this.mIsComplete = mIsComplete;
	}

	public Task getmParentTask() {
		return mParentTask;
	}

	public void setmParentTask(Task mParentTask) {
		this.mParentTask = mParentTask;
	}
}
