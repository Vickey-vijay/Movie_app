package com.iab.omid.library.vungle.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f22166f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.vungle.utils.f f22167a = new com.iab.omid.library.vungle.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f22168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f22170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22171e;

    private a(d dVar) {
        this.f22170d = dVar;
    }

    public static a a() {
        return f22166f;
    }

    private void c() {
        if (!this.f22169c || this.f22168b == null) {
            return;
        }
        Iterator<com.iab.omid.library.vungle.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public void a(@NonNull Context context) {
        if (this.f22169c) {
            return;
        }
        this.f22170d.a(context);
        this.f22170d.a(this);
        this.f22170d.e();
        this.f22171e = this.f22170d.c();
        this.f22169c = true;
    }

    @Override // com.iab.omid.library.vungle.internal.d.a
    public void a(boolean z10) {
        if (!this.f22171e && z10) {
            d();
        }
        this.f22171e = z10;
    }

    public Date b() {
        Date date = this.f22168b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f22167a.a();
        Date date = this.f22168b;
        if (date == null || dateA.after(date)) {
            this.f22168b = dateA;
            c();
        }
    }
}
