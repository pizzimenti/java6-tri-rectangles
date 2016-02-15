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
          // int length = Integer.parseInt(request.queryParams("length"));
          // int width = Integer.parseInt(request.queryParams("width"));
          //
          // Rectangle myRectangle = new Rectangle(length, width);

      HashMap model = new HashMap();
      // model.put("result", myRectangle);
      model.put("template", "templates/output.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
      //additional pages would go here
  }

  //public static 'Returntype' 'FuncName' (Paramtype param) {}  //first business logic function

}
