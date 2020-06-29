package com.revature.beans;

public class Setting 
{
	private int settingId;
	private String setting;
	
	public Setting()
	{
		settingId = 0;
		setting = "";
	}
	
	public int getSettingId()
	{
		return settingId;
	}
	
	public void setSettingId(int settingId) 
	{
		this.settingId = settingId;
	}
	
	public String getSetting() 
	{
		return setting;
	}
	
	public void setSetting(String setting) 
	{
		this.setting = setting;
	}
	
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((setting == null) ? 0 : setting.hashCode());
		result = prime * result + settingId;
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
		Setting other = (Setting) obj;
		if (setting == null) {
			if (other.setting != null)
				return false;
		} else if (!setting.equals(other.setting))
			return false;
		if (settingId != other.settingId)
			return false;
		return true;
	}
	
	@Override
	public String toString() 
	{
		return "Setting [settingId=" + settingId + ", setting=" + setting + "]";
	}
}
