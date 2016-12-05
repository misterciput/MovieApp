package com.mzulfs.MovieApp.app.model;

import android.annotation.SuppressLint;
import android.util.Log;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

final class DateDeserializer implements JsonDeserializer<Date> {

    private static final String TAG = "DateDeserializer";

    @Override
    public Date deserialize(JsonElement element, Type type, JsonDeserializationContext context)
            throws JsonParseException {
        String date = element.getAsString();

        @SuppressLint("SimpleDateFormat")
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        try {
            return formatter.parse(date);
        } catch (ParseException e) {
            Log.e(TAG, "Parsing failed: " + Log.getStackTraceString(e));
            return new Date();
        }
    }

}
