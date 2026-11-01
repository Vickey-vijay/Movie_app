package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.mmadbridge.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class i implements d.a, com.iab.omid.library.mmadbridge.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f21922f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f21923a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.devicevolume.e f21924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.devicevolume.b f21925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.devicevolume.d f21926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f21927e;

    public i(com.iab.omid.library.mmadbridge.devicevolume.e eVar, com.iab.omid.library.mmadbridge.devicevolume.b bVar) {
        this.f21924b = eVar;
        this.f21925c = bVar;
    }

    private c a() {
        if (this.f21927e == null) {
            this.f21927e = c.c();
        }
        return this.f21927e;
    }

    public static i c() {
        if (f21922f == null) {
            f21922f = new i(new com.iab.omid.library.mmadbridge.devicevolume.e(), new com.iab.omid.library.mmadbridge.devicevolume.b());
        }
        return f21922f;
    }

    @Override // com.iab.omid.library.mmadbridge.devicevolume.c
    public void a(float f10) {
        this.f21923a = f10;
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f21926d = this.f21924b.a(new Handler(), context, this.f21925c.a(), this);
    }

    @Override // com.iab.omid.library.mmadbridge.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f21923a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f21926d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f21926d.d();
    }
}
