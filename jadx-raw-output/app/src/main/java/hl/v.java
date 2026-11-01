package hl;

import gl.s0;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f53995a;

    @Override // gl.s0
    public final void a(Object... objArr) {
        this.f53995a.l(((Integer) objArr[0]).intValue(), (JSONArray) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), (JSONArray) objArr[4]);
    }

    public v(h hVar) {
        this.f53995a = hVar;
    }

    @Override // gl.s0
    public final void b(int i10, String str) {
        this.f53995a.j(i10, str);
    }
}
