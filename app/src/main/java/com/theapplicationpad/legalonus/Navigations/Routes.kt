package com.theapplicationpad.legalonus.Navigations

sealed class Routes(val route:String){
    object Splash:Routes("Splash")
    object Home:Routes("Home")
    object Ai:Routes("Ai")
    object LLJ:Routes("LLJ")

    // Modify NewsScreen to accept a URL parameter
//    object NewsScreen : Routes("NewsScreen/{url}") {
//        fun createRoute(url: String) = "NewsScreen/$url"
//    }

    object NewsScreen : Routes("NewsScreen/{url}") {
        // Use this function to create the route with URL
        fun createRoute(url: String): String {
            return "NewsScreen/$url"
        }

        // Create a function to handle when no URL is provided
        fun createRoute(): String {
            return "NewsScreen/"
        }
    }

    object BottomBar:Routes("BottomBar")


    object LegalCoverage:Routes("LegalCoverage")
    object Editorialboard :Routes("Editorialboard")
    object TheFounder :Routes("TheFounder")
    object OurCommunity :Routes("OurCommunity")
    object AboutUS :Routes("AboutUs")
    object LegalOnusLawJournal :Routes("LegalOnusLawJournal")
    object LegalOnusWebsite :Routes("LegalOnusWebsite")
    object ForLegalOnusLawJournal :Routes("ForLegalOnusLawJournal")


}