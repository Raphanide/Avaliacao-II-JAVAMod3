package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.model.Aluno;

public class AtualizarAluno {

    public static void atualiza(Aluno aluno) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin(); // Iniciar transação
        manager.merge(aluno);; // linha que faz o hibernate inserir um objeto no banco
        manager.getTransaction().commit(); // Encerramento da transação

        manager.close();
        factory.close();

    }
}
