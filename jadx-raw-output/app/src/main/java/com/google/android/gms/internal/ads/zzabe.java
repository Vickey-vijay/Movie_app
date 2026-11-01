package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzabe extends IOException {
    public zzabe(Throwable th2) {
        String strConcat;
        String simpleName = th2.getClass().getSimpleName();
        if (th2.getMessage() != null) {
            strConcat = ": ".concat(String.valueOf(th2.getMessage()));
        } else {
            strConcat = "";
        }
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 11 + strConcat.length());
        sb2.append("Unexpected ");
        sb2.append(simpleName);
        sb2.append(strConcat);
        super(sb2.toString(), th2);
    }
}
