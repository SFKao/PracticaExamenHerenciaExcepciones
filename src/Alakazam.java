public class Alakazam extends Pokemon{

    public Alakazam(int hp, int ataque, int defensa) {
        super(hp, ataque, defensa);
    }

    @Override
    public void golpear(Pokemon pokemon) {
        this.usarAtaque().usar(pokemon);
        if(pokemon instanceof Tyranitar)
            pokemon.recibirDanyo(0);
        else if(pokemon instanceof Machamp)
            pokemon.recibirDanyo(2*ataque);
        else
            pokemon.recibirDanyo(ataque);
    }
}
