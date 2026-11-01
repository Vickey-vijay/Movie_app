package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public abstract class V0 {
    public static void a(AdResponse adResponse, C3053n9 c3053n9, bk.l lVar) {
        MetaInfo metaInfo;
        ck.p.j(adResponse, "adResponse");
        ck.p.j(lVar, "onFetchEvent");
        Objects.toString(adResponse);
        AdSet adSet = (AdSet) nj.b0.i0(adResponse.getAdSets(), 0);
        if (lk.a0.k1(adResponse.getRequestId()).toString().length() == 0) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2208))));
        }
        if (adResponse.getAdSets().isEmpty()) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), new Pi((short) 54));
        }
        if (adSet == null) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Pi((short) 2364));
        }
        if (adSet.getAds().isEmpty()) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), new Pi((short) 54));
        }
        com.inmobi.media.ads.network.common.model.Ad ad2 = (com.inmobi.media.ads.network.common.model.Ad) nj.b0.i0(adSet.getAds(), 0);
        String creativeType = (ad2 == null || (metaInfo = ad2.getMetaInfo()) == null) ? null : metaInfo.getCreativeType();
        Map mapO = kotlin.collections.a.o(mj.h.a("isRewarded", Boolean.valueOf(adSet.isRewarded())));
        if (creativeType != null) {
            mapO.put("creativeType", creativeType);
        }
        lVar.invoke(new Oi(mapO));
        a(adSet.getAdSetId(), adSet.isRewarded());
        a(adSet, c3053n9);
    }

    public static void a(String str, boolean z10) {
        if (str.length() == 0) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2231), mj.h.a("isRewarded", Boolean.valueOf(z10)))));
        }
    }

    public static void a(AdSet adSet, C3053n9 c3053n9) {
        Objects.toString(adSet);
        int i10 = 0;
        if (adSet.getAds().peekFirst() != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : adSet.getAds()) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    nj.s.u();
                }
                com.inmobi.media.ads.network.common.model.Ad ad2 = (com.inmobi.media.ads.network.common.model.Ad) obj;
                if (i10 == 0) {
                    a(ad2);
                } else {
                    try {
                        a(ad2);
                        mj.r rVar = mj.r.f64562a;
                    } catch (Y e10) {
                        if (c3053n9 != null) {
                            c3053n9.b("AdResponseValidator", "validateAdObjects Exception: (Index: " + i10 + ") - " + e10);
                        }
                        linkedHashSet.add(ad2);
                    }
                }
                i10 = i11;
            }
            adSet.getAds().removeAll(linkedHashSet);
            return;
        }
        throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2116), mj.h.a("isRewarded", Boolean.valueOf(adSet.isRewarded())))));
    }

    public static void a(com.inmobi.media.ads.network.common.model.Ad ad2) {
        Objects.toString(ad2);
        if (ad2.getImpressionId().length() != 0) {
            String markupType = ad2.getMarkupType();
            ck.p.j(markupType, "type");
            if ((ck.p.e(markupType, CreativeInfo.f44315al) || ck.p.e(markupType, "inmobiJson") || ck.p.e(markupType, "htmlUrl")) && !ck.p.e(ad2.getMarkupType(), "unknown")) {
                try {
                    ad2.getPubContent().a();
                    return;
                } catch (IllegalArgumentException unused) {
                    throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2163))));
                }
            }
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2163))));
        }
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2230);
        throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(map));
    }
}
