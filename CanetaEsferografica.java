package ProjetoBloco1;

public class CanetaEsferografica extends Caneta {
	
	//Polimorfismo de sobreposição 
	@Override
	public void modeloCaneta()
	{
		this.setModelo("Caneta Esferografica");
	}
	@Override
	public void materialCaneta()
	{
		this.setTipoDeTinta("Tinta padrão");
	}

}