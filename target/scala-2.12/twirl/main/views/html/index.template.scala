
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Home")/*2.14*/ {_display_(Seq[Any](format.raw/*2.16*/("""
"""),format.raw/*3.1*/("""<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
 
    <div class="carousel-inner" role="listbox">
        <div class="item active">
          <img src="/assets/images/Addias.jpg" alt="Addias">
          <div class="carousel-caption">
		 
            <h3>Retail top sellers </h3>
            <p>click here for the latest reviews of this months shoes</p>
          </div> 
        </div>

        <div class="item">
            <img src="/assets/images/addias.jpg" alt="star wars the last jedi">
            <div class="carousel-caption">
              <h3>In Cinemason the 15th of December </h3>
              <p>12A</p>
            </div> 
          </div>    

          <div class="item">
            <img src="/assets/images/Deals.jpg" alt="Cinema Deals">
            <div class="carousel-caption">
              <h3>Student Nights Monday-Wednesday 2 Tickets for the price of 1</h3>
              <p>Available after 5pm , Book online for exclusive seating </p>
            </div> 
          </div>
        </div>
		<!-- They havent done anyhting that isnt on w3Schools so its grand ive changed a lot of it anyway  -->

        <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>


<div class="container">    
        <div class="row">
          <div class="col-sm-4">
<div class="panel panel-primary">
<div class="panel-heading">Mens</div>
 <div class="panel-body"><img src="/assets/images/Starwars2.jpg" style="width:100%" alt="Starwars2"></div>
              <div class="panel-footer">  </div>
            </div>
          </div>
          <div class="col-sm-4"> 
            <div class="panel panel-danger">
              <div class="panel-heading">womens </div>
              <div class="panel-body"><img src="/assets/images/daddysHome2.jpg" style="width:100%" alt="daddysHome2"></div>
              <div class="panel-footer"></div>
            </div>
          </div>
          <div class="col-sm-4"> 
            <div class="panel panel-warning">
              <div class="panel-heading">Kids </div>
              <div class="panel-body"><img src="/assets/images/Wonder.jpg"class="img-responsive" style="width:100%" alt="Image"></div>
              <div class="panel-footer"> </div>
            </div>
          </div>
        </div>
      </div>
      <div class="container">    
        <div class="row">
          <div class="col-sm-4">
            <div class="panel panel-primary ">
              <div class="panel-heading"> Mens </div>
              <div class="panel-body"><img src="/assets/images/Paddington.jpg" class="img-responsive" style="width:100%" alt="Paddington2"></div>
              <div class="panel-footer"></div>
            </div>
          </div>
          <div class="col-sm-4"> 
            <div class="panel panel-danger ">
              <div class="panel-heading">womens</div>
              <div class="panel-body"><img src="/assets/images/PitchPerfect3.jpg" class="img-responsive" style="width:100%" alt="PitchPerfect3"></div>
              <div class="panel-footer"> </div>
            </div>
          </div>
          <div class="col-sm-4"> 
            <div class="panel panel-warning">
              <div class="panel-heading">Kids </div>
              <div class="panel-body"><img src="/assets/images/JusticeLeague.jpg" class="img-responsive" style="width:100%" alt="JusticeLeague"></div>
              <div class="panel-footer"></div>
            </div>
          </div>
        </div>
      </div><br><br>     
      </body>
      </html>
""")))}),format.raw/*103.2*/("""
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
                  DATE: Thu Apr 12 15:32:00 IST 2018
                  SOURCE: /home/wdd/ITPROJECT-master/app/views/index.scala.html
                  HASH: 7d8b868a4b309a372bebe6f785be52b8363132be
                  MATRIX: 1030->2|1050->14|1089->16|1116->17|5264->4134
                  LINES: 33->2|33->2|33->2|34->3|134->103
                  -- GENERATED --
              */
          