package com.mgs.carparking.dbtable;

import androidx.databinding.BaseObservable;
import ck.i;
import zl.b;
import zl.f;

/* JADX INFO: compiled from: VideoAdLookEntity.kt */
/* JADX INFO: loaded from: classes2.dex */
@f(name = VideoAdLookEntity.TABLE_NAME)
public final class VideoAdLookEntity extends BaseObservable {
    public static final String CONTENT = "CONTENT";
    public static final Companion Companion = new Companion(null);
    public static final String TABLE_NAME = "VIDEO_AD_LOOK";
    public static final String VIDEOLOOKTIME = "VIDEOLOOKTIME";

    @b(name = "CONTENT")
    private String content;

    @b(name = VIDEOLOOKTIME)
    private long videoLookTime;

    /* JADX INFO: compiled from: VideoAdLookEntity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public final String getContent() {
        return this.content;
    }

    public final long getVideoLookTime() {
        return this.videoLookTime;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setVideoLookTime(long j10) {
        this.videoLookTime = j10;
    }

    public String toString() {
        return "VideoAdLookEntity{content='" + this.content + "'}";
    }
}
