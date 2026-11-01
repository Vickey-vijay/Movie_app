package com.google.android.exoplayer2.source.hls.playlist;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: HlsMediaPlaylist.java */
/* JADX INFO: loaded from: classes8.dex */
public final class c extends q4.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f19638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f19639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f19642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f19643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f19644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f19645l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f19646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final DrmInitData f19647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<a> f19648o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f19649p;

    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    public static final class a implements Comparable<Long> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f19650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final a f19651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f19652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f19653e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f19654f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f19655g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final DrmInitData f19656h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final String f19657i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public final String f19658j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f19659k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long f19660l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f19661m;

        public a(String str, long j10, long j11, @Nullable String str2, @Nullable String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false);
        }

        public a(String str, @Nullable a aVar, String str2, long j10, int i10, long j11, @Nullable DrmInitData drmInitData, @Nullable String str3, @Nullable String str4, long j12, long j13, boolean z10) {
            this.f19650b = str;
            this.f19651c = aVar;
            this.f19653e = str2;
            this.f19652d = j10;
            this.f19654f = i10;
            this.f19655g = j11;
            this.f19656h = drmInitData;
            this.f19657i = str3;
            this.f19658j = str4;
            this.f19659k = j12;
            this.f19660l = j13;
            this.f19661m = z10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l10) {
            if (this.f19655g > l10.longValue()) {
                return 1;
            }
            return this.f19655g < l10.longValue() ? -1 : 0;
        }
    }

    public c(int i10, String str, List<String> list, long j10, long j11, boolean z10, int i11, long j12, int i12, long j13, boolean z11, boolean z12, boolean z13, @Nullable DrmInitData drmInitData, List<a> list2) {
        super(str, list, z11);
        this.f19637d = i10;
        this.f19639f = j11;
        this.f19640g = z10;
        this.f19641h = i11;
        this.f19642i = j12;
        this.f19643j = i12;
        this.f19644k = j13;
        this.f19645l = z12;
        this.f19646m = z13;
        this.f19647n = drmInitData;
        this.f19648o = Collections.unmodifiableList(list2);
        if (list2.isEmpty()) {
            this.f19649p = 0L;
        } else {
            a aVar = list2.get(list2.size() - 1);
            this.f19649p = aVar.f19655g + aVar.f19652d;
        }
        this.f19638e = j10 == -9223372036854775807L ? -9223372036854775807L : j10 >= 0 ? j10 : this.f19649p + j10;
    }

    @Override // h4.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c copy(List<StreamKey> list) {
        return this;
    }

    public boolean e(c cVar) {
        if (cVar == null) {
            return true;
        }
        long j10 = this.f19642i;
        long j11 = cVar.f19642i;
        if (j10 > j11) {
            return true;
        }
        if (j10 < j11) {
            return false;
        }
        int size = this.f19648o.size();
        int size2 = cVar.f19648o.size();
        if (size <= size2) {
            return size == size2 && this.f19645l && !cVar.f19645l;
        }
        return true;
    }

    public c b(long j10, int i10) {
        return new c(this.f19637d, this.f66517a, this.f66518b, this.f19638e, j10, true, i10, this.f19642i, this.f19643j, this.f19644k, this.f66519c, this.f19645l, this.f19646m, this.f19647n, this.f19648o);
    }

    public c c() {
        return this.f19645l ? this : new c(this.f19637d, this.f66517a, this.f66518b, this.f19638e, this.f19639f, this.f19640g, this.f19641h, this.f19642i, this.f19643j, this.f19644k, this.f66519c, true, this.f19646m, this.f19647n, this.f19648o);
    }

    public long d() {
        return this.f19639f + this.f19649p;
    }
}
