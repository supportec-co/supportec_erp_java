package com.supportec.erp.web;

import com.supportec.erp.domain.posts.Posts;
import com.supportec.erp.web.dto.HelloResponseDto;
import com.supportec.erp.web.dto.PostsSaveRequestDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testHello() throws Exception {
        //given
        String url = "http://localhost:" + port + "/hello";
        //when
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        //then
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isEqualTo("hello");
    }

    @Test
    void helloDto() throws Exception {

        //given
        String name = "hello";
        int amount = 1000;
        String url = "http://localhost:" + port + "/hello/dto?name=" + name + "&amount=" + amount;
        //when
        ResponseEntity<HelloResponseDto> responseEntity = restTemplate.getForEntity(url, HelloResponseDto.class);
        //then
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody().getName()).isEqualTo(name);
        assertThat(responseEntity.getBody().getAmount()).isEqualTo(amount);
    }
}