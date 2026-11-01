package com.iab.omid.library.unity3d.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.unity3d.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class h implements d.a, com.iab.omid.library.unity3d.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static h f22056f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f22057a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.devicevolume.e f22058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.devicevolume.b f22059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.unity3d.devicevolume.d f22060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f22061e;

    public h(com.iab.omid.library.unity3d.devicevolume.e eVar, com.iab.omid.library.unity3d.devicevolume.b bVar) {
        this.f22058b = eVar;
        this.f22059c = bVar;
    }

    private c a() {
        if (this.f22061e == null) {
            this.f22061e = c.c();
        }
        return this.f22061e;
    }

    public static h c() {
        if (f22056f == null) {
            f22056f = new h(new com.iab.omid.library.unity3d.devicevolume.e(), new com.iab.omid.library.unity3d.devicevolume.b());
        }
        return f22056f;
    }

    @Override // com.iab.omid.library.unity3d.devicevolume.c
    public void a(float f10) {
        this.f22057a = f10;
        Iterator<com.iab.omid.library.unity3d.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f22060d = this.f22058b.a(new Handler(), context, this.f22059c.a(), this);
    }

    @Override // com.iab.omid.library.unity3d.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f22057a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f22060d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f22060d.d();
    }
}
