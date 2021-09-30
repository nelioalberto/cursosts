package com.nekliuvekliu.cursosts.enums;

public enum TipoCliente {

	PESSOAFISICA (1, "Pessoa Física"),
	PESSOAJURIDICA (2, "Pessoa Jurídica");
	
	private Integer cod;
	private String descricao;
	
	private TipoCliente(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public Integer getCod() {
		return cod;
	}
	
	public String etDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod()))
				return x;
		}
		
		throw new IllegalArgumentException("id inválido " + cod);
	}
	
	
}
