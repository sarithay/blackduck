package com.infosys.realsocial;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.infosys.realsocial.RealSocialConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RealSocialConfig.class)
@WebAppConfiguration
public class RSApplicationTests {

	@Test
	public void contextLoads() {
	}

}
