package my.app.com.MyProject04.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
@Entity
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    private static enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}