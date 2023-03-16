package com.iset.produits.entities;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    protected String nomProduit;
    protected Double prixProduit;
    protected Date dateCreation;

    public Produit() {

    }

    /*
        public Produit() {
        }
    */
    public Long getIdProduit() {
        return idProduit;
    }

    public Produit(String nomProduit, Double prixProduit, Date dateCreation) {
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
        this.dateCreation = dateCreation;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public void setPrixProduit(Double prixProduit) {
        this.prixProduit = prixProduit;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public Double getPrixProduit() {
        return prixProduit;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setIdProduit(Long id) {
    }
}
