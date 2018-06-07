package com.ucbcba.taller.entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Blob;
import java.util.List;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private Integer phone;

    @NotNull
    private String description;

    //@NotNull
    private Blob photo;

    private Integer likes=0;

    private Float latitude;

    private Float longitud;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<User> userslikes;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name="city_id")
    private City city;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<Comment> comments;

    private String rankin="";

    public String getRankin() {
        return rankin;
    }

    public void setRankin(String rankin) {
        this.rankin = rankin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }

    public Category getCategory(){return category;}

    public void setCategory(Category category){this.category=category;}

    public City getCity(){return city;}

    public void setCity(City city){this.city=city;}

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<User> getUserslikes() {
        return userslikes;
    }

    public void setUserslikes(List<User> userslikes) {
        this.userslikes = userslikes;
    }

    public void addLikke(User user){
        userslikes.add(user);
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitud() {
        return longitud;
    }

    public void setLongitud(Float longitud) {
        this.longitud= longitud;
    }

    public boolean findUserLike(User user){
        for (User user1 : userslikes) {
            if (user1.getId()==user.getId()){
                return true;
            }
        }
        return false;
    }

    public List<Comment> getComments(){return comments;}

    public void setComments(List<Comment> comments){this.comments=comments;}

    public Boolean getUserID(Long id){
        Boolean resp=false;
        for (int i=0; i < comments.size(); i++){
            if (id == comments.get(i).getUser().getId()){
                resp=true;
                break;
            }
        }
        return  resp;
    }


    public void setCommentUs(Long id,Comment comment){
        for (int i=0; i < comments.size(); i++){
            if (getUserID(id)){
                comments.set(i,comment);
            }
        }
     }
}
