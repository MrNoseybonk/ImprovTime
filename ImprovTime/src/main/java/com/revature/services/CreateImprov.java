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
		
		ImprovCharacter[] selectedCharacters = new ImprovCharacter[2];
		
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
		selectedCharacters[0] = characters[char1];
		selectedCharacters[1] = characters[char2];
		
		improv.setActivity(activity);
		improv.setCharacters(selectedCharacters);
		improv.setSetting(setting);
		
//		System.out.println("Characters = " + selectedCharacters[0].getCharacter() + " and " + 
//		selectedCharacters[1].getCharacter() + "; Activity = " + activity.getActivity() +
//		"; Setting = " + setting.getSetting());
		
		return improv;
	}
}
