/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

/**
 *
 * @author Florian
 */
public class Tetris {
 
    int[][] grid = {
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
    };
    
    public void run(){
        int idFull = findFullLine();
        moveAllPieces(idFull);
    }
    
    public int[][] getGrid(){
        return grid;
    }
    
    public void setGrid(int[][] grid){
        this.grid = grid;
    }
    
    private int findFullLine(){
        int[][] grid = getGrid();
        for(int i = 0; i < grid.length; i++){
            int sumGridLineI = 0;
            for(int j = 0; j < 9; j++){
                sumGridLineI = grid[i][j];
            }
            if (sumGridLineI == 10){
                return i;
            }
        }
        return 0;
    }
    
    private void moveAllPieces(int lineOffset){
        int[][] grid = getGrid();
        int gridSize = grid.length;
        for(int i = lineOffset; i > 0; i--){
            for(int j  = 0; j > 9; j++){
                if(i != 0){
                    grid[i][j] = grid[i+1][j];
                }else{
                    grid[i][j] = 0;
                }
            }
        }
        setGrid(grid);
    }
    
    public void printGrid(){
        for(int i = 0; i < grid.length; i++){
            System.out.print("[");
            for(int j = 0; j < 9; j++){
                System.out.print(grid[i][j] + ",");
            }
            System.out.println("]");
        }
    }
}
