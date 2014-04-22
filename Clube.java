package Projeto;

public class Clube{
	
   private String anoFundacao;
   private String nClube;
   private String tecnico;
   private String presidente;
   private double sTecnico;
   private int vitorias;
   private int derrotas;
   private Jogador[] jogadores;
   private int cont;
   
   public Clube (String nClube,String anoFundacao, String tecnico, String presidente, double sTecnico){
       this.nClube = nClube;
       this.tecnico =  tecnico;
       this.anoFundacao = anoFundacao;
       this.presidente = presidente;
       this.sTecnico = sTecnico;
       this.jogadores = new Jogador[50];// olhar a quantidade de jogadores maximo em um clube.
       this.cont = 0;
   }
   public void addJogador(Jogador jogador) throws JogadorExistenteException{
	   for(int i = 0; i < this.jogadores.length; i++){
		   if(this.jogadores[i] != null){
			   if(this.jogadores[i].equals(jogador)){
				   throw new JogadorExistenteException("Jogador existente ");
			   }
		   }
	   }
	   this.jogadores[this.cont] = jogador;
	   if(this.cont <= 49){
		   this.cont++;
	   }
   }
   public void removeJogador(String nome) throws JogadorInexistenteException{
	   boolean aux = true;
	   for(int i = 0; i < this.jogadores.length; i++){
		   if(this.jogadores[i] != null){
			   if(this.jogadores[i].getNome().equals(nome)){
				   this.cont--;
				   aux = false;
				   for(int j = i; j < this.jogadores.length; j++){
					   if(j + 1 <= 49){
						   this.jogadores[j] = this.jogadores[j+1];
					   }
				   }
			   }
		   }
	   }
	   if(aux){
		   throw new JogadorInexistenteException("Jogadoe inexistente " + nome);
	   }
   }
   public Jogador getJogador(String nome) throws JogadorInexistenteException{
	   for(int i = 0; i < this.jogadores.length; i++){
		   if(this.jogadores[i] != null){
			   if(this.jogadores[i].getNome().equals(nome)){
				   return this.jogadores[i];
			   }
		   }
	   }
	   throw new JogadorInexistenteException("Jogador inexistente " + nome);
   }
   public int getVitorias(){
       return vitorias;
   }
   
   public void setVitorias(int vitorias) throws VitoriaInvalidaException{
	   if(vitorias >= 0){
		   this.vitorias = vitorias;
	   }else{
		   throw new VitoriaInvalidaException("valor invalidor " + vitorias);
	   }
   }
   
   public int getDerrotas(){
       return derrotas;
   }
   
   public void  setDerrotas(int derrotas) throws DerrotarInvalidaException{
	   if(derrotas >= 0){
		   this.derrotas = derrotas;
	   }else{
		   throw new DerrotarInvalidaException("valor invalidor " + derrotas);
	   }
   }
   
   public String getNClube(){
       return nClube;
   }
   
   public double getSTecnico(){
       return sTecnico;
   }
   
   public String getAnoFundacao(){
       return anoFundacao;
   }
   
   public String getTecnico(){
       return tecnico;
   }
   
   public String getPresidente(){
       return presidente;
   }
   
   public void setNClube(String nClube){
       this.nClube = nClube;
   }
   
   public void setTecnico (String tecnico){
       this.tecnico = tecnico;
   }
   
   public void setAnoFundacao(String anoFundacao){
       this.anoFundacao = anoFundacao;
   }
   
   public void setSTecnico(Double sTecnico){
       this.sTecnico = sTecnico;
   }
   
   public void setPresidente (String presidente){
       this.presidente = presidente;
   }
   
   public void DespedirTecnico(String nome, double salario){
       this.tecnico = nome;
       this.sTecnico = salario;
       //Aqui vc cadastra um novo tecnico sem precisar invocar o SET, dessa forma o set só vai ser usado para AJUSTAR UM DADO ERRADO!
   }
   
   public String TreinadorContinuaTIME(){
       
	   if(vitorias > derrotas){
		   return "TREINADOR CONTINUA NO TIME";
        
	   }else{
		   return "Treinador tem que ser Despedido";
    
	   }   
   }

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clube other = (Clube) obj;
		if (anoFundacao == null) {
			if (other.anoFundacao != null)
				return false;
		} else if (!anoFundacao.equals(other.anoFundacao))
			return false;
		if (derrotas != other.derrotas)
			return false;
		if (jogadores == null) {
			if (other.jogadores != null)
				return false;
		} else if (!jogadores.equals(other.jogadores))
			return false;
		if (nClube == null) {
			if (other.nClube != null)
				return false;
		} else if (!nClube.equals(other.nClube))
			return false;
		if (presidente == null) {
			if (other.presidente != null)
				return false;
		} else if (!presidente.equals(other.presidente))
			return false;
		if (Double.doubleToLongBits(sTecnico) != Double
				.doubleToLongBits(other.sTecnico))
			return false;
		if (tecnico == null) {
			if (other.tecnico != null)
				return false;
		} else if (!tecnico.equals(other.tecnico))
			return false;
		if (vitorias != other.vitorias)
			return false;
		return true;
	}
   
}
   