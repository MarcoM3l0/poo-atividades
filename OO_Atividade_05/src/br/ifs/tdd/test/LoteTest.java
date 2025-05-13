package br.ifs.tdd.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.ifs.tdd.exception.ValidacaoException;
import br.ifs.tdd.model.Lote;
import br.ifs.tdd.model.Produto;

class LoteTest {

	private Produto produtoValido() {
        return new Produto("1234567890123", "Caneta", "Esferográfica", 2.50);
    }
	
	private LocalDate dataFutura = LocalDate.now().plusDays(20);

    @Test
    @DisplayName("CT10: Construção de lote válido")
    void ct10_loteValido() {
    	
        Lote lote = new Lote(produtoValido(), 20, dataFutura);
        assertEquals(produtoValido(), lote.getProduto());
        assertEquals(20, lote.getQuantidade());
        assertEquals(dataFutura, lote.getDataValidade());
    }
	
    @Test
    @DisplayName("CT11: Produto nulo")
    void ct11_ProdutoNulo() {
        
        ValidacaoException ex = assertThrows(ValidacaoException.class,
        		() -> new Lote(null, 20, dataFutura));
        
        assertEquals("Produto inválido", ex.getMessage());
        
    }
    
    @Test
    @DisplayName("CT12: Quantidade negativa")
    void ct12_quantidadeNegativa() {
    	
    	ValidacaoException ex = assertThrows(ValidacaoException.class,
    			() -> new Lote(produtoValido(), -20, dataFutura));
    	
    	assertEquals("Quantidade inválida (deve ser positiva)", ex.getMessage());
    }
    
    @Test
    @DisplayName("CT13: Validade nula")
    void ct13_validadeNula() {
    	
    	ValidacaoException ex = assertThrows(ValidacaoException.class,
    			() -> new Lote(produtoValido(), 20, null));
    	
    	assertEquals("Data de validade obrigatória", ex.getMessage());
    	
    }
    
    
    @Test
    @DisplayName("CT14: Validade no passado")
    void ct14_validadeVencida() {
    	
    	LocalDate dataPassada = LocalDate.now().minusDays(1);
    	
    	ValidacaoException ex = assertThrows(ValidacaoException.class,
    			() -> new Lote(produtoValido(), 20, dataPassada));
    	
    	assertEquals("Data de validade vencida", ex.getMessage());
    }
}
