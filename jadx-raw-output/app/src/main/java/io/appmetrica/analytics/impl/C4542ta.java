package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4542ta extends D2 {
    @Override // io.appmetrica.analytics.impl.D2, io.appmetrica.analytics.impl.InterfaceC4567ua
    @NonNull
    public final Nn a(@Nullable String str) {
        int length = 0;
        if (str != null) {
            int length2 = str.length();
            int i10 = this.f55129a;
            if (length2 > i10) {
                String strSubstring = str.substring(0, i10);
                length = str.getBytes().length - strSubstring.getBytes().length;
                str = strSubstring;
            }
        }
        return new Nn(str, new C4078b3(length));
    }

    public C4542ta(int i10) {
        super(i10);
    }
}
