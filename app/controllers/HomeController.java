package controllers;

import play.mvc.*;
import play.data.*;
import models.medicina;
import views.html.*;
import javax.inject.Inject;
import com.avaje.ebean.Model;
import java.util.ArrayList;
import java.util.List;
import static play.libs.Json.toJson;

/**
 * This controller contains an action to handle HTTP requests to the
 * application's home page.
 */
public class HomeController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * An action that renders an HTML page with a welcome message. The
     * configuration in the <code>routes</code> file means that this method will
     * be called when the application receives a <code>GET</code> request with a
     * path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render(""));
    }

    public Result agregar() {
        return ok(agrega.render(""));
    }

    public Result modificar() {
        return ok(modifica.render(""));
    }
public Result borrar() {
        return ok(borra.render(""));
    }

  
    public Result addMedicina() {
        Form<medicina> medicinaForm = formFactory.form(medicina.class);
        medicina medicamento = medicinaForm.bindFromRequest().get();
        medicamento.save();
        return redirect(routes.HomeController.agregar());
    }

   
    public Result visualizar() {
        Model.Finder<Integer, medicina> finder = new Model.Finder<>(medicina.class);
        List<medicina> medicamentos = finder.all();
        return ok(visualiza.render(medicamentos));

    }
}
