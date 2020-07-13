package com.revature.beans;

import java.util.Arrays;

public class Improv {
	private Activity activity;
	private ImprovCharacter[] characters;
	private Setting setting;
	
	public Activity getActivity() {
		return activity;
	}
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	public ImprovCharacter[] getCharacters() {
		return characters;
	}
	public void setCharacters(ImprovCharacter[] characters) {
		this.characters = characters;
	}
	public Setting getSetting() {
		return setting;
	}
	public void setSetting(Setting setting) {
		this.setting = setting;
	}
	
	@Override
	public String toString() {
		return "Improv [activity=" + activity + ", characters=" + Arrays.toString(characters) + ", setting=" + setting
				+ "]";
	}
}
