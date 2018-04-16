
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

object Womens extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Women's")/*1.17*/ {_display_(Seq[Any](format.raw/*1.19*/("""
    """),format.raw/*2.5*/("""<button onclick="myFunction('Demo1')" class="w3-button w3-block w3-left-align">
            Open Section 1</button>
            
            <div id="Demo1" class="w3-container w3-hide">
              <p>Some text..</p>
            </div>
            
            <script>
            function myFunction(id) """),format.raw/*10.37*/("""{"""),format.raw/*10.38*/("""
                """),format.raw/*11.17*/("""var x = document.getElementById(id);
                if (x.className.indexOf("w3-show") == -1) """),format.raw/*12.59*/("""{"""),format.raw/*12.60*/("""
                    """),format.raw/*13.21*/("""x.className += " w3-show";
                """),format.raw/*14.17*/("""}"""),format.raw/*14.18*/(""" """),format.raw/*14.19*/("""else """),format.raw/*14.24*/("""{"""),format.raw/*14.25*/("""
                    """),format.raw/*15.21*/("""x.className = x.className.replace(" w3-show", "");
                """),format.raw/*16.17*/("""}"""),format.raw/*16.18*/("""
            """),format.raw/*17.13*/("""}"""),format.raw/*17.14*/("""
            """),format.raw/*18.13*/("""</script> 
""")))}),format.raw/*19.2*/("""
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
                  DATE: Fri Apr 13 16:29:40 IST 2018
                  SOURCE: /home/wdd/ITPROJECT-master/app/views/Womens.scala.html
                  HASH: fcd6cf4c8e2e9ea6a90e3688426132b9ad60757a
                  MATRIX: 1031->1|1054->16|1093->18|1125->24|1470->341|1499->342|1545->360|1669->456|1698->457|1748->479|1820->523|1849->524|1878->525|1911->530|1940->531|1990->553|2086->621|2115->622|2157->636|2186->637|2228->651|2271->664
                  LINES: 33->1|33->1|33->1|34->2|42->10|42->10|43->11|44->12|44->12|45->13|46->14|46->14|46->14|46->14|46->14|47->15|48->16|48->16|49->17|49->17|50->18|51->19
                  -- GENERATED --
              */
          