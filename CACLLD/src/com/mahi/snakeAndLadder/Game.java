package com.mahi.snakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {

	Board board;
	Dice dice;
	Deque<Player> playersList = new LinkedList<>();
	Player winner;
	
	public Game() {
		intailizeGame();
	}
	private void intailizeGame() {
		board = new Board(10,5,5);
		dice = new Dice(1);
		addPlayers();
		winner =null;
		
	}
	private void addPlayers() {
		Player player1 = new Player("Neeraj",0);
		Player player2 = new Player("Gorav",0);
		
		playersList.add(player1);
		playersList.add(player2);
	}
	
	public void startGame() {
		while(winner== null) {
			Player playerTurn = findPlayerTurn();
			
		System.out.println("player turn is "+playerTurn.id+" current position is "+playerTurn.position);
		
		int diceNumbers = dice.rollDice();
		//get New position
		System.out.println("dice no "+diceNumbers);
		int newPosition = playerTurn.position+diceNumbers;
		int playerNewPosition = jumpCheck(newPosition);
		playerTurn.position=playerNewPosition;
		System.out.println("player turn is "+playerTurn.id+" position "+playerTurn.position);
		if(playerNewPosition>=board.cells.length*board.cells.length-1)
			winner=playerTurn;
			
		}
		
		System.out.println("winner is "+winner.id);
	}
	private int jumpCheck(int newPosition) {
		if(newPosition> board.cells.length*board.cells.length-1)
			return newPosition;
		
		Cell cell = board.getCell(newPosition);
		if(cell.jump != null && cell.jump.start==newPosition)
			{
			String jumpBy = (cell.jump.start>cell.jump.end)?"snake": "ladder";
			System.out.println("jump done by "+jumpBy);
			return cell.jump.end;
			}
		return newPosition;
	}
	private Player findPlayerTurn() {
		Player first = playersList.removeFirst();
		 playersList.addLast(first);
		return first;
	}
	
}
