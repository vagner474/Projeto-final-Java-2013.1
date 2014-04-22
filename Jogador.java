package Projeto;

public class Jogador{ 
  
  private String newSalario;
  private String nome;
  private String posicao;
  private int numCam;
  private double salario;
  private double au1 = 0.10;
  private double au2 = 0.20;
  private double au3 = 0.30;
  private double aumento;
  private double valor;
  private String imagem;
  private CondicoesFisicas condicao;
  private Contrato contrato;
  
  public Jogador (String nome, String posicao, int numCam, CondicoesFisicas condicao, Contrato contrato){
      this.nome =  nome;
      this.posicao = posicao;
      this.numCam = numCam;
      this.condicao = condicao;
      this.contrato = contrato;
  }
  public CondicoesFisicas getCondicao(){
	  return this.condicao;
  }
  public Contrato getContrato(){
	  return this.contrato;
  }
  public void setNumCam(int numCam) throws NumCamisaInvalidoException{
	  if(numCam > 0){
		  this.numCam= numCam;
	  }else{
		  throw new NumCamisaInvalidoException("Número de camisa invalido " + numCam);
	  }
  }
  
  public String newSalario(){
      return newSalario;
  }
  
  public int getNumCam(){
      return numCam;
  }
   
  public double getSalario(){
      return salario;
  }
  
  public void setSalario(double salario) throws SalarioInvalidoException{
	  if(salario > 0){
		  this.salario =  salario;
	  }else{
		  
		  throw new SalarioInvalidoException("Salario invalido R$ " + salario);
	  }
  }
   
  public String getNome(){
      return nome;
  }
  
  public void setNome(String nome){
      this.nome = nome;
  }
  public String getPosicao(){
      return posicao;
  }
  public void setPosicao(String posicao){
      this.posicao = posicao;
  }
 
    
  public  void NovoSalario (){
      if (salario >= 1000 && salario <= 3000){
          
          newSalario = "Seu Salario recebeu um aumento de 10%";
          
      }
      else if (salario >= 3000 && salario <= 6000){
        
          newSalario = "Seu Salario recebeu um aumento de 20%";
        
      }
      else{
        newSalario = "Seu Salario recebeu um aumento de 30%";
        
      }
  }
  
  public void DireitoDeImagem(){
      
      if (salario >= 50000 || salario <= 1000000 ){
       this.imagem  =  "Jogador tem direito de imagem";
       this.salario = (salario * au2) + salario;
  
      } 
      else{
       this.imagem  =  "Jogador nÃ£o tem direito de imagem";
    
      }
 
  }
  
  public void saberAumento(){
      System.out.println("O aumento do Jogador foi de: "+aumento);
      
  }
  
  public double getValor(){
        return aumento;
  }
  
  public String getImagem(){
      return imagem;
  }
  
  public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		if (contrato == null) {
			if (other.contrato != null)
				return false;
		} else if (!contrato.equals(other.contrato))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numCam != other.numCam)
			return false;
		if (posicao == null) {
			if (other.posicao != null)
				return false;
		} else if (!posicao.equals(other.posicao))
			return false;
		if (Double.doubleToLongBits(salario) != Double
				.doubleToLongBits(other.salario))
			return false;
		if (Double.doubleToLongBits(valor) != Double
				.doubleToLongBits(other.valor))
			return false;
		return true;
	}
  }