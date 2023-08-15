
package monster.g3;

class Monster {
    // Fields for the Monster Class
    private String name;
    private String[] abilities;

    // Parameterized Constructor
    public Monster(String name, String[] abilities) {
        this.name = name;
        this.abilities = abilities;
    }

    public String getName() {
        return name;
    }

    public String[] getAbilities() {
        return abilities;
    }
}