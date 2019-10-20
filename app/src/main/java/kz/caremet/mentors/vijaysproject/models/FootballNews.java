package kz.caremet.mentors.vijaysproject.models;

import java.util.Date;

public class FootballNews {

    int id;
    String title;
    String shortDescription;
    String longDescription;
    String image_url;
    Date cratetion_date;


    public FootballNews(int id,
                        String title,
                        String shortDescription,
                        String longDescription,
                        String image_url,
                        Date cratetion_date){
        this.id = id;
        this.title = title;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.image_url = image_url;
        this.cratetion_date = cratetion_date;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Date getCratetion_date() {
        return cratetion_date;
    }

    public void setCratetion_date(Date cratetion_date) {
        this.cratetion_date = cratetion_date;
    }

}
