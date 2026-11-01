package com.mgs.carparking.netbean;

import ck.p;
import com.mgs.carparking.dbtable.VideoCollectionEntry;
import java.io.Serializable;
import t5.c;

/* JADX INFO: compiled from: TKBean.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class TKBean implements Serializable {
    private int[] ad_collection = new int[0];
    private String ad_freq;
    private boolean netCineVarIsLike;
    private boolean netCineVarIsShow;
    private boolean netCineVarIsTrue;

    @c("type_id")
    private int netCineVarListType_id;

    @c(VideoCollectionEntry.TYPE_PID)
    private int netCineVarListType_pid;

    @c(VideoCollectionEntry.VOD_ACTOR)
    private String netCineVarListVod_actor;

    @c("vod_blurb")
    private String netCineVarListVod_blurb;

    @c(VideoCollectionEntry.VOD_DIRECTOR)
    private String netCineVarListVod_director;

    @c("id")
    private int netCineVarListVod_id;

    @c(VideoCollectionEntry.VOD_NAME)
    public String netCineVarListVod_name;

    @c(VideoCollectionEntry.VOD_PIC)
    private String netCineVarListVod_pic;

    @c("vod_serial")
    private String netCineVarListVod_serial;

    @c("vod_tag")
    private String netCineVarListVod_tag;

    @c("vod_total")
    private String netCineVarListVod_total;

    @c("vod_url")
    private String netCineVarListVod_url;

    public final int[] getAd_collection() {
        return this.ad_collection;
    }

    public final String getAd_freq() {
        return this.ad_freq;
    }

    public final boolean getNetCineVarIsLike() {
        return this.netCineVarIsLike;
    }

    public final boolean getNetCineVarIsShow() {
        return this.netCineVarIsShow;
    }

    public final boolean getNetCineVarIsTrue() {
        return this.netCineVarIsTrue;
    }

    public final int getNetCineVarListType_id() {
        return this.netCineVarListType_id;
    }

    public final int getNetCineVarListType_pid() {
        return this.netCineVarListType_pid;
    }

    public final String getNetCineVarListVod_actor() {
        return this.netCineVarListVod_actor;
    }

    public final String getNetCineVarListVod_blurb() {
        return this.netCineVarListVod_blurb;
    }

    public final String getNetCineVarListVod_director() {
        return this.netCineVarListVod_director;
    }

    public final int getNetCineVarListVod_id() {
        return this.netCineVarListVod_id;
    }

    public final String getNetCineVarListVod_pic() {
        return this.netCineVarListVod_pic;
    }

    public final String getNetCineVarListVod_serial() {
        return this.netCineVarListVod_serial;
    }

    public final String getNetCineVarListVod_tag() {
        return this.netCineVarListVod_tag;
    }

    public final String getNetCineVarListVod_total() {
        return this.netCineVarListVod_total;
    }

    public final String getNetCineVarListVod_url() {
        return this.netCineVarListVod_url;
    }

    public final String getVod_url(String str) {
        p.j(str, "s");
        return this.netCineVarListVod_url + str;
    }

    public final void setAd_collection(int[] iArr) {
        p.j(iArr, "<set-?>");
        this.ad_collection = iArr;
    }

    public final void setAd_freq(String str) {
        this.ad_freq = str;
    }

    public final void setNetCineVarIsLike(boolean z10) {
        this.netCineVarIsLike = z10;
    }

    public final void setNetCineVarIsShow(boolean z10) {
        this.netCineVarIsShow = z10;
    }

    public final void setNetCineVarIsTrue(boolean z10) {
        this.netCineVarIsTrue = z10;
    }

    public final void setNetCineVarListType_id(int i10) {
        this.netCineVarListType_id = i10;
    }

    public final void setNetCineVarListType_pid(int i10) {
        this.netCineVarListType_pid = i10;
    }

    public final void setNetCineVarListVod_actor(String str) {
        this.netCineVarListVod_actor = str;
    }

    public final void setNetCineVarListVod_blurb(String str) {
        this.netCineVarListVod_blurb = str;
    }

    public final void setNetCineVarListVod_director(String str) {
        this.netCineVarListVod_director = str;
    }

    public final void setNetCineVarListVod_id(int i10) {
        this.netCineVarListVod_id = i10;
    }

    public final void setNetCineVarListVod_pic(String str) {
        this.netCineVarListVod_pic = str;
    }

    public final void setNetCineVarListVod_serial(String str) {
        this.netCineVarListVod_serial = str;
    }

    public final void setNetCineVarListVod_tag(String str) {
        this.netCineVarListVod_tag = str;
    }

    public final void setNetCineVarListVod_total(String str) {
        this.netCineVarListVod_total = str;
    }

    public final void setNetCineVarListVod_url(String str) {
        this.netCineVarListVod_url = str;
    }
}
