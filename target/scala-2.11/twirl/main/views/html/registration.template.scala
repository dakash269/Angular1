
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registration_Scope0 {
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

class registration extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/top("Sign Up")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""

  """),format.raw/*5.3*/("""<div ng-app="signup" ng-controller="SignupController">
    <form name="signupForm" ng-submit="signup(signupForm.$valid)">
      <div class="loginbox">
        <div class="formlr col-md-4 col-md-offset-4">
          <div class="logpos">
            <div class="form-group">
              <h1 >Signup</h1>
            </div>
            <div class="formcontent">
              <div class="form-group">
                <div class="fill center">
                  <input ng-model="userName" class="inp fill form-control" type="text" placeholder="Name" name="name" required>
                  <span class="error" ng-show="signupForm.name.$touched && signupForm.name.$invalid" ng-cloak>*The name is required.</span>
                </div>
              </div>
              <div class="form-group">
                <div class="fill center">
                  <input ng-model="userEmail" class="inp fill form-control" type="email" name="email" placeholder="Email" required>
                  <span class="error" ng-show="signupForm.email.$touched && signupForm.email.$invalid" ng-cloak>*An email is required!</span>
                </div>
              </div>
              <div class="form-group">
                <div class="fill center">
                  <input ng-model="userPassword" id="password" placeholder="Password" class="inp fill form-control" pattern="."""),format.raw/*28.127*/("""{"""),format.raw/*28.128*/("""5,"""),format.raw/*28.130*/("""}"""),format.raw/*28.131*/("""" type="password" name="password" required ng-minlength="5">
                  <span class="error" ng-show="signupForm.password.$error.minlength" ng-cloak>*Password too small!</span><br>
                </div>
              </div>
              <div class="form-group">
                <div class="col-lg-12 col-centered">
                  <input id="bigbutton" type="submit" value="SignUp" />
                </div>
              </div>
              <div class="padtop">
                <div align="center">
                  <div class="error1" ng-cloak>"""),format.raw/*39.48*/("""{"""),format.raw/*39.49*/("""{"""),format.raw/*39.50*/(""" """),format.raw/*39.51*/("""alertMessage """),format.raw/*39.64*/("""}"""),format.raw/*39.65*/("""}"""),format.raw/*39.66*/("""</div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="form-group">
          <div class="center col-md-8 col-md-offset-2">
            <h5>Already have an account??</h5>
          <a href=""""),_display_(/*48.21*/routes/*48.27*/.HomeController.login()),format.raw/*48.50*/(""""><h4>Login</h4></a>
          </div>
        </div>
      </div>
    </form>
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
object registration extends registration_Scope0.registration
              /*
                  -- GENERATED --
                  DATE: Wed Mar 22 13:38:48 IST 2017
                  SOURCE: /home/akash/Videos/Movies/finale/app/views/registration.scala.html
                  HASH: 0682c008dcd315373d04d94a3e4b3944ea36695e
                  MATRIX: 922->1|1034->18|1062->21|1084->35|1123->37|1153->41|2542->1401|2572->1402|2603->1404|2633->1405|3219->1963|3248->1964|3277->1965|3306->1966|3347->1979|3376->1980|3405->1981|3690->2239|3705->2245|3749->2268
                  LINES: 34->1|39->1|41->3|41->3|41->3|43->5|66->28|66->28|66->28|66->28|77->39|77->39|77->39|77->39|77->39|77->39|77->39|86->48|86->48|86->48
                  -- GENERATED --
              */
          