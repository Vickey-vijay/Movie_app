package com.iab.omid.library.bigosg.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f21233a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bigosg.adsession.a> f21234b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bigosg.adsession.a> f21235c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return f21233a;
    }

    public void a(com.iab.omid.library.bigosg.adsession.a aVar) {
        this.f21234b.add(aVar);
    }

    public Collection<com.iab.omid.library.bigosg.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f21234b);
    }

    public void b(com.iab.omid.library.bigosg.adsession.a aVar) {
        boolean zD = d();
        this.f21235c.add(aVar);
        if (zD) {
            return;
        }
        f.a().b();
    }

    public Collection<com.iab.omid.library.bigosg.adsession.a> c() {
        return Collections.unmodifiableCollection(this.f21235c);
    }

    public void c(com.iab.omid.library.bigosg.adsession.a aVar) {
        boolean zD = d();
        this.f21234b.remove(aVar);
        this.f21235c.remove(aVar);
        if (!zD || d()) {
            return;
        }
        f.a().c();
    }

    public boolean d() {
        return this.f21235c.size() > 0;
    }
}
