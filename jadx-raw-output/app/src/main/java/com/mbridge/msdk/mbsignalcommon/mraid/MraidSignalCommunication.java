package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class MraidSignalCommunication extends BaseMraidSignalCommunication {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f36074h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f36075g;

    public void expand(Object obj, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/mraid/MraidSignalCommunication;->expand(Ljava/lang/Object;Ljava/lang/String;)V");
        safedk_MraidSignalCommunication_expand_f6c906bf2840fad81e07cacdbd952ac0(obj, str);
        BrandSafetyUtils.onMraidExpand(g.f44969o, str, obj, "mraid.expand");
    }

    public void open(Object obj, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/mraid/MraidSignalCommunication;->open(Ljava/lang/Object;Ljava/lang/String;)V");
        safedk_MraidSignalCommunication_open_95b49e4c97dac868f09b5d1bd1efddc2(obj, str);
        BrandSafetyUtils.onMraidOpen(g.f44969o, str, obj, "mraid.open");
    }

    public void close(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f36112b, "close");
        }
        try {
            q0.b("MraidSignalCommunication", "MRAID close");
            b bVar = this.f36075g;
            if (bVar != null) {
                bVar.close();
            }
        } catch (Throwable th2) {
            q0.b("MraidSignalCommunication", "MRAID close", th2);
        }
    }

    public void safedk_MraidSignalCommunication_expand_f6c906bf2840fad81e07cacdbd952ac0(Object p10, String p11) {
        WindVaneWebView windVaneWebView;
        if (p10 instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) p10;
            windVaneWebView = aVar.f36112b;
            a.a().b(aVar.f36112b, "expand");
        } else {
            windVaneWebView = null;
        }
        try {
            JSONObject jSONObject = new JSONObject(p11);
            String p12 = jSONObject.optString("url");
            String strOptString = jSONObject.optString("shouldUseCustomClose");
            q0.b("MraidSignalCommunication", "MRAID expand " + p12 + Z7.f27998r + strOptString);
            if ((windVaneWebView != null && System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.mbridge.msdk.click.utils.a.f32945d && com.mbridge.msdk.click.utils.a.a(this.f36075g.getMraidCampaign(), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.f32944c)) || TextUtils.isEmpty(p12) || TextUtils.isEmpty(strOptString) || this.f36075g == null) {
                return;
            }
            this.f36075g.expand(p12, strOptString.toLowerCase().equals("true"));
        } catch (Throwable th2) {
            q0.b("MraidSignalCommunication", "MRAID expand", th2);
        }
    }

    public void safedk_MraidSignalCommunication_open_95b49e4c97dac868f09b5d1bd1efddc2(Object p10, String p11) {
        WindVaneWebView windVaneWebView;
        if (p10 instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) p10;
            windVaneWebView = aVar.f36112b;
            a.a().b(aVar.f36112b, "open");
        } else {
            windVaneWebView = null;
        }
        try {
            String strOptString = new JSONObject(p11).optString("url");
            String p12 = "MRAID Open " + strOptString;
            q0.b("MraidSignalCommunication", p12);
            if (this.f36075g == null || TextUtils.isEmpty(strOptString)) {
                return;
            }
            if (windVaneWebView == null || System.currentTimeMillis() - windVaneWebView.lastTouchTime <= com.mbridge.msdk.click.utils.a.f32945d || !com.mbridge.msdk.click.utils.a.a(this.f36075g.getMraidCampaign(), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.f32942a)) {
                this.f36075g.open(strOptString);
            }
        } catch (Throwable th2) {
            q0.b("MraidSignalCommunication", "MRAID Open", th2);
        }
    }

    public void setOrientationProperties(Object obj, String str) {
        String str2;
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f36112b, MRAIDPresenter.SET_ORIENTATION_PROPERTIES);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("allowOrientationChange");
            String strOptString2 = jSONObject.optString("forceOrientation");
            q0.b("MraidSignalCommunication", "MRAID setOrientationProperties");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || this.f36075g == null) {
                return;
            }
            strOptString.toLowerCase().equals("true");
            String lowerCase = strOptString2.toLowerCase();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == 729267099) {
                str2 = C3426d4.i.D;
            } else if (iHashCode != 1430647483) {
                return;
            } else {
                str2 = C3426d4.i.C;
            }
            lowerCase.equals(str2);
        } catch (Throwable th2) {
            q0.b("MraidSignalCommunication", "MRAID setOrientationProperties", th2);
        }
    }

    public void unload(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f36112b, "unload");
        }
        try {
            q0.b("MraidSignalCommunication", "MRAID unload");
            b bVar = this.f36075g;
            if (bVar != null) {
                bVar.unload();
            }
        } catch (Throwable th2) {
            q0.b("MraidSignalCommunication", "MRAID unload", th2);
        }
    }

    public void useCustomClose(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f36112b, "useCustomClose");
        }
        try {
            String strOptString = new JSONObject(str).optString("shouldUseCustomClose");
            q0.b("MraidSignalCommunication", "MRAID useCustomClose " + strOptString);
            if (TextUtils.isEmpty(strOptString) || this.f36075g == null) {
                return;
            }
            this.f36075g.useCustomClose(strOptString.toLowerCase().equals("true"));
        } catch (Throwable th2) {
            q0.b("MraidSignalCommunication", "MRAID useCustomClose", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.g
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof b) {
                this.f36075g = (b) context;
                return;
            }
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof b)) {
                this.f36075g = (b) windVaneWebView.getObject();
            }
            if (windVaneWebView.getMraidObject() != null && (windVaneWebView.getMraidObject() instanceof b)) {
                this.f36075g = (b) windVaneWebView.getMraidObject();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}
