package org.example.ressources;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize
//@JsonDeserialize(as = AttemptInternalBuilder.ImmutableAttempt.class)
public abstract class TopLevel {
    @JsonProperty("name")
    public abstract String name();
    @JsonProperty("sub_name")
    public abstract Optional<String> subName();
    @JsonProperty("code")
    public abstract Integer code();
    @JsonProperty("urls")
    public abstract List<SecondLevel> urls();
}
