package com.chaturvedi.shruti.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("G3ftUbye9KmUxzDH2OZJVgRG2ynGTQhRy1Fj3dRk")
                .clientKey("TGRY7yi1EgJwlPuozRyb6QfT8VtvfhpGXDqj0sMq")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
