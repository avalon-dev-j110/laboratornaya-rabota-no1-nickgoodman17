package ru.avalon.java.dev.j10.labs.models;
import java.time.LocalDate;
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
public class Passport {

    String seria;
    String name;
    String family;
    String otchestvo;
    String name_two;
    LocalDate bdate;
    LocalDate dateOther;
    String comment;
    
    public Passport(String seria, String name, String family, String otchestvo, String name_two, LocalDate bdate, LocalDate dateOther, String comment) {
        this.seria=seria;
        this.name=name;
        this.family=family;
        this.otchestvo=otchestvo;
        this.name_two=name_two;
        this.bdate=bdate;
        this.dateOther=dateOther;
        this.comment=comment;
        
    }
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

    Passport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Passport(Type String) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
