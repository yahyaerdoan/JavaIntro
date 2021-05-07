package gameProject.business.concretes;

import gameProject.business.abstracts.GameService;
import gameProject.entities.concretes.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()  + " adl� oyun eklendi." + '\n');
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()  + " adl� oyun silindi." + '\n');
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()  + " adl� oyun g�ncellendi." + '\n');
		
	}
	
}