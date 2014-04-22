package Projeto;

public class Gerenciador{
    
  private Clube cb;
  private Endereco end;
  
  public Gerenciador(Clube cb,Endereco end){
      this.cb = cb;
      this.end = end;  
  }
  
  public Clube getClube(){
      return this.cb;
  }
 
  public Endereco getEnd(){
    return end;
  }
}
  

