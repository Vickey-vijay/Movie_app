package yads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class y11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f84786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InputStream f84788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f84789e;

    public y11(int i10, ArrayList arrayList, int i11, c21 c21Var) {
        this.f84785a = i10;
        this.f84786b = arrayList;
        this.f84787c = i11;
        this.f84788d = c21Var;
        this.f84789e = null;
    }

    public y11(int i10, List list, byte[] bArr) {
        this.f84785a = i10;
        this.f84786b = list;
        this.f84787c = bArr.length;
        this.f84789e = bArr;
        this.f84788d = null;
    }
}
