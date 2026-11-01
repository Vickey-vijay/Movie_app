package com.fyber.inneractive.sdk.ignite;

import android.text.TextUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.v;
import com.fyber.inneractive.sdk.flow.w;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends IIgniteServiceCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f15799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f15800b;

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
        JSONObject jSONObjectOptJSONObject;
        IAlog.a("InstallCallback onProgress %s", str);
        try {
            String strA = a(str);
            JSONObject jSONObjectOptJSONObject2 = new JSONObject(str).optJSONObject("data");
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("progress")) == null) {
                return;
            }
            int iOptInt = jSONObjectOptJSONObject.optInt("action");
            double dOptDouble = jSONObjectOptJSONObject.optDouble("value");
            r rVar = this.f15799a;
            if (rVar != null) {
                rVar.a(strA, iOptInt, dOptDouble);
            }
        } catch (Exception unused) {
            IAlog.a("Failed to resolve progress data", new Object[0]);
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
        String strOptString;
        IAlog.a("InstallCallback onScheduled %s", str);
        try {
            String strA = a(str);
            try {
                strOptString = new JSONObject(str).getJSONObject("application").optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
            } catch (Exception unused) {
                strOptString = null;
            }
            r rVar = this.f15799a;
            if (rVar != null) {
                rVar.a(strA, strOptString);
            }
        } catch (Exception unused2) {
            IAlog.a("Failed to resolve taskId", new Object[0]);
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
        IAlog.a("InstallCallback onStart %s", str);
        if (this.f15799a != null) {
            this.f15799a.a(a(str));
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        IAlog.a("InstallCallback onSuccess %s", str);
        if (this.f15799a != null) {
            this.f15799a.b(a(str));
            c cVar = this.f15800b;
            if (cVar != null) {
                h hVar = cVar.f15773b;
                String str2 = cVar.f15772a.f15777a;
                hVar.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    IAConfigManager.O.f15024s.a(new z0(new f(str2), str2));
                }
                g gVar = cVar.f15772a;
                w wVar = gVar.f15778b;
                m mVar = gVar.f15779c;
                v vVar = wVar.f15727h;
                u uVar = u.IGNITE_FLOW_INSTALL_DONE;
                if (mVar == null) {
                    mVar = m.SINGLE_TAP;
                }
                vVar.a(uVar, mVar);
            }
        }
    }

    public static String a(String str) {
        try {
            return new JSONObject(str).optString("taskId");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        String strOptString;
        IAlog.a("InstallCallback onError %s", str);
        if (this.f15799a != null) {
            String strA = a(str);
            String strOptString2 = null;
            try {
                JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("data");
                strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("message") : null;
            } catch (Exception unused) {
            }
            try {
                JSONObject jSONObjectOptJSONObject2 = new JSONObject(str).optJSONObject("data");
                if (jSONObjectOptJSONObject2 != null) {
                    strOptString2 = jSONObjectOptJSONObject2.optString("code");
                }
            } catch (Exception unused2) {
            }
            this.f15799a.a(strA, strOptString, strOptString2);
        }
    }

    public s(e eVar, c cVar) {
        this.f15799a = eVar;
        this.f15800b = cVar;
    }
}
