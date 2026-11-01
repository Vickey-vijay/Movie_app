package com.mgs.carparking.dbtable;

import androidx.databinding.BaseObservable;
import ck.i;
import zl.b;
import zl.f;

/* JADX INFO: compiled from: VideoStayTimeEntry.kt */
/* JADX INFO: loaded from: classes10.dex */
@f(name = VideoStayTimeEntry.TABLE_NAME)
public final class VideoStayTimeEntry extends BaseObservable {
    public static final Companion Companion = new Companion(null);
    public static final String DURATION = "duration";
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String TABLE_NAME = "video_stay";

    @b(name = "duration")
    private long duration;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b(name = "id")
    private int f41053id;

    @b(name = "name")
    private String name;

    /* JADX INFO: compiled from: VideoStayTimeEntry.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getId() {
        return this.f41053id;
    }

    public final String getName() {
        return this.name;
    }

    public final void setDuration(long j10) {
        this.duration = j10;
    }

    public final void setId(int i10) {
        this.f41053id = i10;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return "VideoStayTimeEntry{id=" + this.f41053id + ", name='" + this.name + "', duration=" + this.duration + '}';
    }
}
