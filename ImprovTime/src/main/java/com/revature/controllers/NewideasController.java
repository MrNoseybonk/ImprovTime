package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Activity;
import com.revature.beans.ImprovCharacter;
import com.revature.beans.Setting;
import com.revature.services.ActivityService;
import com.revature.services.CharacterService;
import com.revature.services.SettingService;

@RestController
public class NewideasController {
	private ActivityService actServ;
	private CharacterService charServ;
	private SettingService setServ;
	
	@Autowired
	public NewideasController(ActivityService a, CharacterService c, SettingService s)
	{
		actServ = a;
		charServ = c;
		setServ = s;
	}
	
	@PostMapping(path = "/activity")
	public ResponseEntity<Integer> addActivity(@RequestBody Activity activity)
	{
		activity.setActivityId(actServ.addActivity(activity));
		
		if(activity.getActivityId() == -1) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(activity.getActivityId());
	}
	
	@PostMapping(path = "/character")
	public ResponseEntity<Integer> addCharacter(@RequestBody ImprovCharacter character)
	{
		character.setCharacterId(charServ.addCharacter(character));
		
		if(character.getCharacterId() == -1) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(character.getCharacterId());
	}
	
	@PostMapping(path = "/setting")
	public ResponseEntity<Integer> addSetting(@RequestBody Setting setting)
	{
		setting.setSettingId(setServ.addSetting(setting));
		
		if(setting.getSettingId() == -1) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(setting.getSettingId());
	}
}
