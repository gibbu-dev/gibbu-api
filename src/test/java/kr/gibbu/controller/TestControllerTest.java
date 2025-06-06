package kr.gibbu.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(TestController.class)
class TestControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  @DisplayName("ci 테스트가 성공적으로 수행된다.")
  void continuousIntegrationTest() throws Exception {
    // given
    String targetUrl = "/test";
    String expectedResponse = "ci test success";

    // when & then
    mockMvc.perform(get(targetUrl))
        .andExpect(status().isOk())
        .andExpect(content().string(expectedResponse));
  }
}