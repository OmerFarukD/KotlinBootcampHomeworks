package com.example.kotlinbootcamphomeworks.week1.homework1

import com.example.kotlinbootcamphomeworks.week1.homework1.Exceptions.UserException
import com.example.kotlinbootcamphomeworks.week1.homework1.User.User
import com.example.kotlinbootcamphomeworks.week1.homework1.User.UserManager
import java.util.Scanner

fun main(){

    val user = getData()
    try {
        UserManager.checkRules(user)
        println("Giriş Yapıldı.")
    }catch (exception : UserException){
        println(exception.message)
    }
}


fun getData() : User{
    val scanner = Scanner(System.`in`)
    println("Kullanıcı adını giriniz : ")
    val username = scanner.next()
    println("Parola giriniz : ")
    val password = scanner.next()

    return User(username, password)

}