package com.example.demo.integration;

import com.example.demo.entity.Cat;
import com.example.demo.repository.CatRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CatControllerIntegrationTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private CatRepository catRepository;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        catRepository.deleteAll(); // Clears all records from the table
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }


    @Test
    void testGetAllCats() throws Exception {
        // Given
        Cat cat1 = new Cat();
        cat1.setName("Whiskers");
        cat1.setBreed("Siamese");
        cat1.setAge(3);

        Cat cat2 = new Cat();
        cat2.setName("Garfield");
        cat2.setBreed("Tabby");
        cat2.setAge(5);

        catRepository.save(cat1); // Save to the test database
        catRepository.save(cat2);

        String actualJson = mockMvc.perform(get("/cats"))
                .andReturn()
                .getResponse()
                .getContentAsString();

        String expectedJson = "[{\"name\":\"Whiskers\",\"breed\":\"Siamese\",\"age\":3},{\"name\":\"Garfield\",\"breed\":\"Tabby\",\"age\":5}]";

        JSONAssert.assertEquals(expectedJson, actualJson, false);
    }
}
