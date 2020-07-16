package com.revature.services;

import java.util.ArrayList;
import java.util.List;

//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.revature.beans.Activity;
import com.revature.data.ActivityDAO;

@Service
public class ActivityService {
	//public static final Logger log = Logger.getLogger(ActivityService.class);
	private final ActivityDAO actDao;

	@Autowired
    public ActivityService(ActivityDAO a)
    {
		actDao = a;
    }
	
	public Integer addActivity(Activity a) {
		ExampleMatcher modelMatcher = ExampleMatcher.matching()
				  .withIgnorePaths("id") 
				  .withMatcher("activity", new ExampleMatcher.MatcherConfigurer<ExampleMatcher.GenericPropertyMatcher>() {
                      @Override
                      public void configureMatcher(ExampleMatcher.GenericPropertyMatcher matcher) {
                          matcher.endsWith();
                      }
                  });

		Example<Activity> example = Example.of(a, modelMatcher.withIgnoreCase());
		boolean exists = actDao.exists(example);

		if(exists == false)
		{
			return actDao.save(a).getActivityId();
		}
		
		return -1;
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
