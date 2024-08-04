package com.example.bookmyshow.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookTicketRequestDto {

    List<Long> showSeatIds;

    @Override
    public String toString() {
        return "BookTicketRequestDto{" +
                "showSeatIds=" + showSeatIds +
                '}';
    }
}
