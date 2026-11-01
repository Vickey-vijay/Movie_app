package yc;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: compiled from: ScarAdBase.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f85675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f85676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qc.c f85677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public xc.a f85678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f85679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public oc.c f85680f;

    public abstract void b(AdRequest adRequest, qc.b bVar);

    public void a(qc.b bVar) {
        AdRequest adRequestB = this.f85678d.b(this.f85677c.a());
        if (bVar != null) {
            this.f85679e.a(bVar);
        }
        b(adRequestB, bVar);
    }

    public void c(T t10) {
        this.f85675a = t10;
    }

    public a(Context context, qc.c cVar, xc.a aVar, oc.c cVar2) {
        this.f85676b = context;
        this.f85677c = cVar;
        this.f85678d = aVar;
        this.f85680f = cVar2;
    }
}
