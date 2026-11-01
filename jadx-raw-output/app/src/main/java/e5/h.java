package e5;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: DataSpec.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f52374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final byte[] f52376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, String> f52377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f52378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f52379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f52380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final String f52381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f52382i;

    public h(Uri uri, int i10) {
        this(uri, 0L, -1L, null, i10);
    }

    public static String b(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new AssertionError(i10);
    }

    public static int c(@Nullable byte[] bArr) {
        return bArr != null ? 2 : 1;
    }

    public h(Uri uri, long j10, long j11, @Nullable String str) {
        this(uri, j10, j10, j11, str, 0);
    }

    public final String a() {
        return b(this.f52375b);
    }

    public boolean d(int i10) {
        return (this.f52382i & i10) == i10;
    }

    public h e(long j10) {
        long j11 = this.f52380g;
        return f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public h f(long j10, long j11) {
        return (j10 == 0 && this.f52380g == j11) ? this : new h(this.f52374a, this.f52375b, this.f52376c, this.f52378e + j10, this.f52379f + j10, j11, this.f52381h, this.f52382i, this.f52377d);
    }

    public String toString() {
        return "DataSpec[" + a() + Z7.f27998r + this.f52374a + ", " + Arrays.toString(this.f52376c) + ", " + this.f52378e + ", " + this.f52379f + ", " + this.f52380g + ", " + this.f52381h + ", " + this.f52382i + C3426d4.j.f28588e;
    }

    public h(Uri uri, long j10, long j11, @Nullable String str, int i10) {
        this(uri, j10, j10, j11, str, i10);
    }

    public h(Uri uri, long j10, long j11, @Nullable String str, int i10, Map<String, String> map) {
        this(uri, c(null), null, j10, j10, j11, str, i10, map);
    }

    public h(Uri uri, long j10, long j11, long j12, @Nullable String str, int i10) {
        this(uri, null, j10, j11, j12, str, i10);
    }

    public h(Uri uri, @Nullable byte[] bArr, long j10, long j11, long j12, @Nullable String str, int i10) {
        this(uri, c(bArr), bArr, j10, j11, j12, str, i10);
    }

    public h(Uri uri, int i10, @Nullable byte[] bArr, long j10, long j11, long j12, @Nullable String str, int i11) {
        this(uri, i10, bArr, j10, j11, j12, str, i11, Collections.emptyMap());
    }

    public h(Uri uri, int i10, @Nullable byte[] bArr, long j10, long j11, long j12, @Nullable String str, int i11, Map<String, String> map) {
        byte[] bArr2 = bArr;
        boolean z10 = true;
        g5.a.a(j10 >= 0);
        g5.a.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        g5.a.a(z10);
        this.f52374a = uri;
        this.f52375b = i10;
        this.f52376c = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f52378e = j10;
        this.f52379f = j11;
        this.f52380g = j12;
        this.f52381h = str;
        this.f52382i = i11;
        this.f52377d = Collections.unmodifiableMap(new HashMap(map));
    }
}
