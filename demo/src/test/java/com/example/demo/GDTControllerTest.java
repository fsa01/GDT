//package com.example.demo;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import com.example.demo.controller.GDTController;
//import com.example.demo.model.CasaEditrice;
//import com.example.demo.repo.CasaEditriceRepo;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.Optional;
//
//@WebMvcTest(GDTController.class)
//public class GDTControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
////    @MockBean
////    private CasaEditriceRepo repo;
//
//    @Test
//    public void testHelloWorld() throws Exception {
//        this.mockMvc.perform(get("/hello"))
//                .andExpect(status().isOk())
//                .andExpect(content().string("Hello World!"));
//    }
////    @Test
////    public void testGetCasaEditriceById_Success() throws Exception {
////        Long id = 1L;
////        CasaEditrice casaEditrice = new CasaEditrice();
////
////        // Mock repository behavior
////        Mockito.when(repo.findById(id)).thenReturn(Optional.of(casaEditrice));
////
////        mockMvc.perform(MockMvcRequestBuilders.get("/addCasaEditrice/{id}", id))
////                .andExpect(status().isOk())
////                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
////                .andExpect(content().json(asJsonString(casaEditrice)));
////    }
// // Helper method for converting an object to JSON string
////    public static String asJsonString(Object obj) throws JsonProcessingException {
////        ObjectMapper mapper = new ObjectMapper();
////        return mapper.writeValueAsString(obj);
////    }
//}
//
//
