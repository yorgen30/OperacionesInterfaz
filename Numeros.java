
public class Numeros
{
   private Integer a,b;
   Numeros(Integer a,Integer b){
       this.a=a;
       this.b=b;
    }
    Numeros(){}
    
    Integer Multiplicacion(){
        return a*b;
    }
    Integer Suma(){
    return a+b;
    }
    //Start GetterSetterExtension Code
    /**Getter method a*/
    public Integer getA(){
        return this.a;
    }//end method getA

    /**Setter method a*/
    public void setA(Integer a){
        this.a = a;
    }//end method setA

    /**Getter method b*/
    public Integer getB(){
        return this.b;
    }//end method getB

    /**Setter method b*/
    public void setB(Integer b){
        this.b = b;
    }//end method setB

    //End GetterSetterExtension Code
//!
}
