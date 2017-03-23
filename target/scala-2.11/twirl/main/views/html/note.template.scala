
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object note_Scope0 {
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

class note extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String,userEmail: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
    <head>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*6.54*/routes/*6.60*/.Assets.at("stylesheets/note.css")),format.raw/*6.94*/("""">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/cs/bootstrap-theme.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.at("stylesheets/start.css")),format.raw/*11.95*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.at("stylesheets/note2.css")),format.raw/*12.95*/("""">
        <script type="text/javascript" src=""""),_display_(/*13.46*/routes/*13.52*/.Assets.at("javascripts/jquery-3.1.1.min.js")),format.raw/*13.97*/(""""></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js" type="text/javascript"></script>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
        <link rel="stylesheet" href=""""),_display_(/*17.39*/routes/*17.45*/.Assets.at("font-awesome/css/font-awesome.min.css")),format.raw/*17.96*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*18.70*/routes/*18.76*/.Assets.at("bootstrap/css/bootstrap.min.css")),format.raw/*18.121*/("""">
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.at("bootstrap/js/bootstrap.js")),format.raw/*19.68*/("""" type="text/javascript"></script>
        <script type="text/javascript" src=""""),_display_(/*20.46*/routes/*20.52*/.Assets.at("javascripts/angular.min.js")),format.raw/*20.92*/(""""></script>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*21.54*/routes/*21.60*/.Assets.at("stylesheets/simple-sidebar.css")),format.raw/*21.104*/("""">
        <script type="text/javascript" src=""""),_display_(/*22.46*/routes/*22.52*/.Assets.at("javascripts/hello.js")),format.raw/*22.86*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*23.46*/routes/*23.52*/.Assets.at("javascripts/moment.js")),format.raw/*23.87*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*24.46*/routes/*24.52*/.Assets.at("javascripts/bootstrap-datetimepicker.min.js")),format.raw/*24.109*/(""""></script>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*25.55*/routes/*25.61*/.Assets.at("stylesheets/bootstrap-datetimepicker.min.css")),format.raw/*25.119*/("""">

        <style>body"""),format.raw/*27.20*/("""{"""),format.raw/*27.21*/("""background-color:#e8e8e8;"""),format.raw/*27.46*/("""}"""),format.raw/*27.47*/("""</style>
        <style>.modal"""),format.raw/*28.22*/("""{"""),format.raw/*28.23*/("""display:none;position:fixed;z-index:1;padding-top: 55px;left:0;top:0;width:100%;height:100%;overflow:auto;background-color:rgba(0,0,0,0.4);"""),format.raw/*28.162*/("""}"""),format.raw/*28.163*/("""
        """),format.raw/*29.9*/(""".modal-content"""),format.raw/*29.23*/("""{"""),format.raw/*29.24*/("""background-color:#fefefe;margin:auto;padding:20px;border:1px solid #888;width:25%;height:90%;"""),format.raw/*29.117*/("""}"""),format.raw/*29.118*/("""
        """),format.raw/*30.9*/(""".close """),format.raw/*30.16*/("""{"""),format.raw/*30.17*/("""color:#aaaaaa;float:right;font-size:15px;font-weight:bold;"""),format.raw/*30.75*/("""}"""),format.raw/*30.76*/("""
        """),format.raw/*31.9*/(""".close:hover,.close:focus"""),format.raw/*31.34*/("""{"""),format.raw/*31.35*/("""color:#000;text-decoration:none;cursor:pointer;"""),format.raw/*31.82*/("""}"""),format.raw/*31.83*/("""</style>

    </head><body>
    <nav class="navbar-custom navbar navbar-fixed-top">
        <div class="navbar-header">
            <div class="cent col-sm-1 col-md-1"><a href="#menu-toggle" id="menu-toggle"><span class="glyphicon glyphicon-menu-hamburger" aria-hidden="true"></span></a></div>
        </div>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><h1 class="zemofnt fontrobo colBlack ">Keep</h1></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class="active padright"><a class="black" href=""""),_display_(/*43.69*/routes/*43.75*/.HomeController.logout),format.raw/*43.97*/("""">Signout</a></li>
            </ul>
            <div class="col-sm-8 col-md-8 padtopSearch">
                <form class="navbar-form" role="search">
                    <div class="searchBox input-group">
                        <input onfocus="myFunction()" type="text" class="search1 form-control" placeholder="Search" name="q">
                    </div>
                </form>
            </div>
            <div class="userName pull-right">"""),_display_(/*52.47*/userEmail),format.raw/*52.56*/("""</div>
        </div>
    </nav>

    <div id="wrapper" class="toggled">
            <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="itemList">
                    <a href=""""),_display_(/*61.31*/routes/*61.37*/.HomeController.note()),format.raw/*61.59*/("""">
                        <div class="col-sm-3 col-md-3"><i class="fa fa-pencil fa-lg" aria-hidden="true"></i></div><div class="col-sm-6 col-sm-offset-1 col-md-9 col-md-offset-0">Notes</div>
                    </a>
                </li>
                <hr style="border: 0.5px solid #918f8f" width="118%">
                <li class="itemList">
                    <a href=""""),_display_(/*67.31*/routes/*67.37*/.HomeController.Archive()),format.raw/*67.62*/("""">
                        <div class="col-sm-3 col-md-3"><i class="fa fa-archive fa-lg" aria-hidden="true"></i></div><div class="col-sm-6 col-sm-offset-1 col-md-9 col-md-offset-0">Archive</div>

                    </a>
                </li>
                <hr style="border: 0.5px solid #918f8f" width="118%">
                <li class="itemList">
                    <a href=""""),_display_(/*74.31*/routes/*74.37*/.HomeController.Reminder()),format.raw/*74.63*/("""">
                        <div class="col-sm-3 col-md-3"><i class="fa fa-bell fa-lg" aria-hidden="true"></i></div><div class="col-sm-6 col-sm-offset-1 col-md-9 col-md-offset-0">Reminder</div>

                    </a>
                </li>
                <hr style="border: 0.5px solid #918f8f" width="118%">
                <li class="itemList">
                    <a href=""""),_display_(/*81.31*/routes/*81.37*/.HomeController.Trash()),format.raw/*81.60*/("""">
                        <div class="col-sm-3 col-md-3"><i class="fa fa-trash fa-lg" aria-hidden="true"></i></div><div class="col-sm-6 col-sm-offset-1 col-md-9 col-md-offset-0">Trash</div>

                    </a>
                </li>

            </ul>
        </div>
            <div id="myId" ng-app="note"  ng-controller="noteController">
                <div class="form-group">
                    <div class="note col-sm-6  col-md-6 col-md-offset-3">
                        <input ng-model="user" ng-init="user=' """),_display_(/*92.65*/userEmail),format.raw/*92.74*/("""'" name="user" type="hidden">

                        <div ng-show="showRest" id="titleDiv" ng-style="myStyle" class="title" ng-cloak>
                            <input ng-model="title" class="textDivInp" placeholder="Title" name="title" type="text">
                        </div>
                        <div id="contentDiv" class="content1">
                            <textarea ng-focus="showRest = true" ng-model="content" placeholder="Take a note..." name="content"></textarea>
                        </div>

                        <div ng-show="showRest" id="toolbarDiv" class="toolbar" ng-cloak>
                            <div class="col-sm-4 col-md-4">
                                <input ng-model="reminder" class="timeInp datetimepicker4" type="text" name="reminder" placeholder="Set Reminder"/>

                            </div>

                            <div class="col-sm-10 col-md-10">
                                <div align="right" > <button class="done" ng-click="sendData();showRest=false;">Done</button> </div>
                            </div>
                        </div>
                    </div>
                </div>


                <div class="padTopMore col-sm-12 col-md-12" ng-cloak>
                    <div class="row rowWithFullWidth col-sm-12 col-md-12">
                        <div id="items" class="no-padding col-sm-10 col-md-10 col-md-offset-2">
                            <div ng-repeat="post in posts">
                                <div class="col-sm-12 col-md-3 eachCard">
                                    <div class="card" ng-clock>
                                        <input ng-model="id" name="id" ng-value="post.id" type="hidden">
                                        <div class="clickd">
                                            <div name="title" class="title wordWrap" contenteditable="false" ng-cloak>"""),format.raw/*123.119*/("""{"""),format.raw/*123.120*/("""{"""),format.raw/*123.121*/(""" """),format.raw/*123.122*/("""post.title"""),format.raw/*123.132*/("""}"""),format.raw/*123.133*/("""}"""),format.raw/*123.134*/("""</div>
                                            <div name="content" class="content wordWrap" contenteditable="false" ng-cloak>"""),format.raw/*124.123*/("""{"""),format.raw/*124.124*/("""{"""),format.raw/*124.125*/(""" """),format.raw/*124.126*/("""post.content"""),format.raw/*124.138*/("""}"""),format.raw/*124.139*/("""}"""),format.raw/*124.140*/("""</div>
                                            <div name="reminder" class="remind1" contenteditable="false"><div class="remindText" ng-cloak>"""),format.raw/*125.139*/("""{"""),format.raw/*125.140*/("""{"""),format.raw/*125.141*/("""post.reminder"""),format.raw/*125.154*/("""}"""),format.raw/*125.155*/("""}"""),format.raw/*125.156*/("""</div></div>
                                        </div>
                                        <div class="toolbar">
                                            <div class="inner col-sm-offset-2 col-md-offset-2">
                                                <div class="col-sm-3 col-md-3"><a ng-click="del(post.id)"><i data-toggle="tooltip" data-placement="bottom" title="Delete Note" class="fa fa-trash fa-lg" aria-hidden="true"></i></a></div>
                                                <div class="col-sm-3 col-md-3"><a ng-click="archive(post.id)"><i data-toggle="tooltip" data-placement="bottom" title="Archive Note" class="fa fa-archive fa-lg" aria-hidden="true"></i></a></div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                """),format.raw/*140.72*/("""
                    """),format.raw/*141.51*/("""
                        """),format.raw/*142.53*/("""
                            """),format.raw/*143.61*/("""
                                """),format.raw/*144.84*/("""
                                """),format.raw/*145.82*/("""
                                """),format.raw/*146.110*/("""
                                """),format.raw/*147.175*/("""
                                """),format.raw/*148.74*/("""
                                    """),format.raw/*149.135*/("""
                                """),format.raw/*150.43*/("""
                                """),format.raw/*151.57*/("""
                                    """),format.raw/*152.65*/("""

                                    """),format.raw/*154.47*/("""
                                """),format.raw/*155.43*/("""
                                """),format.raw/*156.74*/("""
                                    """),format.raw/*157.153*/("""
                                """),format.raw/*158.43*/("""
                            """),format.raw/*159.39*/("""
                        """),format.raw/*160.35*/("""

                    """),format.raw/*162.31*/("""
                """),format.raw/*163.27*/("""

            """),format.raw/*165.13*/("""</div>

    <script src=""""),_display_(/*167.19*/routes/*167.25*/.Assets.at("/javascripts/controllers/MainController.js")),format.raw/*167.81*/(""""></script>



    """),format.raw/*171.32*/("""
    """),format.raw/*172.64*/("""
    """),format.raw/*173.84*/("""
    """),format.raw/*174.5*/("""</div>
    <script>
            var x = screen.width;
            console.log(x);
            $(function () """),format.raw/*178.27*/("""{"""),format.raw/*178.28*/(""" """),format.raw/*178.29*/("""$('.datetimepicker4').datetimepicker();"""),format.raw/*178.68*/("""}"""),format.raw/*178.69*/(""");
            $('.datetimepicker4').blur(function ()
            """),format.raw/*180.13*/("""{"""),format.raw/*180.14*/("""
                """),format.raw/*181.17*/("""angular.element($('.datetimepicker4')).triggerHandler('input');
            """),format.raw/*182.13*/("""}"""),format.raw/*182.14*/(""");
//            $(document).on('click', '.clickd', function () """),format.raw/*183.62*/("""{"""),format.raw/*183.63*/(""" """),format.raw/*183.64*/("""$('#myModal').modal('show');"""),format.raw/*183.92*/("""}"""),format.raw/*183.93*/(""");
//            $(document).on('click', '#updateButton', function () """),format.raw/*184.68*/("""{"""),format.raw/*184.69*/(""" """),format.raw/*184.70*/("""$('#myModal').modal('toggle');"""),format.raw/*184.100*/("""}"""),format.raw/*184.101*/(""");
    </script>
    <script>$(window).scroll(
            """),format.raw/*187.13*/("""{"""),format.raw/*187.14*/("""previousTop: 0"""),format.raw/*187.28*/("""}"""),format.raw/*187.29*/(""",
            function () """),format.raw/*188.25*/("""{"""),format.raw/*188.26*/("""
                """),format.raw/*189.17*/("""var currentTop = $(window).scrollTop();
                if (currentTop < this.previousTop) """),format.raw/*190.52*/("""{"""),format.raw/*190.53*/("""$(".sidebar em").text("Up");$("#top").show();"""),format.raw/*190.98*/("""}"""),format.raw/*190.99*/("""
                """),format.raw/*191.17*/("""else """),format.raw/*191.22*/("""{"""),format.raw/*191.23*/("""$(".sidebar em").text("Down");$("#top").hide();"""),format.raw/*191.70*/("""}"""),format.raw/*191.71*/("""
                """),format.raw/*192.17*/("""this.previousTop = currentTop;
            """),format.raw/*193.13*/("""}"""),format.raw/*193.14*/(""");</script>
    <script>
            var count=0;
            $(".container").click(function()"""),format.raw/*196.45*/("""{"""),format.raw/*196.46*/("""
                """),format.raw/*197.17*/("""if(count%2==0) """),format.raw/*197.32*/("""{"""),format.raw/*197.33*/("""
                    """),format.raw/*198.21*/("""$("div.gly").hide();
                    count++;
                """),format.raw/*200.17*/("""}"""),format.raw/*200.18*/("""
                """),format.raw/*201.17*/("""else """),format.raw/*201.22*/("""{"""),format.raw/*201.23*/("""
                    """),format.raw/*202.21*/("""count++;
                    $("div.gly").show();
                """),format.raw/*204.17*/("""}"""),format.raw/*204.18*/("""
            """),format.raw/*205.13*/("""}"""),format.raw/*205.14*/(""")
            </script>
    <script>var modal = document.getElementById('myModal1');
    var btn = document.getElementById("myBtn1");
    var span = document.getElementsByClassName("close")[0];
    btn.onclick = function() """),format.raw/*210.30*/("""{"""),format.raw/*210.31*/("""modal.style.display = "block";"""),format.raw/*210.61*/("""}"""),format.raw/*210.62*/("""
    """),format.raw/*211.5*/("""span.onclick = function() """),format.raw/*211.31*/("""{"""),format.raw/*211.32*/("""modal.style.display = "none";"""),format.raw/*211.61*/("""}"""),format.raw/*211.62*/("""
    """),format.raw/*212.5*/("""window.onclick = function(event) """),format.raw/*212.38*/("""{"""),format.raw/*212.39*/("""if (event.target == modal) """),format.raw/*212.66*/("""{"""),format.raw/*212.67*/("""modal.style.display = "none";"""),format.raw/*212.96*/("""}"""),format.raw/*212.97*/("""}"""),format.raw/*212.98*/("""</script>
    """),format.raw/*213.65*/("""
    """),format.raw/*214.53*/("""
    """),format.raw/*215.64*/("""
    """),format.raw/*216.66*/("""
    """),format.raw/*217.66*/("""
    """),format.raw/*218.111*/("""


"""),format.raw/*221.1*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,userEmail:String): play.twirl.api.HtmlFormat.Appendable = apply(title,userEmail)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (title,userEmail) => apply(title,userEmail)

  def ref: this.type = this

}


}

/**/
object note extends note_Scope0.note
              /*
                  -- GENERATED --
                  DATE: Thu Mar 23 11:30:34 IST 2017
                  SOURCE: /home/akash/Videos/Movies/finale/app/views/note.scala.html
                  HASH: bc1a6158045f12ca97314dabbcbc4802d485fc7a
                  MATRIX: 913->1|1041->34|1069->36|1228->169|1242->175|1296->209|1799->685|1814->691|1870->726|1953->782|1968->788|2024->823|2099->871|2114->877|2180->922|2562->1277|2577->1283|2649->1334|2748->1406|2763->1412|2830->1457|2882->1482|2897->1488|2957->1527|3064->1607|3079->1613|3140->1653|3232->1718|3247->1724|3313->1768|3388->1816|3403->1822|3458->1856|3542->1913|3557->1919|3613->1954|3697->2011|3712->2017|3791->2074|3884->2140|3899->2146|3979->2204|4030->2227|4059->2228|4112->2253|4141->2254|4199->2284|4228->2285|4396->2424|4426->2425|4462->2434|4504->2448|4533->2449|4655->2542|4685->2543|4721->2552|4756->2559|4785->2560|4871->2618|4900->2619|4936->2628|4989->2653|5018->2654|5093->2701|5122->2702|5807->3360|5822->3366|5865->3388|6341->3837|6371->3846|6640->4088|6655->4094|6698->4116|7102->4493|7117->4499|7163->4524|7571->4905|7586->4911|7633->4937|8039->5316|8054->5322|8098->5345|8651->5871|8681->5880|10601->7770|10632->7771|10663->7772|10694->7773|10734->7783|10765->7784|10796->7785|10955->7914|10986->7915|11017->7916|11048->7917|11090->7929|11121->7930|11152->7931|11327->8076|11358->8077|11389->8078|11432->8091|11463->8092|11494->8093|12531->9156|12581->9207|12635->9260|12693->9321|12755->9405|12817->9487|12880->9597|12943->9772|13005->9846|13072->9981|13134->10024|13196->10081|13262->10146|13329->10194|13391->10237|13453->10311|13520->10464|13582->10507|13640->10546|13694->10581|13745->10613|13791->10640|13834->10654|13888->10680|13904->10686|13982->10742|14030->10788|14064->10852|14098->10936|14131->10941|14268->11049|14298->11050|14328->11051|14396->11090|14426->11091|14521->11157|14551->11158|14597->11175|14702->11251|14732->11252|14825->11316|14855->11317|14885->11318|14942->11346|14972->11347|15071->11417|15101->11418|15131->11419|15191->11449|15222->11450|15310->11509|15340->11510|15383->11524|15413->11525|15468->11551|15498->11552|15544->11569|15664->11660|15694->11661|15768->11706|15798->11707|15844->11724|15878->11729|15908->11730|15984->11777|16014->11778|16060->11795|16132->11838|16162->11839|16285->11933|16315->11934|16361->11951|16405->11966|16435->11967|16485->11988|16580->12054|16610->12055|16656->12072|16690->12077|16720->12078|16770->12099|16865->12165|16895->12166|16937->12179|16967->12180|17219->12403|17249->12404|17308->12434|17338->12435|17371->12440|17426->12466|17456->12467|17514->12496|17544->12497|17577->12502|17639->12535|17669->12536|17725->12563|17755->12564|17813->12593|17843->12594|17873->12595|17916->12669|17950->12722|17984->12786|18018->12852|18052->12918|18087->13029|18118->13032
                  LINES: 34->1|39->1|41->3|44->6|44->6|44->6|49->11|49->11|49->11|50->12|50->12|50->12|51->13|51->13|51->13|55->17|55->17|55->17|56->18|56->18|56->18|57->19|57->19|57->19|58->20|58->20|58->20|59->21|59->21|59->21|60->22|60->22|60->22|61->23|61->23|61->23|62->24|62->24|62->24|63->25|63->25|63->25|65->27|65->27|65->27|65->27|66->28|66->28|66->28|66->28|67->29|67->29|67->29|67->29|67->29|68->30|68->30|68->30|68->30|68->30|69->31|69->31|69->31|69->31|69->31|81->43|81->43|81->43|90->52|90->52|99->61|99->61|99->61|105->67|105->67|105->67|112->74|112->74|112->74|119->81|119->81|119->81|130->92|130->92|161->123|161->123|161->123|161->123|161->123|161->123|161->123|162->124|162->124|162->124|162->124|162->124|162->124|162->124|163->125|163->125|163->125|163->125|163->125|163->125|178->140|179->141|180->142|181->143|182->144|183->145|184->146|185->147|186->148|187->149|188->150|189->151|190->152|192->154|193->155|194->156|195->157|196->158|197->159|198->160|200->162|201->163|203->165|205->167|205->167|205->167|209->171|210->172|211->173|212->174|216->178|216->178|216->178|216->178|216->178|218->180|218->180|219->181|220->182|220->182|221->183|221->183|221->183|221->183|221->183|222->184|222->184|222->184|222->184|222->184|225->187|225->187|225->187|225->187|226->188|226->188|227->189|228->190|228->190|228->190|228->190|229->191|229->191|229->191|229->191|229->191|230->192|231->193|231->193|234->196|234->196|235->197|235->197|235->197|236->198|238->200|238->200|239->201|239->201|239->201|240->202|242->204|242->204|243->205|243->205|248->210|248->210|248->210|248->210|249->211|249->211|249->211|249->211|249->211|250->212|250->212|250->212|250->212|250->212|250->212|250->212|250->212|251->213|252->214|253->215|254->216|255->217|256->218|259->221
                  -- GENERATED --
              */
          