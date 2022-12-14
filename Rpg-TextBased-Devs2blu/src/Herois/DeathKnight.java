package Herois;

import FantasyOne.GameLogic;

public class DeathKnight extends Personagem{
		public DeathKnight(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
			super(nome, maxVida, xp, vida, pocao, nivel, mp);
			this.setNome(nome);
			this.setMaxVida(maxVida);
			this.setXp(xp);
			this.setVida(vida);
			this.setPocao(pocao);
			this.setNivel(nivel);
			this.setMp(mp);
		}
		
		@Override
		public int ataqueBasico() {
			System.out.println("Dk aplicou o soco da morte, causando 10 de dano!");
			System.out.println("Dano: 10");
			return 10;
		}

		@Override
		public int ataqueBasico2() {
			System.out.println("Dk usou a espada do rei , causando 12 de dano!");
			System.out.println("Dano: 12");
			return 12;
		}

		@Override
		public int ataqueEspecial() {
			if(this.getMp() > 0) {
				System.out.println("Invocou os servos das trevas, causando 20 de dano!");
				System.out.println("Dano: 20");
				this.setMp(this.getMp() - 1);
				return 20;			
			} else {
				System.out.println("Sem mana suficiente para os servos das trevas");
				return 0;
			}
		}

		@Override
		public int ataqueEspecial2() {
			if(this.getMp() > 0) {
				System.out.println("Você usou Exorcizar para expurgar seu inimigo, causando 25 de dano!");
				System.out.println("Dano: 25");
				this.setMp(this.getMp() - 1);			
				return 25;
			} else {
				System.out.println("Você tenta, mas não possui mana suficiente para Exorcizar!");
				return 0;
			}
		}

		@Override
		public void defesa() {
			System.out.println("Você usa a Troca sanguinea e cura 10 pontos de vida!");
			this.setVida(this.getVida() + 20);
		}

		@Override
		public void recebeDano(int dano) {
			this.setVida(this.getVida() - dano);
			System.out.println("Seu personagem recebeu dano, sua vida agora é de: " + this.getVida());
		}
		
		@Override
		public void usarPocao() {
			if(this.getPocao() > 0) {
				this.setPocao(this.getPocao() - 1);			
				this.setVida(this.getVida() + 20);
			} else {
				System.out.println("Você não possui Poções de Cura!");
			}
			System.out.println("Você usou uma Poção de Cura, sua vida atual é: " + this.getVida());
		}
		
		@Override
		public void historia() {
			GameLogic.telaPontilhada(50);
			System.out.println("Historia");
			GameLogic.telaPontilhada(50);
			System.out.println("Ai sim");
			System.out.println("Criem suas historias");

			GameLogic.pressioneUmaTecla();
		}

	}