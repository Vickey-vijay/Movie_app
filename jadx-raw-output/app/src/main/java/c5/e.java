package c5;

import androidx.annotation.Nullable;
import g5.k0;
import k3.r0;

/* JADX INFO: compiled from: TrackSelectorResult.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0[] f5651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f5652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5653d;

    public boolean a(@Nullable e eVar) {
        if (eVar == null || eVar.f5652c.f5645a != this.f5652c.f5645a) {
            return false;
        }
        for (int i10 = 0; i10 < this.f5652c.f5645a; i10++) {
            if (!b(eVar, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(@Nullable e eVar, int i10) {
        return eVar != null && k0.c(this.f5651b[i10], eVar.f5651b[i10]) && k0.c(this.f5652c.a(i10), eVar.f5652c.a(i10));
    }

    public boolean c(int i10) {
        return this.f5651b[i10] != null;
    }

    public e(r0[] r0VarArr, com.google.android.exoplayer2.trackselection.c[] cVarArr, Object obj) {
        this.f5651b = r0VarArr;
        this.f5652c = new c(cVarArr);
        this.f5653d = obj;
        this.f5650a = r0VarArr.length;
    }
}
