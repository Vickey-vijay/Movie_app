package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class t30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f82872a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f82875d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f82877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f82878g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82873b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f82874c = Collections.emptyMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f82876e = -1;

    public final u30 a() {
        ni.a(this.f82872a, "The uri must be set.");
        return new u30(this.f82872a, 0L, this.f82873b, null, this.f82874c, this.f82875d, this.f82876e, this.f82877f, this.f82878g, null);
    }

    public final t30 a(int i10) {
        this.f82878g = i10;
        return this;
    }

    public final t30 a(String str) {
        this.f82877f = str;
        return this;
    }

    public final t30 a(Uri uri) {
        this.f82872a = uri;
        return this;
    }
}
