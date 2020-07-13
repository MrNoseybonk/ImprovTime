package com.revature.beans;

import javax.persistence.*;

@Entity
@Table
public class Activity 
{
	@Id
	private int activityId;
	@Column
	private String activity;
	
	public Activity()
	{
		activityId = 0;
		activity = "";
	}
	
	public int getActivityId()
	{
		return activityId;
	}
	
	public void setActivityId(int activityId) 
	{
		this.activityId = activityId;
	}
	
	public String getActivity() 
	{
		return activity;
	}
	
	public void setActivity(String activity) 
	{
		this.activity = activity;
	}
	
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activity == null) ? 0 : activity.hashCode());
		result = prime * result + activityId;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Activity other = (Activity) obj;
		if (activity == null) {
			if (other.activity != null)
				return false;
		} else if (!activity.equals(other.activity))
			return false;
		if (activityId != other.activityId)
			return false;
		return true;
	}
	
	@Override
	public String toString() 
	{
		return "Activity [activityId=" + activityId + ", activity=" + activity + "]";
	}
}
