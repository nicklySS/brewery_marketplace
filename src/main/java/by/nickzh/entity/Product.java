package by.nickzh.entity;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Product {
    private UUID id;
    private UUID breweryId;
    private String name;
    private String description;
    private Double abv;
    private int ibu;
    private String style;
    private Date createdAt;

    public Product() {
    }

    public Product(UUID id, UUID breweryId, String name, String description,
                   Double abv, int ibu, String style, Date createdAt) {
        this.id = id;
        this.breweryId = breweryId;
        this.name = name;
        this.description = description;
        this.abv = abv;
        this.ibu = ibu;
        this.style = style;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getBreweryId() {
        return breweryId;
    }

    public void setBreweryId(UUID breweryId) {
        this.breweryId = breweryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAbv() {
        return abv;
    }

    public void setAbv(Double abv) {
        this.abv = abv;
    }

    public int getIbu() {
        return ibu;
    }

    public void setIbu(int ibu) {
        this.ibu = ibu;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", breweryId=" + breweryId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", abv=" + abv +
                ", ibu=" + ibu +
                ", style='" + style + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return ibu == product.ibu && Objects.equals(id, product.id) && Objects.equals(
                breweryId, product.breweryId) && Objects.equals(name, product.name) &&
                Objects.equals(description, product.description) && Objects.equals(abv, product.abv) &&
                Objects.equals(style, product.style) && Objects.equals(createdAt, product.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, breweryId, name, description, abv, ibu, style, createdAt);
    }
}
