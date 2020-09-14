/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package culm;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class Menu1 extends BasicGameState{
    private StateBasedGame game;
    private int it=0;
    public static Image menu;
    Menu1(int i){
        this.it=i;
    }

    @Override
    public int getID() {
        return 0;
    }
    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        game =sbg;
        menu = new Image("Images//menu.png");
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException {
       grphcs.drawImage(menu,0,-5);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        int x= input.getMouseX();
        int y = input.getMouseY();
        System.out.println(input.getMouseX()+" "+input.getMouseY());
        if((x>=150&&x<=275)&&(y>=290&&y<=340)&&(input.isMousePressed(0))){
           game.enterState(1, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
        }
    }
    
}
