package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Activity;
import com.revature.data.ActivityDAO;

@Service
public class ActivityService {
	public static final Logger log = Logger.getLogger(ActivityService.class);
	private final ActivityDAO actDao;

	@Autowired
    public ActivityService(ActivityDAO a)
    {
		actDao = a;
    }
	
	public Integer addActivity(Activity a) {
        return actDao.save(a).getActivityId();
    }
	
	public Activity[] getActivities(){
		List<Activity> activitiesList = new ArrayList<>();
		activitiesList = actDao.findAll();
		int length = activitiesList.size();
		Activity[] activities = new Activity[length];
		activities = activitiesList.toArray(new Activity[0]);
		return activities;
	}
	
	public void removeActivity(Activity a) {
		actDao.delete(a);
	}
}
