package dev.patrickoconnell.bird.birdspecies;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="species") //postgres table name is 'species' in 'birdspecies' db
public class BirdSpecies {
    @Id
    @Column(name = "id", nullable = false,insertable=false, updatable = false)
    private Integer id;
    @Column(name = "taxon_order",insertable=false, updatable = false)
    private int taxon_order;
    @Column(name = "category",insertable=false, updatable = false)
    private String category;
    @Column(name = "species_code",insertable=false, updatable = false)
    private String species_code;
    @Column(name = "common_name",insertable=false, updatable = false)
    private String common_name;
    @Column(name = "scientific_name",insertable=false, updatable = false)
    private String scientific_name;
    @Column(name = "order1",insertable=false, updatable = false)
    private String order1;
    @Column(name = "family",insertable=false, updatable = false)
    private String family;
    @Column(name = "species_group",insertable=false, updatable = false)
    private String species_group;

    public Integer getId() {
        return id;
    }

    public int getTaxon_order() {
        return taxon_order;
    }

    public String getCategory() {
        return category;
    }

    public String getSpecies_code() {
        return species_code;
    }

    public String getCommon_name() {
        return common_name;
    }

    public String getScientific_name() {
        return scientific_name;
    }

    public String getOrder1() {
        return order1;
    }

    public String getFamily() {
        return family;
    }

    public String getSpecies_group() {
        return species_group;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTaxon_order(int taxon_order) {
        this.taxon_order = taxon_order;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSpecies_code(String species_code) {
        this.species_code = species_code;
    }

    public void setCommon_name(String common_name) {
        this.common_name = common_name;
    }

    public void setScientific_name(String scientific_name) {
        this.scientific_name = scientific_name;
    }

    public void setOrder1(String order1) {
        this.order1 = order1;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setSpecies_group(String species_group) {
        this.species_group = species_group;
    }

    @Override
    public String toString() {
        return "\"BirdSpecies\"{" + "\"id\"=" + id.toString() +
                ", \"taxon_order\"=" + taxon_order +
                ", \"category\"=" + '\"' + category + '\"' +
                ", \"species_code\"=" + '\"' + species_code + '\"' +
                ", \"common_name\"=" + '\"' + common_name + '\"' +
                ", \"scientific_name\"=" + '\"' + scientific_name + '\"' +
                ", \"order1\"=" + '\"' + order1 + '\"' +
                ", \"family\"=" + '\"' + family + '\"' +
                ", \"species_group\"=" + '\"' + species_group + '\"' +
                '}';
    }
}
