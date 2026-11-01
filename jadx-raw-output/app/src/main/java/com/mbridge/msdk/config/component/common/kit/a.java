package com.mbridge.msdk.config.component.common.kit;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.omsdk.b;
import java.util.Iterator;

/* JADX INFO: compiled from: OmSdkKit.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdSession f33074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdEvents f33075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaEvents f33076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a f33077d;

    private void e() {
    }

    private void i() {
    }

    public void a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.f33077d = aVar;
        a(str);
    }

    private void b() {
        if (this.f33076c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSDKResume");
            this.f33076c.resume();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void c() {
        if (this.f33076c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkBuffEnd");
            this.f33076c.bufferFinish();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void d() {
        if (this.f33076c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkBuffStart");
            this.f33076c.bufferStart();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void f() {
        if (this.f33076c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkClick");
            this.f33076c.adUserInteraction(InteractionType.CLICK);
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void g() {
        if (this.f33074a != null) {
            try {
                q0.b("OMSDK_TAG", "onOMSdkDestory");
                this.f33074a.removeAllFriendlyObstructions();
                this.f33074a.finish();
                this.f33074a = null;
            } catch (Exception e10) {
                q0.b("OmSdkKit", e10.getMessage(), e10);
            }
        }
    }

    private void h() {
        if (this.f33076c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkPause");
            this.f33076c.pause();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void j() {
        if (this.f33076c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkSkipped");
            this.f33076c.skipped();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void k() {
        if (this.f33074a != null) {
            try {
                q0.b("OMSDK_TAG", "onOMSdkStart");
                this.f33074a.start();
                if (this.f33075b != null) {
                    this.f33075b.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                    this.f33075b.impressionOccurred();
                }
                com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f33077d;
                if (aVar != null && !aVar.d()) {
                    Object objB = this.f33077d.b("viewTag");
                    Object objB2 = this.f33077d.b("rootView");
                    if ((objB instanceof String) && (objB2 instanceof ViewGroup)) {
                        String strValueOf = String.valueOf(objB);
                        ViewGroup viewGroup = (ViewGroup) objB2;
                        this.f33074a.registerAdView(viewGroup.findViewWithTag(strValueOf));
                        Iterator<View> it = c.a(viewGroup, strValueOf).iterator();
                        while (it.hasNext()) {
                            this.f33074a.addFriendlyObstruction(it.next(), FriendlyObstructionPurpose.OTHER, null);
                        }
                    }
                }
            } catch (Exception e10) {
                q0.b("OmSdkKit", e10.getMessage(), e10);
            }
        }
    }

    private void a(String str) {
        if (this.f33077d == null) {
        }
        str.hashCode();
        switch (str) {
            case "onDestroy":
                g();
                break;
            case "PlayerPlayPlaying":
                b();
                break;
            case "PlayerPlayPause":
                h();
                break;
            case "PlayerPlayStart":
                k();
                break;
            case "onAdClick":
                f();
                break;
            case "onBufferingEnd":
                c();
                break;
            case "onCreate":
                a();
                break;
            case "PlayerPlayMuteChanged":
                e();
                break;
            case "PlayerProgressChanged":
                i();
                break;
            case "onBufferingStart":
                d();
                break;
            case "skipped":
                j();
                break;
        }
    }

    private void a() {
        try {
            if (this.f33077d.a((Object) "global")) {
                Object objB = this.f33077d.b("global");
                if (objB instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objB;
                    AdSession adSessionA = b.a(com.mbridge.msdk.foundation.controller.c.n().d(), false, String.valueOf(aVar.b(CampaignEx.KEY_OMID)), String.valueOf(aVar.b("requestId")), String.valueOf(aVar.b("id")), String.valueOf(aVar.b("campaignUnitId")), String.valueOf(aVar.b("videoURL")), String.valueOf(aVar.b("requestNoticeId")));
                    this.f33074a = adSessionA;
                    if (adSessionA != null) {
                        this.f33075b = AdEvents.createAdEvents(adSessionA);
                        this.f33076c = MediaEvents.createMediaEvents(this.f33074a);
                    }
                }
            }
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }
}
