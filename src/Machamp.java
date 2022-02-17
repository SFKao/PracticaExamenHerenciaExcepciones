public class Machamp extends Pokemon{

    public Machamp(int hp, int ataque, int defensa) {
        super(hp, ataque, defensa);
    }

    @Override
    public void golpear(Pokemon pokemon) {
        for(int i = 0; i < 4; i++) {
            this.usarAtaque().usar(pokemon);
            pokemon.recibirDanyo(this.ataque);
        }
    }
}
