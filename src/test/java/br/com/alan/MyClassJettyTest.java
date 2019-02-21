package br.com.alan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.alan.modelos.MyClassJetty;

public class MyClassJettyTest {
	
	@Test
	public void verificarIdade() {
		MyClassJetty classe = new MyClassJetty("Teste", 37);
		assertEquals(42.55, classe.getIdadeComAcrescimo(), 0.00001);		
	}

}
