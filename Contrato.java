package Projeto;



public class Contrato{
    
    private String dataContrato;
    private double valorContrato;
    private String emprestarJogador;
    
    
    public Contrato(String dataContrato, double valorContrato){
        
        this.dataContrato = dataContrato;
        this.valorContrato = valorContrato;
    
    }
    
    public void setDataContrato(String dataContrato){
        this.dataContrato = dataContrato ;
    }
    
    public void setValorContrato(double valorContrato){
        this.valorContrato = valorContrato;
    }
    
    public String getDataContrato(){
        return dataContrato;
    }
    
    public double getValorContrato(){
        if(emprestarJogador == "Jogador esta Emprestado"){
            return valorContrato * 10000;
        }else{
            return valorContrato;
        }
        
    }
    
    public void cancelarContrato(){
        this.dataContrato = "Cancelado";
        this.valorContrato = 0.0 ;
        //cancelando o contrato as variaveis são zeradas
    }   
    
    public void renovarContrato(String dataContrato, double valorContrato){
         this.dataContrato = dataContrato; 
         this.valorContrato = valorContrato;
    }
    
    public String getEmprestarJogador(){
        return emprestarJogador;
    }
    
    public void emprestarJogador(){
        if(dataContrato != "Cancelado"){
                emprestarJogador = "Jogador esta Emprestado";
      }else{
               emprestarJogador = "Contrato Cancelado";
        }
    }
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contrato other = (Contrato) obj;
		if (dataContrato == null) {
			if (other.dataContrato != null)
				return false;
		} else if (!dataContrato.equals(other.dataContrato))
			return false;
		if (emprestarJogador == null) {
			if (other.emprestarJogador != null)
				return false;
		} else if (!emprestarJogador.equals(other.emprestarJogador))
			return false;
		if (Double.doubleToLongBits(valorContrato) != Double
				.doubleToLongBits(other.valorContrato))
			return false;
		return true;
	}
    
}
