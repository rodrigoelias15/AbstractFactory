public class Cargo implements Funcionario{

    private FolhaPagamento folhaPagamento;

    public Cargo(GeraAbstrata gerar) {
        this.folhaPagamento = gerar.createFolhaPagamento();
    }

    public String emitirFolhaPagamento(){return this.folhaPagamento.emitir(nome, cargo, salario);}
}
