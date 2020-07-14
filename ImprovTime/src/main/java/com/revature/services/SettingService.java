package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Setting;
import com.revature.data.SettingDAO;

@Service
public class SettingService {
	public final SettingDAO setDao;
	
	@Autowired
    public SettingService(SettingDAO s)
    {
		setDao = s;
    }
	
	public Integer addSetting(Setting s)
	{
		return setDao.save(s).getSettingId();
	}

	public Setting[] getSettings()
	{
		List<Setting> settingsList;
		settingsList = setDao.findAll();
		int length = settingsList.size();
		Setting[] settings = new Setting[length]; 
		settings = settingsList.toArray(new Setting[0]);
		return settings;
	}
	
	public void removeSetting(Setting s)
	{
		setDao.delete(s);
	}
}
