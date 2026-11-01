package kotlinx.serialization.descriptors;

import bk.l;
import bl.n;
import bl.n1;
import bl.p1;
import ck.p;
import ik.k;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mj.h;
import nj.b0;
import nj.d0;
import nj.t;
import zk.g;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class SerialDescriptorImpl implements a, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f63235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Annotation> f63237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<String> f63238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f63239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a[] f63240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<Annotation>[] f63241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean[] f63242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map<String, Integer> f63243j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a[] f63244k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mj.g f63245l;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SerialDescriptorImpl) {
            a aVar = (a) obj;
            if (p.e(h(), aVar.h()) && Arrays.equals(this.f63244k, ((SerialDescriptorImpl) obj).f63244k) && e() == aVar.e()) {
                int iE = e();
                for (int i10 = 0; i10 < iE; i10++) {
                    if (p.e(d(i10).h(), aVar.d(i10).h()) && p.e(d(i10).getKind(), aVar.d(i10).getKind())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public SerialDescriptorImpl(String str, g gVar, int i10, List<? extends a> list, zk.a aVar) {
        p.j(str, "serialName");
        p.j(gVar, "kind");
        p.j(list, "typeParameters");
        p.j(aVar, "builder");
        this.f63234a = str;
        this.f63235b = gVar;
        this.f63236c = i10;
        this.f63237d = aVar.c();
        this.f63238e = b0.M0(aVar.f());
        String[] strArr = (String[]) aVar.f().toArray(new String[0]);
        this.f63239f = strArr;
        this.f63240g = n1.b(aVar.e());
        this.f63241h = (List[]) aVar.d().toArray(new List[0]);
        this.f63242i = b0.K0(aVar.g());
        Iterable<d0> iterableU0 = nj.n.u0(strArr);
        ArrayList arrayList = new ArrayList(t.v(iterableU0, 10));
        for (d0 d0Var : iterableU0) {
            arrayList.add(h.a(d0Var.b(), Integer.valueOf(d0Var.a())));
        }
        this.f63243j = kotlin.collections.a.v(arrayList);
        this.f63244k = n1.b(list);
        this.f63245l = kotlin.b.a(new bk.a<Integer>() { // from class: kotlinx.serialization.descriptors.SerialDescriptorImpl$_hashCode$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final Integer invoke() {
                SerialDescriptorImpl serialDescriptorImpl = this.this$0;
                return Integer.valueOf(p1.a(serialDescriptorImpl, serialDescriptorImpl.f63244k));
            }
        });
    }

    @Override // bl.n
    public Set<String> a() {
        return this.f63238e;
    }

    @Override // kotlinx.serialization.descriptors.a
    public int c(String str) {
        p.j(str, "name");
        Integer num = this.f63243j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.a
    public a d(int i10) {
        return this.f63240g[i10];
    }

    @Override // kotlinx.serialization.descriptors.a
    public int e() {
        return this.f63236c;
    }

    @Override // kotlinx.serialization.descriptors.a
    public String f(int i10) {
        return this.f63239f[i10];
    }

    @Override // kotlinx.serialization.descriptors.a
    public List<Annotation> g(int i10) {
        return this.f63241h[i10];
    }

    @Override // kotlinx.serialization.descriptors.a
    public List<Annotation> getAnnotations() {
        return this.f63237d;
    }

    @Override // kotlinx.serialization.descriptors.a
    public g getKind() {
        return this.f63235b;
    }

    @Override // kotlinx.serialization.descriptors.a
    public String h() {
        return this.f63234a;
    }

    @Override // kotlinx.serialization.descriptors.a
    public boolean i(int i10) {
        return this.f63242i[i10];
    }

    public final int k() {
        return ((Number) this.f63245l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.a
    public boolean b() {
        return a.C0566a.c(this);
    }

    public int hashCode() {
        return k();
    }

    @Override // kotlinx.serialization.descriptors.a
    public boolean isInline() {
        return a.C0566a.b(this);
    }

    public String toString() {
        return b0.p0(k.q(0, e()), ", ", h() + '(', ")", 0, null, new l<Integer, CharSequence>() { // from class: kotlinx.serialization.descriptors.SerialDescriptorImpl.toString.1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final CharSequence invoke(int i10) {
                return SerialDescriptorImpl.this.f(i10) + ": " + SerialDescriptorImpl.this.d(i10).h();
            }
        }, 24, null);
    }
}
