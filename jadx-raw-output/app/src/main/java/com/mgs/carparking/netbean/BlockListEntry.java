package com.mgs.carparking.netbean;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: BlockListEntry.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class BlockListEntry implements Serializable {
    private String banner_pic;
    private String block_name;
    private String content;
    private int data_id;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f41492id;
    private int jump_type;
    private String jump_url;
    private int topic_id;
    private RecommandVideosEntity vod_info;
    private List<RecommandVideosEntity> vod_list;

    public final String getBanner_pic() {
        return this.banner_pic;
    }

    public final String getBlock_name() {
        return this.block_name;
    }

    public final String getContent() {
        return this.content;
    }

    public final int getData_id() {
        return this.data_id;
    }

    public final int getId() {
        return this.f41492id;
    }

    public final int getJump_type() {
        return this.jump_type;
    }

    public final String getJump_url() {
        return this.jump_url;
    }

    public final int getTopic_id() {
        return this.topic_id;
    }

    public final RecommandVideosEntity getVod_info() {
        return this.vod_info;
    }

    public final List<RecommandVideosEntity> getVod_list() {
        return this.vod_list;
    }

    public final void setBanner_pic(String str) {
        this.banner_pic = str;
    }

    public final void setBlock_name(String str) {
        this.block_name = str;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setData_id(int i10) {
        this.data_id = i10;
    }

    public final void setId(int i10) {
        this.f41492id = i10;
    }

    public final void setJump_type(int i10) {
        this.jump_type = i10;
    }

    public final void setJump_url(String str) {
        this.jump_url = str;
    }

    public final void setTopic_id(int i10) {
        this.topic_id = i10;
    }

    public final void setVod_info(RecommandVideosEntity recommandVideosEntity) {
        this.vod_info = recommandVideosEntity;
    }

    public final void setVod_list(List<RecommandVideosEntity> list) {
        this.vod_list = list;
    }
}
