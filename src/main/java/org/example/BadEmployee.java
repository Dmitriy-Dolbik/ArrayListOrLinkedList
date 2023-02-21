package org.example;

import java.util.Objects;

public class BadEmployee extends Person
{
    private String id;

    public BadEmployee(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    // Bad implementation of hashCode and equals
    @Override
    public int hashCode() {
        return 1; // Bad implementation!
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadEmployee)) {
            return false;
        }
        BadEmployee other = (BadEmployee) obj;
        return Objects.equals(id, other.id);
    }
}
