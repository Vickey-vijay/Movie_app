package sg.bigo.ads.controller.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f70502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f70503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70504c;

    public j(String str, @Nullable String str2, int i10) {
        this.f70502a = str;
        this.f70503b = str2;
        this.f70504c = i10;
    }

    @NonNull
    public final String a() {
        return this.f70502a;
    }

    @Nullable
    public final String b() {
        return this.f70503b;
    }

    public final boolean c() {
        return d.a(this.f70503b);
    }

    public final int d() {
        return this.f70504c;
    }

    @NonNull
    public String toString() {
        return super.toString();
    }
}
