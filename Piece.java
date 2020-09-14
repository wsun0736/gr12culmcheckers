/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package culm;

import java.util.ArrayList;
import org.newdawn.slick.Image;

/**
 *
 * @author wsun0736
 */
public class Piece {
    public static int [] bx = {105,264,423,582,185,344,503,662,105,264,423,582};
    public static int[]by={9,9,9,9,89,89,89,89,169,169,169,169};
    public static int[]wy={409,409,409,409,489,489,489,489,569,569,569,569};
    public static int[]wx={185,344,503,662,105,264,423,582,185,344,503,662};
    public static int h=105;


    public static int getX(int type, int position){
    
        if(type==0){
          return bx[position];  
        }else if(type==1){
     return wx[position]-8;
        }
        return 0;
    }
    public static int getY(int type, int position){
        if(type==0){
            return by[position];
        }else if(type ==1){
          return wy[position]-14;  
        }
       return 0; 
    }
}
