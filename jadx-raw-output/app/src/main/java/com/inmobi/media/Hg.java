package com.inmobi.media;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Hg {
    public static Gg a(String str, String str2) {
        ck.p.j(str, "content");
        ck.p.j(str2, "markupType");
        int iHashCode = str2.hashCode();
        if (iHashCode != -1084172778) {
            if (iHashCode != 3213227) {
                if (iHashCode == 1236050372 && str2.equals("htmlUrl")) {
                    return new V7(str);
                }
            } else if (str2.equals(CreativeInfo.f44315al)) {
                return new U7(str);
            }
        } else if (str2.equals("inmobiJson")) {
            return new C3003l9(str);
        }
        throw new IllegalArgumentException("Unsupported markup type: " + str2);
    }
}
