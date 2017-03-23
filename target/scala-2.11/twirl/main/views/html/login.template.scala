
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
    """),_display_(/*2.6*/top("Login")/*2.18*/ {_display_(Seq[Any](format.raw/*2.20*/("""
        """),format.raw/*3.9*/("""<div id="myId" ng-app="login"  ng-controller="loginController">
            <div class="loginbox">
                <div class="formlr col-md-4 col-md-offset-4">
                    <div class="logpos">
                        <div class="form-group">
                            <h1 >Login</h1>
                        </div>
                        <form name="regForm" class="center" ng-submit="login()" method="post">
                            <div class="formcontent">
                                <div class="form-group">
                                    <div class="center fill">
                                        <input class="inp form-control" type="email" name="email" placeholder="Email" ng-model="email" required>
                                        <span class="error" ng-show="regForm.email.$touched && regForm.email.$invalid" ng-cloak>*An email is required!</span>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="center fill">
                                        <input class="inp form-control" type="password" placeholder="Password" name="password" ng-model="password" required >
                                        <span class="error" ng-show="regForm.password.$touched && regForm.password.$invalid" ng-cloak>*Password is required!</span><br>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="center col-lg-12 col-centered">
                                    <input id="bigbutton" type="submit" value="Login" />
                                </div>
                            </div>

                            <div class="padtop">
                                <div align="center">
                                    <div class="error1" ng-cloak>"""),format.raw/*34.66*/("""{"""),format.raw/*34.67*/("""{"""),format.raw/*34.68*/(""" """),format.raw/*34.69*/("""alertMessage """),format.raw/*34.82*/("""}"""),format.raw/*34.83*/("""}"""),format.raw/*34.84*/("""</div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="form-group">
                    <div class="center col-md-8 col-md-offset-2">
                        <h5>Don't have an account??</h5>
                       <a href=""""),_display_(/*43.34*/routes/*43.40*/.HomeController.regis),format.raw/*43.61*/(""""><h4>Signup</h4></a>
                    </div>
                </div>
            </div>
        </div>

    """)))}))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Wed Mar 22 13:38:48 IST 2017
                  SOURCE: /home/akash/Videos/Movies/finale/app/views/login.scala.html
                  HASH: 94e046c521d00f028f55cae6309caf0f42ce460e
                  MATRIX: 908->1|1020->18|1051->24|1071->36|1110->38|1145->47|3175->2049|3204->2050|3233->2051|3262->2052|3303->2065|3332->2066|3361->2067|3748->2427|3763->2433|3805->2454
                  LINES: 34->1|39->1|40->2|40->2|40->2|41->3|72->34|72->34|72->34|72->34|72->34|72->34|72->34|81->43|81->43|81->43
                  -- GENERATED --
              */
          