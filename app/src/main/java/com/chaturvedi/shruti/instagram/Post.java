package com.chaturvedi.shruti.instagram;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Post")
public class Post extends ParseObject {
    public static final String KEY_DESC = "description";
    public static final String KEY_IMG = "image";
    public static final String KEY_USER = "user";

    public String getDescription() {
        return getString("description");
    }

    public void setDescription(String description) {
        put(KEY_DESC, description);
    }

    public ParseFile getImg() {
        return getParseFile(KEY_IMG);
    }

    public void setImg(ParseFile img) {
        put(KEY_IMG, img);
    }

    public ParseUser getUser() {
        return getParseUser(KEY_USER);
    }

    public void setUser(ParseUser user) {
        put(KEY_USER, user);
    }

}


