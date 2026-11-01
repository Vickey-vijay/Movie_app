package com.iab.omid.library.fyber.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f21493c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.fyber.adsession.a> f21494a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.fyber.adsession.a> f21495b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f21493c;
    }

    public Collection<com.iab.omid.library.fyber.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f21495b);
    }

    public void a(com.iab.omid.library.fyber.adsession.a aVar) {
        this.f21494a.add(aVar);
    }

    public Collection<com.iab.omid.library.fyber.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f21494a);
    }

    public void b(com.iab.omid.library.fyber.adsession.a aVar) {
        boolean zD = d();
        this.f21494a.remove(aVar);
        this.f21495b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.fyber.adsession.a aVar) {
        boolean zD = d();
        this.f21495b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }

    public boolean d() {
        return this.f21495b.size() > 0;
    }
}
