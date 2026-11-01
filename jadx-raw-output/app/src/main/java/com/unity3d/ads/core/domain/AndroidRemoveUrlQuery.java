package com.unity3d.ads.core.domain;

import android.net.Uri;
import ck.p;

/* JADX INFO: compiled from: AndroidRemoveUrlQuery.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidRemoveUrlQuery implements RemoveUrlQuery {
    @Override // com.unity3d.ads.core.domain.RemoveUrlQuery
    public String invoke(String str) {
        p.j(str, "url");
        String string = Uri.parse(str).buildUpon().clearQuery().build().toString();
        p.i(string, "parse(url).buildUpon().c…uery().build().toString()");
        return string;
    }
}
