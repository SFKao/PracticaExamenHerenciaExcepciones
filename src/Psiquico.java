public class Psiquico implements Ataque{
    @Override
    public void usar(Pokemon p) {
        System.out.println(p.getClass().getName() + " usa " + this.getClass().getName());
    }
}
