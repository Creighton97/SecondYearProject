
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*6.62*/("""
        """),format.raw/*7.9*/("""<title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("stylesheets/style.css")),format.raw/*9.102*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/styles.css")),format.raw/*10.103*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.59*/routes/*11.65*/.Assets.versioned("images/favicon.png")),format.raw/*11.104*/("""">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body>

        <body id="index" data-spy="scroll" data-target=".navbar" data-offset="10">
        <nav class="navbar .navbar-inverse navbar-fixed-top">
        <!-- ive changed the navbar because i think it is better  -->
          <div class="container-fluid ">
           <!-- container-fluid class will take the full width of the viewport.  
           If you use the container-fluid and resize the browser, 
           you may notice the content inside it will adjust with every pixel to take the full available width.-->
          <div class="navbar-header">
            <!-- just has to go here -->
            
             
              <a class="navbar-brand" href=""""),_display_(/*30.46*/routes/*30.52*/.HomeController.index()),format.raw/*30.75*/(""""><span class="glyphicon glyphicon-fire"></span>RRR</a>
            </div>
              <ul class="nav navbar-nav navbar">
                
                <li><a href=""""),_display_(/*34.31*/routes/*34.37*/.HomeController.Mens()),format.raw/*34.59*/(""""><span class="glyphicon glyphicon-user"></span>Men's</a></li>
                <li><a href=""""),_display_(/*35.31*/routes/*35.37*/.HomeController.Womens()),format.raw/*35.61*/(""""><i class="ionicons ion-woman"></i>
                  Women's</a></li>
                 
                <li><a href=""""),_display_(/*38.31*/routes/*38.37*/.HomeController.Kids()),format.raw/*38.59*/("""">Kids</a></li>
                <!-- this our headings for the web page  -->
               </ul>
               <ul class="nav navbar-nav navbar-right">
               <!-- im spillting it to the right because it looks nicear hope you agree  -->
               <li><a href=""""),_display_(/*43.30*/routes/*43.36*/.HomeController.AboutUs()),format.raw/*43.61*/(""""><span class="glyphicon glyphicon-info-sign"></span>
               </span> About Us</a></li>
                <li><a href=""""),_display_(/*45.31*/routes/*45.37*/.HomeController.contactUs()),format.raw/*45.64*/(""""><span class="glyphicon glyphicon-earphone"></span>Contact Us</a></li>
                </ul>
            </div>
          </div>
        </nav>
    
        """),_display_(/*51.10*/content),format.raw/*51.17*/("""
        """),format.raw/*52.9*/("""<script src=""""),_display_(/*52.23*/routes/*52.29*/.Assets.versioned("javascripts/main.js")),format.raw/*52.69*/("""" type="text/javascript"></script>
    </body>
</html>


"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 11 16:16:04 IST 2018
                  SOURCE: /home/wdd/ITPROJECT-master/app/views/main.scala.html
                  HASH: 66c48e1509dcd76dde6371af9f4a9c0da071141d
                  MATRIX: 952->1|1077->31|1105->33|1184->138|1219->147|1253->155|1278->160|1366->222|1380->228|1442->269|1524->325|1538->331|1601->373|1684->429|1699->435|1764->478|1852->539|1867->545|1928->584|3064->1693|3079->1699|3123->1722|3321->1893|3336->1899|3379->1921|3499->2014|3514->2020|3559->2044|3706->2164|3721->2170|3764->2192|4067->2468|4082->2474|4128->2499|4280->2624|4295->2630|4343->2657|4529->2816|4557->2823|4593->2832|4634->2846|4649->2852|4710->2892
                  LINES: 28->1|33->1|35->3|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|62->30|62->30|62->30|66->34|66->34|66->34|67->35|67->35|67->35|70->38|70->38|70->38|75->43|75->43|75->43|77->45|77->45|77->45|83->51|83->51|84->52|84->52|84->52|84->52
                  -- GENERATED --
              */
          