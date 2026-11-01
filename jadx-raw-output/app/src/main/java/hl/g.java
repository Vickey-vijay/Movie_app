package hl;

import gl.s0;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f53959a;

    @Override // gl.s0
    public final void a(Object... objArr) {
        this.f53959a.l(((Integer) objArr[0]).intValue(), (JSONArray) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), (JSONArray) objArr[4]);
    }

    public g(b0 b0Var) {
        this.f53959a = b0Var;
    }

    @Override // gl.s0
    public final void b(int i10, String str) {
        this.f53959a.j(i10, str);
    }
}
