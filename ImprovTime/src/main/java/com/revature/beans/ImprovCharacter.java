package com.revature.beans;

import javax.persistence.*;

@Entity
@Table
public class ImprovCharacter 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String character;
	
	public ImprovCharacter()
	{
		id = 0;
		character = "";
	}
	
	public int getCharacterId() 
	{
		return id;
	}
	
	public void setCharacterId(int characterId)
	{
		this.id = characterId;
	}
	
	public String getCharacter() 
	{
		return character;
	}
	
	public void setCharacter(String character)
	{
		this.character = character;
	}
	
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((character == null) ? 0 : character.hashCode());
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
		ImprovCharacter other = (ImprovCharacter) obj;
		if (id != other.id)
			return false;
		if (character == null) {
			if (other.character != null)
				return false;
		} else if (!character.equals(other.character))
			return false;
		return true;
	}
	@Override
	public String toString() 
	{
		return "Character [characterId=" + id + ", character=" + character + "]";
	}
}
