package com.mbridge.msdk.click;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;

/* JADX INFO: compiled from: DefaultAppletSchemeCallBack.java */
/* JADX INFO: loaded from: classes9.dex */
public class h extends AppletSchemeCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeListener.NativeTrackingListener f32827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CampaignEx f32828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AppletsModel f32829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f32830d;

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    public void onRequestStart() {
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    public void onRequestFailed(int i10, String str, String str2) {
        CampaignEx campaignEx = this.f32828b;
        if (campaignEx == null || this.f32829c == null) {
            return;
        }
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f32827a;
            if (nativeTrackingListener != null) {
                try {
                    nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e10.getMessage());
                    }
                }
            }
            this.f32829c.setUserClick(false);
            this.f32829c.setRequestingFinish();
            this.f32828b.setClickURL(str2);
            a aVar = this.f32830d;
            if (aVar != null) {
                try {
                    aVar.a(this.f32828b);
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e11.getMessage());
                    }
                }
            }
        } catch (Exception e12) {
            if (MBridgeConstans.DEBUG) {
                q0.b("DefaultAppletSchemeCallBack", e12.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    public void onRequestSuccess(String str) {
        CampaignEx campaignEx = this.f32828b;
        if (campaignEx == null || this.f32829c == null) {
            return;
        }
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f32827a;
            if (nativeTrackingListener != null) {
                try {
                    nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e10.getMessage());
                    }
                }
            }
            this.f32829c.setUserClick(false);
            this.f32829c.setRequestingFinish();
            this.f32828b.setDeepLinkUrl(str);
            a aVar = this.f32830d;
            if (aVar != null) {
                try {
                    aVar.a(this.f32828b);
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e11.getMessage());
                    }
                }
            }
        } catch (Exception e12) {
            if (MBridgeConstans.DEBUG) {
                q0.b("DefaultAppletSchemeCallBack", e12.getMessage());
            }
        }
    }

    public h(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        this.f32827a = nativeTrackingListener;
        this.f32828b = campaignEx;
        this.f32829c = appletsModel;
        this.f32830d = aVar;
    }
}
