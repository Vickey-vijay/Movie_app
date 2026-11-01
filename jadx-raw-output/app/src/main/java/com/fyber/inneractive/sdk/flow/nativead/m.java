package com.fyber.inneractive.sdk.flow.nativead;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f15516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f15518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f15519d;

    public m(p pVar, i iVar, boolean z10, com.fyber.inneractive.sdk.util.g gVar) {
        this.f15519d = pVar;
        this.f15516a = iVar;
        this.f15517b = z10;
        this.f15518c = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0071 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.click.o oVar;
        p pVar = this.f15519d;
        i iVar = this.f15516a;
        boolean z10 = this.f15517b;
        com.fyber.inneractive.sdk.util.g gVar = this.f15518c;
        pVar.getClass();
        String str = iVar.f15509a;
        String str2 = iVar.f15510b;
        if (!v.a(str)) {
            if (v.a(str2)) {
                oVar = new o(pVar, iVar, gVar);
                str = str2;
            } else {
                j jVar = (j) pVar.f15543a;
                i iVar2 = jVar.f15513a;
                if (iVar2 == null || iVar2.equals(iVar)) {
                    IAlog.a("%s : No valid link object, origin: %s", j.f15512d, gVar);
                } else {
                    p pVar2 = jVar.f15515c;
                    i iVar3 = jVar.f15513a;
                    pVar2.getClass();
                    com.fyber.inneractive.sdk.util.r.f18606a.execute(new m(pVar2, iVar3, true, gVar));
                }
            }
            p pVar3 = this.f15519d;
            i iVar4 = this.f15516a;
            pVar3.getClass();
            for (String str3 : iVar4.f15511c) {
                if (!TextUtils.isEmpty(str3)) {
                    z0.b(str3);
                }
            }
        }
        oVar = new n(pVar, iVar, str2, gVar);
        k kVar = ((j) pVar.f15543a).f15514b;
        if (kVar != null) {
            kVar.a(str, z10, gVar, oVar);
        }
        p pVar4 = this.f15519d;
        i iVar5 = this.f15516a;
        pVar4.getClass();
        while (r0.hasNext()) {
            if (!TextUtils.isEmpty(str3)) {
                z0.b(str3);
            }
        }
    }
}
