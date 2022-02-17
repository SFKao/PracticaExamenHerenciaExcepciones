public class Tyranitar extends Pokemon{

    public Tyranitar(int hp, int ataque, int defensa) {
        super(hp, ataque, defensa);
    }

    @Override
    public void golpear(Pokemon pokemon) {
        this.usarAtaque().usar(pokemon);
        pokemon.recibirDanyo(this.ataque);
    }
}
