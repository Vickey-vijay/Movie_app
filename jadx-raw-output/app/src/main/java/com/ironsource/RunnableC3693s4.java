package com.ironsource;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class RunnableC3693s4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f30719a;

    public RunnableC3693s4(JSONObject jSONObject) {
        ck.p.j(jSONObject, "stringToSend");
        this.f30719a = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("preparing to send crashes report");
            URLConnection uRLConnectionOpenConnection = new URL(C3676r4.d().f30604h).openConnection();
            ck.p.h(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            httpURLConnection.setRequestProperty(com.safedk.android.utils.k.f45009b, G5.L);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(IronSourceNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
            dataOutputStream.writeBytes(this.f30719a.toString());
            dataOutputStream.flush();
            dataOutputStream.close();
            Log.i("STATUS", String.valueOf(IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection)));
            Log.i("MSG", httpURLConnection.getResponseMessage());
            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            ironLog.verbose("sent crash report for type " + this.f30719a.get(Z7.f27994n) + " and date " + this.f30719a.get(Z7.f27992l));
        } catch (Exception e10) {
            IronLog.INTERNAL.error(e10.toString());
        }
    }
}
