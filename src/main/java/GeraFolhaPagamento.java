public class GeraFolhaPagamento implements GeraFolhaPagamentoInter {

    public FolhaPagamento createFolhaPagamentoMedico(){
        return new FolhaPagamentoMedico();
    }

    public FolhaPagamento createFolhaPagamentoEnfermeiro(){
        return new FolhaPagamentoEnfermeiro();
    }

    public FolhaPagamento createFolhaPagamentoTecnicoEnfermagem(){
        return new FolhaPagamentoTecnicoEnfermagem();
    }
}
