package controllers;

import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }

    public Result AboutUs() {
        return ok(views.html.AboutUs.render());
    }

    public Result Mens() {
        return ok(views.html.Mens.render());
    }

    public Result contactUs() {
        return ok(views.html.contactUs.render());
    }

    public Result Kids() {
        return ok(views.html.Kids.render());
    }

    public Result Womens() {
        return ok(views.html.Womens.render());
    }
}
