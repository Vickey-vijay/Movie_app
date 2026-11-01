package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f21897f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.mmadbridge.utils.f f21898a = new com.iab.omid.library.mmadbridge.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f21899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f21901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21902e;

    private a(d dVar) {
        this.f21901d = dVar;
    }

    public static a a() {
        return f21897f;
    }

    private void c() {
        if (!this.f21900c || this.f21899b == null) {
            return;
        }
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public void a(@NonNull Context context) {
        if (this.f21900c) {
            return;
        }
        this.f21901d.a(context);
        this.f21901d.a(this);
        this.f21901d.e();
        this.f21902e = this.f21901d.c();
        this.f21900c = true;
    }

    @Override // com.iab.omid.library.mmadbridge.internal.d.a
    public void a(boolean z10) {
        if (!this.f21902e && z10) {
            d();
        }
        this.f21902e = z10;
    }

    public Date b() {
        Date date = this.f21899b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f21898a.a();
        Date date = this.f21899b;
        if (date == null || dateA.after(date)) {
            this.f21899b = dateA;
            c();
        }
    }
}
