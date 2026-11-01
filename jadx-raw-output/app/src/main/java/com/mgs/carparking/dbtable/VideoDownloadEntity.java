package com.mgs.carparking.dbtable;

import ck.i;
import java.io.Serializable;
import zl.b;
import zl.f;

/* JADX INFO: compiled from: VideoDownloadEntity.kt */
/* JADX INFO: loaded from: classes10.dex */
@f(name = VideoDownloadEntity.TABLE_NAME)
public final class VideoDownloadEntity implements Serializable {
    public static final String AUDIO_TYPE = "audio_type";
    public static final String COLLECTION = "collection";
    public static final String COMPLETE = "complete";
    public static final String COMPLETE_NAME = "complete_name";
    public static final String COVER_URL = "coverUrl";
    public static final Companion Companion = new Companion(null);
    public static final String DOWN_URL = "down_url";
    public static final String ID = "id";
    public static final String LAST_NAME = "last_name";
    public static final String NAME = "name";
    public static final String ORGINAL_URL = "orginal_url";
    public static final String SIZE = "size";
    public static final String STATUS = "status";
    public static final String STREAMID = "streamid";
    public static final String TABLE_NAME = "video_download";
    public static final String UPDATE_TIME = "updateTime";
    public static final String URL = "url";
    public static final String VIDEO_POSITION = "video_position";
    public static final String VIDEO_TYPE = "videoType";

    @b(name = AUDIO_TYPE)
    private int audio_type;

    @b(name = "collection")
    private int collection;

    @b(name = "complete")
    private int complete;

    @b(name = COMPLETE_NAME)
    private String complete_name;

    @b(name = "coverUrl")
    private String coverUrl;

    @b(name = DOWN_URL)
    private String down_url;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b(name = "id")
    private int f41049id;
    private boolean isCheck;

    @b(name = LAST_NAME)
    private String lastName;

    @b(name = "name")
    private String name;

    @b(name = ORGINAL_URL)
    private String orginal_url;

    @b(name = "size")
    private long size;

    @b(name = "status")
    private int status;

    @b(name = STREAMID)
    private String streamid;

    @b(name = "updateTime")
    private long updateTime;

    @b(name = "url")
    private String url;

    @b(name = "videoType")
    private int videoType;

    @b(name = VIDEO_POSITION)
    private int video_position;

    /* JADX INFO: compiled from: VideoDownloadEntity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public final int getAudio_type() {
        return this.audio_type;
    }

    public final int getCollection() {
        return this.collection;
    }

    public final int getComplete() {
        return this.complete;
    }

    public final String getComplete_name() {
        return this.complete_name;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getDown_url() {
        return this.down_url;
    }

    public final int getId() {
        return this.f41049id;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOrginal_url() {
        return this.orginal_url;
    }

    public final long getSize() {
        return this.size;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getStreamid() {
        return this.streamid;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getVideoType() {
        return this.videoType;
    }

    public final int getVideo_position() {
        return this.video_position;
    }

    public final boolean isCheck() {
        return this.isCheck;
    }

    public final void setAudio_type(int i10) {
        this.audio_type = i10;
    }

    public final void setCheck(boolean z10) {
        this.isCheck = z10;
    }

    public final void setCollection(int i10) {
        this.collection = i10;
    }

    public final void setComplete(int i10) {
        this.complete = i10;
    }

    public final void setComplete_name(String str) {
        this.complete_name = str;
    }

    public final void setCoverUrl(String str) {
        this.coverUrl = str;
    }

    public final void setDown_url(String str) {
        this.down_url = str;
    }

    public final void setId(int i10) {
        this.f41049id = i10;
    }

    public final void setLastName(String str) {
        this.lastName = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOrginal_url(String str) {
        this.orginal_url = str;
    }

    public final void setSize(long j10) {
        this.size = j10;
    }

    public final void setStatus(int i10) {
        this.status = i10;
    }

    public final void setStreamid(String str) {
        this.streamid = str;
    }

    public final void setUpdateTime(long j10) {
        this.updateTime = j10;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setVideoType(int i10) {
        this.videoType = i10;
    }

    public final void setVideo_position(int i10) {
        this.video_position = i10;
    }

    public String toString() {
        return "VideoDownloadEntity{id=" + this.f41049id + ", name='" + this.name + "', lastName='" + this.lastName + "', coverUrl='" + this.coverUrl + "', videoType=" + this.videoType + ", updateTime=" + this.updateTime + ", url='" + this.url + "', complete=" + this.complete + ", size=" + this.size + ", complete_name='" + this.complete_name + "', streamid='" + this.streamid + "', status=" + this.status + ", orginal_url='" + this.orginal_url + "', collection=" + this.collection + ", down_url='" + this.down_url + "', video_position=" + this.video_position + '}';
    }
}
