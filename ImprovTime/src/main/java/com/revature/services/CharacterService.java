package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.revature.beans.ImprovCharacter;
import com.revature.data.CharacterDAO;

@Service
public class CharacterService {
	private final CharacterDAO charDao;
	
	@Autowired
    public CharacterService (CharacterDAO c)
    {
		charDao = c;
    }
	
	public Integer addCharacter(ImprovCharacter c)
	{
		ExampleMatcher modelMatcher = ExampleMatcher.matching()
				  .withIgnorePaths("id") 
				  .withMatcher("character", new ExampleMatcher.MatcherConfigurer<ExampleMatcher.GenericPropertyMatcher>() {
                    @Override
                    public void configureMatcher(ExampleMatcher.GenericPropertyMatcher matcher) {
                        matcher.endsWith();
                    }
                });

		Example<ImprovCharacter> example = Example.of(c, modelMatcher.withIgnoreCase());
		boolean exists = charDao.exists(example);
		
		if(exists == false)
		{
			return charDao.save(c).getCharacterId();
		}
		
		return -1;
	}
	
	public ImprovCharacter[] getCharacters()
	{
		List<ImprovCharacter> charactersList;
		charactersList = charDao.findAll();
		int length = charactersList.size();
		ImprovCharacter[] characters = new ImprovCharacter[length];
		characters = charactersList.toArray(new ImprovCharacter[0]);
		return characters;
	}
	
	public void removeCharacter(ImprovCharacter c)
	{
		charDao.delete(c);
	}
}
