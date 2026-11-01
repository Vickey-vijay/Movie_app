package com.mgs.carparking.dbtable;

import androidx.databinding.BaseObservable;
import ck.i;
import ck.p;
import zl.b;
import zl.f;

/* JADX INFO: compiled from: VideoLookHistoryEntry.kt */
/* JADX INFO: loaded from: classes6.dex */
@f(name = VideoLookHistoryEntry.TABLE_NAME)
public final class VideoLookHistoryEntry extends BaseObservable {
    public static final String AUDIOTYPE = "audiotype";
    public static final String COLLECTION = "collection";
    public static final String CONTENNT_POSITION = "contentPosition";
    public static final String COVER_URL = "coverUrl";
    public static final String CURRNET = "current";
    public static final Companion Companion = new Companion(null);
    public static final String DURATION = "duration";
    public static final String ID = "id";
    public static final String ISNOTSHARE = "is_not_share";
    public static final String NAME = "name";
    public static final String SUBTITLETYPE = "subtitletype";
    public static final String TABLE_NAME = "video_history";
    public static final String UPDATE_TIME = "updateTime";
    public static final String URL = "url";
    public static final String VIDEO_DESC = "videoDesc";
    public static final String VIDEO_TYPE = "videoType";

    @b(name = "collection")
    private int collection;

    @b(name = CONTENNT_POSITION)
    private long contentPosition;

    @b(name = "coverUrl")
    private String coverUrl;

    @b(name = CURRNET)
    private int current;

    @b(name = "duration")
    private long duration;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b(name = "id")
    private int f41050id;

    @b(name = ISNOTSHARE)
    private int is_not_share;

    @b(name = "name")
    private String name;

    @b(name = "updateTime")
    private long updateTime;

    @b(name = "url")
    private String url;

    @b(name = VIDEO_DESC)
    private String videoDesc;

    @b(name = "videoType")
    private int videoType;

    @b(name = AUDIOTYPE)
    private String audiotype = "";

    @b(name = SUBTITLETYPE)
    private String subtitletype = "";

    /* JADX INFO: compiled from: VideoLookHistoryEntry.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public final String getAudiotype() {
        return this.audiotype;
    }

    public final int getCollection() {
        return this.collection;
    }

    public final long getContentPosition() {
        return this.contentPosition;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getId() {
        return this.f41050id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSubtitletype() {
        return this.subtitletype;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVideoDesc() {
        return this.videoDesc;
    }

    public final int getVideoType() {
        return this.videoType;
    }

    public final int is_not_share() {
        return this.is_not_share;
    }

    public final void setAudiotype(String str) {
        p.j(str, "<set-?>");
        this.audiotype = str;
    }

    public final void setCollection(int i10) {
        this.collection = i10;
    }

    public final void setContentPosition(long j10) {
        this.contentPosition = j10;
    }

    public final void setCoverUrl(String str) {
        this.coverUrl = str;
    }

    public final void setCurrent(int i10) {
        this.current = i10;
    }

    public final void setDuration(long j10) {
        this.duration = j10;
    }

    public final void setId(int i10) {
        this.f41050id = i10;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSubtitletype(String str) {
        p.j(str, "<set-?>");
        this.subtitletype = str;
    }

    public final void setUpdateTime(long j10) {
        this.updateTime = j10;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setVideoDesc(String str) {
        this.videoDesc = str;
    }

    public final void setVideoType(int i10) {
        this.videoType = i10;
    }

    public final void set_not_share(int i10) {
        this.is_not_share = i10;
    }

    public String toString() {
        return "VideoLookHistoryEntry{id=" + this.f41050id + ", name='" + this.name + "', coverUrl='" + this.coverUrl + "', videoType=" + this.videoType + ", videoDesc='" + this.videoDesc + "', updateTime=" + this.updateTime + ", url='" + this.url + "', current=" + this.current + ", contentPosition=" + this.contentPosition + ", duration=" + this.duration + ", is_not_share=" + this.is_not_share + ", collection=" + this.collection + '}';
    }
}
