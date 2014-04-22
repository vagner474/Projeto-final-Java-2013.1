package Projeto;
public class Endereco{
    
    private String cidade;
    private String rua;
    private int num;
    private String bairro;
    private String uf;
    private String pais;
        
    public Endereco(String cidade, String rua, int num, String bairro, String uf, String pais){
       
        this.cidade = cidade;
        this.rua = rua;
        this.num = num;
        this.bairro = bairro;
        this.uf = uf;
        this.pais =  pais;
        
    }
    
    public void cancelarENDERECO(){
        this.cidade = null;
        this.rua = null;
        this.num = 0;
        this.bairro = null ;
        this.uf = null;
        this.pais = null;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public String getRua(){
        return rua;
    }
    
    public int getNum(){
        return num;
    }
    
    public String getBairro(){
        return bairro;
    }
    
    public String getUf(){
        return uf;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public void setRua(String rua){
        this.rua =  rua;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    public void setBairro(String bairro){
        this.bairro =  bairro;
    }
    
    public void setUf(String uf){
        this.uf =  uf;
    }
    
    public String getPais(){
        return pais;
    }
    
    public void setPais(String p){
        this.pais = p;
    }
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (num != other.num)
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		return true;
	}
    
}