/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CBD.videojuego.videojuego;

import java.util.Objects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author jaime
 */
@Document
public class Videojuego {
    
    @Id
    private String id;
    
    @Field("Name")
    private String name;
    
    @Field("Platform") 
    private String platform;
    
    @Field("Year_of_Release") 
    private Integer yearOfRelease ;
    
    @Field("Genre") 
    private String genre;
    
    @Field("Publisher") 
    private String publisher;
    
    @Field("NA_Sales") 
    private Double NA_Sales;
    
    @Field("EU_Sales") 
    private Double EU_Sales;
    
    @Field("JP_Sales") 
    private Double JP_Sales;
    
    @Field("Other_Sales") 
    private Double Other_Sales;
    
    @Field("Global_Sales") 
    private Double Global_Sales;
    
    @Field("Critic_Score") 
    private Integer Critic_Score;
    
    @Field("Critic_Count") 
    private Integer Critic_Count;
    
    @Field("User_Score") 
    private Double User_Score;
     
    @Field("User_Count") 
    private Integer User_Count;
      
    @Field("Developer") 
    private String Developer;
       
    @Field("Rating") 
    private String Rating;

    
    public Videojuego() {
    }

    public Videojuego(String id, String name, String platform, Integer yearOfRelease, String genre, String publisher, Double NA_Sales, Double EU_Sales, Double JP_Sales, Double Other_Sales, Double Global_Sales, Integer Critic_Score, Integer Critic_Count, Double User_Score, Integer User_Count, String Developer, String Rating) {
        this.id = id;
        this.name = name;
        this.platform = platform;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
        this.publisher = publisher;
        this.NA_Sales = NA_Sales;
        this.EU_Sales = EU_Sales;
        this.JP_Sales = JP_Sales;
        this.Other_Sales = Other_Sales;
        this.Global_Sales = Global_Sales;
        this.Critic_Score = Critic_Score;
        this.Critic_Count = Critic_Count;
        this.User_Score = User_Score;
        this.User_Count = User_Count;
        this.Developer = Developer;
        this.Rating = Rating;
    }

    public Videojuego(String name, String platform, Integer yearOfRelease, String genre, String publisher, Double NA_Sales, Double EU_Sales, Double JP_Sales, Double Other_Sales, Double Global_Sales, Integer Critic_Score, Integer Critic_Count, Double User_Score, Integer User_Count, String Developer, String Rating) {
        this.name = name;
        this.platform = platform;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
        this.publisher = publisher;
        this.NA_Sales = NA_Sales;
        this.EU_Sales = EU_Sales;
        this.JP_Sales = JP_Sales;
        this.Other_Sales = Other_Sales;
        this.Global_Sales = Global_Sales;
        this.Critic_Score = Critic_Score;
        this.Critic_Count = Critic_Count;
        this.User_Score = User_Score;
        this.User_Count = User_Count;
        this.Developer = Developer;
        this.Rating = Rating;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Integer getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(Integer yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Double getNA_Sales() {
        return NA_Sales;
    }

    public void setNA_Sales(Double NA_Sales) {
        this.NA_Sales = NA_Sales;
    }

    public Double getEU_Sales() {
        return EU_Sales;
    }

    public void setEU_Sales(Double EU_Sales) {
        this.EU_Sales = EU_Sales;
    }

    public Double getJP_Sales() {
        return JP_Sales;
    }

    public void setJP_Sales(Double JP_Sales) {
        this.JP_Sales = JP_Sales;
    }

    public Double getOther_Sales() {
        return Other_Sales;
    }

    public void setOther_Sales(Double Other_Sales) {
        this.Other_Sales = Other_Sales;
    }

    public Double getGlobal_Sales() {
        return Global_Sales;
    }

    public void setGlobal_Sales(Double Global_Sales) {
        this.Global_Sales = Global_Sales;
    }

    public Integer getCritic_Score() {
        return Critic_Score;
    }

    public void setCritic_Score(Integer Critic_Score) {
        this.Critic_Score = Critic_Score;
    }

    public Integer getCritic_Count() {
        return Critic_Count;
    }

    public void setCritic_Count(Integer Critic_Count) {
        this.Critic_Count = Critic_Count;
    }

    public Double getUser_Score() {
        return User_Score;
    }

    public void setUser_Score(Double User_Score) {
        this.User_Score = User_Score;
    }

    public Integer getUser_Count() {
        return User_Count;
    }

    public void setUser_Count(Integer User_Count) {
        this.User_Count = User_Count;
    }

    public String getDeveloper() {
        return Developer;
    }

    public void setDeveloper(String Developer) {
        this.Developer = Developer;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.platform);
        hash = 83 * hash + Objects.hashCode(this.yearOfRelease);
        hash = 83 * hash + Objects.hashCode(this.genre);
        hash = 83 * hash + Objects.hashCode(this.publisher);
        hash = 83 * hash + Objects.hashCode(this.NA_Sales);
        hash = 83 * hash + Objects.hashCode(this.EU_Sales);
        hash = 83 * hash + Objects.hashCode(this.JP_Sales);
        hash = 83 * hash + Objects.hashCode(this.Other_Sales);
        hash = 83 * hash + Objects.hashCode(this.Global_Sales);
        hash = 83 * hash + Objects.hashCode(this.Critic_Score);
        hash = 83 * hash + Objects.hashCode(this.Critic_Count);
        hash = 83 * hash + Objects.hashCode(this.User_Score);
        hash = 83 * hash + Objects.hashCode(this.User_Count);
        hash = 83 * hash + Objects.hashCode(this.Developer);
        hash = 83 * hash + Objects.hashCode(this.Rating);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Videojuego other = (Videojuego) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.platform, other.platform)) {
            return false;
        }
        if (!Objects.equals(this.genre, other.genre)) {
            return false;
        }
        if (!Objects.equals(this.publisher, other.publisher)) {
            return false;
        }
        if (!Objects.equals(this.Developer, other.Developer)) {
            return false;
        }
        if (!Objects.equals(this.Rating, other.Rating)) {
            return false;
        }
        if (!Objects.equals(this.yearOfRelease, other.yearOfRelease)) {
            return false;
        }
        if (!Objects.equals(this.NA_Sales, other.NA_Sales)) {
            return false;
        }
        if (!Objects.equals(this.EU_Sales, other.EU_Sales)) {
            return false;
        }
        if (!Objects.equals(this.JP_Sales, other.JP_Sales)) {
            return false;
        }
        if (!Objects.equals(this.Other_Sales, other.Other_Sales)) {
            return false;
        }
        if (!Objects.equals(this.Global_Sales, other.Global_Sales)) {
            return false;
        }
        if (!Objects.equals(this.Critic_Score, other.Critic_Score)) {
            return false;
        }
        if (!Objects.equals(this.Critic_Count, other.Critic_Count)) {
            return false;
        }
        if (!Objects.equals(this.User_Score, other.User_Score)) {
            return false;
        }
        return Objects.equals(this.User_Count, other.User_Count);
    }

    @Override
    public String toString() {
        return "Videojuego{" + "id=" + id + ", name=" + name + ", platform=" + platform + ", yearOfRelease=" + yearOfRelease + ", genre=" + genre + ", publisher=" + publisher + ", NA_Sales=" + NA_Sales + ", EU_Sales=" + EU_Sales + ", JP_Sales=" + JP_Sales + ", Other_Sales=" + Other_Sales + ", Global_Sales=" + Global_Sales + ", Critic_Score=" + Critic_Score + ", Critic_Count=" + Critic_Count + ", User_Score=" + User_Score + ", User_Count=" + User_Count + ", Developer=" + Developer + ", Rating=" + Rating + '}';
    }
    
    
    
}
