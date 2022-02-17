import java.util.Random;

public abstract class Pokemon {
    public static Random r = new Random();

    protected int hp;
    protected int ataque;
    protected int defensa;

    protected Ataque[] ataques;
    private int nAtaques;

    public Pokemon(int hp, int ataque, int defensa) {
        this.hp = hp;
        this.ataque = ataque;
        this.defensa = defensa;
        ataques = new Ataque[4];
        nAtaques = 0;
    }

    public void anyadirAtaque(Ataque a) throws PokemonException {
        if(nAtaques >= 4)
            throw new PokemonException("Se intento añadir un 5o ataque");
        ataques[nAtaques++] = a;
    }

    public int getnAtaques() {
        return nAtaques;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public abstract void golpear(Pokemon pokemon);

    public void recibirDanyo(int danyo){
        if(danyo - defensa > hp)
            hp = 0;
        else
            hp -= danyo - defensa;
    }

    public Ataque usarAtaque(){
        return ataques[r.nextInt(nAtaques)];
    }
}
