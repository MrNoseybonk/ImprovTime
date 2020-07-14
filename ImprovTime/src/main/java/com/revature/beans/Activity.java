package com.revature.beans;

import javax.persistence.*;

@Entity
@Table
public class Activity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String activity;
	
	public Activity()
	{
		id = 0;
		activity = "";
	}
	
	public int getActivityId()
	{
		return id;
	}
	
	public void setActivityId(int activityId) 
	{
		this.id = activityId;
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
		result = prime * result + id;
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
		if (id != other.id)
			return false;
		return true;
	}
	
	@Override
	public String toString() 
	{
		return "Activity [activityId=" + id + ", activity=" + activity + "]";
	}
}
