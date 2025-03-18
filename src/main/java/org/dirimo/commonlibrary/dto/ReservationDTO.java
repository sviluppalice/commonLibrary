package org.dirimo.commonlibrary.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDTO {

    private Long reservationId;
    private BookDTO book;
    private CustomerDTO customer;
    private LocalDate resStartDate;
    private LocalDate resEndDate;
}
