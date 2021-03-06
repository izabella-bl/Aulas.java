package Exercicios.MVC.ATP23.Model;

import java.util.UUID;

public class BaseModel {

    private UUID id;

    public BaseModel(){
        createId();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    private void createId(){
        UUID uniqueKey = UUID.randomUUID();
        this.id = uniqueKey;
    }


}
