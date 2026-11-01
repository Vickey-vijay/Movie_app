package com.bytedance.sdk.component.le.ouw.vt.vt;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.le.ouw.le;
import com.bytedance.sdk.component.le.ouw.lh.vt;
import com.bytedance.sdk.component.le.ouw.ouw.ouw.ra;
import com.bytedance.sdk.component.le.ouw.pno;
import com.bytedance.sdk.component.le.ouw.yu;
import com.ironsource.sdk.controller.f;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class ouw {
    public static le ouw;

    public static le ouw() {
        try {
            vt.ouw();
            if (ouw == null) {
                ouw = pno.vt().bly.fkw();
            }
        } catch (Exception unused) {
        }
        return ouw;
    }

    public static String vt() {
        return ra.vt + "/ad_log_event/";
    }

    public static void ouw(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar) {
        if (ouwVar == null) {
            return;
        }
        try {
            vt.ouw();
            Context context = pno.vt().ouw;
            le leVarOuw = ouw();
            vt.ouw();
            if (leVarOuw != null) {
                Uri uri = Uri.parse(vt() + "adLogDispatch?event=" + com.bytedance.sdk.component.le.ouw.ouw.ouw.le.ouw(ouwVar.le()));
                vt.ouw();
                leVarOuw.ouw(uri);
                vt.ouw();
            }
        } catch (Throwable th2) {
            th2.toString();
            vt.lh();
        }
    }

    public static String ouw(Uri uri) {
        com.bytedance.sdk.component.le.ouw.yu.ouw ouwVarLh;
        vt.ouw();
        byte b10 = 2;
        String str = uri.getPath().split("/")[2];
        str.hashCode();
        int i10 = 0;
        switch (str.hashCode()) {
            case -482705237:
                b10 = str.equals("trackAdFailed") ? (byte) 0 : (byte) -1;
                break;
            case -171493183:
                b10 = str.equals("adLogStart") ? (byte) 1 : (byte) -1;
                break;
            case 964299715:
                if (!str.equals("adLogStop")) {
                    b10 = -1;
                }
                break;
            case 1025736635:
                b10 = str.equals("adLogDispatch") ? (byte) 3 : (byte) -1;
                break;
            case 1131732929:
                b10 = str.equals("trackAdUrl") ? (byte) 4 : (byte) -1;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                com.bytedance.sdk.component.le.ouw.le.ouw.ouw().ouw(uri.getQueryParameter("did"), uri.getBooleanQueryParameter("triggerOnInit", false));
                break;
            case 1:
                vt.ouw();
                pno.vt();
                pno.lh();
                break;
            case 2:
                vt.yu();
                pno.vt();
                pno.yu();
                break;
            case 3:
                vt.yu();
                String queryParameter = uri.getQueryParameter("event");
                if (!TextUtils.isEmpty(queryParameter) && (ouwVarLh = com.bytedance.sdk.component.le.ouw.yu.ouw.ouw.lh(com.bytedance.sdk.component.le.ouw.ouw.ouw.le.vt(queryParameter))) != null) {
                    yu.ouw.ouw(ouwVarLh);
                    break;
                }
                break;
            case 4:
                vt.yu();
                try {
                    String queryParameter2 = uri.getQueryParameter("did");
                    boolean zBooleanValue = Boolean.valueOf(uri.getQueryParameter("replace")).booleanValue();
                    String queryParameter3 = uri.getQueryParameter("track");
                    String queryParameter4 = uri.getQueryParameter("urlType");
                    String queryParameter5 = uri.getQueryParameter(f.b.f30919c);
                    String[] strArrSplit = com.bytedance.sdk.component.le.ouw.ouw.ouw.le.vt(queryParameter3).split(StringUtils.COMMA);
                    if (strArrSplit.length > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : strArrSplit) {
                            String strVt = com.bytedance.sdk.component.le.ouw.ouw.ouw.le.vt(str2);
                            if (!TextUtils.isEmpty(strVt)) {
                                arrayList.add(strVt);
                            }
                        }
                        try {
                            if (!TextUtils.isEmpty(queryParameter4)) {
                                i10 = Integer.parseInt(queryParameter4);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        com.bytedance.sdk.component.le.ouw.le.ouw.ouw().ouw(queryParameter2, arrayList, zBooleanValue, null, i10, queryParameter5);
                    }
                } catch (Throwable unused2) {
                    return null;
                }
                break;
        }
        return null;
    }
}
