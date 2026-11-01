package com.fyber.inneractive.sdk.ignite;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends j0.a {
    public l(Context context, k kVar, com.fyber.inneractive.sdk.ignite.events.wrappers.a aVar, boolean z10, boolean z11, boolean z12, h hVar) {
        l0.f iVar;
        super(kVar, aVar);
        l0.e eVar = new l0.e(context);
        if (z10 && z11) {
            iVar = new l0.h(new l0.g(eVar, hVar), true, z12, hVar, this);
        } else if (z10) {
            iVar = new l0.h(eVar, false, z12, hVar, this);
        } else if (z11) {
            iVar = new l0.g(eVar, hVar);
        } else {
            iVar = new l0.i(eVar, hVar);
        }
        this.f61679a = iVar;
    }
}
