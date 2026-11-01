package com.mbridge.msdk.foundation.same.report;

import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.v;
import com.mbridge.msdk.tracker.w;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: StringReportResponseHandler.java */
/* JADX INFO: loaded from: classes10.dex */
public class n extends w {
    @Override // com.mbridge.msdk.tracker.w
    public v<String> a(q qVar) {
        String str;
        try {
            str = new String(qVar.f38221b, com.mbridge.msdk.tracker.network.toolbox.f.a(qVar.f38222c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(qVar.f38221b);
        }
        return v.a(str, com.mbridge.msdk.tracker.network.toolbox.f.a(qVar));
    }
}
