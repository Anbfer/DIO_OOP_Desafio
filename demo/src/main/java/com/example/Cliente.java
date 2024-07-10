package com.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class Cliente {

	@Getter
	@Setter
	private String nome;

}
