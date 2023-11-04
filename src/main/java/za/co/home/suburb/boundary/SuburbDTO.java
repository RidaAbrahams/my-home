package za.co.home.suburb.boundary;

import za.co.home.suburb.entity.Suburb;

import javax.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder({"suburbName", "quadrant", "crimeHotspot", "worthConsidering", "suburbRating", "comments"})
public class SuburbDTO {
    private String suburbName;
    private int quadrant;
    private boolean crimeHotspot;
    private boolean worthConsidering;
    private int suburbRating;
    private String comments;

    public SuburbDTO() {
    }

    public SuburbDTO(String suburbName, int quadrant, boolean crimeHotspot, boolean worthConsidering, int suburbRating, String comments) {
        this.suburbName = suburbName;
        this.quadrant = quadrant;
        this.crimeHotspot = crimeHotspot;
        this.worthConsidering = worthConsidering;
        this.suburbRating = suburbRating;
        this.comments = comments;
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
        return "SuburbDTO{" +
                "suburbName='" + suburbName + '\'' +
                ", quadrant=" + quadrant +
                ", crimeHotspot=" + crimeHotspot +
                ", worthConsidering=" + worthConsidering +
                ", suburbRating=" + suburbRating +
                ", comments='" + comments + '\'' +
                '}';
    }

    public static SuburbDTO fromSuburbEntity(Suburb entity) {
        SuburbDTO result = new SuburbDTO();
        result.setSuburbName(entity.getSuburbName());
        result.setQuadrant(entity.getQuadrant());
        result.setCrimeHotspot(entity.isCrimeHotspot());
        result.setWorthConsidering(entity.isWorthConsidering());
        result.setSuburbRating(entity.getSuburbRating());
        result.setComments(entity.getComments());
        return result;
    }
}
