package com.bytedance.sdk.component.ra.vt;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.jg;
import com.bytedance.sdk.component.vt.ouw.ko;
import com.bytedance.sdk.component.vt.ouw.le;
import com.bytedance.sdk.component.vt.ouw.mwh;
import com.bytedance.sdk.component.vt.ouw.ra;
import com.bytedance.sdk.component.vt.ouw.ryl;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class vt extends lh {
    public static final com.bytedance.sdk.component.vt.ouw.ouw ouw;
    public static final com.bytedance.sdk.component.vt.ouw.ouw vt;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private com.bytedance.sdk.component.vt.ouw.ouw f11914cf;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f11915lh;
    private Map<String, String> ryl;

    public final void ouw(final com.bytedance.sdk.component.ra.ouw.ouw ouwVar) {
        try {
            ryl.ouw ouwVar2 = new ryl.ouw();
            if (this.f11915lh) {
                ouwVar2.ouw(this.bly);
            } else {
                ra.ouw ouwVar3 = new ra.ouw();
                Uri uri = Uri.parse(this.bly);
                ouwVar3.ouw(uri.getScheme());
                ouwVar3.vt(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    ouwVar3.lh(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.ryl.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.ryl.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        ouwVar3.ouw(strEncode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                ouwVar2.f11957lh = ouwVar3.vt();
            }
            ouw(ouwVar2);
            ouwVar2.ouw = this.f11914cf;
            ouwVar2.fkw = yu();
            if (!TextUtils.isEmpty(this.f11910le)) {
                ouwVar2.pno = this.f11910le;
            }
            int i10 = this.f11911ra;
            if (i10 > 0) {
                ouwVar2.f11958ra = i10;
            }
            this.yu.ouw(ouwVar2.ouw("GET", (mwh) null).ouw()).ouw(new com.bytedance.sdk.component.vt.ouw.lh() { // from class: com.bytedance.sdk.component.ra.vt.vt.1
                @Override // com.bytedance.sdk.component.vt.ouw.lh
                public final void ouw(IOException iOException) {
                    com.bytedance.sdk.component.ra.ouw.ouw ouwVar4 = ouwVar;
                    if (ouwVar4 != null) {
                        ouwVar4.ouw(vt.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.vt.ouw.lh
                public final void ouw(jg jgVar) throws IOException {
                    if (ouwVar != null) {
                        HashMap map = new HashMap();
                        if (jgVar != null) {
                            le leVarFkw = jgVar.fkw();
                            for (int i11 = 0; i11 < leVarFkw.ouw.length / 2; i11++) {
                                map.put(leVarFkw.ouw(i11), leVarFkw.vt(i11));
                            }
                            ko koVarYu = jgVar.yu();
                            ouwVar.ouw(vt.this, new com.bytedance.sdk.component.ra.vt(jgVar.vt(), jgVar.ouw(), jgVar.lh(), map, koVarYu == null ? "" : koVarYu.vt(), 0L, 0L));
                        }
                    }
                }
            });
        } catch (Throwable th2) {
            if (com.bytedance.sdk.component.ra.lh.yu.ouw()) {
                th2.printStackTrace();
            }
            ouwVar.ouw(this, new IOException(th2.getMessage()));
        }
    }

    static {
        com.bytedance.sdk.component.vt.ouw.ouw.C0101ouw c0101ouw = new com.bytedance.sdk.component.vt.ouw.ouw.C0101ouw();
        c0101ouw.ouw = true;
        ouw = c0101ouw.ouw();
        vt = new com.bytedance.sdk.component.vt.ouw.ouw.C0101ouw().ouw();
    }

    public vt(cf cfVar) {
        super(cfVar);
        this.f11914cf = ouw;
        this.f11915lh = false;
        this.ryl = new HashMap();
    }

    public final com.bytedance.sdk.component.ra.vt ouw() {
        try {
            ryl.ouw ouwVar = new ryl.ouw();
            String strVt = "";
            if (this.f11915lh) {
                ouwVar.ouw(this.bly);
            } else {
                ra.ouw ouwVar2 = new ra.ouw();
                Uri uri = Uri.parse(this.bly);
                ouwVar2.ouw(uri.getScheme());
                ouwVar2.vt(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    ouwVar2.lh(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.ryl.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.ryl.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        ouwVar2.ouw(strEncode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                ouwVar.f11957lh = ouwVar2.vt();
            }
            ouw(ouwVar);
            ouwVar.ouw = this.f11914cf;
            ouwVar.fkw = yu();
            jg jgVarVt = this.yu.ouw(ouwVar.ouw("GET", (mwh) null).ouw()).vt();
            if (jgVarVt != null) {
                HashMap map = new HashMap();
                le leVarFkw = jgVarVt.fkw();
                for (int i10 = 0; i10 < leVarFkw.ouw.length / 2; i10++) {
                    map.put(leVarFkw.ouw(i10), leVarFkw.vt(i10));
                }
                ko koVarYu = jgVarVt.yu();
                if (koVarYu != null) {
                    strVt = koVarYu.vt();
                }
                return new com.bytedance.sdk.component.ra.vt(jgVarVt.vt(), jgVarVt.ouw(), jgVarVt.lh(), map, strVt, 0L, 0L);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return null;
    }
}
