package windowsBuilding;

import java.io.BufferedWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextField;

public class Cliente {
	
	private String nome;
	private String email;
	private int idade;
	
	
	
	//Método 
	public String salvar() throws IOException {
		File f1 = new File("/home/cafecomjava/ide/rlsystem-fund-poo-java/rlsystem.curso.javaBasico/src/windowsBuilding/cliente_arquivo.txt");
		
		if(!f1.exists()) {
			
			 try {
					f1.createNewFile();
					FileWriter writer = new FileWriter(f1);
					
					writer.write(this.nome + " - " + this.email + " - " + this.idade);
					writer.flush();
					writer.close();
		} catch(Exception ex) { // ex é o objeto criado pelo Exception
			
			return "Erro no sistema. Mensagem: " + ex.getMessage();
		}
			
		}
		
		return "O cadastro foi cadastrado com sucesso";
		
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	

	
}

