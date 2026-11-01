package com.bytedance.sdk.component.vt.ouw.ouw.ouw;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.vt.ouw.jg;
import com.bytedance.sdk.component.vt.ouw.ko;
import com.bytedance.sdk.component.vt.ouw.ryl;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class pno extends jg {
    public static int ouw = -1;
    public String fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public ryl f11946lh;
    public HttpURLConnection vt;
    public int yu;

    public pno(HttpURLConnection httpURLConnection, ryl rylVar) {
        this.yu = ouw;
        this.vt = httpURLConnection;
        this.f11946lh = rylVar;
    }

    public final String toString() {
        return "";
    }

    @Override // com.bytedance.sdk.component.vt.ouw.jg
    public final com.bytedance.sdk.component.vt.ouw.le fkw() {
        if (this.vt == null) {
            return new com.bytedance.sdk.component.vt.ouw.le(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.vt.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!"Content-Range".equalsIgnoreCase(entry.getKey()) || ouw() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.vt.ouw.le((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.bytedance.sdk.component.vt.ouw.jg
    public final com.bytedance.sdk.component.vt.ouw.tlj le() {
        com.bytedance.sdk.component.lh.ouw.ouw ouwVar;
        ryl rylVar = this.f11946lh;
        if (rylVar == null || (ouwVar = rylVar.vt) == null) {
            return null;
        }
        return new com.bytedance.sdk.component.vt.ouw.tlj(ouwVar);
    }

    @Override // com.bytedance.sdk.component.vt.ouw.jg
    public final String lh() throws IOException {
        return !TextUtils.isEmpty(this.fkw) ? this.fkw : this.vt.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.vt.ouw.jg
    public final int ouw() {
        try {
            return PangleNetworkBridge.httpUrlConnectionGetResponseCode(this.vt);
        } catch (Exception unused) {
            return this.yu;
        }
    }

    @Override // com.bytedance.sdk.component.vt.ouw.jg
    public final ko yu() {
        bly blyVar;
        com.bytedance.sdk.component.lh.ouw.ouw ouwVar;
        com.bytedance.sdk.component.lh.ouw.ouw ouwVar2;
        ryl rylVar = this.f11946lh;
        if (rylVar != null && (ouwVar2 = rylVar.vt) != null) {
            ouwVar2.f11863ra = SystemClock.elapsedRealtime();
        }
        bly blyVar2 = null;
        try {
            try {
                blyVar = new bly(this.vt);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ko.yu(th2.getMessage());
            }
        } catch (Exception unused) {
            HttpURLConnection httpURLConnection = this.vt;
            blyVar = new bly(httpURLConnection, httpURLConnection.getErrorStream());
        }
        blyVar2 = blyVar;
        ryl rylVar2 = this.f11946lh;
        if (rylVar2 != null && (ouwVar = rylVar2.vt) != null) {
            ouwVar.pno = SystemClock.elapsedRealtime();
        }
        return blyVar2;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.jg, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            yu().close();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.vt.ouw.jg
    public final boolean vt() {
        if (ouw() >= 200 && ouw() < 300) {
            return true;
        }
        return false;
    }

    public pno(int i10, String str, ryl rylVar) {
        this.fkw = str;
        this.f11946lh = rylVar;
        this.yu = i10;
    }
}
