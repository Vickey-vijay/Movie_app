package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.List;
import m4.l;
import m4.m;

/* JADX INFO: compiled from: TrackSelection.java */
/* JADX INFO: loaded from: classes7.dex */
public interface c {

    /* JADX INFO: compiled from: TrackSelection.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrackGroup f19917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f19918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Object f19920d;

        public a(TrackGroup trackGroup, int... iArr) {
            this(trackGroup, iArr, 0, null);
        }

        public a(TrackGroup trackGroup, int[] iArr, int i10, @Nullable Object obj) {
            this.f19917a = trackGroup;
            this.f19918b = iArr;
            this.f19919c = i10;
            this.f19920d = obj;
        }
    }

    /* JADX INFO: compiled from: TrackSelection.java */
    public interface b {
        c[] a(a[] aVarArr, e5.c cVar);
    }

    void a(long j10, long j11, long j12, List<? extends l> list, m[] mVarArr);

    int b(Format format);

    boolean blacklist(int i10, long j10);

    void disable();

    void enable();

    int evaluateQueueSize(long j10, List<? extends l> list);

    Format getFormat(int i10);

    int getIndexInTrackGroup(int i10);

    Format getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    @Nullable
    Object getSelectionData();

    int getSelectionReason();

    TrackGroup getTrackGroup();

    int indexOf(int i10);

    int length();

    default void onDiscontinuity() {
    }

    void onPlaybackSpeed(float f10);
}
