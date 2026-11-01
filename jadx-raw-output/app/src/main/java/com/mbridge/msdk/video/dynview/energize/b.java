package com.mbridge.msdk.video.dynview.energize;

import android.view.View;
import com.mbridge.msdk.video.dynview.c;
import java.util.Map;

/* JADX INFO: compiled from: UIEnergize.java */
/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f38616a;

    public static b a() {
        b bVar;
        if (f38616a != null) {
            return f38616a;
        }
        synchronized (b.class) {
            if (f38616a == null) {
                f38616a = new b();
            }
            bVar = f38616a;
        }
        return bVar;
    }

    private void b(View view, c cVar) {
        new com.mbridge.msdk.video.dynview.wrapper.b().b(view, cVar);
    }

    private void b(View view, c cVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.wrapper.b().b(view, cVar, map);
    }

    private void c(View view, c cVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.wrapper.b().a(view, cVar, map);
    }

    private b() {
    }

    public void a(View view, c cVar, Map<String, Object> map) {
        if (cVar == null) {
            return;
        }
        int iG = cVar.g();
        if (iG == 1) {
            a(view, map);
            return;
        }
        if (iG == 2) {
            c(view, cVar, map);
            return;
        }
        if (iG == 3) {
            b(view, cVar);
        } else if (iG == 4) {
            b(view, cVar, map);
        } else {
            if (iG != 5) {
                return;
            }
            a(view, cVar);
        }
    }

    private void a(View view, c cVar) {
        new com.mbridge.msdk.video.dynview.wrapper.b().a(view, cVar);
    }

    private void a(View view, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.wrapper.b().a(view, map);
    }
}
