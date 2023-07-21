package com.example.kotlinbootcamphomeworks.week1.homework1.User

import com.example.kotlinbootcamphomeworks.week1.homework1.Exceptions.PasswordOrUsernameMissingException
import com.example.kotlinbootcamphomeworks.week1.homework1.Exceptions.UsernameAndPasswordNotEmptyException

class UserManager {
    companion object{
        private var data = User.createUser
        fun checkRules(user:User){

            if (user.username.isEmpty() || user.password.isEmpty()){
                throw UsernameAndPasswordNotEmptyException()
            }
            else if (!checkPasswordAndEmail(user.username,user.password))
                throw PasswordOrUsernameMissingException()
        }
        private fun checkPasswordAndEmail(username:String, password:String): Boolean{
            if (username != data.username || password != data.password)
                return false
            return true
        }


    }
}