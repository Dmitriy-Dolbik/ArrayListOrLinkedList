package org.example;

import java.util.HashMap;
import java.util.Map;

public final class ImmutablePerson {
    private final String name;
    private final Map<String, String> children;
    public ImmutablePerson(String name, Map<String, String> children) {
        this.name = name;
        Map<String, String> deepCopy = new HashMap<>();
        for(String key : children.keySet()) {
            deepCopy.put(key, children.get(key));
        }
        this.children = deepCopy;
    }
    public String getName() {
        return name;
    }

    public Map<String, String> getChildren()
    {
        Map<String, String> deepCopy = new HashMap<>();
        for(String key : children.keySet()) {
            deepCopy.put(key, children.get(key));
        }
        return deepCopy;
    }
}
