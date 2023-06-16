package com.mahi.snakeAndLadder;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Board {

	Cell[][] cells;
	public Board(int boardSize,int noOfSnake, int noOfLadder) {
		intializeBoard(boardSize);
		addSnakeAndLadders(cells,noOfSnake,noOfLadder);
	}
	private void addSnakeAndLadders(Cell[][] cells, int noOfSnake, int noOfLadder) {
		addSnake(cells,noOfSnake);
		addLadder(cells,noOfLadder);
		
	}
	private void addLadder(Cell[][] cells, int noOfLadder) {
		while(noOfLadder>0) {
			int ladderStart = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
			int ladderEnd =ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
			if(ladderEnd<=ladderStart)
				continue;
			
			Jump ladderObj = new Jump(ladderStart, ladderEnd);
			Cell cell= getCell(ladderStart);
			cell.jump = ladderObj;
			
			noOfLadder--;
		}
		
	}
	private void addSnake(Cell[][] cells, int noOfSnake) {
		while(noOfSnake>0) {
			int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
			int snakeTail =ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
			if(snakeHead<=snakeTail)
				continue;
			
			Jump snakeObj = new Jump(snakeHead, snakeTail);
			Cell cell= getCell(snakeHead);
			cell.jump = snakeObj;
			
			noOfSnake--;
		}
		
	}
	private void intializeBoard(int boardSize) {
		cells = new Cell[boardSize][boardSize];
		
		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				Cell obj = new Cell();
				cells[i][j]= obj;
			}
		}
		
	}
	
	Cell getCell(int position) {
		int row = position/cells.length;
		int col = position/cells.length;
		
		return cells[row][col];
	}
}
