//RM95021 - Matheus de Deus
package br.com.fiap.mp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.mp.model.Pedido;


public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}

