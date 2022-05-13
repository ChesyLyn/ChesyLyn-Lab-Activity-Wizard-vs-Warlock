public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Battle Begin!");
        System.out.println("Wizards and Warlocks");
        System.out.println("Both Fighter Have 200 HP and 200 Mana");
        System.out.println("~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=");
        
        
        Wizard HarryPotter = new Wizard("HarryPotter");
        Warlock Voldemort = new Warlock("Voldemort");
        HarryPotter.FireStorm(Voldemort);
        HarryPotter.WaterTide(Voldemort);
        Voldemort.WindSlash(HarryPotter);
       HarryPotter.BlazingFire(Voldemort);
        Voldemort.DarkArrow(HarryPotter);
        Voldemort.WindHeal(Voldemort); 
       HarryPotter.FireHeal(HarryPotter);
        HarryPotter.FireSlash(Voldemort);
       Voldemort.FireFist(HarryPotter);
      HarryPotter.FireFang(Voldemort);
     

    }
}