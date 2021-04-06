package modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String lado1, String lado2, String lado3)
    {
        super(lado1, lado2, lado3);
        this.Validar();
    }
    
    private void Validar()
    {
        this.setMensagem("");
        try
        {
            this.setL1(Double.valueOf(this.getLado1()));
            this.setL2(Double.valueOf(this.getLado2()));
            this.setL3(Double.valueOf(this.getLado3()));
            if (this.getL1() <= 0 || this.getL2()<= 0 || this.getL3() <= 0)
                this.setMensagem("Digite um número maior que zero");
            
            else if (this.getL1() + this.getL2() <= this.getL3() |
                this.getL2() + this.getL3() <= this.getL1() |
                this.getL3() + this.getL1() <= this.getL2())
                this.setMensagem("Não é um triangulo");
        }
        catch (Exception e)
        {
            this.setMensagem("Número invalido");
        }
    }
}