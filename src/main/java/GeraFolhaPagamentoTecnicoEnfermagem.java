public class GeraFolhaPagamentoTecnicoEnfermagem implements GeraAbstrata {

    public FolhaPagamento createFolhaPagamento(){
        return new FolhaPagamentoTecnicoEnfermagem();
    }
}

