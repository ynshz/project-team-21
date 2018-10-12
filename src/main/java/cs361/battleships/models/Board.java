package cs361.battleships.models;

import java.util.ArrayList;
import java.util.List;



public class Board {
	private List<Result> attacks;
	private List<Ship> ships;
	/*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
	public Board() {
		// TODO Implement
		attacks = new ArrayList<Result>();
		ships = new ArrayList<Ship>();
	}

	/*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
	public boolean placeShip(Ship ship, int x, char y, boolean isVertical) {
		// TODO Implement
		if(ships.size() > 3){
			return false;
		}
		else if (x<1 || x>10){
			return false;
		}
		else if (y<1 || y>10){
			return false;
		}
		else {
			ships.add(ship);
			return true;
		}

	}

	/*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
	public Result attack(int x, char y) {
		//TODO Implement
		Result r = new Result();
		if(x<1 || x>10 || y< 'A' || y>'J'){
			r.setResult(AtackStatus.INVALID);

		}
		else{
			int i;
			for(i=0; i<ships.size();i++){

			}

		}

		return r;
	}

	public List<Ship> getShips() {
		//TODO implement
		return ships;
	}

	public void setShips(List<Ship> ships) {
		//TODO implement
		this.ships = ships;
	}

	public List<Result> getAttacks() {
		//TODO implement
		return attacks;
	}

	public void setAttacks(List<Result> attacks) {
		//TODO implement
		this.attacks = attacks;
	}
}
