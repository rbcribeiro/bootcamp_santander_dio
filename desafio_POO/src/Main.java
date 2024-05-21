import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso CSS");
		curso1.setDescricao("CSSDescrição");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso NODE");
		curso2.setDescricao("NODEDescrição");
		curso2.setCargaHoraria(18);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("GULP");
		mentoria.setDescricao("GULPDescrição");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("--");
		System.out.println("Conteúdos Inscritos " + devCamila.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXp());
		
		System.out.println("------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("--");
		System.out.println("Conteúdos Inscritos " + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
		
	}

}
