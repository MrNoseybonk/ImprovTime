import com.revature.beans.Activity;
import com.revature.beans.ImprovCharacter;
import com.revature.beans.Setting;
import com.revature.data.ImprovHardCoded;
import com.revature.services.CreateImprov;

public class ImprovTime {
	
	private static ImprovHardCoded hardCode;
	private static CreateImprov createImprov;

	public static void main(String[] args) {
		hardCode = new ImprovHardCoded();
		createImprov = new CreateImprov();
		Activity[] activities;
		Setting[] settings;
		ImprovCharacter[] characters;
		
		activities = hardCode.buildActivityData();
		
		settings = hardCode.buildSettingData();
		
		characters = hardCode.buildCharacterData();
		
		createImprov.setUpImprov(activities, characters, settings);
	}

}
