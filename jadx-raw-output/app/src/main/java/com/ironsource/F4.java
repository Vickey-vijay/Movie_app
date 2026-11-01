package com.ironsource;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public interface F4 {
    String a(String str, String str2);

    void a(String str);

    Map<String, ?> allData();

    void b(String str, String str2);

    static /* synthetic */ String a(F4 f10, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return f10.a(str, str2);
    }
}
