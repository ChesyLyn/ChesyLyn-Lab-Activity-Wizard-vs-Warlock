public class Warlock extends Character {
    Warlock(String name){
        super(name);
    }
   
    public void WindSlash(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with WindSlash (Damage - 50 , Mana Cost - 30)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 30;
        manaTarget(enemyCharacter, manaPoints);

    }
    public void DarkArrow(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with DarkArrow (Damage - 60 , Mana Cost - 40)");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 40;
        manaTarget(enemyCharacter, manaPoints);

    } 
    public void WindHeal(Character characterName){
        System.out.println("Both use Heal");
        System.out.println("~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=");
        System.out.println(super.characterName + " Use Wind Heal (Heal - 50)");
        int healPoints = 50;
        healTarget(characterName, healPoints);
        manadTarget(characterName, manaPoints);
    } 
    public void FireFist(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with FireFist (Damage - 60 , Mana Cost - 20)");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 20;
        manaTarget(enemyCharacter, manaPoints);
    } 
}