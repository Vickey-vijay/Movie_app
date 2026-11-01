package com.unity3d.ads.core.domain;

import ck.p;
import lk.a0;

/* JADX INFO: compiled from: CommonGetFileExtensionFromUrl.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class CommonGetFileExtensionFromUrl implements GetFileExtensionFromUrl {
    private final RemoveUrlQuery removeUrlQuery;

    public CommonGetFileExtensionFromUrl(RemoveUrlQuery removeUrlQuery) {
        p.j(removeUrlQuery, "removeUrlQuery");
        this.removeUrlQuery = removeUrlQuery;
    }

    public final RemoveUrlQuery getRemoveUrlQuery() {
        return this.removeUrlQuery;
    }

    @Override // com.unity3d.ads.core.domain.GetFileExtensionFromUrl
    public String invoke(String str) {
        p.j(str, "url");
        String strInvoke = this.removeUrlQuery.invoke(str);
        if (strInvoke == null) {
            return null;
        }
        String strZ0 = a0.Z0(strInvoke, '/', null, 2, null);
        boolean z10 = false;
        if (!a0.W(strZ0, '.', false, 2, null)) {
            return null;
        }
        String strZ1 = a0.Z0(strZ0, '.', null, 2, null);
        if (strZ1.length() == 0) {
            z10 = true;
        }
        if (z10) {
            return null;
        }
        return strZ1;
    }
}
