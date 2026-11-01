package com.mgs.carparking.dbtable;

import androidx.databinding.BaseObservable;
import ck.i;
import zl.b;
import zl.f;

/* JADX INFO: compiled from: VideoCollectionEntry.kt */
/* JADX INFO: loaded from: classes.dex */
@f(name = VideoCollectionEntry.TABLE_NAME)
public final class VideoCollectionEntry extends BaseObservable {
    public static final Companion Companion = new Companion(null);
    public static final String ID = "id";
    public static final String TABLE_NAME = "video_collection";
    public static final String TYPE_PID = "type_pid";
    public static final String VOD_ACTOR = "vod_actor";
    public static final String VOD_AREA = "vod_area";
    public static final String VOD_DIRECTOR = "vod_director";
    public static final String VOD_DOUBAN_SCORE = "vod_douban_score";
    public static final String VOD_NAME = "vod_name";
    public static final String VOD_PIC = "vod_pic";
    public static final String VOD_YEAR = "vod_year";

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b(name = "id")
    private int f41048id;

    @b(name = TYPE_PID)
    private int type_pid;

    @b(name = VOD_ACTOR)
    private String vod_actor;

    @b(name = VOD_AREA)
    private String vod_area;

    @b(name = VOD_DIRECTOR)
    private String vod_director;

    @b(name = VOD_DOUBAN_SCORE)
    private String vod_douban_score;

    @b(name = VOD_NAME)
    private String vod_name;

    @b(name = VOD_PIC)
    private String vod_pic;

    @b(name = VOD_YEAR)
    private String vod_year;

    /* JADX INFO: compiled from: VideoCollectionEntry.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public final int getId() {
        return this.f41048id;
    }

    public final int getType_pid() {
        return this.type_pid;
    }

    public final String getVod_actor() {
        return this.vod_actor;
    }

    public final String getVod_area() {
        return this.vod_area;
    }

    public final String getVod_director() {
        return this.vod_director;
    }

    public final String getVod_douban_score() {
        return this.vod_douban_score;
    }

    public final String getVod_name() {
        return this.vod_name;
    }

    public final String getVod_pic() {
        return this.vod_pic;
    }

    public final String getVod_year() {
        return this.vod_year;
    }

    public final void setId(int i10) {
        this.f41048id = i10;
    }

    public final void setType_pid(int i10) {
        this.type_pid = i10;
    }

    public final void setVod_actor(String str) {
        this.vod_actor = str;
    }

    public final void setVod_area(String str) {
        this.vod_area = str;
    }

    public final void setVod_director(String str) {
        this.vod_director = str;
    }

    public final void setVod_douban_score(String str) {
        this.vod_douban_score = str;
    }

    public final void setVod_name(String str) {
        this.vod_name = str;
    }

    public final void setVod_pic(String str) {
        this.vod_pic = str;
    }

    public final void setVod_year(String str) {
        this.vod_year = str;
    }

    public String toString() {
        return "VideoCollectionEntry{id=" + this.f41048id + ", vod_name='" + this.vod_name + "', vod_pic='" + this.vod_pic + "', type_pid='" + this.type_pid + "', vod_year='" + this.vod_year + "', vod_area='" + this.vod_area + "', vod_director='" + this.vod_director + "', vod_douban_score='" + this.vod_douban_score + "', vod_actor='" + this.vod_actor + "'}";
    }
}
