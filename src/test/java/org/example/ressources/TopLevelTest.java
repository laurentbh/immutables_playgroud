package org.example.ressources;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopLevelTest {
    ObjectMapper objectMapper;

    @BeforeEach
    public void setup() {
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new Jdk8Module());

    }

    @Test
    public void testBuilder() throws JsonProcessingException {
        ImmutableTopLevel obj = ImmutableTopLevel.builder()
                .code(1)
                .name("lol")
                .build();

        String json = objectMapper.writeValueAsString(obj);
        Assertions.assertThat(obj.name()).isEqualTo("lol");
        Assertions.assertThat(obj.subName()).isEmpty();

    }

    @Test
    public void testBuilderFromString() throws JsonProcessingException {
        String json = "{\"name\":\"lol\",\"sub_name\":null,\"code\":1,\"urls\":[]}";

        ImmutableTopLevel obj = objectMapper.readValue(json, ImmutableTopLevel.class);

        Assertions.assertThat(obj.name()).isEqualTo("lol");
        Assertions.assertThat(obj.subName()).isEmpty();

    }


}