package com.iset.produits.DAO;
import com.iset.produits.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
