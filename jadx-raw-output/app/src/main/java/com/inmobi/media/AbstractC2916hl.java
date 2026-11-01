package com.inmobi.media;

import android.os.Build;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2916hl {
    public static final C3348z5 a(List list) {
        ck.p.j(list, "<this>");
        return list.size() != 2 ? new C3348z5(0, 0) : new C3348z5(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    public static final String a(String str) {
        ck.p.j(str, "url");
        if (Build.VERSION.SDK_INT >= 33) {
            return URLEncoder.encode(str, Charset.defaultCharset());
        }
        return URLEncoder.encode(str);
    }
}
