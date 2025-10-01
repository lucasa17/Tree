package Default;

import java.util.*;

public class Person implements Comparable<Person>{
	private String nome;
	private Integer matricula;	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	@Override
	public int compareTo(Person outraPessoa) {
		return this.matricula.compareTo(outraPessoa.getMatricula());
	}
	
	@Override
	public String toString() {
		return this.nome + " - " + this.matricula;
	}
	
}
