package com.algaworks.ecommerce.model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pagamento.class)
public abstract class Pagamento_ {

	public static volatile SingularAttribute<Pagamento, Pedido> pedido;
	public static volatile SingularAttribute<Pagamento, Integer> id;
	public static volatile SingularAttribute<Pagamento, Integer> versao;
	public static volatile SingularAttribute<Pagamento, StatusPagamento> status;

	public static final String PEDIDO = "pedido";
	public static final String ID = "id";
	public static final String VERSAO = "versao";
	public static final String STATUS = "status";

}

