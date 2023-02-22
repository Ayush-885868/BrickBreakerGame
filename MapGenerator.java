/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package com.mycompany.brickbreakergame;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author TRAYAMBKUM
 */
/*public class MapGenerator {
    public int map[][];
    public int bricksWidth;
    public int bricksHeight;
    public MapGenerator(int row, int col){
        map = new int [row][col];
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map.length; j++){
                map[i][j] = 1;
            }
        }
        bricksWidth = 540/col; // frame size/total no of columns for getting bricks widdth
        bricksHeight =150/row; //150 is total height of box in which we want to fill bricks rowWise
        
    }
    public void draw(Graphics2D g){
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                if(map[i][j] >0){
                    g.setColor(Color.red);
                    g.fillRect(j*bricksWidth+80, i*bricksHeight+50, bricksWidth, bricksHeight);
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j*bricksWidth+80, i*bricksHeight+50, bricksWidth, bricksHeight);
                    
                }
            
        }
        }
    }
    
}*/
package com.mycompany.brickbreakergame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author chinm
 */
public class MapGenerator {
     public int map[][];
    public int bricksWidth;
    public int bricksHeight;
    public MapGenerator(int row , int col){
        map = new int[row][col];
         for (int[] map1 : map) {
             for (int j = 0; j < map[0].length; j++) {
                 map1[j] = 1;
             }
         }
        bricksWidth = 540/col;
        bricksHeight = 150/row;
    }
    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    g.setColor(Color.orange);// brick colour
                    g.fillRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);

                }
            }

        }
    }
    public void setBricksValue(int value,int row,int col)
    {
        map[row][col] = value;

    }

}
