package com.example.stockservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer userId;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Product productId;

    @NonNull
    private LocalDateTime openOrder;
    private LocalDateTime closeOrder;
}
