package com.bytedance.sdk.component.vt.ouw.ouw.ouw;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.jg;
import com.bytedance.sdk.component.vt.ouw.mwh;
import com.bytedance.sdk.component.vt.ouw.ryl;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class vt implements com.bytedance.sdk.component.vt.ouw.vt {
    private static List<Object> yu;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private AtomicBoolean f11947lh = new AtomicBoolean(false);
    public ryl ouw;
    public com.bytedance.sdk.component.vt.ouw.yu vt;

    @Override // com.bytedance.sdk.component.vt.ouw.vt
    public final ryl ouw() {
        return this.ouw;
    }

    static {
        try {
            yu = new ArrayList();
            Class<?> cls = Class.forName("com.android.okhttp.Protocol");
            Enum enumValueOf = Enum.valueOf(cls, "HTTP_1_1");
            if (enumValueOf != null) {
                yu.add(enumValueOf);
            }
            Enum enumValueOf2 = Enum.valueOf(cls, "HTTP_2");
            if (enumValueOf2 != null) {
                yu.add(enumValueOf2);
            }
        } catch (Throwable th2) {
            ko.fkw("get protocol error", th2.getMessage());
        }
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new vt(this.ouw, this.vt);
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt
    public final void lh() {
        this.f11947lh.set(true);
    }

    public final jg ouw(ryl rylVar) throws IOException {
        return ouw(rylVar, com.bytedance.sdk.component.ra.ouw.yu());
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt
    public final jg vt() throws IOException {
        List<com.bytedance.sdk.component.vt.ouw.pno> list;
        com.bytedance.sdk.component.lh.ouw.ouw ouwVar;
        ryl rylVar = this.ouw;
        if (rylVar != null && (ouwVar = rylVar.vt) != null) {
            if (ouwVar.vt == 0) {
                ouwVar.vt = SystemClock.elapsedRealtime();
            }
            this.ouw.vt.f11862lh = SystemClock.elapsedRealtime();
        }
        this.vt.yu().remove(this);
        this.vt.fkw().add(this);
        com.bytedance.sdk.component.vt.ouw.yu yuVar = this.vt;
        if ((yuVar instanceof le) && (yuVar.yu().size() + this.vt.fkw().size() > this.vt.vt() || this.f11947lh.get())) {
            this.vt.fkw().remove(this);
            return new pno(pno.ouw, "Maximum number of requests exceeded", this.ouw);
        }
        try {
            cf cfVar = this.ouw.ouw;
            if (cfVar == null || (list = cfVar.ouw) == null || list.size() <= 0) {
                return ouw(this.ouw);
            }
            ArrayList arrayList = new ArrayList(this.ouw.ouw.ouw);
            arrayList.add(new com.bytedance.sdk.component.vt.ouw.pno() { // from class: com.bytedance.sdk.component.vt.ouw.ouw.ouw.vt.1
                @Override // com.bytedance.sdk.component.vt.ouw.pno
                public final jg ouw(com.bytedance.sdk.component.vt.ouw.pno.ouw ouwVar2) throws IOException {
                    return vt.this.ouw(ouwVar2.ouw());
                }
            });
            return ((com.bytedance.sdk.component.vt.ouw.pno) arrayList.get(0)).ouw(new lh(arrayList, this.ouw));
        } catch (Throwable th2) {
            throw new IOException(th2.getMessage());
        }
    }

    public vt(ryl rylVar, com.bytedance.sdk.component.vt.ouw.yu yuVar) {
        this.ouw = rylVar;
        this.vt = yuVar;
    }

    private jg ouw(ryl rylVar, boolean z10) throws IOException {
        String strOuw;
        jg jgVarOuw;
        ryl rylVar2;
        ryl rylVar3;
        byte[] bArr;
        int iHttpUrlConnectionGetResponseCode = pno.ouw;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(rylVar.vt().ouw().toString()).openConnection();
                if (z10) {
                    try {
                        if (!"setting".equals(rylVar.le()) && !"gecko".equals(rylVar.le()) && !"load_ug_t".equals(rylVar.le())) {
                            try {
                                Field declaredField = httpURLConnection2.getClass().getDeclaredField("delegate");
                                declaredField.setAccessible(true);
                                Object obj = declaredField.get(httpURLConnection2);
                                Field declaredField2 = obj.getClass().getDeclaredField("client");
                                declaredField2.setAccessible(true);
                                Object obj2 = declaredField2.get(obj);
                                if (yu.size() == 2) {
                                    obj2.getClass().getDeclaredMethod("setProtocols", List.class).invoke(obj2, yu);
                                }
                            } catch (Throwable th2) {
                                ko.fkw("openHttp2 error", th2.getMessage());
                            }
                        }
                    } catch (IOException e10) {
                        e = e10;
                        httpURLConnection = httpURLConnection2;
                        if (iHttpUrlConnectionGetResponseCode == -1 && z10) {
                            jgVarOuw = ouw(rylVar, false);
                        } else {
                            strOuw = ouw(httpURLConnection, e);
                            this.vt.fkw().remove(this);
                            return new pno(iHttpUrlConnectionGetResponseCode, strOuw, rylVar);
                        }
                    } catch (Exception e11) {
                        e = e11;
                        httpURLConnection = httpURLConnection2;
                        strOuw = ouw(httpURLConnection, e);
                        this.vt.fkw().remove(this);
                    }
                }
                if (rylVar.yu() != null && rylVar.yu().size() > 0) {
                    for (Map.Entry<String, List<String>> entry : rylVar.yu().entrySet()) {
                        String key = entry.getKey();
                        for (String str : entry.getValue()) {
                            if ("_disable_retry".equals(key) && "1".equals(str)) {
                                try {
                                    Field declaredField3 = httpURLConnection2.getClass().getDeclaredField("delegate");
                                    declaredField3.setAccessible(true);
                                    Object obj3 = declaredField3.get(httpURLConnection2);
                                    Field declaredField4 = obj3.getClass().getDeclaredField("client");
                                    declaredField4.setAccessible(true);
                                    Object obj4 = declaredField4.get(obj3);
                                    obj4.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(obj4, Boolean.FALSE);
                                } catch (Exception unused) {
                                }
                            } else {
                                httpURLConnection2.addRequestProperty(key, str);
                            }
                        }
                    }
                }
                cf cfVar = rylVar.ouw;
                if (cfVar != null) {
                    TimeUnit timeUnit = cfVar.f11935lh;
                    if (timeUnit != null) {
                        httpURLConnection2.setConnectTimeout((int) timeUnit.toMillis(cfVar.vt));
                    }
                    cf cfVar2 = rylVar.ouw;
                    if (cfVar2.f11935lh != null) {
                        httpURLConnection2.setReadTimeout((int) cfVar2.fkw.toMillis(cfVar2.yu));
                    }
                }
                if (rylVar.pno() == null) {
                    httpURLConnection2.setRequestMethod("GET");
                } else {
                    if (!(this.ouw.yu() == null ? false : this.ouw.yu().containsKey("Content-Type")) && rylVar.pno().f11941lh != null) {
                        httpURLConnection2.addRequestProperty("Content-Type", rylVar.pno().f11941lh.ouw);
                    }
                    httpURLConnection2.setRequestMethod(rylVar.lh());
                    if ("POST".equalsIgnoreCase(rylVar.lh())) {
                        OutputStream outputStreamUrlConnectionGetOutputStream = PangleNetworkBridge.urlConnectionGetOutputStream(httpURLConnection2);
                        mwh mwhVarPno = rylVar.pno();
                        if (mwhVarPno != null && (rylVar3 = this.ouw) != null && "POST".equalsIgnoreCase(rylVar3.lh()) && mwhVarPno.f11940le == mwh.ouw.BYTE_ARRAY_TYPE && (bArr = mwhVarPno.fkw) != null && bArr.length > 0) {
                            outputStreamUrlConnectionGetOutputStream.write(rylVar.pno().fkw);
                        } else {
                            mwh mwhVarPno2 = rylVar.pno();
                            if ((mwhVarPno2 == null || (rylVar2 = this.ouw) == null || !"POST".equalsIgnoreCase(rylVar2.lh()) || mwhVarPno2.f11940le != mwh.ouw.STRING_TYPE || TextUtils.isEmpty(mwhVarPno2.yu)) ? false : true) {
                                outputStreamUrlConnectionGetOutputStream.write(rylVar.pno().yu.getBytes());
                            }
                        }
                        outputStreamUrlConnectionGetOutputStream.flush();
                        outputStreamUrlConnectionGetOutputStream.close();
                    }
                }
                com.bytedance.sdk.component.lh.ouw.ouw ouwVar = rylVar.vt;
                if (ouwVar != null) {
                    ouwVar.yu = SystemClock.elapsedRealtime();
                }
                httpURLConnection2.connect();
                com.bytedance.sdk.component.lh.ouw.ouw ouwVar2 = rylVar.vt;
                if (ouwVar2 != null) {
                    ouwVar2.fkw = SystemClock.elapsedRealtime();
                }
                iHttpUrlConnectionGetResponseCode = PangleNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection2);
                com.bytedance.sdk.component.lh.ouw.ouw ouwVar3 = rylVar.vt;
                if (ouwVar3 != null) {
                    ouwVar3.f11861le = SystemClock.elapsedRealtime();
                }
                if (this.f11947lh.get()) {
                    PangleNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection2);
                    this.vt.fkw().remove(this);
                    strOuw = "internal error";
                    return new pno(iHttpUrlConnectionGetResponseCode, strOuw, rylVar);
                }
                jgVarOuw = new pno(httpURLConnection2, rylVar);
                this.vt.fkw().remove(this);
                return jgVarOuw;
            } catch (Throwable th3) {
                this.vt.fkw().remove(this);
                throw th3;
            }
        } catch (IOException e12) {
            e = e12;
        } catch (Exception e13) {
            e = e13;
        }
    }

    private static String ouw(HttpURLConnection httpURLConnection, Exception exc) {
        try {
            return httpURLConnection.getErrorStream().toString();
        } catch (Throwable unused) {
            return exc.getMessage();
        }
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt
    public final void ouw(final com.bytedance.sdk.component.vt.ouw.lh lhVar) {
        com.bytedance.sdk.component.lh.ouw.ouw ouwVar;
        ryl rylVar = this.ouw;
        if (rylVar != null && (ouwVar = rylVar.vt) != null) {
            ouwVar.vt = SystemClock.elapsedRealtime();
        }
        this.vt.lh().submit(new com.bytedance.sdk.component.pno.lh.vt(this.ouw.ra(), this.ouw.le()) { // from class: com.bytedance.sdk.component.vt.ouw.ouw.ouw.vt.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    jg jgVarVt = vt.this.vt();
                    if (jgVarVt == null) {
                        lhVar.ouw(new IOException("response is null"));
                    } else {
                        lhVar.ouw(jgVarVt);
                    }
                } catch (IOException e10) {
                    e10.printStackTrace();
                    lhVar.ouw(e10);
                }
            }
        });
    }
}
