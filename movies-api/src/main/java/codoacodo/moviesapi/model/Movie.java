package codoacodo.moviesapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private int screen;
    private LocalDateTime dateTimeStarts;
    private LocalDateTime dateTimeEnds;
    private double price;

public Movie(String title, int screen, LocalDateTime dateTimeStarts, LocalDateTime dateTimeEnds, double price){
    this.title = title;
    this.screen = screen;
    this.dateTimeStarts = dateTimeStarts;
    this.dateTimeEnds = dateTimeEnds;
    this.price = price;
}

}
