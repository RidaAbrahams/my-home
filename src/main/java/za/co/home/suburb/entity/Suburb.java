package za.co.home.suburb.entity;

import za.co.home.suburb.boundary.SuburbDTO;

import javax.persistence.*;

@Entity
@NamedQueries({
    @NamedQuery(name = Suburb.FIND_BY_ID, query = "select s from Suburb s where s.id = :id")
})
public class Suburb {

    public static final String FIND_BY_ID = "findById";

    @Id
    @GeneratedValue()
    private Long id;
    @Column(name = "suburb_name")
    private String suburbName;
    @Column(name = "quadrant")
    private int quadrant;
    @Column(name = "crime_hot_spot")
    private boolean crimeHotspot;
    @Column(name = "worth_considering")
    private boolean worthConsidering;
    @Column(name = "suburb_rating")
    private int suburbRating;
    @Column(name = "comments")
    private String comments;

    public Suburb() {
    }

    public Suburb(Long id,
                  String suburbName,
                  int quadrant,
                  boolean crimeHotspot,
                  boolean worthConsidering,
                  int suburbRating,
                  String comments) {
        this.id = id;
        this.suburbName = suburbName;
        this.quadrant = quadrant;
        this.crimeHotspot = crimeHotspot;
        this.worthConsidering = worthConsidering;
        this.suburbRating = suburbRating;
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSuburbName() {
        return suburbName;
    }

    public void setSuburbName(String suburbName) {
        this.suburbName = suburbName;
    }

    public int getQuadrant() {
        return quadrant;
    }

    public void setQuadrant(int quadrant) {
        this.quadrant = quadrant;
    }

    public boolean isCrimeHotspot() {
        return crimeHotspot;
    }

    public void setCrimeHotspot(boolean crimeHotspot) {
        this.crimeHotspot = crimeHotspot;
    }

    public boolean isWorthConsidering() {
        return worthConsidering;
    }

    public void setWorthConsidering(boolean worthConsidering) {
        this.worthConsidering = worthConsidering;
    }

    public int getSuburbRating() {
        return suburbRating;
    }

    public void setSuburbRating(int suburbRating) {
        this.suburbRating = suburbRating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Suburb{" +
                "id=" + id +
                ", suburbName='" + suburbName + '\'' +
                ", quadrant=" + quadrant +
                ", crimeHotspot=" + crimeHotspot +
                ", worthConsidering=" + worthConsidering +
                ", suburbRating=" + suburbRating +
                ", comments='" + comments + '\'' +
                '}';
    }

    public static Suburb fromSuburbDTO(SuburbDTO dto) {
        Suburb result = new Suburb();
        result.setId(null);
        result.setSuburbName(dto.getSuburbName());
        result.setQuadrant(dto.getQuadrant());
        result.setCrimeHotspot(dto.isCrimeHotspot());
        result.setWorthConsidering(dto.isWorthConsidering());
        result.setSuburbRating(dto.getSuburbRating());
        result.setComments(dto.getComments());
        return result;
    }
}
