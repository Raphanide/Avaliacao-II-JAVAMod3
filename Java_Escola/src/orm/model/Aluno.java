package orm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name="alunos")
public class Aluno {

        @Id
        @GeneratedValue
        private long id;


        private String nome;
        private String email;
        private String cpf;


        private LocalDate dataNascimento;

        private String naturalidade;
        private String endereco;

        public Aluno() {

        }

        public Aluno(long id, String nome, String email, String cpf, LocalDate dataNascimento, String naturalidade,
                     String endereco) {
            this.id = id;
            this.nome = nome;
            this.email = email;
            this.cpf = cpf;
            this.dataNascimento = dataNascimento;
            this.naturalidade = naturalidade;
            this.endereco = endereco;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
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

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public LocalDate getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        public String getNaturalidade() {
            return naturalidade;
        }

        public void setNaturalidade(String naturalidade) {
            this.naturalidade = naturalidade;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }


        @Override
        public String toString() {
            return "id = " + id + ", nome = " + nome + ", email = " + email + ", cpf = " + cpf.formatted("xxx.xxx.xxx-xx", cpf) + ", dataNascimento = "
                    + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                    + ", naturalidade = " + naturalidade + ", endereco = " + endereco;
        }





    }