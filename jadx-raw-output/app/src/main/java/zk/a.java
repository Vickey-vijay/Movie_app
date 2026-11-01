package zk;

import ck.p;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import nj.s;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<? extends Annotation> f86449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f86450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<String> f86451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<kotlinx.serialization.descriptors.a> f86452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<List<Annotation>> f86453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<Boolean> f86454g;

    public a(String str) {
        p.j(str, "serialName");
        this.f86448a = str;
        this.f86449b = s.k();
        this.f86450c = new ArrayList();
        this.f86451d = new HashSet();
        this.f86452e = new ArrayList();
        this.f86453f = new ArrayList();
        this.f86454g = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(a aVar, String str, kotlinx.serialization.descriptors.a aVar2, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = s.k();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        aVar.a(str, aVar2, list, z10);
    }

    public final void a(String str, kotlinx.serialization.descriptors.a aVar, List<? extends Annotation> list, boolean z10) {
        p.j(str, "elementName");
        p.j(aVar, "descriptor");
        p.j(list, "annotations");
        if (this.f86451d.add(str)) {
            this.f86450c.add(str);
            this.f86452e.add(aVar);
            this.f86453f.add(list);
            this.f86454g.add(Boolean.valueOf(z10));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + this.f86448a).toString());
    }

    public final List<Annotation> c() {
        return this.f86449b;
    }

    public final List<List<Annotation>> d() {
        return this.f86453f;
    }

    public final List<kotlinx.serialization.descriptors.a> e() {
        return this.f86452e;
    }

    public final List<String> f() {
        return this.f86450c;
    }

    public final List<Boolean> g() {
        return this.f86454g;
    }

    public final void h(List<? extends Annotation> list) {
        p.j(list, "<set-?>");
        this.f86449b = list;
    }
}
