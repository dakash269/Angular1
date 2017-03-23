
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/akash/Pictures/finale/conf/routes
// @DATE:Thu Mar 23 19:16:32 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def archive: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.archive",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "archive"})
        }
      """
    )
  
    // @LINE:27
    def Trash: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Trash",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Trash"})
        }
      """
    )
  
    // @LINE:23
    def loginnow: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.loginnow",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:26
    def Archive: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Archive",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Archive"})
        }
      """
    )
  
    // @LINE:16
    def getArchive: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getArchive",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getArchive"})
        }
      """
    )
  
    // @LINE:34
    def getPosts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getPosts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getPosts"})
        }
      """
    )
  
    // @LINE:21
    def regis: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.regis",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "regis"})
        }
      """
    )
  
    // @LINE:18
    def getReminder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getReminder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getReminder"})
        }
      """
    )
  
    // @LINE:8
    def delA: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.delA",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delA"})
        }
      """
    )
  
    // @LINE:10
    def movetonote: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.movetonote",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "movetonote"})
        }
      """
    )
  
    // @LINE:9
    def unarchive: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.unarchive",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "unarchive"})
        }
      """
    )
  
    // @LINE:30
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:13
    def del: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.del",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "del"})
        }
      """
    )
  
    // @LINE:22
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.register",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "regis"})
        }
      """
    )
  
    // @LINE:7
    def delT: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.delT",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delT"})
        }
      """
    )
  
    // @LINE:25
    def note: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.note",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "note"})
        }
      """
    )
  
    // @LINE:28
    def Reminder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Reminder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Reminder"})
        }
      """
    )
  
    // @LINE:32
    def addNotetaken: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addNotetaken",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addPost"})
        }
      """
    )
  
    // @LINE:20
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:17
    def getTrash: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getTrash",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getTrash"})
        }
      """
    )
  
  }

  // @LINE:38
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
