package dataAccess.abstracts;

import entities.concretes.Game;

public interface GameDao {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
}
