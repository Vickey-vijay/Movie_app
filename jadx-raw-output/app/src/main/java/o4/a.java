package o4;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: AdaptationSet.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<i> f64990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<d> f64991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<d> f64992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<d> f64993f;

    public a(int i10, int i11, List<i> list, List<d> list2, List<d> list3, List<d> list4) {
        this.f64988a = i10;
        this.f64989b = i11;
        this.f64990c = Collections.unmodifiableList(list);
        this.f64991d = Collections.unmodifiableList(list2);
        this.f64992e = Collections.unmodifiableList(list3);
        this.f64993f = Collections.unmodifiableList(list4);
    }
}
