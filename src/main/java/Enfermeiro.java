public class Enfermeiro implements Funcionario{

    private FolhaPagamento folhaPagamento;
    private float salario;

    public Enfermeiro(GeraFolhaPagamentoInter geraFolhaPagamentoInter){
        this.folhaPagamento = geraFolhaPagamentoInter.createFolhaPagamentoEnfermeiro();
    }

    public String emitirFolhaPagamento() {
        return this.folhaPagamento.emitir(nome, matricula, salario);
    }

}