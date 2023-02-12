package com.example.task_manager.model;


import com.sun.istack.NotNull;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String password;
    private String bio;
    private String profilePic;

//    USERS FOLLOWING LIST BELOW
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "user_following",
            joinColumns =  {
                    @JoinColumn(name = "user_id")
            }
    )
    private List<Long> following = new ArrayList<Long>();


    public List<Long> getFollowing() {
        return following;
    }

    public void setFollowing(List<Long> following) {
        this.following = following;
    }




    //    USERS FOLLOWERS LIST BELOW
@ElementCollection(fetch = FetchType.LAZY)
@CollectionTable(name = "user_followers",
        joinColumns =  {
                @JoinColumn(name = "user_uid")
        }
)
private List<String> followers = new ArrayList<String>();

    public List<String> getFollowers() {
        return followers;
    }

    public void setFollowers(List<String> followers) {
        this.followers = followers;
    }



//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//    private List<Friendship> friendships;

    public User(Long id, String name, String password, String bio, String profilePic) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.bio = bio;
        this.profilePic = profilePic;
    }

    public User(Long id, String name, String password, String bio, String profilePic, List<Long> following) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.bio = bio;
        this.profilePic = profilePic;
        this.following = following;
    }

    public User() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

//    public List<Friendship> getFriendships() {
//        return friendships;
//    }
//
//    public void setFriendships(List<Friendship> friendships) {
//        this.friendships = friendships;
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", bio='" + bio + '\'' +
                ", profilePic='" + profilePic + '\'' +
                ", following=" + following +
                ", followers=" + followers +
                '}';
    }

//    public User id(Long id) {
//        this.id = id;
//        return this;
//    }
//    public User name(String name) {
//        this.name = name;
//        return this;
//    }
//    public User password(String password) {
//        this.password = password;
//        return this;
//    }
//    public User bio(String bio) {
//        this.bio = bio;
//        return this;
//    }
//
//    public User profilePic(String profilePic) {
//        this.profilePic = profilePic;
//        return this;
//    }
//
//    public User friendships(List<Friendship> friendships) {
//        this.friendships = friendships;
//        return this;
//    }

}
