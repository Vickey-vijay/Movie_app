package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class fc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f77350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f77351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f77352d;

    public fc2(String str, long j10, ArrayList arrayList, List list) {
        this.f77349a = str;
        this.f77350b = j10;
        this.f77351c = Collections.unmodifiableList(arrayList);
        this.f77352d = Collections.unmodifiableList(list);
    }
}
