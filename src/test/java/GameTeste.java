/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.fizzbuzz.Game;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alunoinf
 */
public class GameTeste {
    
   @Test
   public void testValidaNumNone(){
       Game game = new Game();
        assertEquals("1",game.validaNum(1));
        assertEquals("2",game.validaNum(2));
        assertEquals("4",game.validaNum(4));
       
   }
      @Test
   public void testValidaNumFizz(){
       Game game = new Game();
        assertEquals("fizz",game.validaNum(3));
        assertEquals("fizz",game.validaNum(9));
        assertEquals("fizz",game.validaNum(6));
   }
      @Test
   public void testValidaNumBuzz(){
       Game game = new Game();
        assertEquals("buzz",game.validaNum(5));
        assertEquals("buzz",game.validaNum(10));
        assertEquals("buzz",game.validaNum(20));
       
   }
      @Test
   public void testValidaFizzBuzz(){
       Game game = new Game();
        assertEquals("fizz buzz",game.validaNum(15));
        assertEquals("fizz buzz",game.validaNum(45));
        assertEquals("fizz buzz",game.validaNum(60));
       
   }
}
