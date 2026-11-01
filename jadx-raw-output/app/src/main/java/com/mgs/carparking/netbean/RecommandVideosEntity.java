package com.mgs.carparking.netbean;

import ck.p;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: RecommandVideosEntity.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class RecommandVideosEntity implements Serializable {
    private String actor;
    private int[] ad_collection = new int[0];
    private String ad_freq;
    private String area;
    private String audio_language_tag;
    private int audio_type;
    private List<AudioTypeEntry> audio_type_option;
    private String collection_new_title;
    private int comicPosition;
    private String coverUrl;
    private String custom_content;
    private String director;
    private int hide_ad;
    private int icon_type;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f41504id;
    private int is_share;
    private String moduleName;
    private int module_id;
    private String name;
    private String play_position;
    private String remarks;
    private List<SeriesInfoEntry> series_info;
    private String simpleDesc;
    private int source_id;
    private String tag;
    private int topType;
    private int type_id;
    private int type_pid;
    private String upload_user_head_img;
    private int upload_user_id;
    private String upload_user_name;
    private String videoDesc;
    private int videoId;
    private int videoType;
    private String vod_actor;
    private String vod_area;
    private String vod_blurb;
    private List<VideoBean> vod_collection;
    private String vod_director;
    private String vod_douban_score;
    private int vod_duration_free;
    private String vod_from_id;
    private int vod_is_cam;
    private int vod_is_update;
    private int vod_isend;
    private String vod_name;
    private String vod_pic;
    private String vod_serial;
    private String vod_tag;
    private String vod_total;
    private String vod_url;
    private String vod_year;

    public final String getActor() {
        return this.actor;
    }

    public final int[] getAd_collection() {
        return this.ad_collection;
    }

    public final String getAd_freq() {
        return this.ad_freq;
    }

    public final String getArea() {
        return this.area;
    }

    public final String getAudio_language_tag() {
        return this.audio_language_tag;
    }

    public final int getAudio_type() {
        return this.audio_type;
    }

    public final List<AudioTypeEntry> getAudio_type_option() {
        return this.audio_type_option;
    }

    public final String getCollection_new_title() {
        return this.collection_new_title;
    }

    public final int getComicPosition() {
        return this.comicPosition;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getCustom_content() {
        return this.custom_content;
    }

    public final String getDirector() {
        return this.director;
    }

    public final int getHide_ad() {
        return this.hide_ad;
    }

    public final int getIcon_type() {
        return this.icon_type;
    }

    public final int getId() {
        return this.f41504id;
    }

    public final String getModuleName() {
        return this.moduleName;
    }

    public final int getModule_id() {
        return this.module_id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPlay_position() {
        return this.play_position;
    }

    public final String getRemarks() {
        return this.remarks;
    }

    public final List<SeriesInfoEntry> getSeries_info() {
        return this.series_info;
    }

    public final String getSimpleDesc() {
        return this.simpleDesc;
    }

    public final int getSource_id() {
        return this.source_id;
    }

    public final String getTag() {
        return this.tag;
    }

    public final int getTopType() {
        return this.topType;
    }

    public final int getType_id() {
        return this.type_id;
    }

    public final int getType_pid() {
        return this.type_pid;
    }

    public final String getUpload_user_head_img() {
        return this.upload_user_head_img;
    }

    public final int getUpload_user_id() {
        return this.upload_user_id;
    }

    public final String getUpload_user_name() {
        return this.upload_user_name;
    }

    public final String getVideoDesc() {
        return this.videoDesc;
    }

    public final int getVideoId() {
        return this.videoId;
    }

    public final int getVideoType() {
        return this.videoType;
    }

    public final String getVod_actor() {
        return this.vod_actor;
    }

    public final String getVod_area() {
        return this.vod_area;
    }

    public final String getVod_blurb() {
        return this.vod_blurb;
    }

    public final List<VideoBean> getVod_collection() {
        return this.vod_collection;
    }

    public final String getVod_director() {
        return this.vod_director;
    }

    public final String getVod_douban_score() {
        return this.vod_douban_score;
    }

    public final int getVod_duration_free() {
        return this.vod_duration_free;
    }

    public final String getVod_from_id() {
        return this.vod_from_id;
    }

    public final int getVod_is_cam() {
        return this.vod_is_cam;
    }

    public final int getVod_is_update() {
        return this.vod_is_update;
    }

    public final int getVod_isend() {
        return this.vod_isend;
    }

    public final String getVod_name() {
        return this.vod_name;
    }

    public final String getVod_pic() {
        return this.vod_pic;
    }

    public final String getVod_serial() {
        return this.vod_serial;
    }

    public final String getVod_tag() {
        return this.vod_tag;
    }

    public final String getVod_total() {
        return this.vod_total;
    }

    public final String getVod_url() {
        return this.vod_url;
    }

    public final String getVod_year() {
        return this.vod_year;
    }

    public final int is_share() {
        return this.is_share;
    }

    public final void setActor(String str) {
        this.actor = str;
    }

    public final void setAd_collection(int[] iArr) {
        p.j(iArr, "<set-?>");
        this.ad_collection = iArr;
    }

    public final void setAd_freq(String str) {
        this.ad_freq = str;
    }

    public final void setArea(String str) {
        this.area = str;
    }

    public final void setAudio_language_tag(String str) {
        this.audio_language_tag = str;
    }

    public final void setAudio_type(int i10) {
        this.audio_type = i10;
    }

    public final void setAudio_type_option(List<AudioTypeEntry> list) {
        this.audio_type_option = list;
    }

    public final void setCollection_new_title(String str) {
        this.collection_new_title = str;
    }

    public final void setComicPosition(int i10) {
        this.comicPosition = i10;
    }

    public final void setCoverUrl(String str) {
        this.coverUrl = str;
    }

    public final void setCustom_content(String str) {
        this.custom_content = str;
    }

    public final void setDirector(String str) {
        this.director = str;
    }

    public final void setHide_ad(int i10) {
        this.hide_ad = i10;
    }

    public final void setIcon_type(int i10) {
        this.icon_type = i10;
    }

    public final void setId(int i10) {
        this.f41504id = i10;
    }

    public final void setModuleName(String str) {
        this.moduleName = str;
    }

    public final void setModule_id(int i10) {
        this.module_id = i10;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPlay_position(String str) {
        this.play_position = str;
    }

    public final void setRemarks(String str) {
        this.remarks = str;
    }

    public final void setSeries_info(List<SeriesInfoEntry> list) {
        this.series_info = list;
    }

    public final void setSimpleDesc(String str) {
        this.simpleDesc = str;
    }

    public final void setSource_id(int i10) {
        this.source_id = i10;
    }

    public final void setTag(String str) {
        this.tag = str;
    }

    public final void setTopType(int i10) {
        this.topType = i10;
    }

    public final void setType_id(int i10) {
        this.type_id = i10;
    }

    public final void setType_pid(int i10) {
        this.type_pid = i10;
    }

    public final void setUpload_user_head_img(String str) {
        this.upload_user_head_img = str;
    }

    public final void setUpload_user_id(int i10) {
        this.upload_user_id = i10;
    }

    public final void setUpload_user_name(String str) {
        this.upload_user_name = str;
    }

    public final void setVideoDesc(String str) {
        this.videoDesc = str;
    }

    public final void setVideoId(int i10) {
        this.videoId = i10;
    }

    public final void setVideoType(int i10) {
        this.videoType = i10;
    }

    public final void setVod_actor(String str) {
        this.vod_actor = str;
    }

    public final void setVod_area(String str) {
        this.vod_area = str;
    }

    public final void setVod_blurb(String str) {
        this.vod_blurb = str;
    }

    public final void setVod_collection(List<VideoBean> list) {
        this.vod_collection = list;
    }

    public final void setVod_director(String str) {
        this.vod_director = str;
    }

    public final void setVod_douban_score(String str) {
        this.vod_douban_score = str;
    }

    public final void setVod_duration_free(int i10) {
        this.vod_duration_free = i10;
    }

    public final void setVod_from_id(String str) {
        this.vod_from_id = str;
    }

    public final void setVod_is_cam(int i10) {
        this.vod_is_cam = i10;
    }

    public final void setVod_is_update(int i10) {
        this.vod_is_update = i10;
    }

    public final void setVod_isend(int i10) {
        this.vod_isend = i10;
    }

    public final void setVod_name(String str) {
        this.vod_name = str;
    }

    public final void setVod_pic(String str) {
        this.vod_pic = str;
    }

    public final void setVod_serial(String str) {
        this.vod_serial = str;
    }

    public final void setVod_tag(String str) {
        this.vod_tag = str;
    }

    public final void setVod_total(String str) {
        this.vod_total = str;
    }

    public final void setVod_url(String str) {
        this.vod_url = str;
    }

    public final void setVod_year(String str) {
        this.vod_year = str;
    }

    public final void set_share(int i10) {
        this.is_share = i10;
    }
}
