import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso java");
		curso1.setDescricao("Descrição");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso javascript");
		curso2.setDescricao("Descrição script");
		curso2.setCargaHoraria(18);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria java");
		mentoria1.setDescricao("Mentoria descrição");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		System.out.println();

	}

}
