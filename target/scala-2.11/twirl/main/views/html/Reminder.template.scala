
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object Reminder_Scope0 {
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

class Reminder extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html><head>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.at("stylesheets/Reminder.css")),format.raw/*5.94*/("""">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/cs/bootstrap-theme.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.at("stylesheets/start.css")),format.raw/*10.91*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*11.50*/routes/*11.56*/.Assets.at("stylesheets/note2.css")),format.raw/*11.91*/("""">
    <script type="text/javascript" src=""""),_display_(/*12.42*/routes/*12.48*/.Assets.at("javascripts/jquery-3.1.1.min.js")),format.raw/*12.93*/(""""></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
    <link rel="stylesheet" href=""""),_display_(/*16.35*/routes/*16.41*/.Assets.at("font-awesome/css/font-awesome.min.css")),format.raw/*16.92*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*17.66*/routes/*17.72*/.Assets.at("bootstrap/css/bootstrap.min.css")),format.raw/*17.117*/("""">
    <script src=""""),_display_(/*18.19*/routes/*18.25*/.Assets.at("bootstrap/js/bootstrap.js")),format.raw/*18.64*/("""" type="text/javascript"></script>
    <script type="text/javascript" src=""""),_display_(/*19.42*/routes/*19.48*/.Assets.at("javascripts/angular.min.js")),format.raw/*19.88*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*20.42*/routes/*20.48*/.Assets.at("javascripts/moment.js")),format.raw/*20.83*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*21.42*/routes/*21.48*/.Assets.at("javascripts/bootstrap-datetimepicker.min.js")),format.raw/*21.105*/(""""></script>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*22.51*/routes/*22.57*/.Assets.at("stylesheets/bootstrap-datetimepicker.min.css")),format.raw/*22.115*/("""">

    <style>body"""),format.raw/*24.16*/("""{"""),format.raw/*24.17*/("""background-color:#e8e8e8;"""),format.raw/*24.42*/("""}"""),format.raw/*24.43*/("""</style>
</head>
    <body>

        <div id="top"></div>

        <div class="container"><div class="bar1"></div><div class="bar2"></div><div class="bar3"></div></div>


        <div id="search"><input type="text" name="search" class="col-sm-6" placeholder="Search" autocomplete="off"><br/></div>

        <ul class="nav navbar-nav navbar-right">
            <li class="active padright"><a class="signout" href=""""),_display_(/*36.67*/routes/*36.73*/.HomeController.logout()),format.raw/*36.97*/("""">Signout</a></li>
        </ul>

        <div class="glyphicon glyphicon-bell"></div><br/><br/><br/><br/><br/>

        <div id="Reminder"><h3>Reminder</h3></div>
        <div ng-app="rem" ng-controller="ReminderHttpGetController">
            <div class="padTopMore col-md-12" ng-cloak>
                <div class="row rowWithFullWidth col-md-12">
                    <div id="items" class="no-padding col-md-10 col-md-offset-2">
                        <div ng-repeat="post in postsReminder">
                            <div class="col-md-3 eachCard">
                                <div class="card" ng-clock>
                                    <input ng-model="id" name="id" ng-value="post.id" type="hidden">
                                    <div class="clickd">
                                        <div name="title" class="title wordWrap" contenteditable="false" ng-cloak>"""),format.raw/*51.115*/("""{"""),format.raw/*51.116*/("""{"""),format.raw/*51.117*/(""" """),format.raw/*51.118*/("""post.title"""),format.raw/*51.128*/("""}"""),format.raw/*51.129*/("""}"""),format.raw/*51.130*/("""</div>
                                        <div name="content" class="content wordWrap" contenteditable="false" ng-cloak>"""),format.raw/*52.119*/("""{"""),format.raw/*52.120*/("""{"""),format.raw/*52.121*/(""" """),format.raw/*52.122*/("""post.content"""),format.raw/*52.134*/("""}"""),format.raw/*52.135*/("""}"""),format.raw/*52.136*/("""</div>
                                        <div name="reminder" class="remind" contenteditable="false"><div class="remindText" ng-cloak>"""),format.raw/*53.134*/("""{"""),format.raw/*53.135*/("""{"""),format.raw/*53.136*/("""post.reminder"""),format.raw/*53.149*/("""}"""),format.raw/*53.150*/("""}"""),format.raw/*53.151*/("""</div></div>
                                    </div>
                                    <div class="toolbar">
                                        <div class="inner col-md-offset-2">
                                            <div class="col-md-3"><a ng-click="del(post.id)"><i data-toggle="tooltip" data-placement="bottom" title="Delete Note" class="fa fa-trash fa-lg" aria-hidden="true"></i></a></div>
                                            <div class="col-md-3"><a ng-click="archive(post.id)"><i data-toggle="tooltip" data-placement="bottom" title="Archive Note" class="fa fa-archive fa-lg" aria-hidden="true"></i></a></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


                <script src=""""),_display_(/*69.31*/routes/*69.37*/.Assets.at("/javascripts/controllers/MainController.js")),format.raw/*69.93*/(""""></script>
                <div class="gly">

                    <ul><li><div class="glyphicon glyphicon-pencil">      &emsp;<a href=""""),_display_(/*72.91*/routes/*72.97*/.HomeController.note),format.raw/*72.117*/("""" id="notes">Notes</a></div></li><br/>
                        <li><div class="glyphicon glyphicon-alert">       &emsp;Reminders</div></li><br/></ul>

                    <hr style="border: 0.5px solid #918f8f" width="118%">

                    <ul>Lables &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&emsp;&emsp;&emsp; EDIT<br/><br/><br/>
                        <li><div class="glyphicon glyphicon-plus">       &emsp;Create new</div></li><br/></ul>

                    <hr style="border: 0.5px solid #918f8f" width="118%">

                    <ul><li><div class="glyphicon glyphicon-cloud-download">      &emsp;<a href=""""),_display_(/*82.99*/routes/*82.105*/.HomeController.Archive),format.raw/*82.128*/("""" id="archive">Archive</a></div></li><br/>
                        <li><div class="glyphicon glyphicon-trash">       &emsp;<a href=""""),_display_(/*83.91*/routes/*83.97*/.HomeController.Trash),format.raw/*83.118*/("""" id="trash">Trash</a></div></li><br/></ul>

                    <hr style="border: 0.5px solid #918f8f" width="118%">

                    <ul><li><div class="glyphicon glyphicon-cog">         &emsp;Settings</div></li><br/>
                        <li><div class="glyphicon glyphicon-question-sign">         &emsp;Help</div></li><br/></ul></div>

                <div class="img"></div>
                <div class="imgtxt">Notes with upcoming reminders appear here</div>
            <div class="scrollbar" id="style1"><div class="force-overflow"></div></div></div>
        <script>$(window).scroll(
                """),format.raw/*94.17*/("""{"""),format.raw/*94.18*/("""
                    """),format.raw/*95.21*/("""previousTop: 0
                """),format.raw/*96.17*/("""}"""),format.raw/*96.18*/(""",
                function () """),format.raw/*97.29*/("""{"""),format.raw/*97.30*/("""
                    """),format.raw/*98.21*/("""var currentTop = $(window).scrollTop();
                    if (currentTop < this.previousTop) """),format.raw/*99.56*/("""{"""),format.raw/*99.57*/("""
                        """),format.raw/*100.25*/("""$(".sidebar em").text("Up");
                        $("#top").show();
                    """),format.raw/*102.21*/("""}"""),format.raw/*102.22*/(""" """),format.raw/*102.23*/("""else """),format.raw/*102.28*/("""{"""),format.raw/*102.29*/("""
                        """),format.raw/*103.25*/("""$(".sidebar em").text("Down");
                        $("#top").hide();
                    """),format.raw/*105.21*/("""}"""),format.raw/*105.22*/("""
                    """),format.raw/*106.21*/("""this.previousTop = currentTop;
                """),format.raw/*107.17*/("""}"""),format.raw/*107.18*/(""");</script>

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
object Reminder extends Reminder_Scope0.Reminder
              /*
                  -- GENERATED --
                  DATE: Wed Mar 22 13:38:48 IST 2017
                  SOURCE: /home/akash/Videos/Movies/finale/app/views/Reminder.scala.html
                  HASH: 50a1cc7fa50ae0230d0c1cc3dd3974119c8e465a
                  MATRIX: 914->1|1024->16|1052->18|1156->96|1170->102|1228->140|1711->596|1726->602|1782->637|1861->689|1876->695|1932->730|2003->774|2018->780|2084->825|2450->1164|2465->1170|2537->1221|2632->1289|2647->1295|2714->1340|2762->1361|2777->1367|2837->1406|2940->1482|2955->1488|3016->1528|3096->1581|3111->1587|3167->1622|3247->1675|3262->1681|3341->1738|3430->1800|3445->1806|3525->1864|3572->1883|3601->1884|3654->1909|3683->1910|4124->2324|4139->2330|4184->2354|5101->3242|5131->3243|5161->3244|5191->3245|5230->3255|5260->3256|5290->3257|5444->3382|5474->3383|5504->3384|5534->3385|5575->3397|5605->3398|5635->3399|5804->3539|5834->3540|5864->3541|5906->3554|5936->3555|5966->3556|6930->4493|6945->4499|7022->4555|7186->4692|7201->4698|7243->4718|7910->5358|7926->5364|7971->5387|8131->5520|8146->5526|8189->5547|8833->6163|8862->6164|8911->6185|8970->6216|8999->6217|9057->6247|9086->6248|9135->6269|9258->6364|9287->6365|9341->6390|9461->6481|9491->6482|9521->6483|9555->6488|9585->6489|9639->6514|9761->6607|9791->6608|9841->6629|9917->6676|9947->6677
                  LINES: 34->1|39->1|41->3|43->5|43->5|43->5|48->10|48->10|48->10|49->11|49->11|49->11|50->12|50->12|50->12|54->16|54->16|54->16|55->17|55->17|55->17|56->18|56->18|56->18|57->19|57->19|57->19|58->20|58->20|58->20|59->21|59->21|59->21|60->22|60->22|60->22|62->24|62->24|62->24|62->24|74->36|74->36|74->36|89->51|89->51|89->51|89->51|89->51|89->51|89->51|90->52|90->52|90->52|90->52|90->52|90->52|90->52|91->53|91->53|91->53|91->53|91->53|91->53|107->69|107->69|107->69|110->72|110->72|110->72|120->82|120->82|120->82|121->83|121->83|121->83|132->94|132->94|133->95|134->96|134->96|135->97|135->97|136->98|137->99|137->99|138->100|140->102|140->102|140->102|140->102|140->102|141->103|143->105|143->105|144->106|145->107|145->107
                  -- GENERATED --
              */
          