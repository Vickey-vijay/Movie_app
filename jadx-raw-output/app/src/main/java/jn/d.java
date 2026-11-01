package jn;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.fourthline.cling.model.ValidationException;
import un.l;
import un.q;
import yn.j;
import yn.z;

/* JADX INFO: compiled from: MutableDevice.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f61956a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public URL f61958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f61959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f61960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f61961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public URI f61962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f61963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f61964i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f61965j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public URI f61966k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f61967l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f61968m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public URI f61969n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public yn.g f61971p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f61975t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f61957b = new h();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<yn.h> f61970o = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<e> f61972q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<f> f61973r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List<d> f61974s = new ArrayList();

    public un.a b(un.a aVar, q qVar, URL url) throws ValidationException {
        ArrayList arrayList = new ArrayList();
        Iterator<d> it = this.f61974s.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b(aVar, qVar, url));
        }
        return aVar.B(this.f61956a, qVar, d(), c(url), f(), g(aVar), arrayList);
    }

    public un.b c(URL url) {
        String str = this.f61960e;
        un.g gVar = new un.g(this.f61961f, this.f61962g);
        un.h hVar = new un.h(this.f61963h, this.f61964i, this.f61965j, this.f61966k);
        String str2 = this.f61967l;
        String str3 = this.f61968m;
        URI uri = this.f61969n;
        List<yn.h> list = this.f61970o;
        return new un.b(url, str, gVar, hVar, str2, str3, uri, (yn.h[]) list.toArray(new yn.h[list.size()]), this.f61971p);
    }

    public j d() {
        return j.d(this.f61959d);
    }

    public q e() {
        h hVar = this.f61957b;
        return new q(hVar.f61994a, hVar.f61995b);
    }

    public un.d[] f() {
        un.d[] dVarArr = new un.d[this.f61972q.size()];
        Iterator<e> it = this.f61972q.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            dVarArr[i10] = it.next().a();
            i10++;
        }
        return dVarArr;
    }

    public l[] g(un.a aVar) throws ValidationException {
        l[] lVarArrD = aVar.D(this.f61973r.size());
        Iterator<f> it = this.f61973r.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            lVarArrD[i10] = it.next().a(aVar);
            i10++;
        }
        return lVarArrD;
    }

    public un.a a(un.a aVar) throws ValidationException {
        return b(aVar, e(), this.f61958c);
    }
}
