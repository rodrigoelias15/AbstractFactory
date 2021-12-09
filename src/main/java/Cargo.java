public class Cargo implements Funcionario{

    private FolhaPagamento folhaPagamento;

    public Cargo(GeraAbstrata gerar) {
        this.folhaPagamento = gerar.createFolhaPagamento();
    }
}
