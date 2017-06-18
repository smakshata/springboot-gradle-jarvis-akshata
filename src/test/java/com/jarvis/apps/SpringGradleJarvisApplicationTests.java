package com.jarvis.apps;

import static org.junit.Assert.assertEquals;
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
	    
	    //http://ip:port/jarvis/config/path
	    
	    @Test
	    public void testGetConfig() throws Exception {
	        ResultActions result = this.mockMvc.perform(get("/config/{name}", "path").contentType("application/json"))
	                .andExpect(status().isOk());
	        String response = result.andReturn().getResponse().getContentAsString();
	        //System.out.println(response);
	        assertEquals("Your Config with : path has value 'testValue'",response);
	                //.andExpect();
	    }

}
