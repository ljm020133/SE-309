package com.example.screens.Classes;

    public class User {
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)

        public User() {
        }

        private Long id;

        private String username;

        private String email;

        private String userStatistics;

        private String password;

        //@OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
        //private Player player;

        //getters and setters

        public String getUserStatistics() {
            return userStatistics;
        }

        public String getEmail() {
            return email;
        }

        public String getUsername() {
            return username;
        }

        public Long getId() {
            return id;
        }

        public String getPassword() {
            return password;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setUserStatistics(String userStatistics) {
            this.userStatistics = userStatistics;
        }

        public void setPassword(String password) {
            this.password = password;
        }
        // public Player getPlayer() {
        //    return player;
        // }

        //public void setPlayer(Player player) {
        //   this.player = player;
        // }


    }
