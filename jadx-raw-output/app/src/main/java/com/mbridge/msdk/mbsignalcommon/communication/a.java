package com.mbridge.msdk.mbsignalcommon.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseCommonBannerSignalCommunicationImp.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f36065a = "a";

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void a(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void handlerH5Exception(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void install(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void c(Object obj, String str) {
        try {
            if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
                f.a().a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f36112b);
            }
        } catch (Throwable th2) {
            q0.b(f36065a, "onSignalCommunication", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void b(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (!TextUtils.isEmpty(str)) {
            if (contextD == null) {
                try {
                    if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f36112b) != null) {
                        contextD = windVaneWebView.getContext();
                    }
                } catch (Exception unused) {
                }
            }
            if (contextD == null) {
                f.a().b(obj, d.a(1));
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", m0.s(contextD));
                String string = jSONObject.toString();
                if (!TextUtils.isEmpty(string)) {
                    string = Base64.encodeToString(string.getBytes(), 2);
                }
                f.a().b(obj, string);
            } catch (Throwable unused2) {
                f.a().b(obj, d.a(1));
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void increaseOfferFrequence(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                d.a(obj, new JSONObject(str));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (!TextUtils.isEmpty(str)) {
            if (contextD == null) {
                try {
                    if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f36112b) != null) {
                        contextD = windVaneWebView.getContext();
                    }
                } catch (Exception unused) {
                }
            }
            if (contextD == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("url");
                int iOptInt = jSONObject.optInt("type");
                if (iOptInt == 1) {
                    com.mbridge.msdk.click.c.c(contextD, strOptString);
                } else if (iOptInt == 2) {
                    com.mbridge.msdk.click.c.e(contextD, strOptString);
                }
            } catch (Throwable unused2) {
            }
        }
    }
}
