package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.MetaInfo;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2939ik {
    public static final Map a(G g10) {
        String creativeType;
        ck.p.j(g10, "<this>");
        Map mapO = kotlin.collections.a.o(mj.h.a("plId", Long.valueOf(g10.f22692a.f25027a.f22935a)), mj.h.a("plType", g10.f22692a.f25027a.f22941g), mj.h.a("adType", "native"), mj.h.a("markupType", g10.f22694c), mj.h.a("creativeId", "\"" + g10.f22696e + "\""), mj.h.a("impressionId", "\"" + g10.f22704m.f22612b + "\""), mj.h.a("isRewarded", Boolean.valueOf(g10.f22693b.f22485a)));
        MetaInfo metaInfo = g10.f22695d;
        if (metaInfo != null && (creativeType = metaInfo.getCreativeType()) != null) {
            mapO.put("creativeType", creativeType);
        }
        String str = g10.f22700i;
        if (str != null) {
            mapO.put("metadataBlob", str);
        }
        return mapO;
    }

    public static final Map a(C3095p1 c3095p1) {
        ck.p.j(c3095p1, "<this>");
        return kotlin.collections.a.o(mj.h.a("plId", Long.valueOf(c3095p1.f25027a.f22935a)), mj.h.a("plType", c3095p1.f25027a.f22941g), mj.h.a("adType", "native"));
    }
}
