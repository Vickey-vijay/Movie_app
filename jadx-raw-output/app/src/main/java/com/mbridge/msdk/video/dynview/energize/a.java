package com.mbridge.msdk.video.dynview.energize;

import android.view.View;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.listener.e;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: DataEnergize.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile a f38614b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.video.dynview.inter.a f38615a;

    public static a a() {
        a aVar;
        if (f38614b != null) {
            return f38614b;
        }
        synchronized (a.class) {
            if (f38614b == null) {
                f38614b = new a();
            }
            aVar = f38614b;
        }
        return aVar;
    }

    private void b(c cVar, View view, Map map, e eVar) {
        new com.mbridge.msdk.video.dynview.wrapper.a().b(cVar, view, map, eVar);
    }

    private void c(c cVar, View view, Map map, e eVar) {
        new com.mbridge.msdk.video.dynview.wrapper.a().c(cVar, view, map, eVar);
    }

    public void b() {
        com.mbridge.msdk.video.dynview.inter.a aVar = this.f38615a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void c() {
        com.mbridge.msdk.video.dynview.inter.a aVar = this.f38615a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void d() {
        com.mbridge.msdk.video.dynview.inter.a aVar = this.f38615a;
        if (aVar != null) {
            aVar.c();
        }
    }

    private a() {
    }

    public void a(View view, c cVar, Map map, e eVar) {
        int iG = cVar.g();
        if (iG == 1) {
            a(cVar, view, map, eVar);
            return;
        }
        if (iG == 2) {
            b(cVar, view, map, eVar);
            return;
        }
        if (iG == 4) {
            a(cVar, view, eVar);
        } else if (iG != 5) {
            eVar.a(view, new ArrayList());
        } else {
            c(cVar, view, map, eVar);
        }
    }

    private void a(c cVar, View view, Map map, e eVar) {
        com.mbridge.msdk.video.dynview.wrapper.a aVar = new com.mbridge.msdk.video.dynview.wrapper.a();
        aVar.a(cVar, view, map, eVar);
        this.f38615a = aVar.f38765l;
    }

    private void a(c cVar, View view, e eVar) {
        new com.mbridge.msdk.video.dynview.wrapper.a().a(cVar, view, eVar);
    }
}
