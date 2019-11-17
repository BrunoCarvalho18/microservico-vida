package com.projeto.vida.testes;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import br.com.projeto.vida.VidaApplication;
import br.com.projeto.vida.controller.dto.ClienteDto;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = { VidaApplication.class })
@WebAppConfiguration
public class TesteRealizaCadastro {
	private MockMvc mvc;
	@Autowired
	private WebApplicationContext wac;

	@Before
	public void setup() {
		this.mvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
	
	@Test
	public void testeEndpointHello()throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/v1/hello")
				.accept(MediaType.APPLICATION_JSON))
		        .andExpect(status().is(200));
	}

	@Test
	public void testIncluirCliente() throws Exception {
		 mvc.perform(MockMvcRequestBuilders.post("/api/v1/cadastrocliente")
         		.content(asJsonString(new ClienteDto ("47149191053", "brunoteste@gmail.com", "Bruno Carvalho", "B")))
                 .contentType(MediaType.APPLICATION_JSON)
                 .accept(MediaType.APPLICATION_JSON))
                 .andExpect(status().is(201));
	}
	
	
	public static String asJsonString(final Object obj) {
	    try {
	        return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}

}
