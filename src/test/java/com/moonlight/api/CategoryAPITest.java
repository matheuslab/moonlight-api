package com.moonlight.api;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = {CategoryAPI.class})
public class CategoryAPITest {

  @Autowired
  private MockMvc mvc;

  @Test
  void getAPiResponse() throws Exception {
    String url = "/categories";

    mvc.perform(
        get(url)
            .contentType(MediaType.APPLICATION_JSON)
    )
        .andExpect(status().is2xxSuccessful());
  }

}
