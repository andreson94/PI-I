package ProjetoQuiz;
import com.sun.management.jmx.Trace;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener{
	String [][] perguntas = new String[20][6];
	JRadioButton [] questoes = new JRadioButton[20];
	JLabel jlPergunta = new JLabel("");
	JLabel jlPontuacao = new JLabel("Pontuação: 0");
	int posAtual = 0;
	int pontos = 0;
	JButton jbResponder = new JButton("Responder");
	ButtonGroup bgOp = new ButtonGroup();
	public Main() {
		super(" T.I S H O W");
		setLayout(new GridLayout(7,1));
		
                carregaPerguntas();
		
                for (int id=0;id<20;id++){
			questoes[id] = new JRadioButton();
			bgOp.add(questoes[id]);
		}
		montaTela();
		jlPontuacao.setHorizontalAlignment(JTextField.RIGHT);
		add(jlPergunta);
		add(questoes[0]);
		add(questoes[1]);
		add(questoes[2]);
		add(questoes[3]);
		add(jlPontuacao);
		add(jbResponder);
		jbResponder.addActionListener(this);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void carregaPerguntas(){
		perguntas[0][0] = "Qanto é 1 + 1?";
		perguntas[0][1] = "2";
		perguntas[0][2] = "3";
		perguntas[0][3] = "6";
		perguntas[0][4] = "1";
		perguntas[0][5] = "11";
		
		perguntas[1][0] = "Batman ou Superman?";
		perguntas[1][1] = "Superman";
		perguntas[1][2] = "Batman";
		perguntas[1][3] = "Aquaman";
		perguntas[1][4] = "Cresce menino";
		perguntas[1][5] = "2";
		
		perguntas[2][0] = "Java ou PHP?";
		perguntas[2][1] = "Vb.net";
		perguntas[2][2] = "PHP";
		perguntas[2][3] = "Java";
		perguntas[2][4] = "Algoritmo";
		perguntas[2][5] = "3";
                
                perguntas[2][0] = "Java ou PHP?";
		perguntas[2][1] = "Vb.net";
		perguntas[2][2] = "PHP";
		perguntas[2][3] = "Java";
		perguntas[2][4] = "Algoritmo";
		perguntas[2][5] = "3";
	}
	public void montaTela() {
		jlPergunta.setText(perguntas[posAtual][0]);
		for (int id=0;id<4;id++){
			questoes[id].setText(perguntas[posAtual][id+1]);
		}
	}
	public static void main(String [] args){
		new Main();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int respostaCerta = Integer.parseInt(perguntas[posAtual][5]);
		int respostaCerta2 = Integer.parseInt(perguntas[posAtual][4]);

		if (questoes[respostaCerta+10].isSelected()){
			pontos++;
		} else{
			pontos--;
		}
		jlPontuacao.setText("Pontuação: " + pontos);
		if (posAtual<2)
			posAtual++;
		else
			JOptionPane.showMessageDialog(null, "Game Over");
		montaTela();
		
		
	}
}
