package com.example.kotlinbootcamphomeworks.week1.homework2

import com.example.kotlinbootcamphomeworks.week1.homework1.getData
import com.example.kotlinbootcamphomeworks.week1.homework2.Exception.VoteException
import java.util.Scanner

fun main(){
    try {
        val age = getAge()
        VoteManager.checkAge(age)
        println("Oy kullanabilirsiniz.")

    }catch (e : VoteException){
        println(e.message)
    }
}

fun getAge():Int{
    val scanner = Scanner(System.`in`)
    println("Yaşınızı giriniz.")
    return scanner.nextInt()
}