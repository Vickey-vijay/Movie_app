package kotlinx.serialization.internal;

import bk.l;
import bl.g0;
import bl.n;
import bl.n1;
import bl.p1;
import bl.q1;
import ck.i;
import ck.p;
import ik.k;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.b;
import kotlinx.serialization.descriptors.a;
import mj.g;
import nj.b0;
import nj.s;

/* JADX INFO: compiled from: PluginGeneratedSerialDescriptor.kt */
/* JADX INFO: loaded from: classes6.dex */
public class PluginGeneratedSerialDescriptor implements a, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0<?> f63267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f63270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<Annotation>[] f63271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<Annotation> f63272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f63273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<String, Integer> f63274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f63275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f63276k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f63277l;

    public PluginGeneratedSerialDescriptor(String str, g0<?> g0Var, int i10) {
        p.j(str, "serialName");
        this.f63266a = str;
        this.f63267b = g0Var;
        this.f63268c = i10;
        this.f63269d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f63270e = strArr;
        int i12 = this.f63268c;
        this.f63271f = new List[i12];
        this.f63273h = new boolean[i12];
        this.f63274i = kotlin.collections.a.j();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f63275j = b.b(lazyThreadSafetyMode, new bk.a<xk.b<?>[]>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$childSerializers$2
            {
                super(0);
            }

            @Override // bk.a
            public final xk.b<?>[] invoke() {
                xk.b<?>[] bVarArrChildSerializers;
                g0 g0Var2 = this.this$0.f63267b;
                return (g0Var2 == null || (bVarArrChildSerializers = g0Var2.childSerializers()) == null) ? q1.f5457a : bVarArrChildSerializers;
            }
        });
        this.f63276k = b.b(lazyThreadSafetyMode, new bk.a<a[]>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$typeParameterDescriptors$2
            {
                super(0);
            }

            @Override // bk.a
            public final a[] invoke() {
                ArrayList arrayList;
                xk.b<?>[] bVarArrTypeParametersSerializers;
                g0 g0Var2 = this.this$0.f63267b;
                if (g0Var2 == null || (bVarArrTypeParametersSerializers = g0Var2.typeParametersSerializers()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(bVarArrTypeParametersSerializers.length);
                    for (xk.b<?> bVar : bVarArrTypeParametersSerializers) {
                        arrayList.add(bVar.getDescriptor());
                    }
                }
                return n1.b(arrayList);
            }
        });
        this.f63277l = b.b(lazyThreadSafetyMode, new bk.a<Integer>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$_hashCode$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final Integer invoke() {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.this$0;
                return Integer.valueOf(p1.a(pluginGeneratedSerialDescriptor, pluginGeneratedSerialDescriptor.o()));
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginGeneratedSerialDescriptor) {
            a aVar = (a) obj;
            if (p.e(h(), aVar.h()) && Arrays.equals(o(), ((PluginGeneratedSerialDescriptor) obj).o()) && e() == aVar.e()) {
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

    public static /* synthetic */ void l(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        pluginGeneratedSerialDescriptor.k(str, z10);
    }

    @Override // bl.n
    public Set<String> a() {
        return this.f63274i.keySet();
    }

    @Override // kotlinx.serialization.descriptors.a
    public int c(String str) {
        p.j(str, "name");
        Integer num = this.f63274i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.a
    public final int e() {
        return this.f63268c;
    }

    @Override // kotlinx.serialization.descriptors.a
    public String f(int i10) {
        return this.f63270e[i10];
    }

    @Override // kotlinx.serialization.descriptors.a
    public List<Annotation> g(int i10) {
        List<Annotation> list = this.f63271f[i10];
        return list == null ? s.k() : list;
    }

    @Override // kotlinx.serialization.descriptors.a
    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.f63272g;
        return list == null ? s.k() : list;
    }

    @Override // kotlinx.serialization.descriptors.a
    public zk.g getKind() {
        return kotlinx.serialization.descriptors.b.a.f63246a;
    }

    @Override // kotlinx.serialization.descriptors.a
    public String h() {
        return this.f63266a;
    }

    @Override // kotlinx.serialization.descriptors.a
    public boolean i(int i10) {
        return this.f63273h[i10];
    }

    public final void k(String str, boolean z10) {
        p.j(str, "name");
        String[] strArr = this.f63270e;
        int i10 = this.f63269d + 1;
        this.f63269d = i10;
        strArr[i10] = str;
        this.f63273h[i10] = z10;
        this.f63271f[i10] = null;
        if (i10 == this.f63268c - 1) {
            this.f63274i = m();
        }
    }

    public final Map<String, Integer> m() {
        HashMap map = new HashMap();
        int length = this.f63270e.length;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(this.f63270e[i10], Integer.valueOf(i10));
        }
        return map;
    }

    public final xk.b<?>[] n() {
        return (xk.b[]) this.f63275j.getValue();
    }

    public final a[] o() {
        return (a[]) this.f63276k.getValue();
    }

    public final int p() {
        return ((Number) this.f63277l.getValue()).intValue();
    }

    public final void q(Annotation annotation) {
        p.j(annotation, "annotation");
        List<Annotation> arrayList = this.f63271f[this.f63269d];
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            this.f63271f[this.f63269d] = arrayList;
        }
        arrayList.add(annotation);
    }

    public final void r(Annotation annotation) {
        p.j(annotation, "a");
        if (this.f63272g == null) {
            this.f63272g = new ArrayList(1);
        }
        List<Annotation> list = this.f63272g;
        p.g(list);
        list.add(annotation);
    }

    public String toString() {
        return b0.p0(k.q(0, this.f63268c), ", ", h() + '(', ")", 0, null, new l<Integer, CharSequence>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor.toString.1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final CharSequence invoke(int i10) {
                return PluginGeneratedSerialDescriptor.this.f(i10) + ": " + PluginGeneratedSerialDescriptor.this.d(i10).h();
            }
        }, 24, null);
    }

    @Override // kotlinx.serialization.descriptors.a
    public boolean b() {
        return a.C0566a.c(this);
    }

    @Override // kotlinx.serialization.descriptors.a
    public a d(int i10) {
        return n()[i10].getDescriptor();
    }

    public int hashCode() {
        return p();
    }

    @Override // kotlinx.serialization.descriptors.a
    public boolean isInline() {
        return a.C0566a.b(this);
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, g0 g0Var, int i10, int i11, i iVar) {
        this(str, (i11 & 2) != 0 ? null : g0Var, i10);
    }
}
