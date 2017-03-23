
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/akash/Pictures/finale/conf/routes
// @DATE:Thu Mar 23 19:16:32 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: javax.inject.Provider[controllers.HomeController],
  // @LINE:38
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: javax.inject.Provider[controllers.HomeController],
    // @LINE:38
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delT""", """@controllers.HomeController@.delT"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delA""", """@controllers.HomeController@.delA"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """unarchive""", """@controllers.HomeController@.unarchive"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movetonote""", """@controllers.HomeController@.movetonote"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """del""", """@controllers.HomeController@.del"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """archive""", """@controllers.HomeController@.archive"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getArchive""", """@controllers.HomeController@.getArchive"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getTrash""", """@controllers.HomeController@.getTrash"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getReminder""", """@controllers.HomeController@.getReminder"""),
    ("""GET""", this.prefix, """@controllers.HomeController@.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """regis""", """@controllers.HomeController@.regis"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """regis""", """@controllers.HomeController@.register"""),
    ("""POST""", this.prefix, """@controllers.HomeController@.loginnow"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """note""", """@controllers.HomeController@.note"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Archive""", """@controllers.HomeController@.Archive"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Trash""", """@controllers.HomeController@.Trash"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Reminder""", """@controllers.HomeController@.Reminder"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """@controllers.HomeController@.logout"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addPost""", """@controllers.HomeController@.addNotetaken()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getPosts""", """@controllers.HomeController@.getPosts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_delT0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delT")))
  )
  private[this] lazy val controllers_HomeController_delT0_invoker = createInvoker(
    HomeController_0.get.delT,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "delT",
      Nil,
      "POST",
      """""",
      this.prefix + """delT"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_delA1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delA")))
  )
  private[this] lazy val controllers_HomeController_delA1_invoker = createInvoker(
    HomeController_0.get.delA,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "delA",
      Nil,
      "POST",
      """""",
      this.prefix + """delA"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_unarchive2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("unarchive")))
  )
  private[this] lazy val controllers_HomeController_unarchive2_invoker = createInvoker(
    HomeController_0.get.unarchive,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "unarchive",
      Nil,
      "POST",
      """""",
      this.prefix + """unarchive"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_movetonote3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movetonote")))
  )
  private[this] lazy val controllers_HomeController_movetonote3_invoker = createInvoker(
    HomeController_0.get.movetonote,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "movetonote",
      Nil,
      "POST",
      """""",
      this.prefix + """movetonote"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_del4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("del")))
  )
  private[this] lazy val controllers_HomeController_del4_invoker = createInvoker(
    HomeController_0.get.del,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "del",
      Nil,
      "POST",
      """""",
      this.prefix + """del"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_archive5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("archive")))
  )
  private[this] lazy val controllers_HomeController_archive5_invoker = createInvoker(
    HomeController_0.get.archive,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "archive",
      Nil,
      "POST",
      """""",
      this.prefix + """archive"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_getArchive6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getArchive")))
  )
  private[this] lazy val controllers_HomeController_getArchive6_invoker = createInvoker(
    HomeController_0.get.getArchive,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getArchive",
      Nil,
      "GET",
      """""",
      this.prefix + """getArchive"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_getTrash7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getTrash")))
  )
  private[this] lazy val controllers_HomeController_getTrash7_invoker = createInvoker(
    HomeController_0.get.getTrash,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getTrash",
      Nil,
      "GET",
      """""",
      this.prefix + """getTrash"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_getReminder8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getReminder")))
  )
  private[this] lazy val controllers_HomeController_getReminder8_invoker = createInvoker(
    HomeController_0.get.getReminder,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getReminder",
      Nil,
      "GET",
      """""",
      this.prefix + """getReminder"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_login9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_login9_invoker = createInvoker(
    HomeController_0.get.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_regis10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("regis")))
  )
  private[this] lazy val controllers_HomeController_regis10_invoker = createInvoker(
    HomeController_0.get.regis,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "regis",
      Nil,
      "GET",
      """""",
      this.prefix + """regis"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_register11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("regis")))
  )
  private[this] lazy val controllers_HomeController_register11_invoker = createInvoker(
    HomeController_0.get.register,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "register",
      Nil,
      "POST",
      """""",
      this.prefix + """regis"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_loginnow12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_loginnow12_invoker = createInvoker(
    HomeController_0.get.loginnow,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "loginnow",
      Nil,
      "POST",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_note13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("note")))
  )
  private[this] lazy val controllers_HomeController_note13_invoker = createInvoker(
    HomeController_0.get.note,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "note",
      Nil,
      "GET",
      """""",
      this.prefix + """note"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_Archive14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Archive")))
  )
  private[this] lazy val controllers_HomeController_Archive14_invoker = createInvoker(
    HomeController_0.get.Archive,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Archive",
      Nil,
      "GET",
      """""",
      this.prefix + """Archive"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_Trash15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Trash")))
  )
  private[this] lazy val controllers_HomeController_Trash15_invoker = createInvoker(
    HomeController_0.get.Trash,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Trash",
      Nil,
      "GET",
      """""",
      this.prefix + """Trash"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HomeController_Reminder16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Reminder")))
  )
  private[this] lazy val controllers_HomeController_Reminder16_invoker = createInvoker(
    HomeController_0.get.Reminder,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Reminder",
      Nil,
      "GET",
      """""",
      this.prefix + """Reminder"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_HomeController_logout17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_HomeController_logout17_invoker = createInvoker(
    HomeController_0.get.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_HomeController_addNotetaken18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addPost")))
  )
  private[this] lazy val controllers_HomeController_addNotetaken18_invoker = createInvoker(
    HomeController_0.get.addNotetaken(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addNotetaken",
      Nil,
      "POST",
      """""",
      this.prefix + """addPost"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_HomeController_getPosts19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getPosts")))
  )
  private[this] lazy val controllers_HomeController_getPosts19_invoker = createInvoker(
    HomeController_0.get.getPosts,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getPosts",
      Nil,
      "GET",
      """""",
      this.prefix + """getPosts"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Assets_at20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at20_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_delT0_route(params) =>
      call { 
        controllers_HomeController_delT0_invoker.call(HomeController_0.get.delT)
      }
  
    // @LINE:8
    case controllers_HomeController_delA1_route(params) =>
      call { 
        controllers_HomeController_delA1_invoker.call(HomeController_0.get.delA)
      }
  
    // @LINE:9
    case controllers_HomeController_unarchive2_route(params) =>
      call { 
        controllers_HomeController_unarchive2_invoker.call(HomeController_0.get.unarchive)
      }
  
    // @LINE:10
    case controllers_HomeController_movetonote3_route(params) =>
      call { 
        controllers_HomeController_movetonote3_invoker.call(HomeController_0.get.movetonote)
      }
  
    // @LINE:13
    case controllers_HomeController_del4_route(params) =>
      call { 
        controllers_HomeController_del4_invoker.call(HomeController_0.get.del)
      }
  
    // @LINE:14
    case controllers_HomeController_archive5_route(params) =>
      call { 
        controllers_HomeController_archive5_invoker.call(HomeController_0.get.archive)
      }
  
    // @LINE:16
    case controllers_HomeController_getArchive6_route(params) =>
      call { 
        controllers_HomeController_getArchive6_invoker.call(HomeController_0.get.getArchive)
      }
  
    // @LINE:17
    case controllers_HomeController_getTrash7_route(params) =>
      call { 
        controllers_HomeController_getTrash7_invoker.call(HomeController_0.get.getTrash)
      }
  
    // @LINE:18
    case controllers_HomeController_getReminder8_route(params) =>
      call { 
        controllers_HomeController_getReminder8_invoker.call(HomeController_0.get.getReminder)
      }
  
    // @LINE:20
    case controllers_HomeController_login9_route(params) =>
      call { 
        controllers_HomeController_login9_invoker.call(HomeController_0.get.login)
      }
  
    // @LINE:21
    case controllers_HomeController_regis10_route(params) =>
      call { 
        controllers_HomeController_regis10_invoker.call(HomeController_0.get.regis)
      }
  
    // @LINE:22
    case controllers_HomeController_register11_route(params) =>
      call { 
        controllers_HomeController_register11_invoker.call(HomeController_0.get.register)
      }
  
    // @LINE:23
    case controllers_HomeController_loginnow12_route(params) =>
      call { 
        controllers_HomeController_loginnow12_invoker.call(HomeController_0.get.loginnow)
      }
  
    // @LINE:25
    case controllers_HomeController_note13_route(params) =>
      call { 
        controllers_HomeController_note13_invoker.call(HomeController_0.get.note)
      }
  
    // @LINE:26
    case controllers_HomeController_Archive14_route(params) =>
      call { 
        controllers_HomeController_Archive14_invoker.call(HomeController_0.get.Archive)
      }
  
    // @LINE:27
    case controllers_HomeController_Trash15_route(params) =>
      call { 
        controllers_HomeController_Trash15_invoker.call(HomeController_0.get.Trash)
      }
  
    // @LINE:28
    case controllers_HomeController_Reminder16_route(params) =>
      call { 
        controllers_HomeController_Reminder16_invoker.call(HomeController_0.get.Reminder)
      }
  
    // @LINE:30
    case controllers_HomeController_logout17_route(params) =>
      call { 
        controllers_HomeController_logout17_invoker.call(HomeController_0.get.logout)
      }
  
    // @LINE:32
    case controllers_HomeController_addNotetaken18_route(params) =>
      call { 
        controllers_HomeController_addNotetaken18_invoker.call(HomeController_0.get.addNotetaken())
      }
  
    // @LINE:34
    case controllers_HomeController_getPosts19_route(params) =>
      call { 
        controllers_HomeController_getPosts19_invoker.call(HomeController_0.get.getPosts)
      }
  
    // @LINE:38
    case controllers_Assets_at20_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at20_invoker.call(Assets_1.at(path, file))
      }
  }
}
