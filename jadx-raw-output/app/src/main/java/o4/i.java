package o4;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Representation.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f65039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format f65040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f65042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<d> f65043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f65044f;

    /* JADX INFO: compiled from: Representation.java */
    public static class b extends i implements n4.c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final j.a f65045g;

        public b(long j10, Format format, String str, j.a aVar, @Nullable List<d> list) {
            super(j10, format, str, aVar, list);
            this.f65045g = aVar;
        }

        @Override // o4.i
        @Nullable
        public String a() {
            return null;
        }

        @Override // o4.i
        public n4.c b() {
            return this;
        }

        @Override // o4.i
        @Nullable
        public h c() {
            return null;
        }

        @Override // n4.c
        public long getDurationUs(long j10, long j11) {
            return this.f65045g.e(j10, j11);
        }

        @Override // n4.c
        public long getFirstSegmentNum() {
            return this.f65045g.c();
        }

        @Override // n4.c
        public int getSegmentCount(long j10) {
            return this.f65045g.d(j10);
        }

        @Override // n4.c
        public long getSegmentNum(long j10, long j11) {
            return this.f65045g.f(j10, j11);
        }

        @Override // n4.c
        public h getSegmentUrl(long j10) {
            return this.f65045g.h(this, j10);
        }

        @Override // n4.c
        public long getTimeUs(long j10) {
            return this.f65045g.g(j10);
        }

        @Override // n4.c
        public boolean isExplicit() {
            return this.f65045g.i();
        }
    }

    /* JADX INFO: compiled from: Representation.java */
    public static class c extends i {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Uri f65046g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f65047h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final String f65048i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public final h f65049j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public final k f65050k;

        public c(long j10, Format format, String str, j.e eVar, @Nullable List<d> list, @Nullable String str2, long j11) {
            super(j10, format, str, eVar, list);
            this.f65046g = Uri.parse(str);
            h hVarC = eVar.c();
            this.f65049j = hVarC;
            this.f65048i = str2;
            this.f65047h = j11;
            this.f65050k = hVarC != null ? null : new k(new h(null, 0L, j11));
        }

        @Override // o4.i
        @Nullable
        public String a() {
            return this.f65048i;
        }

        @Override // o4.i
        @Nullable
        public n4.c b() {
            return this.f65050k;
        }

        @Override // o4.i
        @Nullable
        public h c() {
            return this.f65049j;
        }
    }

    public static i e(long j10, Format format, String str, j jVar, @Nullable List<d> list) {
        return f(j10, format, str, jVar, list, null);
    }

    @Nullable
    public abstract String a();

    @Nullable
    public abstract n4.c b();

    @Nullable
    public abstract h c();

    public i(long j10, Format format, String str, j jVar, @Nullable List<d> list) {
        this.f65039a = j10;
        this.f65040b = format;
        this.f65041c = str;
        this.f65043e = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f65044f = jVar.a(this);
        this.f65042d = jVar.b();
    }

    public static i f(long j10, Format format, String str, j jVar, @Nullable List<d> list, @Nullable String str2) {
        if (jVar instanceof j.e) {
            return new c(j10, format, str, (j.e) jVar, list, str2, -1L);
        }
        if (jVar instanceof j.a) {
            return new b(j10, format, str, (j.a) jVar, list);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    @Nullable
    public h d() {
        return this.f65044f;
    }
}
