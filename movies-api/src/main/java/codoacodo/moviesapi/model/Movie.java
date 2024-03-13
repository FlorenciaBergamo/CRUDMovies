package codoacodo.moviesapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {
    private Long id;
    private String title;
    private int screen;
    private LocalDateTime dateTimeStarts;
    private LocalDateTime dateTimeEnds;
    private double price;
}
