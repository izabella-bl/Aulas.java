package Exercicios.MVC.ATP27.Model;

import java.util.UUID;

public class BaseId {

    private UUID id;

    public BaseId(){
        geradorId();
    }

    public UUID getId() {
        return id;
    }

    private void geradorId(){
        UUID id = UUID.randomUUID();
        this.id = id;
    }


}
