
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object Archive_Scope0 {
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

class Archive extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html><head>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.at("stylesheets/Archive.css")),format.raw/*5.93*/("""">
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

  <style>body"""),format.raw/*24.14*/("""{"""),format.raw/*24.15*/("""background-color:#e8e8e8;"""),format.raw/*24.40*/("""}"""),format.raw/*24.41*/("""</style>
</head>
<body>

    <div id="top"></div>

    <div class="container"><div class="bar1"></div><div class="bar2"></div><div class="bar3"></div></div>


    <div id="search"><input type="text" name="search" class="col-sm-6" placeholder="Search" autocomplete="off"><br/></div>

    <ul class="nav navbar-nav navbar-right">
      <li class="active padright"><a class="signout" href=""""),_display_(/*36.61*/routes/*36.67*/.HomeController.logout()),format.raw/*36.91*/("""">Signout</a></li>
    </ul>

    <div class="glyphicon glyphicon-bell"></div><br/><br/><br/><br/><br/>

    <div id="Archive"><h3>Archive</h3></div>
      <div id="myId1" ng-app="archive1"  ng-controller="archiveController">
          <div class="padTopMore col-md-12" ng-cloak>
              <div class="row rowWithFullWidth col-md-12">
                  <div id="items" class="no-padding col-md-10 col-md-offset-2">
                      <div ng-repeat="post in posts">
                          <div class="col-md-3 eachCard" >
                              <div class="card" ng-clock>
                                  <input ng-model="id" name="id" ng-value="post.id" type="hidden">
                                  <div class="clickd">
                                      <div name="title" class="title wordWrap" contenteditable="false" ng-cloak>"""),format.raw/*51.113*/("""{"""),format.raw/*51.114*/("""{"""),format.raw/*51.115*/(""" """),format.raw/*51.116*/("""post.title"""),format.raw/*51.126*/("""}"""),format.raw/*51.127*/("""}"""),format.raw/*51.128*/("""</div>
                                      <div name="content" class="content wordWrap" contenteditable="false" ng-cloak>"""),format.raw/*52.117*/("""{"""),format.raw/*52.118*/("""{"""),format.raw/*52.119*/(""" """),format.raw/*52.120*/("""post.content"""),format.raw/*52.132*/("""}"""),format.raw/*52.133*/("""}"""),format.raw/*52.134*/("""</div>
                                      <div name="reminder" class="remind" contenteditable="false"><div class="remindText" ng-cloak>"""),format.raw/*53.132*/("""{"""),format.raw/*53.133*/("""{"""),format.raw/*53.134*/("""post.reminder"""),format.raw/*53.147*/("""}"""),format.raw/*53.148*/("""}"""),format.raw/*53.149*/("""</div></div>
                                  </div>
                                  <div class="toolbar">
                                      <div class="inner col-md-offset-2">
                                          <div class="col-md-3"><a ng-click="delA(post.id)"><i data-toggle="tooltip" data-placement="bottom" title="Delete Note" class="fa fa-trash fa-lg" aria-hidden="true"></i></a></div>
                                          <div class="col-md-3"><a ng-click="unarchive(post.id)"><i data-toggle="tooltip" data-placement="bottom" title="Unarchive Note"  class="glyphicon glyphicon-inbox" aria-hidden="true"></i></a></div>
                                      </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                      </div>
                  </div>
              </div>
          </div>
          <script src=""""),_display_(/*68.25*/routes/*68.31*/.Assets.at("/javascripts/controllers/MainController.js")),format.raw/*68.87*/(""""></script>
    <div class="gly">

      <ul><li><div class="glyphicon glyphicon-pencil">      &emsp;<a href=""""),_display_(/*71.77*/routes/*71.83*/.HomeController.note),format.raw/*71.103*/(""""id="notes">Notes</a></div></li><br/>
        <li><div class="glyphicon glyphicon-alert">       &emsp;<a href=""""),_display_(/*72.75*/routes/*72.81*/.HomeController.Reminder),format.raw/*72.105*/("""" id="reminder">Reminders</a></div></li><br/></ul>

      <hr style="border: 0.5px solid #918f8f" width="118%">

      <ul>Lables &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&emsp;&emsp;&emsp; EDIT<br/><br/><br/>
        <li><div class="glyphicon glyphicon-plus">       &emsp;Create new</div></li><br/></ul>

      <hr style="border: 0.5px solid #918f8f" width="118%">

      <ul><li><div class="glyphicon glyphicon-cloud-download">      &emsp;Archive</div></li><br>
        <li><div class="glyphicon glyphicon-trash">       &emsp;<a href=""""),_display_(/*82.75*/routes/*82.81*/.HomeController.Trash),format.raw/*82.102*/("""" id="trash">Trash</a></div></li><br/></ul>

      <hr style="border: 0.5px solid #918f8f" width="118%">

      <ul><li><div class="glyphicon glyphicon-cog">         &emsp;Settings</div></li><br/>
        <li><div class="glyphicon glyphicon-question-sign">         &emsp;Help</div></li><br/></ul></div>

    <div class="img"></div>
    <div class="imgtxt">&emsp;&emsp;Your archived notes appear here</div>
    <div class="scrollbar" id="style1"><div class="force-overflow"></div></div>
    <script>$(window).scroll(
            """),format.raw/*93.13*/("""{"""),format.raw/*93.14*/("""
                """),format.raw/*94.17*/("""previousTop: 0
            """),format.raw/*95.13*/("""}"""),format.raw/*95.14*/(""",
            function () """),format.raw/*96.25*/("""{"""),format.raw/*96.26*/("""
                """),format.raw/*97.17*/("""var currentTop = $(window).scrollTop();
                if (currentTop < this.previousTop) """),format.raw/*98.52*/("""{"""),format.raw/*98.53*/("""
                    """),format.raw/*99.21*/("""$(".sidebar em").text("Up");
                    $("#top").show();
                """),format.raw/*101.17*/("""}"""),format.raw/*101.18*/(""" """),format.raw/*101.19*/("""else """),format.raw/*101.24*/("""{"""),format.raw/*101.25*/("""
                    """),format.raw/*102.21*/("""$(".sidebar em").text("Down");
                    $("#top").hide();
                """),format.raw/*104.17*/("""}"""),format.raw/*104.18*/("""
                """),format.raw/*105.17*/("""this.previousTop = currentTop;
            """),format.raw/*106.13*/("""}"""),format.raw/*106.14*/(""");</script>
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
object Archive extends Archive_Scope0.Archive
              /*
                  -- GENERATED --
                  DATE: Wed Mar 22 13:38:48 IST 2017
                  SOURCE: /home/akash/Videos/Movies/finale/app/views/Archive.scala.html
                  HASH: 197838a1413829f49c2b1ceae7904c31eb24e379
                  MATRIX: 912->1|1022->16|1050->18|1154->96|1168->102|1225->139|1699->586|1714->592|1770->627|1847->677|1862->683|1918->718|1987->760|2002->766|2068->811|2426->1142|2441->1148|2513->1199|2606->1265|2621->1271|2688->1316|2734->1335|2749->1341|2809->1380|2910->1454|2925->1460|2986->1500|3064->1551|3079->1557|3135->1592|3213->1643|3228->1649|3307->1706|3394->1766|3409->1772|3489->1830|3534->1847|3563->1848|3616->1873|3645->1874|4060->2262|4075->2268|4120->2292|5005->3148|5035->3149|5065->3150|5095->3151|5134->3161|5164->3162|5194->3163|5346->3286|5376->3287|5406->3288|5436->3289|5477->3301|5507->3302|5537->3303|5704->3441|5734->3442|5764->3443|5806->3456|5836->3457|5866->3458|6853->4418|6868->4424|6945->4480|7083->4591|7098->4597|7140->4617|7279->4729|7294->4735|7340->4759|7923->5315|7938->5321|7981->5342|8537->5870|8566->5871|8611->5888|8666->5915|8695->5916|8749->5942|8778->5943|8823->5960|8942->6051|8971->6052|9020->6073|9132->6156|9162->6157|9192->6158|9226->6163|9256->6164|9306->6185|9420->6270|9450->6271|9496->6288|9568->6331|9598->6332
                  LINES: 34->1|39->1|41->3|43->5|43->5|43->5|48->10|48->10|48->10|49->11|49->11|49->11|50->12|50->12|50->12|54->16|54->16|54->16|55->17|55->17|55->17|56->18|56->18|56->18|57->19|57->19|57->19|58->20|58->20|58->20|59->21|59->21|59->21|60->22|60->22|60->22|62->24|62->24|62->24|62->24|74->36|74->36|74->36|89->51|89->51|89->51|89->51|89->51|89->51|89->51|90->52|90->52|90->52|90->52|90->52|90->52|90->52|91->53|91->53|91->53|91->53|91->53|91->53|106->68|106->68|106->68|109->71|109->71|109->71|110->72|110->72|110->72|120->82|120->82|120->82|131->93|131->93|132->94|133->95|133->95|134->96|134->96|135->97|136->98|136->98|137->99|139->101|139->101|139->101|139->101|139->101|140->102|142->104|142->104|143->105|144->106|144->106
                  -- GENERATED --
              */
          