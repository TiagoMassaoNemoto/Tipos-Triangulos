package modelo;

public class Triangulo extends absPropriedades
{

    public Triangulo(Double l1, Double l2, Double l3)
    {
        super(l1, l2, l3);
        this.Verificar();
    }
    
    private void Verificar()
    {
        if (this.getL1().equals(this.getL2()) & this.getL1().equals(this.getL3()) & this.getL2().equals(this.getL3()))
            this.setResposta("Equilátero");
        
        else if (this.getL1().equals(this.getL2()) | this.getL1().equals(this.getL3()) | this.getL2().equals(this.getL3()))
            this.setResposta("Isóscele");
        
        else
            this.setResposta("Escaleno");
    }
}