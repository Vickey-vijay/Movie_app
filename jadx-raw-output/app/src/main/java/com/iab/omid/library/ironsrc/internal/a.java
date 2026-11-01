package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f21762f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.ironsrc.utils.f f21763a = new com.iab.omid.library.ironsrc.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f21764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f21766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21767e;

    private a(d dVar) {
        this.f21766d = dVar;
    }

    public static a a() {
        return f21762f;
    }

    private void c() {
        if (!this.f21765c || this.f21764b == null) {
            return;
        }
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public void a(@NonNull Context context) {
        if (this.f21765c) {
            return;
        }
        this.f21766d.a(context);
        this.f21766d.a(this);
        this.f21766d.e();
        this.f21767e = this.f21766d.c();
        this.f21765c = true;
    }

    @Override // com.iab.omid.library.ironsrc.internal.d.a
    public void a(boolean z10) {
        if (!this.f21767e && z10) {
            d();
        }
        this.f21767e = z10;
    }

    public Date b() {
        Date date = this.f21764b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f21763a.a();
        Date date = this.f21764b;
        if (date == null || dateA.after(date)) {
            this.f21764b = dateA;
            c();
        }
    }
}
