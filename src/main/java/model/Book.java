package model;

import lombok.*;

@Data
@Builder
public class Book {
    private String name;
    private String creatingTime;

    private String author;
    private String genre;
    private Integer publicRating;
    private Integer myRating;
}
