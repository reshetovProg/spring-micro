package com.example.shopservice.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
@Builder
public class OrderDTO {
    private Long id;
    private Integer userId;

    private Long productId;

    @NonNull
    private LocalDateTime openOrder;

}
