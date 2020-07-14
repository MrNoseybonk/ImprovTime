package com.revature.services;

import com.revature.beans.Activity;
import com.revature.beans.Improv;
import com.revature.beans.ImprovCharacter;
import com.revature.beans.Setting;
import java.util.Random;

public class CreateImprov 
{
	public static Improv setUpImprov(Activity[] activities, ImprovCharacter[] characters, Setting[] settings)
	{
		Improv improv = new Improv();
		Random rdm = new Random();
		int actSize = activities.length;
		int charSize = characters.length;
		int setSize = settings.length;
		int noRepeat = 0;
		
		String[] selectedCharacters = new String[2];
		
		int act = rdm.nextInt(actSize);
		int set = rdm.nextInt(setSize);
		int char1 = rdm.nextInt(charSize);
		int char2 = 0;
		
		do
		{
			char2 = rdm.nextInt(charSize);
			if(char2 != char1)
			{
				noRepeat++;
			}
		}while(noRepeat == 0);
		
		Activity activity = new Activity();
		Setting setting = new Setting();
		
		activity = activities[act];
		setting = settings[set];
		selectedCharacters[0] = characters[char1].getCharacter();
		selectedCharacters[1] = characters[char2].getCharacter();
		
		improv.setActivity(activity.getActivity());
		improv.setCharacters(selectedCharacters);
		improv.setSetting(setting.getSetting());
		
		return improv;
	}
}
