package com.example.travelog.models

data class TravelData(    var id: String = "",
                          val userId: String = "",
                          val images: List<String> = listOf<String>(),
                          var username: String = "",
                          var usersurname:String ="",
                          val title: String = "",
                          val description: String = "",
                          val address:String="",)
