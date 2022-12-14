package Inimigos;

import FantasyOne.GameLogic;

public class VilaoElfo extends Vilao{
	
	public VilaoElfo(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.println("Elfo utilizou seu arco e flecha, causando 10 de dano!");
		System.out.println("Dano: 10");
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("Elfo utilizou sua espada, causando 15 de dano!");
		System.out.println("Dano: 15");
		return 15;
	}

	@Override
	public int ataqueEspecial() {
		if(this.getMp()>0) {
			System.out.println("Elfo usou luminocese, causando 25 de dano!");
			System.out.println("Dano: 25");
			return 25;
		}else {
			System.out.println("Mana insuficiente!");
			return 0;
		}
	}

	@Override
	public int ataqueEspecial2() {
		if(this.getMp()>0) {
			System.out.println("Elfo usou magia de luz, causando 35 de dano!");
			System.out.println("Dano: 35");
			return 35;
		}else {
			System.out.println("Mana insuficiente!");
			return 0;
		}
	}

	@Override
	public void defesa() {
		if(this.getMp() >= 2) {
			System.out.println("Elfo utilizou sua Aura de Cura, aumentando seu HP em 20!");
			this.setVida(this.getVida() + 20);
		}else {
			System.out.println("Sem mana suficiente para recuperar vida!");
		}
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.println("Seu personagem recebeu dano, sua vida agora é de: " + this.getVida());
	}

	@Override
	public void historia() {
		GameLogic.telaPontilhada(50);
		System.out.println(
				"Conforme nosso herói começava a se aproximar da subida do vulcão, ele percebeu a presença de um capanga Elfo, com um longo cabelo negro e orelhas pontudas, ele porta uma espada e um cajado, e em suas costas havia um arco. Nosso herói aproxima-se furtivamente e inicia o confronto. Ataque!");
		GameLogic.telaPontilhada(50);

		GameLogic.pressioneUmaTecla();
	}
}