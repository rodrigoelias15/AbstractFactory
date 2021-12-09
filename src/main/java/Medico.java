public class Medico implements Funcionario{

    private FolhaPagamento folhaPagamento;
    private float salario;

    public Medico(GeraFolhaPagamentoInter geraFolhaPagamentoInter){
        this.folhaPagamento = geraFolhaPagamentoInter.createFolhaPagamentoMedico();
    }

    public String emitirFolhaPagamento() {
        return this.folhaPagamento.emitir(nome, matricula, salario);
    }

}
