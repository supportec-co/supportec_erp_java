package com.supportec.erp.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testHello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello")) // 아까 지정해 뒀던 get 요청을 test하겠다는 의미이다.
                .andDo(print())  // MockMvcResultHandlers.print가 static으로 import된 것을 확인할 수 있다.
                .andExpect(status().isOk()) // 200 응답을 ok 할것이다.
                .andExpect(content().string("hello"));  // 문자열을 리턴하는 것을 확인한다.
    }

    @Test
    void helloDto() throws Exception {
        String name = "hello";
        int amount = 1000;

        mockMvc.perform(MockMvcRequestBuilders.get("/hello/dto")
                        .param("name", name)
                        .param("amount", String.valueOf(amount))) // 아까 지정해 뒀던 get 요청을 test하겠다는 의미이다.
                .andDo(print())  // MockMvcResultHandlers.print가 static으로 import된 것을 확인할 수 있다.
                .andExpect(status().isOk()) // 200 응답을 ok 할것이다.
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount)));  // 문자열을 리턴하는 것을 확인한다.
    }
}