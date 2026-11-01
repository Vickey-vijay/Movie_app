package sg.bigo.ads.core.f.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f71414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f71415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f71417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f71418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f71419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f71420g;

    public b(int i10, int i11, int i12, int i13, @NonNull String str, @Nullable String str2, @Nullable String str3) {
        this.f71414a = i10;
        this.f71415b = i11;
        this.f71420g = i13;
        this.f71416c = str;
        this.f71419f = i12;
        this.f71417d = str2;
        this.f71418e = str3;
    }

    public final boolean a() {
        return TextUtils.equals(this.f71417d, "application/javascript");
    }
}
