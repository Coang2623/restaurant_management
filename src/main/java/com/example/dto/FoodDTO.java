package com.example.dto;

import java.math.BigDecimal;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FoodDTO {
	private BigDecimal foodNumber;
	private String foodName;
	private Float foodPrice;
	private String foodImg;
	private Double revenue;
	private String status;
	private String catName;
	private Integer id;
}
