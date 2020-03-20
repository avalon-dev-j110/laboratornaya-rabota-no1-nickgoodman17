package ru.avalon.java.dev.j10.labs;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.models.Passport;

public class Main {

    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */
    public Main() {

        
        Person smith = null;
    }
    /**
     *
     * @param args
     */
    /*set установить значение
    get получить значение*/
    
    public static void main (String[] args){
        Address addressIvanov = new Address();//"S-Peterburg", "ulica", "12");
        addressIvanov.setAddress("Санкт-Петербург", "Думская", "6");      
        Passport passport = new Passport (); 
        passport.setNumber("1212");
        Address addressSmith = new Address();
        addressSmith.setAddress("Ekaterinburg", "Lenina street", "123");
                
         Person ivanov = new Person("Иванов","Иван","Иванович", null, addressIvanov);
         Person smith = new Person("John","Edvard", null, "Smith", addressSmith);
         System.out.println(ivanov.getFullName() + " " + ivanov.getAddress().getFullAddress().toString());
         System.out.println(smith.getFullName() + " " + addressSmith.getFullAddress().toString());
        }
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    
}