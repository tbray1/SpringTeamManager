package com.springboot.teammanager.model;

import javax.persistence.*;
import java.io.Serializable;

    @Entity
    public class Player implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(nullable = false, updatable = false)
        private Long id;
        private String name;
        private String email;
        private String position;
        private String phone;
        private String imageUrl;
        private String jerseyNumber;

        public Player() {}

        public Player(String name, String email, String position, String phone, String imageUrl, String jerseyNumber) {
            this.name = name;
            this.email = email;
            this.position = position;
            this.phone = phone;
            this.imageUrl = imageUrl;
            this.jerseyNumber = jerseyNumber;
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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String setPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getJerseyNumber() {
            return jerseyNumber;
        }

        public void setJerseyNumber(String jerseyNumber) {
            this.jerseyNumber = jerseyNumber;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", position='" + position + '\'' +
                    ", phone='" + phone + '\'' +
                    ", imageUrl='" + imageUrl + '\'' +
                    '}';
        }
    }

