package br.edu.ifs.designpatterns.proxy.impl;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import br.edu.ifs.designpatterns.proxy.Arquivo;

public class ArquivoReal implements Arquivo {
	
	private String nome;
	
	

	public ArquivoReal(String nome) {
		this.nome = nome;
	}

	@Override
	public void criar() {
		
		try {
			Files.createFile(Paths.get(this.nome));
		} catch (IOException e) {
            throw new RuntimeException("Falha ao criar arquivo", e);
        }
		
	}

	@Override
	public String recuperar() {
		
		try {
            return new String(Files.readAllBytes(Paths.get(this.nome)), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("Falha ao ler arquivo", e);
        }
	}

	@Override
	public void escrever(String string) {
		
		try {
			
			String conteudoQuebraLinha = string;
			
			if(Files.size(Paths.get(this.nome)) > 0)
				conteudoQuebraLinha = "\n" + string;
			
			Files.write(Paths.get(this.nome), conteudoQuebraLinha.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
		} catch(IOException e) {
			throw new RuntimeException("Falha ao ler arquvio", e);
		}
		
	}

	@Override
	public void remover() {
		try {
            Files.delete(Paths.get(this.nome));
        } catch (IOException e) {
            throw new RuntimeException("Falha ao remover arquivo", e);
        }
	}

}
