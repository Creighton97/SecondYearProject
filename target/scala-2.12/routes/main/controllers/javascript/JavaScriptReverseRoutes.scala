
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/ITPROJECT-master/conf/routes
// @DATE:Wed Apr 11 16:16:03 IST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def contactUs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.contactUs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contactUs"})
        }
      """
    )
  
    // @LINE:8
    def Mens: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Mens",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Mens"})
        }
      """
    )
  
    // @LINE:7
    def AboutUs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.AboutUs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "AboutUs"})
        }
      """
    )
  
    // @LINE:10
    def Kids: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Kids",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kids"})
        }
      """
    )
  
    // @LINE:11
    def Womens: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Womens",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Womens"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
