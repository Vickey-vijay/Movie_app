package com.mbridge.msdk.foundation.same.net;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* JADX INFO: compiled from: LoadUrlTool.java */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    public static String a(String str) {
        String strB = b(str);
        if (TextUtils.isEmpty(strB)) {
            return "";
        }
        return c1.a(strB);
    }

    public static String b(String str) {
        int iB;
        g gVarB = h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
        if (TextUtils.isEmpty(str)) {
            iB = gVarB.q0();
        } else {
            iB = gVarB.B();
        }
        return com.mbridge.msdk.foundation.same.net.utils.d.h().a(str, iB);
    }
}
