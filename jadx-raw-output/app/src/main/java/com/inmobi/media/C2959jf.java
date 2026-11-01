package com.inmobi.media;

import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2959jf implements InterfaceC2845f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImpressionType f24609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdSessionContext f24610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f24612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AdSession f24613f;

    public static boolean a(byte b10, byte b11) {
        if (b10 == b11) {
            return true;
        }
        mj.g gVar = P9.f23321a;
        P9.a(new L2(new Exception("Omid AdSession State Error currentState :: " + ((int) b10) + ", expectedState :: " + ((int) b11))));
        return false;
    }

    public C2959jf(String str, ImpressionType impressionType, AdSessionContext adSessionContext, boolean z10) {
        ck.p.j(str, "mAdSessionType");
        ck.p.j(impressionType, "impressionType");
        this.f24608a = str;
        this.f24609b = impressionType;
        this.f24610c = adSessionContext;
        this.f24611d = z10;
    }

    public static boolean a(byte b10) {
        if (b10 > 0) {
            return true;
        }
        mj.g gVar = P9.f23321a;
        P9.a(new L2(new Exception("Omid AdSession State Error currentState :: " + ((int) b10) + ", expectedState :: 1")));
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    public final void a(WebView webView, Map map) {
        AdSession adSession;
        AdSession adSession2;
        CreativeType creativeType;
        Owner owner;
        CreativeType creativeType2;
        ck.p.j(webView, "trackingView");
        if (this.f24613f == null) {
            boolean z10 = this.f24611d;
            Owner owner2 = Owner.JAVASCRIPT;
            CreativeType creativeType3 = CreativeType.DEFINED_BY_JAVASCRIPT;
            switch (this.f24608a) {
                case "native_display_ad":
                    owner2 = Owner.NATIVE;
                    owner = Owner.NONE;
                    creativeType = CreativeType.NATIVE_DISPLAY;
                    break;
                case "html_display_ad":
                    owner = Owner.NONE;
                    creativeType = CreativeType.HTML_DISPLAY;
                    break;
                case "native_video_ad":
                    owner2 = Owner.NATIVE;
                    creativeType2 = CreativeType.VIDEO;
                    creativeType = creativeType2;
                    owner = owner2;
                    break;
                case "html_audio_ad":
                    creativeType2 = CreativeType.AUDIO;
                    creativeType = creativeType2;
                    owner = owner2;
                    break;
                case "html_video_ad":
                    creativeType2 = CreativeType.VIDEO;
                    creativeType = creativeType2;
                    owner = owner2;
                    break;
                default:
                    creativeType = creativeType3;
                    owner = null;
                    break;
            }
            AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, this.f24609b, owner2, owner, z10), this.f24610c);
            ck.p.i(adSessionCreateAdSession, "createAdSession(...)");
            this.f24613f = adSessionCreateAdSession;
            if (adSessionCreateAdSession != null) {
                String str = this.f24608a;
                ck.p.j(adSessionCreateAdSession, "adSession");
                if (ck.p.e(str, "native_video_ad")) {
                    MediaEvents.createMediaEvents(adSessionCreateAdSession);
                    AdEvents.createAdEvents(adSessionCreateAdSession);
                } else {
                    AdEvents.createAdEvents(adSessionCreateAdSession);
                }
                this.f24612e = (byte) 1;
            }
        }
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (a(this.f24612e, (byte) 1) && (adSession2 = this.f24613f) != null) {
            adSession2.registerAdView(webView);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) entry.getKey();
                FriendlyObstructionPurpose friendlyObstructionPurpose = (FriendlyObstructionPurpose) entry.getValue();
                ck.p.j(view, "childView");
                ck.p.j(friendlyObstructionPurpose, "obstructionCode");
                if (a(this.f24612e) && (adSession = this.f24613f) != null) {
                    adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
                }
            }
        }
        if (a(this.f24612e, (byte) 1)) {
            AdSession adSession3 = this.f24613f;
            if (adSession3 != null) {
                adSession3.start();
            }
            this.f24612e = (byte) 2;
        }
    }
}
