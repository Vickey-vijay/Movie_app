package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public final class jt {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2890 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2891 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2892 = -8951586584454626386L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f2893;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private WeakReference<WebView> f2894;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private WeakReference<bb.e> f2895;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2729(bb.e eVar) {
        new WeakReference(eVar);
        int i10 = f2891 + 79;
        f2890 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final WebView m2732() {
        int i10 = f2891 + 123;
        f2890 = i10 % 128;
        int i11 = i10 % 2;
        WebView webView = this.f2894.get();
        int i12 = f2891 + 29;
        f2890 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 3 : 'F') != 3) {
            return webView;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2735(WebViewClient webViewClient) {
        int i10 = f2891 + 3;
        f2890 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            m2732();
            throw null;
        }
        WebView webViewM2732 = m2732();
        if (webViewM2732 != null) {
            try {
                hk hkVar = new hk(ki.m2907(webViewM2732), webViewClient);
                m2728(hkVar);
                webViewM2732.setWebViewClient(hkVar);
                this.f2893 = true;
                int i11 = f2890 + 51;
                f2891 = i11 % 128;
                if ((i11 % 2 != 0 ? '\\' : (char) 19) != '\\') {
                    return;
                } else {
                    throw null;
                }
            } catch (Exception e10) {
                kd.m2872(m2730("Ϲ﹢\uf89eﬃ\uf563\uf786\uf22f\uec74\uee9e\ue92b\ueb51\ue583\ue031\ue252\udcff\udf27", 64937 - View.MeasureSpec.getSize(0)).intern(), m2730("ϫ쇟蟚䗈ௐ즁进䷞Ꮒ퇁韙嗡ᯭ\ud9a9鿓左⏼\ue1cb\ua7f1旲⯥\ue9d2꾀涂㎃\uf18b랔", 49666 - TextUtils.lastIndexOf("", '0', 0)).intern(), e10, false);
            }
        }
        this.f2893 = false;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2728(bb.e eVar) {
        this.f2895 = new WeakReference<>(eVar);
        int i10 = f2891 + 123;
        f2890 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final bb.e m2731() {
        int i10 = f2890 + 123;
        int i11 = i10 % 128;
        f2891 = i11;
        int i12 = i10 % 2;
        WeakReference<bb.e> weakReference = this.f2895;
        if ((weakReference != null ? 'D' : 'Q') != 'Q') {
            return weakReference.get();
        }
        int i13 = i11 + 9;
        f2890 = i13 % 128;
        int i14 = i13 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2733(WebChromeClient webChromeClient) {
        WebView webViewM2732;
        int i10 = f2890 + 83;
        f2891 = i10 % 128;
        if (i10 % 2 != 0) {
            webViewM2732 = m2732();
            int i11 = 38 / 0;
            if (webViewM2732 == null) {
                return;
            }
        } else {
            webViewM2732 = m2732();
            if (webViewM2732 == null) {
                return;
            }
        }
        int i12 = f2890 + 71;
        f2891 = i12 % 128;
        int i13 = i12 % 2;
        try {
            WebChromeClient webChromeClientM2898 = ki.m2898(webViewM2732);
            if (!(webChromeClientM2898 != null)) {
                return;
            }
            int i14 = f2891 + 109;
            f2890 = i14 % 128;
            int i15 = i14 % 2;
            if (webChromeClientM2898 instanceof WebChromeClient) {
                return;
            }
            hi hiVar = new hi(webChromeClientM2898, webChromeClient);
            m2729((bb.e) hiVar);
            webViewM2732.setWebChromeClient(hiVar);
        } catch (Exception e10) {
            kd.m2872(m2730("Ϲ﹢\uf89eﬃ\uf563\uf786\uf22f\uec74\uee9e\ue92b\ueb51\ue583\ue031\ue252\udcff\udf27", 64937 - Color.blue(0)).intern(), m2730("ϫ頙㑖킎泈ॗꕗ䆨\uddf2稷ᙵ늷仵\uea8f蜿⍀뾜寸\uf01c豃⢥쓪愥ﵞ馺㗺퇉渇\u0a56", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 39877).intern(), e10, false);
        }
    }

    public jt(WebView webView) {
        this.f2894 = new WeakReference<>(webView);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2730(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2019) {
            f.f2017 = i10;
            char[] cArr2 = new char[cArr.length];
            f.f2018 = 0;
            while (true) {
                int i11 = f.f2018;
                if (i11 < cArr.length) {
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f2892);
                    f.f2018++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m2734() {
        int i10 = f2891 + 71;
        int i11 = i10 % 128;
        f2890 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        boolean z10 = this.f2893;
        int i12 = i11 + 45;
        f2891 = i12 % 128;
        if (i12 % 2 == 0) {
            return z10;
        }
        throw null;
    }
}
