/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author jamel_pc
 */
public class Produit implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String libelle;
    private String description;
    private String marque;
    private String etat;
    private String prixProduit;
    private String quantiteStock;
    private String pourcentagePromotion;
    private Date createdDate;
    private String duree;
    private String approuver;
    private Integer seller;
    private String imageName;
    private Date updatedAt;
    private Categorie produitCategorie;

    public Produit() {
    }

    public Produit(Integer id) {
        this.id = id;
    }

    public Produit(Integer id, String libelle, String description, String marque, String etat, String prixProduit, String quantiteStock, Date createdDate, String duree, Date updatedAt) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.marque = marque;
        this.etat = etat;
        this.prixProduit = prixProduit;
        this.quantiteStock = quantiteStock;
        this.createdDate = createdDate;
        this.duree = duree;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(String prixProduit) {
        this.prixProduit = prixProduit;
    }

    public String getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(String quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public String getPourcentagePromotion() {
        return pourcentagePromotion;
    }

    public void setPourcentagePromotion(String pourcentagePromotion) {
        this.pourcentagePromotion = pourcentagePromotion;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getApprouver() {
        return approuver;
    }

    public void setApprouver(String approuver) {
        this.approuver = approuver;
    }

    public Integer getSeller() {
        return seller;
    }

    public void setSeller(Integer seller) {
        this.seller = seller;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Categorie getProduitCategorie() {
        return produitCategorie;
    }

    public void setProduitCategorie(Categorie produitCategorie) {
        this.produitCategorie = produitCategorie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Produit[ id=" + id + " ]";
    }
    
}
