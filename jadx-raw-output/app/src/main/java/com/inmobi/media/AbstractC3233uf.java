package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.ImpressionType;

/* JADX INFO: renamed from: com.inmobi.media.uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3233uf {
    public static C2959jf a(String str, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, boolean z10, String str2, byte b10, String str3) {
        ImpressionType impressionType;
        ck.p.j(str, "creativeType");
        Cf cf2 = Bf.f22423a;
        cf2.getClass();
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "webView");
        AdSessionContext adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(cf2.f22471b, gestureDetectorOnGestureListenerC2785ci, str2, str3);
        ck.p.i(adSessionContextCreateHtmlAdSessionContext, "createHtmlAdSessionContext(...)");
        if (b10 == 1) {
            impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
        } else if (b10 == 2) {
            impressionType = ImpressionType.UNSPECIFIED;
        } else if (b10 == 3) {
            impressionType = ImpressionType.LOADED;
        } else if (b10 == 4) {
            impressionType = ImpressionType.BEGIN_TO_RENDER;
        } else if (b10 == 5) {
            impressionType = ImpressionType.ONE_PIXEL;
        } else if (b10 == 6) {
            impressionType = ImpressionType.VIEWABLE;
        } else if (b10 == 7) {
            impressionType = ImpressionType.AUDIBLE;
        } else {
            impressionType = b10 == 0 ? ImpressionType.OTHER : ImpressionType.OTHER;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -284840886) {
            if (iHashCode != 93166550) {
                if (iHashCode != 112202875) {
                    if (iHashCode == 1425678798 && str.equals("nonvideo")) {
                        return new C2959jf("html_display_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, false);
                    }
                } else if (str.equals("video")) {
                    return new C2959jf("html_video_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, z10);
                }
            } else if (str.equals("audio")) {
                return new C2959jf("html_audio_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, z10);
            }
        } else if (str.equals("unknown")) {
            ck.p.i("vf", "access$getTAG$cp(...)");
            return null;
        }
        ck.p.i("vf", "access$getTAG$cp(...)");
        return null;
    }
}
