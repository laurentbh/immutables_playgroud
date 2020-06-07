package org.example.ressources;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TopLevelTest {

    @Test
    public void testBuilder() {
        ImmutableTopLevel obj = ImmutableTopLevel.builder()
                .code(1)
                .name("lol")
                .build();
        Assertions.assertThat(obj.name()).isEqualTo("lol");
        Assertions.assertThat(obj.subName()).isEmpty();

    }


}