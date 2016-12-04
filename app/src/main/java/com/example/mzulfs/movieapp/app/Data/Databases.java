package com.example.mzulfs.movieapp.app.Data;

import net.simonvt.schematic.annotation.Database;
import net.simonvt.schematic.annotation.Table;


@Database(version = Databases.VERSION)
public final class Databases {
    private Databases(){}

    public static final int VERSION = 1;

    @Table(FavoritesColumns.class)
    public static final String FAVORITES = "favorites";

}
