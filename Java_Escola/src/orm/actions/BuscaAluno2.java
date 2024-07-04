package orm.actions;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orm.model.Aluno;

public class BuscaAluno2 {
    public static List<Aluno> busca(){

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();


        Query query = manager.createQuery("select a from Aluno as a");

        @SuppressWarnings("unchecked")
        List<Aluno> alunos = query.getResultList();

        manager.close();
        factory.close();

        return alunos;

    }
}
