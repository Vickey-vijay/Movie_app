package hl;

import gl.s0;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f53944a;

    @Override // gl.s0
    public final void a(Object... objArr) {
        this.f53944a.l(((Integer) objArr[0]).intValue(), (JSONArray) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), (JSONArray) objArr[4]);
    }

    public c0(q qVar) {
        this.f53944a = qVar;
    }

    @Override // gl.s0
    public final void b(int i10, String str) {
        this.f53944a.j(i10, str);
    }
}
