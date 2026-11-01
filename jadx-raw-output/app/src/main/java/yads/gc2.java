package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class gc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f77737a;

    public final boolean a(String str) {
        try {
            return this.f77737a.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
        }
    }

    public gc2(Context context) {
        this.f77737a = context.getApplicationContext();
    }
}
