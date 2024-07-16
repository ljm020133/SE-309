package com.example.screens.api;


import com.example.screens.Classes.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserApi {

    @GET("users")
    Call<List<User>> users();

    //@POST("users/register")
    

}

//    @Autowired
//    private UserService us;
//
//    @Autowired
//    //needed for CustomUserService constructor for JWT
//    private UserRepo ur;
//
//    @Autowired
//    private PlayerRepo pr;
//
//    //CREATE
//    //register a new user
//    @PostMapping("users/register")
//    public void register(@RequestBody User user) {
//        us.register(user);
//    }
//    //READ
//    @GetMapping("users")
//    public List<User> users() {
//        return us.getAllUsers();
//    }
//    //UPDATE
//    @PostMapping("/users/update")
//    public void updateUser(@RequestBody User user) {
//        us.updateUser(user);
//    }
//    //DELETE
//    @PostMapping("/users/delete/{userId}")
//    public void deleteUser(@PathVariable Long userId) {
//        us.deleteUserByUserId(userId);
//    }
//
//    //EXTRA FUNCTIONALITY
//
//    //try logging in as a user
//    @PutMapping("users/login/{username}/{password}")
//    public boolean login(@PathVariable String username, @PathVariable String password) {
//        System.out.println("TRYING LOGIN");
//        if(us.isValidLogin(username, password)){
//            System.out.println("PASSED LOGIN");
//
//            //create a token for the user
//            UserDetails.userId = ur.findUserIdByUsername(username);
//            UserDetails.username = username;
//            //create a player attatches to the user for the session
//            Player player = new Player();
//            player.setUser(ur.findByUsername(username));
//            player.setUsername(username);
//            System.out.println("CRASHES AT NEXT LINE");
//            pr.save(player);
//
//            return true;
//        }
//        return false;
//    }
//
//    @RequestMapping("users/logout")
//    public boolean logout(){
//        return us.logout();
//    }
