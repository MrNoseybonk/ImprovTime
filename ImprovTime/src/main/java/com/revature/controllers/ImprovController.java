package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Activity;
import com.revature.beans.Improv;
import com.revature.beans.ImprovCharacter;
import com.revature.beans.Setting;
import com.revature.services.ActivityService;
import com.revature.services.CharacterService;
import com.revature.services.CreateImprov;
import com.revature.services.HardCodedInfo;
import com.revature.services.SettingService;

@RestController
//@CrossOrigin(origins="http://localhost:4200", allowCredentials = "true")
@RequestMapping(path="/set")
public class ImprovController {
//	private ActivityService actServ;
//	private CharacterService charServ;
//	private SettingService setServ;
	//private CreateImprov cImprov;
	private HardCodedInfo hardCode;
	
//	@Autowired
//	public ImprovController(ActivityService a, CharacterService c, SettingService s)
//	{
//		actServ = a;
//		charServ = c;
//		setServ = s;
//	}
	@Autowired
	public ImprovController(HardCodedInfo h)
	{
		hardCode = h;
	}
	
	@GetMapping
	public ResponseEntity<Improv> getImprov()
	{
//		Activity[] activities = actServ.getActivities();
//		ImprovCharacter[] characters = charServ.getCharacters();
//		Setting[] settings = setServ.getSettings();
		Activity[] activities = hardCode.getActivities();
		ImprovCharacter[] characters = hardCode.getCharacters();
		Setting[] settings = hardCode.getSetting();
		Improv i = CreateImprov.setUpImprov(activities, characters, settings);
		return ResponseEntity.ok(i);
	}
}
