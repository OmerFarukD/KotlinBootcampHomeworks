package com.example.kotlinbootcamphomeworks.week1.homework1.User

data class User(val username : String, val password:String) {
    companion object{
        val createUser = User("Omer","123456")
    }
}