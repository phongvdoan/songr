package com.phongvdoan.songr;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class SongrApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private HomeController homeController;

	@Test
	void contextLoads() {
	}



	@Test
	public void shouldHaveHomePage() throws Exception {
		this.mockMvc.perform(get("/"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("<h2>Songr App</h2>")));
	}

	@Test
	public void shouldHaveHelloPage() throws Exception {
		this.mockMvc.perform(get("/hello"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("<h1>Hello, World!</h1>")));
	}

	@Test
	public void shouldHaveCapitalizePage() throws Exception {
		this.mockMvc.perform(get("/capitalize/hi"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("<h1><span>HI</span></h1>")));
	}

	@Test
	public void shouldHaveAlbumsPage() throws Exception {
		this.mockMvc.perform(get("/albums"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("<h1>Album List: </h1>")));
	}
//	https://stackoverflow.com/questions/49956208/spring-controller-testing-with-mockmvc-post-method
//	@Test
//	public void shouldHaveAlbumPage() throws Exception {
//		Object randomObj = new Object() {
//			public final long id = 1;
//		};
//		ObjectMapper objectMapper = new ObjectMapper();
//		String json = objectMapper.writeValueAsString(randomObj);
//		this.mockMvc.perform(get("/album").content(json))
//
//				.andDo(print())
//				.andExpect(status().isOk())
//				.andExpect(content().string(containsString("<h1>Album Details: </h1>")));
//	}

}
