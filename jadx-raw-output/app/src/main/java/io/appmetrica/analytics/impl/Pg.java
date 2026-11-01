package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Pg extends Sg {
    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q10) {
        String value = q10.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            yo yoVar = this.f55865a.f56218t;
            synchronized (yoVar) {
                yoVar.c(yoVar.b() + 1);
            }
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            q10.f55786n = Boolean.TRUE;
            b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void b() {
        yo yoVar = this.f55865a.f56218t;
        synchronized (yoVar) {
            yoVar.a(yoVar.a() + 1);
        }
        this.f55865a.z();
        N8 n10 = this.f55865a.f56210l;
        if (n10.f55616c == null) {
            n10.a();
        }
        P8 p10 = n10.f55616c;
        p10.getClass();
        p10.f55727b = new HashSet();
        p10.f55729d = 0;
        P8 p11 = n10.f55616c;
        p11.f55726a = true;
        S8 s10 = n10.f55615b;
        IBinaryDataHelper iBinaryDataHelper = s10.f55857c;
        R8 r10 = s10.f55856b;
        s10.f55855a.getClass();
        iBinaryDataHelper.insert("event_hashes", r10.toByteArray(Q8.a(p11)));
    }

    public Pg(Y4 y10) {
        super(y10);
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C4385n2 c4385n2 = this.f55865a.t().f56855y;
                    for (String str2 : Uri.decode(queryParameter).split(C3426d4.j.f28584c)) {
                        String strDecode = Uri.decode(str2);
                        int iIndexOf = strDecode.indexOf("=");
                        if (iIndexOf >= 0 && a(Uri.decode(strDecode.substring(0, iIndexOf)), Uri.decode(strDecode.substring(iIndexOf + 1)), c4385n2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, C4385n2 c4385n2) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c4385n2 == null) {
            return false;
        }
        for (Pair pair : c4385n2.f57304a) {
            if (mo.a(pair.first, str) && ((obj = pair.second) == null || ((C4360m2) obj).f57239a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
