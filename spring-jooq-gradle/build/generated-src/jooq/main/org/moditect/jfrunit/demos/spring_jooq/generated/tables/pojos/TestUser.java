/*
 * This file is generated by jOOQ.
 */
package org.moditect.jfrunit.demos.spring_jooq.generated.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long    id;
    private final String  username;
    private final Integer age;

    public TestUser(TestUser value) {
        this.id = value.id;
        this.username = value.username;
        this.age = value.age;
    }

    public TestUser(
        Long    id,
        String  username,
        Integer age
    ) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    /**
     * Getter for <code>public.test_user.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.test_user.username</code>.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Getter for <code>public.test_user.age</code>.
     */
    public Integer getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TestUser (");

        sb.append(id);
        sb.append(", ").append(username);
        sb.append(", ").append(age);

        sb.append(")");
        return sb.toString();
    }
}