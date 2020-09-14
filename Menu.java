package culm;

import java.util.ArrayList;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;


public class Menu extends BasicGameState{
  public static StateBasedGame game;
    private int it = 1;
    public String c ="Checkers";
    public static int[][]xpos;
public ArrayList<ArrayList<Piece>> bpiece = new ArrayList();
public Image blackpiece;
public Image whitepiece;
    public Image board;
 Menu(int i){
for(int c=0;c<2;c++){
    bpiece.add(new ArrayList<Piece>());
}
for(int c=0;c<12;c++){
    bpiece.get(0).add(new Piece());
    bpiece.get(1).add(new Piece());
}
  this.it=i;
}

    @Override
    public int getID() {
               
   return 1;
    }

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
           game =sbg;
       board = new Image("Images\\baord.png");
       blackpiece = new Image("Images\\bpiece.png");
       whitepiece=new Image("Images\\wpiece.png");
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException {
        grphcs.drawImage(board,150,50);
        grphcs.drawString(c,350, 0);
        grphcs.setColor(Color.black);
  
        for(int c=0;c<12;c++){

        grphcs.drawImage(blackpiece,Piece.getX(0,c),Piece.getY(0,c));
        }
         for(int c=0;c<12;c++){

        grphcs.drawImage(whitepiece,Piece.getX(1,c),Piece.getY(1,c));
        }
        grphcs.setBackground(Color.white);
  
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
                 Input input = gc.getInput();
                 int x= input.getMouseX();
                 int y  =input.getMouseY();
        //System.out.println(input.getMouseX()+" "+input.getMouseY());
        if(x>250&&x<330&&y>468&&y<541&&input.isMouseButtonDown(0)){
            System.out.println(x+" "+y);
        }
    

    
}}
