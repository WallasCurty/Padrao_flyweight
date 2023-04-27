import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class BancoTest {
    @Test
    void deveRetornarClientes() {
        Banco banco = new Banco();
        banco.cadastrar("João",1234567 ,"Vassouras", "RJ");
        banco.cadastrar("Fernando",2345678 ,"Vassouras", "RJ");
        banco.cadastrar("Ana Julia",3456789 ,"Vassouras", "RJ");
        banco.cadastrar("Patricia",4567891 ,"Além Paraiba", "MG");

        List<String> saida = Arrays.asList(
                "Aluno{nome='João', cpf=1234567, cidade='Vassouras', uf='MG'}",
                "Aluno{nome='Fernando', cpf=2345678, cidade='Vassouras', uf='MG'}",
                "Aluno{nome='Ana Julia', cpf=3456789, cidade='Vassouras', uf='MG'}",
                "Aluno{nome='Patricia', cpf=4567891,cidade='Além Paraiba', uf='MG'}");

        assertEquals(saida, banco.obterClientes());
    }

    @Test
    void deveRetornarTotalCidades() {
        Banco banco = new Banco();
        banco.cadastrar("João",1234567 ,"Vassouras", "RJ");
        banco.cadastrar("Fernando",2345678 ,"Vassouras", "RJ");
        banco.cadastrar("Ana Julia",3456789 ,"Vassouras", "RJ");
        banco.cadastrar("Patricia",4567891 ,"Além Paraiba", "MG");

        assertEquals(2, CidadeFactory.getTotalCidades());
    }
}
