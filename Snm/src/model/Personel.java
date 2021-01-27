package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                           // classımızı kalıcı hale getiriyor(Kullanılması zorunlu)

@Table(name="PERSONEL")           // Oluşturulacak tablomuza isim atadık
 
public class Personel implements Serializable
 
{
 
      
 
       private Integer personel_id;
 
       private String personel_isim;
 
       private String personel_soyisim;
 
       private Integer personel_maas;
 
           
 
       @Id                                     //     Bu değişkenin id değeri olduğunu belirtiyoruz(Kullanılması zorunlu)
       @Column(name="PERSONEL_ID")             //     Kolonumuzun ismini belirledik
       public Integer getPersonel_id() {
 
             return personel_id;
 
       }
 
       public void setPersonel_id(Integer personel_id) {
 
             this.personel_id = personel_id;
 
       }
 
       @Column(name="PERSONEL_ISIM")          //     Kolonumuzun ismini belirledik
 
       public String getPersonel_isim() {
 
             return personel_isim;
 
       }
 
       public void setPersonel_isim(String personel_isim) {
 
             this.personel_isim = personel_isim;
 
       }
 
       @Column(name="PERSONEL_SOYISIM")         //     Kolonumuzun ismini belirledik
 
       public String getPersonel_soyisim() {
 
             return personel_soyisim;
 
       }
 
       public void setPersonel_soyisim(String personel_soyisim) {
 
             this.personel_soyisim = personel_soyisim;
 
       }
 
       @Column(name="PERSONEL_MAAS")          //     Kolonumuzun ismini belirledik
 
       public Integer getPersonel_maas() {
 
             return personel_maas;
 
       }
 
       public void setPersonel_maas(Integer personel_maas) {
 
             this.personel_maas = personel_maas;
 
       }
 
}