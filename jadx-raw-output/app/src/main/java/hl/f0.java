package hl;

import gl.s0;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f53958a;

    @Override // gl.s0
    public final void a(Object... objArr) {
        this.f53958a.l(((Integer) objArr[0]).intValue(), (JSONArray) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), (JSONArray) objArr[4]);
    }

    public f0(g0 g0Var) {
        this.f53958a = g0Var;
    }

    @Override // gl.s0
    public final void b(int i10, String str) {
        this.f53958a.j(i10, str);
    }
}
