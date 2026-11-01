package yads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class xf2 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f84576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f84577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f84578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f84579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s63[] f84580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object[] f84581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f84582l;

    @Override // yads.s63
    public final int a() {
        return this.f84577g;
    }

    @Override // yads.s63
    public final int b() {
        return this.f84576f;
    }

    public xf2(List list, sy2 sy2Var) {
        super(sy2Var);
        int size = list.size();
        this.f84578h = new int[size];
        this.f84579i = new int[size];
        this.f84580j = new s63[size];
        this.f84581k = new Object[size];
        this.f84582l = new HashMap();
        Iterator it = list.iterator();
        int iB = 0;
        int iA = 0;
        int i10 = 0;
        while (it.hasNext()) {
            dn1 dn1Var = (dn1) it.next();
            this.f84580j[i10] = dn1Var.a();
            this.f84579i[i10] = iB;
            this.f84578h[i10] = iA;
            iB += this.f84580j[i10].b();
            iA += this.f84580j[i10].a();
            this.f84581k[i10] = dn1Var.getUid();
            this.f84582l.put(this.f84581k[i10], Integer.valueOf(i10));
            i10++;
        }
        this.f84576f = iB;
        this.f84577g = iA;
    }
}
