package com.fyber.inneractive.sdk.response.nativead;

import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends com.fyber.inneractive.sdk.response.e {
    public i N;

    @Override // com.fyber.inneractive.sdk.response.e
    public final InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, r rVar) {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.response.e
    public final InneractiveErrorCode b() {
        return null;
    }

    public final e c() {
        ArrayList<f> arrayList;
        i iVar = this.N;
        if (iVar == null || (arrayList = iVar.f18479a) == null) {
            fVar = null;
        } else {
            for (f fVar : arrayList) {
                if (fVar.f18468c != null) {
                }
            }
            fVar = null;
        }
        if (fVar != null) {
            return fVar.f18468c;
        }
        return null;
    }

    public final boolean d() {
        String str;
        e eVarC = c();
        if (eVarC != null && (str = eVarC.f18465a) != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }
}
