package Inimigos;
import FantasyOne.Criatura;

public class VilaoDuergar extends Criatura{
	
	public VilaoDuergar(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.println("O Duergar ataca com CHUTE");
		System.out.println("Dano de 10");
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("O Duergar ataca com MACHADADA");
		System.out.println("Dano de 15");
		return 15;
	}

	@Override
	public int ataqueEspecial() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int ataqueEspecial2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void defesa() {
		// TODO Auto-generated method stub
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.println("Seu personagem recebeu dano, sua vida agora é de: " + this.getVida());
	}

	@Override
	public void usarPocao() {
		// TODO Auto-generated method stub
		
	}

}
