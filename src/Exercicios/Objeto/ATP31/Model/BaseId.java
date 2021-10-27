package Exercicios.Objeto.ATP31.Model;


import java.util.UUID;

public class BaseId {
    private UUID id;

    public BaseId(){
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



    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  BaseId){
            BaseId id1 = (BaseId) obj;
            if (this.id.compareTo(id1.getId()) == 0){
                return true;
            }
        }
        return false;
    }


}
