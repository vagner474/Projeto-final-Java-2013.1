package Projeto;

public class CondicoesFisicas{
   
    private double peso;
    private double altura;
    private double imc;
    private String situacaoFisica;
    private String timeBackPlay;
        
    public CondicoesFisicas(double peso, double altura) throws AlturaInvalidaException, PesoInvalidoException{
        this.setPeso(peso);
        this.setAltura(altura);
    }
    
    public double getPeso() {
        return peso;
    }
    
    public double getAltura(){
        return altura;
    }
       
    public void setPeso(double peso) throws PesoInvalidoException{
    	if(peso > 0){
    		this.peso = peso;
    	}else{
    		throw new PesoInvalidoException("Peso invalido " + peso);
    	}
    }
    
    public void setAltura(double altura) throws AlturaInvalidaException{
        if(altura >= 0){
        	this.altura = altura;
        }else{
        	throw new AlturaInvalidaException("Altura invalida " + altura);
        }
    }
    
    public void calculaImc(){
        this.imc = peso / (altura*altura);
    
    }
    
    public void avaliacaoFisica(){
         
        if(imc > 18.5 && imc < 25){
            situacaoFisica = " Disponivel para o Jogo ";
             
        }
        else{
            
            situacaoFisica = "Indisponivel para o Jogo"; 
        }
    
    }
      
    public String getSituacaoFisica(){
        return situacaoFisica;
    }
    
    public void estudoTEMPO(){
        if(situacaoFisica == "Indisponivel para o Jogo"){
                timeBackPlay = "Tratamento de 4 semanas";
        }
        else{
            timeBackPlay = "Apto para Jogar";
        }
        
    }
    
    public String getTimeBackPlay(){
        return timeBackPlay;
    } 
    
   
}
