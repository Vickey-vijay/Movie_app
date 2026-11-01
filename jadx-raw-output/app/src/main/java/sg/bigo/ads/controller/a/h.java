package sg.bigo.ads.controller.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f70496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f70497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f70498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f70499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f70500e;

    public h(@Nullable String str, boolean z10) {
        this(str, true, z10, 0, "success");
    }

    public h(@Nullable String str, boolean z10, boolean z11, int i10, String str2) {
        this.f70496a = str;
        this.f70497b = z10;
        this.f70498c = z11;
        this.f70499d = i10;
        this.f70500e = str2;
    }

    public static h a(@Nullable String str, boolean z10, int i10, String str2) {
        return new h(str, false, z10, i10, str2);
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }
}
