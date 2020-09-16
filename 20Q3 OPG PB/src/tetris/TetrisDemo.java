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
public class TetrisDemo {
   public static void main(String[] args){
       Tetris tetris = new Tetris();
       int[][] grid = {
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,1,1,0,0,0,0,0,0},
            {0,0,1,0,0,0,0,1,0,0},
            {0,0,1,0,0,0,1,1,0,1},
            {1,1,1,1,1,1,1,1,1,1},
            {0,0,0,0,0,0,0,0,0,0},
        };
       tetris.setGrid(grid);
       tetris.printGrid();
       tetris.run();
       System.out.println("___");
       tetris.printGrid();
   } 
}
