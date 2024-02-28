package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.controller.GDTController;
import com.example.demo.model.CasaEditrice;
import com.example.demo.repo.CasaEditriceRepo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GDTController.class)
public class GDTControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private CasaEditriceRepo repo;

    @Test
    public void testHelloWorld() throws Exception {
        this.mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World!"));
    }
//    @Test
//    public void testAddCasaEditrice() throws Exception {
//        CasaEditrice casaEditrice = new CasaEditrice("Nome Casa Editrice");
//        when(repo.save(casaEditrice)).thenReturn(casaEditrice);
//
//        this.mockMvc.perform(MockMvcRequestBuilders.post("/addCasaEditrice")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{ \"nome\": \"Nome Casa Editrice\" }"))
//                .andExpect(status().isOk());
//    }
}

