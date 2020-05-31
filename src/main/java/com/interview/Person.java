package com.interview;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Person {

    private Integer id;
    private String personName;

    public Person( String personName ){
        this.personName = personName;
    }
}
