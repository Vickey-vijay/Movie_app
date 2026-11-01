package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f85267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f85268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f85269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f85270f;

    public zb(int i10, int i11, ArrayList arrayList, List list, List list2, List list3) {
        this.f85265a = i10;
        this.f85266b = i11;
        this.f85267c = Collections.unmodifiableList(arrayList);
        this.f85268d = Collections.unmodifiableList(list);
        this.f85269e = Collections.unmodifiableList(list2);
        this.f85270f = Collections.unmodifiableList(list3);
    }
}
