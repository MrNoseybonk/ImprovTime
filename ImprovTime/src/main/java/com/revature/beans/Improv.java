package com.revature.beans;

import java.util.Arrays;

public class Improv {
	private String activity;
	private String[] characters;
	private String setting;
	
	public Improv()
	{
		activity = "";
		setting = "";
		characters = null;
	}
	
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public String[] getCharacters() {
		return characters;
	}
	public void setCharacters(String[] characters) {
		this.characters = characters;
	}
	public String getSetting() {
		return setting;
	}
	public void setSetting(String setting) {
		this.setting = setting;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activity == null) ? 0 : activity.hashCode());
		result = prime * result + Arrays.hashCode(characters);
		result = prime * result + ((setting == null) ? 0 : setting.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Improv other = (Improv) obj;
		if (activity == null) {
			if (other.activity != null)
				return false;
		} else if (!activity.equals(other.activity))
			return false;
		if (!Arrays.equals(characters, other.characters))
			return false;
		if (setting == null) {
			if (other.setting != null)
				return false;
		} else if (!setting.equals(other.setting))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Improv [activity=" + activity + ", characters=" + Arrays.toString(characters) + ", setting=" + setting
				+ "]";
	}
}
