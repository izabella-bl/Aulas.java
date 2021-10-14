package Exercicios.Objeto.ATP23.Model;

import java.util.UUID;

public class BaseModel {
    private UUID id;

    public BaseModel(){
        createId();
    }

    public UUID getId() {
        return id;
    }

    private void createId(){
        UUID uniqueKey = UUID.randomUUID();
        this.id = uniqueKey;
    }
}
