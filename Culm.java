package culm;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Culm extends StateBasedGame{

    public static void main(String[] args) throws SlickException {
          AppGameContainer app = new AppGameContainer(new Culm("Checkers"));
      app.setShowFPS(false);
      app.setDisplayMode(950, 720, false);
      app.start();
  
    }
    public Culm(String name){
        super(name);
    }

    @Override
    public void initStatesList(GameContainer gc) throws SlickException {
        this.addState(new Menu(0));
       this.addState(new Menu1(1));
    }


    
    
}
