package com.example.kotlinbootcamphomeworks.week1.homework2

import com.example.kotlinbootcamphomeworks.week1.homework2.Exception.VoteException
class VoteManager {

    companion object{
        fun checkAge(age : Int){
            if (age<18){
                throw VoteException();
            }
        }
    }
}