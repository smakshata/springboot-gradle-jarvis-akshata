package com.jarvis.apps;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringGradleJarvisApplicationTests {

	 @Autowired
	    private WebApplicationContext wac;
	 
	    private MockMvc mockMvc;
	 
	    @Before
	    public void setup() {
	        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	    }
	    
	    @Test
	    public void testGetConfig() throws Exception {
	        ResultActions result = this.mockMvc.perform(get("/jarvis/config/pathName"))
	                .andExpect(status().isOk());
	        assert(result.andReturn().equals("pathName=test"));
	                //.andExpect();
	    }

}
