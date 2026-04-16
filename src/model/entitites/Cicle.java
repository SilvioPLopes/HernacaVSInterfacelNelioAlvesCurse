package model.entitites;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class Cicle extends AbstractShape{

    private  Double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
