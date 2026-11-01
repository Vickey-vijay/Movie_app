package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.webkit.WebResourceResponse;
import android.widget.RelativeLayout;
import com.ironsource.C3426d4;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import okio.Buffer;

/* JADX INFO: loaded from: classes5.dex */
public abstract class F3 {
    public static final boolean a(String str) {
        return str != null && str.length() > 0;
    }

    public static final WebResourceResponse a(InputStream inputStream, String str) {
        ck.p.j(inputStream, "<this>");
        ck.p.j(str, "mimeType");
        Map mapG = nj.l0.g(mj.h.a("Access-Control-Allow-Origin", "*"));
        C3298x5.f25687a.getClass();
        return C3298x5.v() ? new WebResourceResponse(str, "UTF-8", 200, "OK", mapG, inputStream) : new WebResourceResponse(str, "UTF-8", inputStream);
    }

    public static final int b(float f10) {
        try {
            return ek.b.c(f10);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final int c(float f10) {
        try {
            return (int) (f10 / J5.b());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final int a(int i10) {
        try {
            return (int) (i10 / J5.b());
        } catch (Exception unused) {
            return i10;
        }
    }

    public static final float a(float f10) {
        return ek.b.c(f10 * 10.0f) / 10.0f;
    }

    public static final boolean a(Context context) {
        int i10;
        ck.p.j(context, "<this>");
        C3298x5.f25687a.getClass();
        if (Build.VERSION.SDK_INT < 35) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
            ck.p.i(packageInfo, "getPackageInfo(...)");
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            i10 = applicationInfo != null ? applicationInfo.targetSdkVersion : -1;
        } catch (Exception unused) {
        }
        return i10 >= 35;
    }

    public static final void a(wo woVar, RelativeLayout.LayoutParams layoutParams, Df df2) {
        ck.p.j(woVar, "<this>");
        ck.p.j(layoutParams, "layoutParams");
        ck.p.j(df2, "orientation");
        woVar.getClass();
        ck.p.j(df2, "orientation");
        vo voVar = (vo) woVar.f25675a.get(df2);
        int i10 = voVar != null ? voVar.f25597a : 0;
        ck.p.j(df2, "orientation");
        vo voVar2 = (vo) woVar.f25675a.get(df2);
        int i11 = voVar2 != null ? voVar2.f25599c : 0;
        ck.p.j(df2, "orientation");
        vo voVar3 = (vo) woVar.f25675a.get(df2);
        layoutParams.setMargins(i10, 0, i11, voVar3 != null ? voVar3.f25600d : 0);
    }

    public static final String a(HashMap map) {
        String strEncode;
        String strEncode2;
        ck.p.j(map, "<this>");
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String string = lk.a0.k1((String) entry.getValue()).toString();
            if (string.length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(C3426d4.j.f28584c);
                }
                ck.w wVar = ck.w.f6066a;
                Locale locale = Locale.US;
                try {
                    strEncode = URLEncoder.encode(str, "UTF-8");
                    ck.p.i(strEncode, "encode(...)");
                } catch (UnsupportedEncodingException unused) {
                    strEncode = "";
                }
                try {
                    strEncode2 = URLEncoder.encode(string, "UTF-8");
                    ck.p.i(strEncode2, "encode(...)");
                } catch (UnsupportedEncodingException unused2) {
                    strEncode2 = "";
                }
                String str2 = String.format(locale, "%s=%s", Arrays.copyOf(new Object[]{strEncode, strEncode2}, 2));
                ck.p.i(str2, "format(...)");
                sb2.append(str2);
            }
        }
        String string2 = sb2.toString();
        ck.p.i(string2, "toString(...)");
        return string2;
    }

    public static final String a(Buffer buffer) {
        ck.p.j(buffer, "<this>");
        String strEncodeToString = Base64.encodeToString(buffer.readByteArray(), 0);
        ck.p.i(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public static final void a(nk.l0 l0Var) {
        if (l0Var == null) {
            return;
        }
        try {
            kotlinx.coroutines.d.d(l0Var, null, 1, null);
        } catch (IllegalStateException unused) {
        }
    }

    public static final kotlinx.coroutines.g a(nk.l0 l0Var, long j10, long j11, bk.l lVar) {
        ck.p.j(l0Var, "<this>");
        ck.p.j(lVar, "action");
        return nk.j.d(l0Var, null, null, new B3(j10, lVar, j11, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(C3136qh c3136qh, bk.l lVar, rj.c cVar) {
        D3 d10;
        if (cVar instanceof D3) {
            d10 = (D3) cVar;
            int i10 = d10.f22494b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                d10.f22494b = i10 - Integer.MIN_VALUE;
            } else {
                d10 = new D3(cVar);
            }
        } else {
            d10 = new D3(cVar);
        }
        Object obj = d10.f22493a;
        Object objF = sj.a.f();
        int i11 = d10.f22494b;
        try {
            if (i11 == 0) {
                kotlin.c.b(obj);
                E3 e10 = new E3(lVar, null);
                d10.f22494b = 1;
                if (c3136qh.a(e10, d10) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
        } catch (IllegalStateException e11) {
            mj.g gVar = P9.f23321a;
            P9.a(new L2(e11));
        }
        return mj.r.f64562a;
    }

    public static final Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        ck.p.j(context, "<this>");
        ck.p.j(intentFilter, "filter");
        C3298x5.f25687a.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter, 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
