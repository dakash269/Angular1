
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/akash/Pictures/finale/conf/routes
// @DATE:Thu Mar 23 19:16:32 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
