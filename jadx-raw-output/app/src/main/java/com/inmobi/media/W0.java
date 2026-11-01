package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.Partner;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.inmobi.media.core.config.models.AdConfig;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Partner f23717a;

    public static AdSessionContext a(String str, List list, Map map, String str2, String str3) {
        VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithoutParameters;
        ck.p.j(str, "omsdkScript");
        ck.p.j(list, "omidTrackers");
        ck.p.j(map, "macros");
        ck.p.j(str3, "customReferenceData");
        ck.p.j(list, "adVerifications");
        ck.p.j(map, "macros");
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3358zf c3358zf = (C3358zf) it.next();
            try {
                String str4 = c3358zf.f25568a;
                if (map != null) {
                    String strN = str4;
                    for (Map.Entry entry : map.entrySet()) {
                        strN = lk.x.N(strN, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
                    }
                    str4 = strN;
                }
                URL url = new URL(str4);
                String str5 = c3358zf.f25846c;
                String str6 = c3358zf.f25847d;
                verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = (str5.length() <= 0 || !F3.a(str6)) ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url) : VerificationScriptResource.createVerificationScriptResourceWithParameters(str5, url, str6);
            } catch (MalformedURLException unused) {
                verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = null;
            }
            arrayList.add(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters);
        }
        AdSessionContext adSessionContextCreateNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(f23717a, str, nj.b0.c0(arrayList), str2, str3);
        ck.p.i(adSessionContextCreateNativeAdSessionContext, "createNativeAdSessionContext(...)");
        return adSessionContextCreateNativeAdSessionContext;
    }

    static {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(AdConfig.class, "clazz");
        String partnerKey = ((AdConfig) Y3.f23815a.a(AdConfig.class)).getViewability().getOmidConfig().getPartnerKey();
        if (partnerKey.length() == 0) {
            partnerKey = "Inmobi";
        }
        Partner partnerCreatePartner = Partner.createPartner(partnerKey, a());
        ck.p.i(partnerCreatePartner, "createPartner(...)");
        f23717a = partnerCreatePartner;
    }

    public static String a() {
        return "a" + lk.x.N("11.1.0", ".", "", false, 4, null);
    }
}
