package jn;

import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.fourthline.cling.model.ValidationException;
import un.l;
import un.m;
import yn.r;
import yn.s;

/* JADX INFO: compiled from: MutableService.java */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f61981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f61982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public URI f61983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public URI f61984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public URI f61985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<a> f61986f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<g> f61987g = new ArrayList();

    public l a(un.a aVar) throws ValidationException {
        return aVar.C(this.f61981a, this.f61982b, this.f61983c, this.f61984d, this.f61985e, b(), c());
    }

    public org.fourthline.cling.model.meta.a[] b() {
        org.fourthline.cling.model.meta.a[] aVarArr = new org.fourthline.cling.model.meta.a[this.f61986f.size()];
        Iterator<a> it = this.f61986f.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            aVarArr[i10] = it.next().a();
            i10++;
        }
        return aVarArr;
    }

    public m[] c() {
        m[] mVarArr = new m[this.f61987g.size()];
        Iterator<g> it = this.f61987g.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            mVarArr[i10] = it.next().a();
            i10++;
        }
        return mVarArr;
    }
}
