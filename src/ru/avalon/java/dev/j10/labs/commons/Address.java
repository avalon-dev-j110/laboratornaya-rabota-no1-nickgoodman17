package ru.avalon.java.dev.j10.labs.commons;

public class Address {

    private String city;
    public String street;
    public String house;
    
    

    public void setAddress(String city, String street, String house){
        this.city = city;
        this.street = street;
        this.house = house;
    }
    /*
      public String getCity(){
        return city;  
    } 
      public String getStreet(){
        return street;  
    } 
      public int getHouse(){
        return house;  
    } */
     public StringBuilder getFullAddress() {
        StringBuilder fullAddress = new StringBuilder();//создали переменную фуллнейм и после проверки на непустоту фулл добавляем через аппенд (скеивание) каждой переменной из имени
        
         if (city != null) {
            fullAddress = fullAddress.append(city + ",");//
        }
         if (street != null) {
            fullAddress = fullAddress.append(" " + street + ",");//
        }
         if (house != null) {
            fullAddress = fullAddress.append(" " + house);//
        }
        return fullAddress;   
    }       
            
}
/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый за пределами пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
