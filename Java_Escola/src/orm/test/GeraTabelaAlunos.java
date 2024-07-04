package orm.test;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class GeraTabelaAlunos {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
    }
}
