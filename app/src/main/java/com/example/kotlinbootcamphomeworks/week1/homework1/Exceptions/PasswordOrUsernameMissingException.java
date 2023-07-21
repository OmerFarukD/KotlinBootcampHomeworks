package com.example.kotlinbootcamphomeworks.week1.homework1.Exceptions;

public class PasswordOrUsernameMissingException extends UserException{
    public PasswordOrUsernameMissingException() {
        super("Kullanıcı adı veya parola hatalı.");
    }

}
