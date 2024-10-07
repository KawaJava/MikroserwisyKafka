package kawajava.github.io.generator.order.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "orders")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date placeDate;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
    private BigDecimal grossValue;
    private String zipcode;
    private String city;
    private String street;

}
