package hl;

import gl.s0;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f53945a;

    @Override // gl.s0
    public final void a(Object... objArr) {
        this.f53945a.l(((Integer) objArr[0]).intValue(), (JSONArray) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), (JSONArray) objArr[4]);
    }

    public d(i iVar) {
        this.f53945a = iVar;
    }

    @Override // gl.s0
    public final void b(int i10, String str) {
        this.f53945a.j(i10, str);
    }
}
