package com.iab.omid.library.appodeal.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f21107c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.appodeal.adsession.a> f21108a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.appodeal.adsession.a> f21109b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f21107c;
    }

    public Collection<com.iab.omid.library.appodeal.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f21109b);
    }

    public void a(com.iab.omid.library.appodeal.adsession.a aVar) {
        this.f21108a.add(aVar);
    }

    public Collection<com.iab.omid.library.appodeal.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f21108a);
    }

    public void b(com.iab.omid.library.appodeal.adsession.a aVar) {
        boolean zD = d();
        this.f21108a.remove(aVar);
        this.f21109b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.appodeal.adsession.a aVar) {
        boolean zD = d();
        this.f21109b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }

    public boolean d() {
        return this.f21109b.size() > 0;
    }
}
