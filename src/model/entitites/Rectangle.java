package model.entitites;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class Rectangle extends AbstractShape {

    private Double width;
    private Double height;

    @Override
    public double area() {
        return width * height;
    }
}