package com.applovin.impl;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.ScriptInjector;
import com.iab.omid.library.applovin.adsession.Partner;
import com.ironsource.C3426d4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f7758b = com.applovin.impl.sdk.k.o();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f7759c;

    public String a() {
        return this.f7759c;
    }

    public Partner b() {
        return Partner.createPartner((String) this.f7757a.a(x4.f9883b0), AppLovinSdk.VERSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.f7759c != null) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f7758b.getResources().openRawResource(R.raw.omsdk_v1_5_3)));
            try {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            this.f7759c = sb2.toString();
                            bufferedReader.close();
                            return;
                        }
                        sb2.append(line);
                    }
                } catch (Throwable th2) {
                    try {
                        Log.e("OpenMeasurementService", "Failed to load JavaScript Open Measurement SDK", th2);
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e10) {
                            Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e10);
                        }
                        throw th3;
                    }
                }
            } catch (IOException e11) {
                Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e11);
            }
        } catch (Throwable th4) {
            this.f7757a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7757a.O().a("OpenMeasurementService", "Failed to retrieve resource omsdk_v1_5_3.js", th4);
            }
        }
    }

    private void h() {
        this.f7757a.q0().a((i5) new r6(this.f7757a, "OpenMeasurementService", new Runnable() { // from class: com.applovin.impl.eb
            @Override // java.lang.Runnable
            public final void run() {
                this.f7449b.f();
            }
        }), d6.b.OTHER);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public String a(String str, Map map) {
        String strInjectScriptContentIntoHtml;
        try {
            if (e()) {
                String strA = k4.a(this.f7757a, map);
                if (StringUtils.isValidString(strA)) {
                    strInjectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(strA, str);
                } else {
                    strInjectScriptContentIntoHtml = str;
                }
            } else {
                strInjectScriptContentIntoHtml = str;
            }
            return ScriptInjector.injectScriptContentIntoHtml(this.f7759c, strInjectScriptContentIntoHtml);
        } catch (Throwable th2) {
            this.f7757a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7757a.O().a("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th2);
            }
            return str;
        }
    }

    public boolean e() {
        String str = this.f7757a.n0().getExtraParameters().get("enable_omsdk_testing");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public void i() {
        if (((Boolean) this.f7757a.a(x4.f9875a0)).booleanValue()) {
            this.f7757a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7757a.O().a("OpenMeasurementService", "Initializing Open Measurement SDK v" + c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.db
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7321b.g();
                }
            });
        }
    }

    public j4(com.applovin.impl.sdk.k kVar) {
        this.f7757a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Omid.activate(this.f7758b);
        this.f7757a.O();
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVarO = this.f7757a.O();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Init ");
            if (d()) {
                str = "succeeded";
            } else {
                str = C3426d4.i.f28566t;
            }
            sb2.append(str);
            sb2.append(" and took ");
            sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb2.append("ms");
            oVarO.a("OpenMeasurementService", sb2.toString());
        }
        h();
    }

    public String c() {
        return Omid.getVersion();
    }

    public boolean d() {
        return Omid.isActive();
    }
}
