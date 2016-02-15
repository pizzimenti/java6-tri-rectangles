import org.junit.*;
import static org.junit.Assert.*;

public class UnitTest {

  @Test
  public void newRectangle_instatiatesCorrectly() {
    Rectangle testRectangle = new Rectangle(2, 2);
    assertEquals(true, testRectangle instanceof Rectangle);
  }

  @Test
  public void isSquare_whenNotASquare_false() {
    Rectangle testRectangle = new Rectangle(2, 4);
    assertEquals(false, testRectangle.isSquare());
  }

  @Test
  public void isSquare_whenIsASquare_true() {
    Rectangle testRectangle = new Rectangle(4, 4);
    assertEquals(true, testRectangle.isSquare());
  }

  /*
  @Test
  public void giveChange_25cents_1quarter() {
    App testApp = new App();
    assertEquals("{Nickels=0, Dimes=0, Quarters=1, Pennies=0}", testApp.giveChange(25).toString());
  }
  */

}
