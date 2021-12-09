import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargoTest {

    @Test
    void deveEmitirFolhaPagamentoMedico() {
        GeraAbstrata gerar = new GeraFolhaPagamentoMedico();
        Cargo cargo = new Cargo(gerar);
        assertEquals("Nome: Jose, Cargo: Medico, Salario: 4000.0",
                cargo.emitirFolhaPagamento("Jose", "Medico", 4000));
    }

    @Test
    void deveEmitirFolhaPagamentoEnfermeiro() {
        GeraAbstrata gerar = new GeraFolhaPagamentoEnfermeiro();
        Cargo cargo = new Cargo(gerar);
        assertEquals("Nome: Maria, Cargo: Enfermeira, Salario: 2500.0",
                cargo.emitirFolhaPagamento("Maria", "Enfermeira", 2500));
    }

    @Test
    void deveEmitirFolhaPagamentoTecnicoEnfermagem() {
        GeraAbstrata gerar = new GeraFolhaPagamentoTecnicoEnfermagem();
        Cargo cargo = new Cargo(gerar);
        assertEquals("Nome: Luiz, Cargo: Tecnico em Enfermagem, Salario: 1500.0",
                cargo.emitirFolhaPagamento("Luiz", "Tecnico em Enfermagem", 1500));
    }

}