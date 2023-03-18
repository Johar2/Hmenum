class Boss extends GameEntity {
    private Weapon weapon;

    public Boss(String name, int health, int damage, Weapon weapon) {
        super(name, health, damage);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo() {
        return "Name: " + getName() + "\nHealth: " + getHealth() + "\nDamage: " + getDamage() +
                "\nWeapon type: " + weapon.getType() + "\nWeapon name: " + weapon.getName();
    }
}