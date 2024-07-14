import javax.swing.*;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        JFrame janela = new JFrame();

        janela.setTitle("Meu Primeiro Programa!");
        janela.setSize(500, 500);

        // Quando clicar no x da janela ele para o programa automaticamente
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Adicionado uma label
        JLabel labelNome = new JLabel("Nome: ");
        labelNome.setBounds(20, 20, 50, 20);

        // Criando um campo do nome
        JTextField campoTextoNome = new JTextField();
        campoTextoNome.setBounds(20, 40, 200, 20);

        // Craindo botão
        JButton botaoEnviar = new JButton("Enviar");
        botaoEnviar.setBounds(20, 60, 100, 20);

        botaoEnviar.addActionListener(e -> {     // Mesma coisa do javascript na parte do DOM
            String nomeDigitado = campoTextoNome.getText();
            JOptionPane.showMessageDialog(janela, "Olá, " + nomeDigitado);
        });

        // A ordem aqui n importa mt
        janela.setLayout(null);
        janela.getContentPane().add(labelNome);
        janela.getContentPane().add(campoTextoNome);
        janela.getContentPane().add(botaoEnviar);


        janela.setVisible(true);
    }

}

