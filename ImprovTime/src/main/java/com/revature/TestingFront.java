package com.revature;

import com.revature.beans.Activity;
import com.revature.beans.ImprovCharacter;
import com.revature.beans.Setting;
import com.revature.data.ActivityDAO;
import com.revature.data.CharacterDAO;
import com.revature.data.SettingDAO;
import com.revature.services.ActivityService;
import com.revature.services.CharacterService;
import com.revature.services.SettingService;

public class TestingFront {
	private static ActivityService actServ;
	private static CharacterService charServ;
	private static SettingService setServ;
	private static ActivityDAO actDao;
	private static CharacterDAO charDao;
	private static SettingDAO setDao;
	
	public static void main(String[] args) {
		actServ = new ActivityService(actDao);
		charServ = new CharacterService(charDao);
		setServ = new SettingService(setDao);
		Activity[] activities = actServ.getActivities();
		ImprovCharacter[] characters = charServ.getCharacters();
		Setting[] settings = setServ.getSettings();
		
		for(Activity a : activities)
		{
			System.out.println(a);
		}
		
		for(ImprovCharacter c : characters)
		{
			System.out.println(c);
		}
		
		for(Setting s : settings)
		{
			System.out.println(s);
		}
	}

}
