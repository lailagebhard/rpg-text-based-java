package Inimigos;

import FantasyOne.Criatura;

public class ChefaoMinotauro extends Criatura {

	public ChefaoMinotauro(String name, int maxHp, int xp, int hp, int pocao, int nivel, int mp) {
		super(name, maxHp, xp, hp, pocao, nivel, mp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int ataqueBasico() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int ataqueBasico2() {
		// TODO Auto-generated method stub
		return 0;
	}s

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
	public int defesa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int recebeDano(int dano) {
		this.vida = this.vida - dano;
		System.out.println("Seu personagem recebeu dano, sua vida agora é de: " + this.vida);
		return this.vida;
	}

}
