package imcs;
public class IMCs {
     String a,b;
     float x,y;
     float imcs;
    
    public boolean getCheckEmpty(String a,String b) {
        if(a.equals("")||b.equals("")||(a.equals("")&&b.equals(""))){
            return true;
        }else{
            this.a=a;
            this.b=b;
            return false;
        }
    }
    public boolean getCheckIsNumeric(){
        try{
            Float.parseFloat(a);
            Float.parseFloat(b);
            setConvertir();
            return true;
        }catch(NumberFormatException e){
            return false;
        }
     }
    public void setConvertir(){
        this.x=Float.parseFloat(a);
        this.y=Float.parseFloat(b);
        
    }
    
    public float getIMCs(){
        float imc;
        imc=x/(y*y);
        this.imcs=imc;
        return imc;
    }    
    public String getStatus(){
        String status="";
        if(imcs<=18.4){
            status="insuficiencia Ponderal";
        }else if(imcs >=18.5 && imcs <=24.9){
            status="Tiene Peso Normal";
        }else if(imcs >=25 && imcs <=29.9){
            status="Sufre De Sobrepeso";
        }else if(imcs >=30 && imcs <=34.9){
            status="Obesidad Grado I";    
        }else if(imcs >=35 && imcs <=39.9){
            status="Obesidad Grado II";
        }else if(imcs >=40){
            status="Obesidad Grado III";
        }
        return status;
          
    }
      
    public String getTip(){
        String tip="";
        if(imcs<=18.4){
            tip=" Alimentate Adecuadamente ";
        }else if(imcs >=18.5 && imcs <=24.9){
            tip="Excelente Peso";
        }else if(imcs >=25 && imcs <=29.9){
            tip="Bajale un poco a las comidas";
        }else if(imcs >=30 && imcs <=34.9){
            tip="Sal a hacer ejercicio dos veces al dia";    
        }else if(imcs >=35 && imcs <=39.9){
            tip="Haz ejercicio y come frutas y verduras";
        }else if(imcs >=40){
            tip="Busca ayuda medica";
        }
        return tip;
          
    }   
    
 }
    

    
