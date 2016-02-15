import org.junit.*;
import static org.junit.Assert.*;

public class UnitTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle (1,1,1);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void isTriangle_sidesAreTriangle_true() {
    Triangle testTriangle = new Triangle (1,1,1);
    assertEquals(true, testTriangle.isTriangle());
  }

  @Test
  public void isTriangle_sidesAreNotTriangle_false() {
    Triangle testTriangle = new Triangle (10, 5, 1);
    assertEquals(false, testTriangle.isTriangle());
  }

  @Test
  public void isEquilateral_sidesAreAllEqual_true() {
    Triangle testTriangle = new Triangle (5, 5, 5);
    assertEquals(true, testTriangle.isEquilateral());
  }

  @Test
  public void isIsosceles_twoSidesAreEqual_true() {
    Triangle testTriangle = new Triangle (5,4,5);
    assertEquals(true, testTriangle.isIsosceles());
  }

  // @Test
  // public void isTriangle_sidesAreNotTriangle_false () {
  //   Triangle testTriangle = new Triangle(10,1,2) {
  //   }
  // }

  /*
  @Test
  public void giveChange_25cents_1quarter() {
    App testApp = new App();
    assertEquals("{Nickels=0, Dimes=0, Quarters=1, Pennies=0}", testApp.giveChange(25).toString());
  }
  */

}
