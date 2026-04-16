package model.entitites;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import model.enums.Color;

@Data
@SuperBuilder
@NoArgsConstructor
public abstract class AbstractShape implements Shape {

    private Color color;
}
