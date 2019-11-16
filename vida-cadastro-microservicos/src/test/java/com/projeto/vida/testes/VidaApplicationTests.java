package com.projeto.vida.testes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import br.com.projeto.vida.VidaApplication;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = { VidaApplication.class })
@WebAppConfiguration
public class VidaApplicationTests {
	
	@Test
	public void contextLoads() {
	}
	

}
