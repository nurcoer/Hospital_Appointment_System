package com.example.mhrs;

import com.example.mhrs.dataHelper;

public class docClass {
    private String Chapter = null;
    private String Email = null;
    private String Hospital = null;
    private String Name = null;
    private String Surname = null ;
    private String Password = null;
    private String Type = "Doc";
    dataHelper data;

    public docClass(){
        data = new dataHelper();
    }
    public String GetChapter(){
        return Chapter;
    }
    public void SetChapter(String Chapter){
        this.Chapter = Chapter;
    }
    public String GetEmail(){
        return Email;
    }
    public void SetEmail(String Email){
        this.Email = Email;
    }
    public String GetHospital(){
        return Hospital;
    }
    public void SetHospital(String Hospital){
        this.Hospital = Hospital;
    }
    public String GetName(){
        return Name;
    }
    public void SetName(String Name){
        this.Name = Name;
    }
    public String GetSurname(){
        return Surname;
    }
    public void SetSurame(String Surname){
        this.Surname = Surname;
    }
    public String GetPassword(){
        return Password;
    }
    public void SetPassword(String Password){
        this.Password = Password;
    }
    public void SetType(){
        this.Type = Type;
    }
    public boolean addAppointments(String date,String Hour,String SickTc){
        data.dataWrite(date,Hour);
        data.dataWrite(Hour,SickTc);
        return true;
    }
}
