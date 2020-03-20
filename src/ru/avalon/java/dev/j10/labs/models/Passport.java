package ru.avalon.java.dev.j10.labs.models;

import java.util.Date;

public class Passport {
    private String seria;
    private String number;
    private String fam;
    private String name;
    private String ot;
    private String name2;
    private Date dateBirth;
    private Date dateOther;
    private String placeOther;

    public Passport(String seria, String number, Date dateBirth, Date dateOther, String placeOther) {
        this.seria = seria;
        this.number = number;
        this.dateBirth = dateBirth;
        this.dateOther = dateOther;
        this.placeOther = placeOther;
    }

    public Passport() {
    }

    public String getSeria() {
        return seria;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOt() {
        return ot;
    }

    public void setOt(String ot) {
        this.ot = ot;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Date getDateOther() {
        return dateOther;
    }

    public void setDateOther(Date dateOther) {
        this.dateOther = dateOther;
    }

    public String getPlaceOther() {
        return placeOther;
    }

    public void setPlaceOther(String placeOther) {
        this.placeOther = placeOther;
    }
    
    
}
/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */

    

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
    
