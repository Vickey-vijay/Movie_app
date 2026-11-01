package com.mbridge.msdk.foundation.same.image;

import android.content.Context;
import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: CommonImageLoader.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f34961a;

    public static b a(Context context) {
        if (f34961a == null) {
            f34961a = new b(context);
        }
        return f34961a;
    }

    public void a() {
    }

    public void a(String str) {
    }

    public void b() {
    }

    public b(Context context) {
    }

    public Bitmap b(String str) {
        if (v0.k(str)) {
            return null;
        }
        return d.a().c(str);
    }

    public boolean c(String str) {
        if (v0.k(str)) {
            return false;
        }
        return d.a().d(str);
    }

    public void a(String str, c cVar) {
        d.a().b(str, null, cVar);
    }
}
