package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.models.*;
import ru.avalon.java.dev.j10.labs.commons.Address;
/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность, наделённая:
 * <ol>
 * <li>именем;
 * <li>паспортными данными;
 * <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
    private Passport passport;
    private String fam;
    private String name;
    private String name2;
    private String ot;
    private Address address;

    public Person(String fam, String name, String name2, String ot, Address address) {
        this.fam = fam;
        this.name = name;
        this.name2 = name2;
        this.ot = ot;
        this.address = address;
    }

    
    
    
    public StringBuilder getFullName() {
        StringBuilder fullName = new StringBuilder();//создали переменную фуллнейм и после проверки на непустоту фулл добавляем через аппенд (скеивание) каждой переменной из имени
        if (ot != null && name2 == null){
         if (fam != null) {
            fullName = fullName.append(fam);//
        }
         if (name != null) {
            fullName = fullName.append(" " + name + " " + ot);//
        }
         
        }
        else if (name2 != null && ot == null){
          if (name != null) {
            fullName = fullName.append(name);//
        }
          if (name2 != null) {
            char ch = name2.charAt(0);
            fullName.append(" " + ch + ".");
        }
          if (fam != null) {
            fullName = fullName.append(" " + fam);//
        }
        }
        else {
         if (fam != null) {
            fullName = fullName.append(fam);//
        }
         if (name != null) {
            fullName = fullName.append(" " + name);//
        }
        }
        return fullName;   
    }
        //private Address address = new Address();
        //public Passport(){
        //address.setAddress("С-Петербург", "Невский пр-кт", 12); 
       
    
    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то возвращет Имя, Фимилию и
     * Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то возвращает Имя,
     * Первую букву второго имени, и Фамилию, разделённые пробелом. После
     * Инициала второго имени должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а есть только Имя и
     * Фамилия, то возвращает их, разделённые пробелом.
     *
     * @return имя человека в виде строки.
     */
    
    
    
   
    
    

    
    
        
        
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
     

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной регистрации человека,
     * согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public Address getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
}
