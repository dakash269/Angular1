
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object top_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class top extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.32*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en" data-framework="angular2">
  <head>
    <title>"""),_display_(/*7.13*/title),format.raw/*7.18*/("""</title>
      <base href="/" />
      <meta charset="utf-8">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.at("stylesheets/start.css")),format.raw/*10.91*/("""">
    <script type="text/javascript" src=""""),_display_(/*11.42*/routes/*11.48*/.Assets.at("javascripts/jquery-3.1.1.min.js")),format.raw/*11.93*/(""""></script>
    <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*13.66*/routes/*13.72*/.Assets.at("bootstrap/css/bootstrap.min.css")),format.raw/*13.117*/("""">
    <script src=""""),_display_(/*14.19*/routes/*14.25*/.Assets.at("bootstrap/js/bootstrap.min.js")),format.raw/*14.68*/("""" type="text/javascript"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
      


  </head>

  <body>
     

      <nav class="navbar-custom navbar navbar-fixed-top">
        <div class="navbar-header">
            <div class="cent col-md-1"></div>
        </div>
       <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
           <ul class="nav navbar-nav">
               <li class="active"><h2 class="zemofnt fontrobo colBlack ">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;Keep</h2></li>
           </ul>
       </div>
      </nav>
      """),_display_(/*34.8*/content),format.raw/*34.15*/("""
      """),format.raw/*35.7*/("""<script src=""""),_display_(/*35.21*/routes/*35.27*/.Assets.at("javascripts/controllers/MainController.js")),format.raw/*35.82*/(""""></script>

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


}

/**/
object top extends top_Scope0.top
              /*
                  -- GENERATED --
                  DATE: Thu Mar 23 19:16:33 IST 2017
                  SOURCE: /home/akash/Pictures/finale/app/views/top.scala.html
                  HASH: fb3165ed8532beff94a34bf43a57d6a34d0577fb
                  MATRIX: 909->2|1034->32|1062->34|1168->114|1193->119|1331->230|1346->236|1402->271|1473->315|1488->321|1554->366|1740->525|1755->531|1822->576|1870->597|1885->603|1949->646|2694->1365|2722->1372|2756->1379|2797->1393|2812->1399|2888->1454
                  LINES: 34->2|39->2|41->4|44->7|44->7|47->10|47->10|47->10|48->11|48->11|48->11|50->13|50->13|50->13|51->14|51->14|51->14|71->34|71->34|72->35|72->35|72->35|72->35
                  -- GENERATED --
              */
          