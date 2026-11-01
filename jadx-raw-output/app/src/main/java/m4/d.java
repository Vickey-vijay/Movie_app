package m4;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.Loader;
import e5.o;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Chunk.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d implements Loader.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e5.h f64041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Format f64043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f64044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Object f64045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f64046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f64047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f64048h;

    public final long a() {
        return this.f64048h.c();
    }

    public final long b() {
        return this.f64047g - this.f64046f;
    }

    public final Map<String, List<String>> c() {
        return this.f64048h.e();
    }

    public final Uri d() {
        return this.f64048h.d();
    }

    public d(com.google.android.exoplayer2.upstream.a aVar, e5.h hVar, int i10, Format format, int i11, @Nullable Object obj, long j10, long j11) {
        this.f64048h = new o(aVar);
        this.f64041a = (e5.h) g5.a.e(hVar);
        this.f64042b = i10;
        this.f64043c = format;
        this.f64044d = i11;
        this.f64045e = obj;
        this.f64046f = j10;
        this.f64047g = j11;
    }
}
