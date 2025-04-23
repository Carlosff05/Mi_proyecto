public class Coche {
    private String matricula;
    private int caballos, velocidad;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return this.matricula;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }
    public int getCaballos() {
        return this.caballos;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getVelocidad() {
        return this.velocidad;
    }

    public Coche(String matricula, int caballos) {
        setCaballos(caballos);
        setMatricula(matricula);
        setVelocidad(0);
    }

    public void acelerar(int acelerado) {
        System.out.println("El coche está acelerando de " + getVelocidad() + " a " + (getVelocidad() + acelerado));
        setVelocidad(getVelocidad() + acelerado);
    }
}
