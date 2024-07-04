package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.model.Aluno;

public class InserirAluno {
	public static void inserir(Aluno aluno) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.persist(aluno);
		manager.getTransaction().commit();

		manager.close();
		factory.close();

	}
}
