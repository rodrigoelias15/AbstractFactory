public class TecnicoEnfermagem implements Funcionario{

    private FolhaPagamento folhaPagamento;
    private float salario;

    public TecnicoEnfermagem(GeraFolhaPagamentoInter geraFolhaPagamentoInter){
        this.folhaPagamento = geraFolhaPagamentoInter.createFolhaPagamentoTecnicoEnfermagem();
    }

    public String emitirFolhaPagamento() {
        return this.folhaPagamento.emitir(nome, matricula, salario);
    }

}
