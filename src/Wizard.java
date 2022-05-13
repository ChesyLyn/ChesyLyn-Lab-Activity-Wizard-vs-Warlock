public class Wizard extends Character {
    Wizard(String name){
        super(name);
    }
    public void FireStorm(Character enemyCharacter){
        
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 60 , Mana Cost - 15)");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 15;
        manaTarget(enemyCharacter, manaPoints);

        
    }
    public void WaterTide(Character enemyCharacter){
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName + " with Watertide (Damage - 60 , Mana Cost - 25)");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 25;
        manaTarget(enemyCharacter, manaPoints);

       
    }
    public void BlazingFire(Character enemyCharacter){
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName + " with BlazingFire (Damage - 60 , Mana Cost - 35)");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 35;
        manaTarget(enemyCharacter, manaPoints);

        
    }
    public void FireHeal(Character characterName){
        System.out.println(super.characterName + " Use FireHeal (Heal - 50)");
        int healPoints = 50;
        healTarget(characterName, healPoints);
        manadTarget(characterName, manaPoints);
    } 
    public void FireSlash(Character enemyCharacter){
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName + " with FireSlash (Damage - 60 , Mana Cost - 35)");
        int damagePoints = 60;
        damageTarget( enemyCharacter, damagePoints);
        int manaPoints = 35;
        manaTargett( enemyCharacter, manaPoints);

        
    }
    public void FireFang(Character enemyCharacter){
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName + " with FireFang (Damage - 60 , Mana Cost - 40)");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 40;
        manaTarget(enemyCharacter, manaPoints);
        levelTarget(enemyCharacter, level);   
    }

    

    
}
