
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/ITPROJECT-master/conf/routes
// @DATE:Wed Apr 11 16:16:03 IST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def contactUs(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contactUs")
    }
  
    // @LINE:8
    def Mens(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Mens")
    }
  
    // @LINE:7
    def AboutUs(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "AboutUs")
    }
  
    // @LINE:10
    def Kids(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kids")
    }
  
    // @LINE:11
    def Womens(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Womens")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
