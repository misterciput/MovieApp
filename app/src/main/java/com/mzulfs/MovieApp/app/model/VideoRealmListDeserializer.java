package com.mzulfs.MovieApp.app.model;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mzulfs.MovieApp.app.entity.Video;

import java.lang.reflect.Type;

import io.realm.RealmList;

final class VideoRealmListDeserializer implements JsonDeserializer<RealmList<Video>> {

    private static final String TAG = VideoRealmListDeserializer.class.getSimpleName();

    @Override
    public RealmList<Video> deserialize(JsonElement element, Type type, JsonDeserializationContext context)
            throws JsonParseException {
        RealmList<Video> videos = new RealmList<>();
        JsonArray ja = element.getAsJsonObject().get("results").getAsJsonArray();
        for (JsonElement je : ja) {
            videos.add((Video) context.deserialize(je, Video.class));
        }
        return videos;
    }

}
