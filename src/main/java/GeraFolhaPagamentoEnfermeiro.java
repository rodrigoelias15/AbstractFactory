public class GeraFolhaPagamentoEnfermeiro implements GeraAbstrata {

    public FolhaPagamento createFolhaPagamento(){
        return new FolhaPagamentoEnfermeiro();
    }
}
