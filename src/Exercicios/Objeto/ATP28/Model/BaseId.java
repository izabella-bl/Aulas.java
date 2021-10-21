package Exercicios.Objeto.ATP28.Model;

import java.util.Objects;
import java.util.Random;

public abstract class BaseId {
     private long id;

     public BaseId(){
         this.id = geraId();
     }

    public long getId() {
        return id;
    }

    private int geraId(){
        Random num = new Random();
        return num.nextInt(10000);
    }

    @Override
    public boolean equals(Object obj) {
       if(obj instanceof BaseId){
           BaseId baseId = (BaseId) obj;
           if(this.id == baseId.getId()){
               return  true;
           }
       }
       return false;
    }


}
