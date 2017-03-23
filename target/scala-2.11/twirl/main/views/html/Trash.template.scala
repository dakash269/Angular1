
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object Trash_Scope0 {
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

class Trash extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html><head>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.at("stylesheets/Trash.css")),format.raw/*5.91*/("""">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" media="screen" href=""""),_display_(/*10.48*/routes/*10.54*/.Assets.at("stylesheets/start.css")),format.raw/*10.89*/("""">
  <link rel="stylesheet" media="screen" href=""""),_display_(/*11.48*/routes/*11.54*/.Assets.at("stylesheets/note2.css")),format.raw/*11.89*/("""">
  <script type="text/javascript" src=""""),_display_(/*12.40*/routes/*12.46*/.Assets.at("javascripts/jquery-3.1.1.min.js")),format.raw/*12.91*/(""""></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js" type="text/javascript"></script>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
  <link rel="stylesheet" href=""""),_display_(/*16.33*/routes/*16.39*/.Assets.at("font-awesome/css/font-awesome.min.css")),format.raw/*16.90*/("""">
  <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*17.64*/routes/*17.70*/.Assets.at("bootstrap/css/bootstrap.min.css")),format.raw/*17.115*/("""">
  <script src=""""),_display_(/*18.17*/routes/*18.23*/.Assets.at("bootstrap/js/bootstrap.js")),format.raw/*18.62*/("""" type="text/javascript"></script>
  <script type="text/javascript" src=""""),_display_(/*19.40*/routes/*19.46*/.Assets.at("javascripts/angular.min.js")),format.raw/*19.86*/(""""></script>
  <script type="text/javascript" src=""""),_display_(/*20.40*/routes/*20.46*/.Assets.at("javascripts/moment.js")),format.raw/*20.81*/(""""></script>
  <script type="text/javascript" src=""""),_display_(/*21.40*/routes/*21.46*/.Assets.at("javascripts/bootstrap-datetimepicker.min.js")),format.raw/*21.103*/(""""></script>
  <link rel="stylesheet" type="text/css" href=""""),_display_(/*22.49*/routes/*22.55*/.Assets.at("stylesheets/bootstrap-datetimepicker.min.css")),format.raw/*22.113*/("""">

</head>
  <body>

    <div id="top"></div>

    <div class="container"><div class="bar1"></div><div class="bar2"></div><div class="bar3"></div></div>


    <div id="search"><input type="text"name="search"class="col-sm-6"placeholder="Search"autocomplete="off"><br/></div>

    <div id="Trash"><h3>Trash</h3></div>

    <ul class="nav navbar-nav navbar-right">
      <li class="active padright"><a class="signout" href=""""),_display_(/*37.61*/routes/*37.67*/.HomeController.logout()),format.raw/*37.91*/("""">Signout</a></li>
    </ul>

    <div class="glyphicon glyphicon-bell"></div><br/><br/><br/><br/><br/>

      <div id="myId1" ng-app="trash"  ng-controller="trashController">
    <div class="padTopMore col-md-12" ng-cloak>
      <div class="row rowWithFullWidth col-md-12">
        <div id="items" class="no-padding col-md-10 col-md-offset-2">
          <div ng-repeat="post in posts">
            <div class="col-md-3 eachCard" >
              <div class="card" ng-clock>
                <input ng-model="id" name="id" ng-value="post.id" type="hidden">
                <div class="clickd">
                  <div name="title" class="title wordWrap" contenteditable="false" ng-cloak>"""),format.raw/*51.93*/("""{"""),format.raw/*51.94*/("""{"""),format.raw/*51.95*/(""" """),format.raw/*51.96*/("""post.title"""),format.raw/*51.106*/("""}"""),format.raw/*51.107*/("""}"""),format.raw/*51.108*/("""</div>
                  <div name="content" class="content wordWrap" contenteditable="false" ng-cloak>"""),format.raw/*52.97*/("""{"""),format.raw/*52.98*/("""{"""),format.raw/*52.99*/(""" """),format.raw/*52.100*/("""post.content"""),format.raw/*52.112*/("""}"""),format.raw/*52.113*/("""}"""),format.raw/*52.114*/("""</div>
                    <div name="reminder" class="remind" contenteditable="false"><div class="remindText" ng-cloak>"""),format.raw/*53.114*/("""{"""),format.raw/*53.115*/("""{"""),format.raw/*53.116*/("""post.reminder"""),format.raw/*53.129*/("""}"""),format.raw/*53.130*/("""}"""),format.raw/*53.131*/("""</div></div>
                </div>
                <div class="toolbar">
                  <div class="inner col-md-offset-2">
                    <div class="col-md-3"><a ng-click="delT(post.id)"><i data-toggle="tooltip" data-placement="bottom" title="Delete Note" class="fa fa-trash fa-lg" aria-hidden="true"></i></a></div>
                    <div class="col-md-3"><a ng-click="movetonote(post.id)"><i data-toggle="tooltip" data-placement="bottom" title="Move to Note"  class="glyphicon glyphicon-inbox" aria-hidden="true"></i></a></div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
      </div>

      <script src=""""),_display_(/*69.21*/routes/*69.27*/.Assets.at("/javascripts/controllers/MainController.js")),format.raw/*69.83*/(""""></script>
    <div class="gly">

      <ul><li><div class="glyphicon glyphicon-pencil">      &emsp;<a href=""""),_display_(/*72.77*/routes/*72.83*/.HomeController.note),format.raw/*72.103*/("""" id="notes">Notes</a></div></li><br/>
        <li><div class="glyphicon glyphicon-alert">       &emsp;<a href=""""),_display_(/*73.75*/routes/*73.81*/.HomeController.Reminder),format.raw/*73.105*/("""" id="reminder">Reminders</a></div></li><br/></ul>

      <hr style="border: 0.5px solid #918f8f" width="118%">

      <ul>Lables &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&emsp;&emsp;&emsp; EDIT<br/><br/><br/>
        <li><div class="glyphicon glyphicon-plus">       &emsp;Create new</div></li><br/></ul>

      <hr style="border: 0.5px solid #918f8f" width="118%">

      <ul><li><div class="glyphicon glyphicon-cloud-download">      &emsp;<a href=""""),_display_(/*82.85*/routes/*82.91*/.HomeController.Archive),format.raw/*82.114*/("""" id="archive">Archive</a></div></li><br/>
        <li><div class="glyphicon glyphicon-trash">       &emsp;Trash</div></li><br/></ul>

      <hr style="border: 0.5px solid #918f8f" width="118%">

      <ul><li><div class="glyphicon glyphicon-cog">         &emsp;Settings</div></li><br/>
        <li><div class="glyphicon glyphicon-question-sign">         &emsp;Help</div></li><br/></ul></div>

    <div class="img"></div>
    <div class="imgtxt">&emsp;&emsp;No notes in trash</div>
    <div class="scrollbar"id="style1"><div class="force-overflow"></div></div>
      <script>$(window).scroll(
              """),format.raw/*94.15*/("""{"""),format.raw/*94.16*/("""
                  """),format.raw/*95.19*/("""previousTop: 0
              """),format.raw/*96.15*/("""}"""),format.raw/*96.16*/(""",
              function () """),format.raw/*97.27*/("""{"""),format.raw/*97.28*/("""
                  """),format.raw/*98.19*/("""var currentTop = $(window).scrollTop();
                  if (currentTop < this.previousTop) """),format.raw/*99.54*/("""{"""),format.raw/*99.55*/("""
                      """),format.raw/*100.23*/("""$(".sidebar em").text("Up");
                      $("#top").show();
                  """),format.raw/*102.19*/("""}"""),format.raw/*102.20*/(""" """),format.raw/*102.21*/("""else """),format.raw/*102.26*/("""{"""),format.raw/*102.27*/("""
                      """),format.raw/*103.23*/("""$(".sidebar em").text("Down");
                      $("#top").hide();
                  """),format.raw/*105.19*/("""}"""),format.raw/*105.20*/("""
                  """),format.raw/*106.19*/("""this.previousTop = currentTop;
              """),format.raw/*107.15*/("""}"""),format.raw/*107.16*/(""");</script>
  </body></html>
"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object Trash extends Trash_Scope0.Trash
              /*
                  -- GENERATED --
                  DATE: Wed Mar 22 13:38:48 IST 2017
                  SOURCE: /home/akash/Videos/Movies/finale/app/views/Trash.scala.html
                  HASH: c4fdd703163ef7cd27d4b6e81fb5318495487526
                  MATRIX: 908->1|1018->16|1046->18|1150->96|1164->102|1219->137|1693->584|1708->590|1764->625|1841->675|1856->681|1912->716|1981->758|1996->764|2062->809|2420->1140|2435->1146|2507->1197|2600->1263|2615->1269|2682->1314|2728->1333|2743->1339|2803->1378|2904->1452|2919->1458|2980->1498|3058->1549|3073->1555|3129->1590|3207->1641|3222->1647|3301->1704|3388->1764|3403->1770|3483->1828|3933->2251|3948->2257|3993->2281|4705->2965|4734->2966|4763->2967|4792->2968|4831->2978|4861->2979|4891->2980|5022->3083|5051->3084|5080->3085|5110->3086|5151->3098|5181->3099|5211->3100|5360->3220|5390->3221|5420->3222|5462->3235|5492->3236|5522->3237|6269->3957|6284->3963|6361->4019|6499->4130|6514->4136|6556->4156|6696->4269|6711->4275|6757->4299|7253->4768|7268->4774|7313->4797|7948->5404|7977->5405|8024->5424|8081->5453|8110->5454|8166->5482|8195->5483|8242->5502|8363->5595|8392->5596|8444->5619|8560->5706|8590->5707|8620->5708|8654->5713|8684->5714|8736->5737|8854->5826|8884->5827|8932->5846|9006->5891|9036->5892
                  LINES: 34->1|39->1|41->3|43->5|43->5|43->5|48->10|48->10|48->10|49->11|49->11|49->11|50->12|50->12|50->12|54->16|54->16|54->16|55->17|55->17|55->17|56->18|56->18|56->18|57->19|57->19|57->19|58->20|58->20|58->20|59->21|59->21|59->21|60->22|60->22|60->22|75->37|75->37|75->37|89->51|89->51|89->51|89->51|89->51|89->51|89->51|90->52|90->52|90->52|90->52|90->52|90->52|90->52|91->53|91->53|91->53|91->53|91->53|91->53|107->69|107->69|107->69|110->72|110->72|110->72|111->73|111->73|111->73|120->82|120->82|120->82|132->94|132->94|133->95|134->96|134->96|135->97|135->97|136->98|137->99|137->99|138->100|140->102|140->102|140->102|140->102|140->102|141->103|143->105|143->105|144->106|145->107|145->107
                  -- GENERATED --
              */
          