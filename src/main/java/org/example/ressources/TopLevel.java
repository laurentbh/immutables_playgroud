package org.example.ressources;

import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
public abstract class TopLevel {
    public abstract String name();
    public abstract Optional<String> subName();
    public abstract Integer code();
    public abstract List<SecondLevel> urls();
}
