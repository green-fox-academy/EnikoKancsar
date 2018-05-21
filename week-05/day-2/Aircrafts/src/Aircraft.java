public class Aircraft {
    private final int maxAmmo;
    private final int baseDamage;
    private int currentAmmo;
    private String type;

     public Aircraft(int maxAmmo, int baseDamage, String type) {
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        currentAmmo = 0;
        this.type = type;
    }

    public int fight(Aircraft otherAircraft) {
         int damage = baseDamage * currentAmmo;
         currentAmmo = 0;
         return damage;
    }

    public int refill(int amountOfRefilling) {
         if (amountOfRefilling <= maxAmmo - currentAmmo) {
             currentAmmo += amountOfRefilling;
             amountOfRefilling = 0;
         } else {
             amountOfRefilling -= maxAmmo - currentAmmo;
             currentAmmo = maxAmmo;
         }
         return amountOfRefilling;
    }

    public String getType() {
         return type;
    }

    public String getStatus() {
         return "Type: " + type
                 + ", Ammo: " + currentAmmo
                 + ", Base Damage: " + baseDamage
                 + ", All Damage: " + currentAmmo * baseDamage;
    }

    public boolean isPriority() {
        return false;
    }
}
