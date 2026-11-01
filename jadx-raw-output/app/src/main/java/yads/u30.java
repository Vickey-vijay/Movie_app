package yads;

import android.net.Uri;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class u30 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f83340k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f83341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f83342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f83343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f83344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f83345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f83346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f83347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f83348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f83349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f83350j;

    public u30(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        boolean z10 = true;
        ni.a(j10 + j11 >= 0);
        ni.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        ni.a(z10);
        this.f83341a = uri;
        this.f83342b = j10;
        this.f83343c = i10;
        this.f83344d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f83345e = Collections.unmodifiableMap(new HashMap(map));
        this.f83346f = j11;
        this.f83347g = j12;
        this.f83348h = str;
        this.f83349i = i11;
        this.f83350j = obj;
    }

    static {
        ho0.a("goog.exo.datasource");
    }

    public final u30 a(long j10, long j11) {
        return (j10 == 0 && this.f83347g == j11) ? this : new u30(this.f83341a, this.f83342b, this.f83343c, this.f83344d, this.f83345e, this.f83346f + j10, j11, this.f83348h, this.f83349i, this.f83350j);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f83343c;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb2.append(str);
        sb2.append(Z7.f27998r);
        sb2.append(this.f83341a);
        sb2.append(", ");
        sb2.append(this.f83346f);
        sb2.append(", ");
        sb2.append(this.f83347g);
        sb2.append(", ");
        sb2.append(this.f83348h);
        sb2.append(", ");
        sb2.append(this.f83349i);
        sb2.append(C3426d4.j.f28588e);
        return sb2.toString();
    }
}
