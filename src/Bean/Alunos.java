package Bean;

/**
 *
 * @author Alberto
 */
public class Alunos extends CadUsuario{
        private float altura;
        private float peso;
        private float panturrilha;
        private float braco;
        private float perna;
        private float cintura;
        private float coxa;
        private float peitoral;
        private float costas;

        public Alunos(){
        }
        
        public Alunos(String nome, String CPF){
   //         super (CPF, nome);
   //         this.
        }
    
    	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public float getPanturrilha() {
		return panturrilha;
	}


	public void setPanturrilha(float panturrilha) {
		this.panturrilha = panturrilha;
	}


	public float getBraco() {
		return braco;
	}


	public void setBraco(float braco) {
		this.braco = braco;
	}


	public float getPerna() {
		return perna;
	}


	public void setPerna(float perna) {
		this.perna = perna;
	}


	public float getCintura() {
		return cintura;
	}


	public void setCintura(float cintura) {
		this.cintura = cintura;
	}


	public float getCoxa() {
		return coxa;
	}


	public void setCoxa(float coxa) {
		this.coxa = coxa;
	}


	public float getPeitoral() {
		return peitoral;
	}


	public void setPeitoral(float peitoral) {
		this.peitoral = peitoral;
	}


	public float getCostas() {
		return costas;
	}


	public void setCostas(float costas) {
		this.costas = costas;
	}
}
