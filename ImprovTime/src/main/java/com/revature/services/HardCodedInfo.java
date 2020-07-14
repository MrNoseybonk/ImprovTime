package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Activity;
import com.revature.beans.ImprovCharacter;
import com.revature.beans.Setting;
import com.revature.data.ImprovHardCoded;

@Service
public class HardCodedInfo {
private final ImprovHardCoded hardCode;
	
	@Autowired
    public HardCodedInfo (ImprovHardCoded c)
    {
		hardCode = c;
    }

	public Activity[] getActivities()
	{
		Activity[] activities = hardCode.buildActivityData();
		return activities;
	}
	
	public ImprovCharacter[] getCharacters()
	{
		ImprovCharacter[] characters = hardCode.buildCharacterData();
		return characters;
	}
	
	public Setting[] getSetting()
	{
		Setting[] settings = hardCode.buildSettingData();
		return settings;
	}
}
