package uc;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: compiled from: ScarAdBase.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f72800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f72801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qc.c f72802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public tc.a f72803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f72804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public oc.c f72805f;

    public abstract void b(AdRequest adRequest, qc.b bVar);

    public void a(qc.b bVar) {
        AdRequest adRequestB = this.f72803d.b(this.f72802c.a());
        if (bVar != null) {
            this.f72804e.a(bVar);
        }
        b(adRequestB, bVar);
    }

    public void c(T t10) {
        this.f72800a = t10;
    }

    public a(Context context, qc.c cVar, tc.a aVar, oc.c cVar2) {
        this.f72801b = context;
        this.f72802c = cVar;
        this.f72803d = aVar;
        this.f72805f = cVar2;
    }
}
