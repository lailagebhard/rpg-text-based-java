package Frames;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.StyleConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class FrameHerois extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameHerois frame = new FrameHerois();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameHerois() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel texto1 = new JLabel("Agora vamos escolher o seu herói!");
		texto1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		texto1.setHorizontalAlignment(SwingConstants.CENTER);
		texto1.setBounds(87, 16, 560, 34);
		contentPane.add(texto1);
		
		JLabel deathKnight = new JLabel();
		deathKnight.setHorizontalAlignment(SwingConstants.CENTER);
		deathKnight.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		deathKnight.setIcon(new ImageIcon(FrameHerois.class.getResource("/Images/herois-bruxo-cacador.png")));
		deathKnight.setBounds(39, 79, 100, 130);
		contentPane.add(deathKnight);
		
		JLabel lblNewLabel = new JLabel("Bruxo Caçador");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNewLabel.setBounds(35, 220, 109, 21);
		contentPane.add(lblNewLabel);
		
		JLabel deathKnight_2 = new JLabel();
		deathKnight_2.setIcon(new ImageIcon(FrameHerois.class.getResource("/Images/herois-eladrin.png")));
		deathKnight_2.setHorizontalAlignment(SwingConstants.CENTER);
		deathKnight_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		deathKnight_2.setBounds(178, 79, 100, 130);
		contentPane.add(deathKnight_2);
		
		JLabel deathKnight_1_1 = new JLabel();
		deathKnight_1_1.setIcon(new ImageIcon(FrameHerois.class.getResource("/Images/herois-mago-cinzento.png")));
		deathKnight_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		deathKnight_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		deathKnight_1_1.setBounds(317, 79, 100, 130);
		contentPane.add(deathKnight_1_1);
		
		JLabel deathKnight_1_1_1 = new JLabel();
		deathKnight_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		deathKnight_1_1_1.setIcon(new ImageIcon(FrameHerois.class.getResource("/Images/herois-sacerdote.png")));
		deathKnight_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		deathKnight_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		deathKnight_1_1_1.setBounds(460, 45, 100, 164);
		contentPane.add(deathKnight_1_1_1);
		
		JLabel deathKnight_1_1_2 = new JLabel();
		deathKnight_1_1_2.setIcon(new ImageIcon(FrameHerois.class.getResource("/Images/herois-deathknight.png")));
		deathKnight_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		deathKnight_1_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		deathKnight_1_1_2.setBounds(597, 79, 100, 130);
		contentPane.add(deathKnight_1_1_2);
		
		JLabel lblEladrin = new JLabel("Eladrin");
		lblEladrin.setHorizontalAlignment(SwingConstants.CENTER);
		lblEladrin.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblEladrin.setBounds(174, 220, 109, 21);
		contentPane.add(lblEladrin);
		
		JLabel lblMagoCinzento = new JLabel("Mago Cinzento");
		lblMagoCinzento.setHorizontalAlignment(SwingConstants.CENTER);
		lblMagoCinzento.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblMagoCinzento.setBounds(313, 220, 109, 21);
		contentPane.add(lblMagoCinzento);
		
		JLabel lblSacerdote = new JLabel("Sacerdote");
		lblSacerdote.setHorizontalAlignment(SwingConstants.CENTER);
		lblSacerdote.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblSacerdote.setBounds(456, 220, 109, 21);
		contentPane.add(lblSacerdote);
		
		JLabel lblMagoCinzento_1_1 = new JLabel("DeathKnight");
		lblMagoCinzento_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMagoCinzento_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblMagoCinzento_1_1.setBounds(593, 220, 109, 21);
		contentPane.add(lblMagoCinzento_1_1);
		
		JTextPane txtpnBruxoCacador = new JTextPane();
		txtpnBruxoCacador.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtpnBruxoCacador.setBackground(new Color(240, 240, 240));
		txtpnBruxoCacador.setText("O implacável caçador usar seus poderes mágicos para destruir seus inimigos.");
		txtpnBruxoCacador.setBounds(39, 245, 110, 118);
		contentPane.add(txtpnBruxoCacador);	
				
		JTextPane txtpnEladrin = new JTextPane();
		txtpnEladrin.setEditable(false);
		txtpnEladrin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtpnEladrin.setText("Espécie de elfo que adquire seus poderes da natureza e os modifca de acordo com as estações do ano, causando danos ao inimigo ou se curando.");
		txtpnEladrin.setBackground(SystemColor.menu);
		txtpnEladrin.setBounds(173, 245, 110, 130);
		contentPane.add(txtpnEladrin);
		
		JTextPane txtpnSacerdote = new JTextPane();
		txtpnSacerdote.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtpnSacerdote.setText("Com sua túnica e seu cajado, usa sua fé e o poder divino para subjulgar seus inimigos. Usando orações ele é capaz de causar grande dano e se curar.");
		txtpnSacerdote.setBackground(SystemColor.menu);
		txtpnSacerdote.setBounds(456, 245, 110, 118);
		contentPane.add(txtpnSacerdote);
		
		JTextPane txtpnDeathKnight = new JTextPane();
		txtpnDeathKnight.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtpnDeathKnight.setText("O poderoso guerreiro possui uma armadura impenetrável e usa suas habilidades para se defender e destruir seus oponentes.");
		txtpnDeathKnight.setBackground(SystemColor.menu);
		txtpnDeathKnight.setBounds(595, 245, 110, 118);
		contentPane.add(txtpnDeathKnight);
		
		JButton btn = new JButton("ESCOLHER MEU HERÓI");
		btn.setForeground(new Color(255, 255, 255));
		btn.setBackground(new Color(255, 0, 128));
		btn.setVerticalAlignment(SwingConstants.TOP);
		btn.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dispose();
			}
		});
		btn.setBounds(272, 400, 189, 23);
		contentPane.add(btn);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignOnBaseline(true);
		panel.setBounds(311, 245, 112, 157);
		contentPane.add(panel);
		
		JTextPane txtpnPersonagemMsticoEle = new JTextPane();
		txtpnPersonagemMsticoEle.setText("Personagem místico, ele veio da Lua com o intuito de proteger Untirade. Seus ataques são fortes e irão acabar seus oponentes.");
		panel.add(txtpnPersonagemMsticoEle);
	}
}
