package br.com.insubordinada;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TesteExemplo {
    //Apenas um exemplo

    @Test
    public void deve_passar() {
        assertThat(true, equalTo(true));
    }
}
