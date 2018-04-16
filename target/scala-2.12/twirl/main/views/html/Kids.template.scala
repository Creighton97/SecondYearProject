
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object Kids extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Kids")/*1.14*/ {_display_(Seq[Any](format.raw/*1.16*/("""
    """),format.raw/*2.5*/("""<div class="jumbotron text-center">
            <h1>..........</h1>
            <p>Resize this responsive page to see the effect!</p>
          </div>
          
          <div class="container">
            <div class="row">
              <div class="col-sm-4">
                <img src="addias.jpg" alt="addias">
                <h3>Column 1</h3>
                <p>Lorem ipsum dolor..</p>
                <p>Ut enim ad..</p>
              </div>
              <div class="col-sm-4">
                <h3>Column 2</h3>
                <p>Lorem ipsum dolor..</p>
                <p>Ut enim ad..</p>
              </div>
              <div class="col-sm-4">
                <h3>Column 3</h3>
                <p>Lorem ipsum dolor..</p>
                <p>Ut enim ad..</p>
              </div>
            </div>
            <div class="form-group">
                    <label for="comment">Comment:</label>
                    <textarea class="form-control" rows="5" id="comment"></textarea>
                  </div> 
          </div> 
""")))}),format.raw/*31.2*/("""

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 12 16:32:18 IST 2018
                  SOURCE: /home/wdd/ITPROJECT-master/app/views/Kids.scala.html
                  HASH: 29a30a82b1616fecbb831d435198d63f05568edb
                  MATRIX: 1029->1|1049->13|1088->15|1120->21|2214->1085
                  LINES: 33->1|33->1|33->1|34->2|63->31
                  -- GENERATED --
              */
          