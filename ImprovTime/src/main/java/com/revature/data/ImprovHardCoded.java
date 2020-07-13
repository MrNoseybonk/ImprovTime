package com.revature.data;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.revature.beans.Activity;
import com.revature.beans.ImprovCharacter;
import com.revature.beans.Setting;

@Repository
public class ImprovHardCoded 
{
	public static Activity[] activitiesArray;
	public static ImprovCharacter[] charactersArray;
	public static Setting[] settingsArray;
	
	public Activity[] buildActivityData()
	{
		Set<Activity> activities = new HashSet<>();
		Activity activity = new Activity();
		
		activity.setActivityId(1);
		activity.setActivity("Starting a fire.");
		activities.add(activity);
		activity = new Activity();
		activity.setActivityId(2);
		activity.setActivity("Building a boat.");
		activities.add(activity);
		activity = new Activity();
		activity.setActivityId(3);
		activity.setActivity("Setting up a room.");
		activities.add(activity);
		activity = new Activity();
		activity.setActivityId(4);
		activity.setActivity("Hunting for snipes.");
		activities.add(activity);
		activity = new Activity();
		activity.setActivityId(5);
		activity.setActivity("Training for an interview.");
		activities.add(activity);
		
		activitiesArray = activities.toArray(new Activity[0]);
		
		return activitiesArray;
	}
	
	public Setting[] buildSettingData()
	{
		Set<Setting> settings = new HashSet<>();
		Setting setting = new Setting();
		
		setting.setSettingId(1);
		setting.setSetting("Outer Space");
		settings.add(setting);
		setting = new Setting();
		setting.setSettingId(2);
		setting.setSetting("On a deserted island");
		settings.add(setting);
		setting = new Setting();
		setting.setSettingId(3);
		setting.setSetting("In a fallout shelter");
		settings.add(setting);
		setting = new Setting();
		setting.setSettingId(4);
		setting.setSetting("Times Square during New Years Eve");
		settings.add(setting);
		setting = new Setting();
		setting.setSettingId(5);
		setting.setSetting("On the roof of the White House");
		settings.add(setting);
		
		settingsArray = settings.toArray(new Setting[0]);

		return settingsArray;
	}
	
	public ImprovCharacter[] buildCharacterData()
	{
		Set<ImprovCharacter> characters = new HashSet<>();
		ImprovCharacter character = new ImprovCharacter();
		
		character.setCharacterId(1);
		character.setCharacter("Mickey Mouse");
		characters.add(character);
		character = new ImprovCharacter();
		character.setCharacterId(2);
		character.setCharacter("Bugs Bunny");
		characters.add(character);
		character = new ImprovCharacter();
		character.setCharacterId(3);
		character.setCharacter("Donald Duck");
		characters.add(character);
		character = new ImprovCharacter();
		character.setCharacterId(4);
		character.setCharacter("Daffy Duck");
		characters.add(character);
		character = new ImprovCharacter();
		character.setCharacterId(5);
		character.setCharacter("Bullwinkle Moose");
		characters.add(character);
		character = new ImprovCharacter();
		character.setCharacterId(6);
		character.setCharacter("Rocket J. Squirrel");
		characters.add(character);
		character = new ImprovCharacter();
		character.setCharacterId(7);
		character.setCharacter("Porky Pig");
		characters.add(character);
		character = new ImprovCharacter();
		character.setCharacterId(8);
		character.setCharacter("Goofy");
		characters.add(character);
		character = new ImprovCharacter();
		character.setCharacterId(9);
		character.setCharacter("Homer Simpson");
		characters.add(character);
		character = new ImprovCharacter();
		character.setCharacterId(10);
		character.setCharacter("Scooby-Doo");
		characters.add(character);
		
		charactersArray = characters.toArray(new ImprovCharacter[0]);
		
		return charactersArray;
	}
}
