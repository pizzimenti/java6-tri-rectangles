import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/input.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/result", (request, response) -> {

    //call business logic functions here

    int side1 = Integer.parseInt(request.queryParams("side1"));
    int side2 = Integer.parseInt(request.queryParams("side2"));
    int side3 = Integer.parseInt(request.queryParams("side3"));

    Triangle myTriangle = new Triangle (side1, side2, side3);

    String triangleType;

    if (myTriangle.isEquilateral()) {
      triangleType = "equilateral";
    } else if (myTriangle.isIsosceles()) {
      triangleType = "isosceles";
    }  else if (myTriangle.isScalene()) {
      triangleType = "scalene";
    }   else {
      triangleType = "not a triangle";
    }

          // int length = Integer.parseInt(request.queryParams("length"));
          // int width = Integer.parseInt(request.queryParams("width"));
          //
          // Rectangle myRectangle = new Rectangle(length, width);

      HashMap model = new HashMap();
      model.put("template", "templates/output.vtl");
      model.put("triangleType", triangleType);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
      //additional pages would go here
  }  //end of Main

  //public static 'Returntype' 'FuncName' (Paramtype param) {}  //first business logic function

}  //end of App
