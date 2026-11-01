package com.bytedance.sdk.openadsdk.jqy;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.G5;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public ouw f13214lh;
    public vt ouw;
    public yu vt;
    private final String fkw = "StrategyCenter";
    public int yu = 0;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private Runnable f13213le = new Runnable() { // from class: com.bytedance.sdk.openadsdk.jqy.lh.2
        @Override // java.lang.Runnable
        public final void run() {
            final lh lhVar = lh.this;
            yu yuVar = lhVar.vt;
            if (yuVar == null || yuVar.fkw() == null || lhVar.vt.le() == null) {
                return;
            }
            lhVar.vt.ouw().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jqy.lh.1
                @Override // java.lang.Runnable
                public final void run() {
                    lh lhVar2 = lh.this;
                    lhVar2.yu++;
                    try {
                        ouw ouwVar = lhVar2.f13214lh;
                        if (ouwVar != null) {
                            ouwVar.ouw();
                        }
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(lh.this.vt.fkw()).openConnection();
                        if (lh.this.vt.ra() != null && lh.this.vt.ra().size() > 0) {
                            for (Map.Entry<String, String> entry : lh.this.vt.ra().entrySet()) {
                                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                            }
                        }
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setRequestProperty("Content-Type", G5.L);
                        OutputStream outputStreamUrlConnectionGetOutputStream = null;
                        try {
                            outputStreamUrlConnectionGetOutputStream = PangleNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
                            outputStreamUrlConnectionGetOutputStream.write(lh.this.vt.le().toString().getBytes());
                            outputStreamUrlConnectionGetOutputStream.close();
                            int iHttpUrlConnectionGetResponseCode = PangleNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                            Log.i("StrategyCenter", "executing strategy fetch");
                            if (iHttpUrlConnectionGetResponseCode == 200) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(PangleNetworkBridge.urlConnectionGetInputStream(httpURLConnection)));
                                StringBuffer stringBuffer = new StringBuffer();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    } else {
                                        stringBuffer.append(line);
                                    }
                                }
                                bufferedReader.close();
                                JSONObject jSONObjectOuw = lh.this.vt.ouw(PangleVideoBridge.jsonObjectInit(stringBuffer.toString()));
                                SharedPreferences sharedPreferencesOuw = lh.this.ouw.ouw();
                                if (sharedPreferencesOuw != null) {
                                    SharedPreferences.Editor editorEdit = sharedPreferencesOuw.edit();
                                    editorEdit.clear();
                                    editorEdit.commit();
                                }
                                lh.this.ouw.ouw(jSONObjectOuw);
                                ouw ouwVar2 = lh.this.f13214lh;
                                if (ouwVar2 != null) {
                                    ouwVar2.vt();
                                }
                            } else {
                                ouw ouwVar3 = lh.this.f13214lh;
                                if (ouwVar3 != null) {
                                    httpURLConnection.getResponseMessage();
                                    ouwVar3.lh();
                                }
                            }
                            vt vtVar = lh.this.ouw;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                SharedPreferences sharedPreferencesOuw2 = vtVar.ouw();
                                if (sharedPreferencesOuw2 != null) {
                                    SharedPreferences.Editor editorEdit2 = sharedPreferencesOuw2.edit();
                                    editorEdit2.putLong("local_last_update_time", jCurrentTimeMillis);
                                    editorEdit2.apply();
                                }
                            } catch (Throwable th2) {
                                Log.e("SPUnit", th2.getMessage());
                            }
                            lh.this.ouw();
                        } catch (Throwable th3) {
                            if (outputStreamUrlConnectionGetOutputStream != null) {
                                outputStreamUrlConnectionGetOutputStream.close();
                            }
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        Log.e("StrategyCenter", th4.getMessage() == null ? "error " : th4.getMessage());
                        ouw ouwVar4 = lh.this.f13214lh;
                        if (ouwVar4 != null) {
                            th4.getMessage();
                            ouwVar4.lh();
                        }
                    }
                }
            });
        }
    };

    public final void ouw() {
        if (this.vt != null) {
            int i10 = 3600000;
            int iOuw = this.ouw.ouw("req_interval", 3600000);
            long jOuw = this.ouw.ouw("local_last_update_time");
            if (iOuw >= 600000 && iOuw <= 86400000) {
                i10 = iOuw;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - jOuw;
            Log.i("StrategyCenter", "before  realInterval=".concat(String.valueOf(jCurrentTimeMillis)));
            long j10 = 0;
            if (jCurrentTimeMillis >= 0) {
                long j11 = i10;
                if (jCurrentTimeMillis <= j11) {
                    j10 = j11 - jCurrentTimeMillis;
                }
            }
            Log.i("StrategyCenter", "after  realInterval=".concat(String.valueOf(j10)));
            this.vt.yu().removeCallbacks(this.f13213le);
            if (this.yu > 24) {
                return;
            }
            this.vt.yu().postDelayed(this.f13213le, j10);
        }
    }

    public lh(yu yuVar) {
        this.ouw = null;
        fkw fkwVar = new fkw(yuVar);
        this.vt = fkwVar;
        String strLh = fkwVar.lh();
        if (!TextUtils.isEmpty(strLh) && !strLh.startsWith("pag")) {
            strLh = "pag_".concat(strLh);
        }
        this.ouw = new vt(this.vt.vt(), strLh);
    }

    public final String ouw(String str, String str2) {
        vt vtVar = this.ouw;
        return vtVar == null ? str2 : vtVar.ouw(str, str2);
    }
}
