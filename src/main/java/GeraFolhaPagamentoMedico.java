public class GeraFolhaPagamentoMedico implements GeraAbstrata {

    public FolhaPagamento createFolhaPagamento(){
        return new FolhaPagamentoMedico();
    }
}
