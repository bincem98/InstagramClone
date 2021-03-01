package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LiRW9UK7tv7VmG5elReMxw0ts1zC38ScYRXzFb82")
                .clientKey("LVAIIOAEKUNDOSTgq4Hc2vFikevDxfVfKHlriDoM")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
