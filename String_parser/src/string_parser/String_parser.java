
package string_parser;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class String_parser {
     
    
  
    public  static void main(String[] args) {
        int j=0;
        List array = new ArrayList();
        Person current;
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("ddMMyyyy");
        String text = "John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986/Moscow";
        String[] all_people =text.split("[./ ]");
        for(int i=0;i<all_people.length;i+=4)
        {       
            Person t =new Person(all_people[i],all_people[i+1],LocalDate.parse(all_people[i+2],parser),all_people[i+3]);                   
            array.add(t);
            j++;
           
                
        }
        for(int i =0;i<array.size();i++){
             current = (Person)array.get(i);
        System.out.println("Persoana nr."+(i+1)+":\n"+current.showInfo()+"\n");   
        }
        
    }
    public static class Person
    { String nume;
    String prenume;
    LocalDate data;
    String loc;
    
        public  Person(String nume,String prenume, LocalDate data,String loc)
        {
            this.nume=nume;
            this.prenume=prenume;
            this.data=data;
            this.loc=loc;
        
        }
        
        public String showInfo()
        {   
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
            String s= "Nume: "+this.nume+"\nPrenume: "+this.prenume +"\nData nasterii: "+this.data.format(formatter)+"\nOras: "+this.loc;
            return s;
        }
        }
    }

