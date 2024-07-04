package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.model.Aluno;

public class RemoverAluno {

    public static void remover(Aluno aluno) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin(); // Iniciar transação
        manager.remove(manager.contains(aluno) ? aluno : manager.merge(aluno));
        manager.getTransaction().commit(); // Encerramento da transação

        manager.close();
        factory.close();
    }
}