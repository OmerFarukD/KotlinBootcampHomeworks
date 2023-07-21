package com.example.kotlinbootcamphomeworks.week1.homework1.Exceptions;

public class UsernameAndPasswordNotEmptyException extends UserException{
    public UsernameAndPasswordNotEmptyException() {
        super("Kullanıcı adı veya parola boş olamaz.");
    }

}
