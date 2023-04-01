package task1;
public class Person { 
    String name; 
    int age; 
  
 
    public String  getName(){ 
        return name; 
    } 
 
    public void setName(String name){ 
        this.name = name; 
    } 
 
 
    public int getAge(){ 
        return age; 
    } 
    public void setAge(int age){ 
        if(age<0){ 
            this.age = 0; 
        }else{ 
            this.age = age; 
        } 
    } 
 
     
     
}
