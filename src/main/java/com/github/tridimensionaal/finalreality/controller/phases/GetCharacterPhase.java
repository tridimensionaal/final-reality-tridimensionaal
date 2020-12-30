package com.github.tridimensionaal.finalreality.controller.phases;

public class GetCharacterPhase extends Phase{
    public GetCharacterPhase(){
        this.namePhase = "Get character phase";
        this.canGetCharacter = true;
    }

    @Override
    public void toAttackPhase(){
        changePhase(new AttackPhase());
    }

    @Override
    public void toPrepareToAttackPhase(){
        changePhase(new PrepareToAttackPhase());
    }


    @Override
    public void getCharacter() throws InvalidMovementException {
        if(controller.getQueueSize()>0){
            super.getCharacter();
            this.toAttackPhase();
        }
        else{
            this.toPrepareToAttackPhase();
        }
    }
}
