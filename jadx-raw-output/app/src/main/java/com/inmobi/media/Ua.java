package com.inmobi.media;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.webkit.URLUtil;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.graphics.drawable.IconCompat;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.Ua;
import com.inmobi.media.ads.network.common.model.InlineParams;
import com.ironsource.C3426d4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;

/* JADX INFO: loaded from: classes7.dex */
public final class Ua {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f23628j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Va f23630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rh f23631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ma f23632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3061nh f23633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Za f23634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3028m9 f23635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakReference f23636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23637i;

    public /* synthetic */ Ua(Context context, Va va2, C2908hd c2908hd, InterfaceC3061nh interfaceC3061nh, Za za2, InterfaceC3028m9 interfaceC3028m9, int i10) {
        this(context, va2, null, (i10 & 8) != 0 ? null : c2908hd, interfaceC3061nh, za2, interfaceC3028m9, null);
    }

    public static /* synthetic */ Ta a(Ua ua2, String str, String str2, String str3, Ya ya2, int i10) {
        if ((i10 & 8) != 0) {
            ya2 = null;
        }
        return ua2.a(str, str2, str3, ya2, (i10 & 16) == 0);
    }

    public final Ta b(String str, String str2, String str3, Ya ya2) {
        InterfaceC3028m9 interfaceC3028m9 = this.f23635g;
        if (interfaceC3028m9 != null) {
            ck.p.i("Ua", "TAG");
            ((C3053n9) interfaceC3028m9).c("Ua", "In processInMobiNativeBrowserScheme");
        }
        String queryParameter = Uri.parse(str3).getQueryParameter("url");
        if (queryParameter == null || queryParameter.length() == 0) {
            Ma ma2 = this.f23632d;
            if (ma2 != null) {
                ma2.a(str2, "Invalid URL", str);
            }
            InterfaceC3028m9 interfaceC3028m10 = this.f23635g;
            if (interfaceC3028m10 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m10).c("Ua", "InMobiNativeBrowserScheme url is Empty or null");
            }
            a(Na.LPStartFailed, ya2, (Integer) 8001);
            return new Ta(3, 8001);
        }
        if (ya2 != null) {
            ya2.f23836f = "EX_NATIVE";
        }
        if (AbstractC2999l5.a(str3, this.f23629a, this.f23633e, this.f23635g)) {
            a(Na.LPStartSuccess, ya2, (Integer) null);
            c(str, str2, str3);
            InterfaceC3028m9 interfaceC3028m11 = this.f23635g;
            if (interfaceC3028m11 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m11).c("Ua", "InmobiNativeBrowser scheme url handled successfully");
            }
            return new Ta(1);
        }
        int iA = AbstractC2999l5.a(this.f23629a, queryParameter, this.f23633e, str, this.f23635g);
        if (iA == 0 || iA == 1) {
            a(Na.LPStartSuccess, ya2, (Integer) null);
            c(str, str2, str3);
            InterfaceC3028m9 interfaceC3028m12 = this.f23635g;
            if (interfaceC3028m12 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m12).c("Ua", "InmobiNativeBrowser scheme url handled successfully");
            }
            return new Ta(1);
        }
        Ma ma3 = this.f23632d;
        if (ma3 != null) {
            ma3.a(str2, "Invalid URL", str);
        }
        InterfaceC3028m9 interfaceC3028m13 = this.f23635g;
        if (interfaceC3028m13 != null) {
            ck.p.i("Ua", "TAG");
            ((C3053n9) interfaceC3028m13).c("Ua", "InmobiNativeBrowser scheme url handling failed");
        }
        a(Na.LPBrowserOpenFailed, ya2, Integer.valueOf(iA));
        return new Ta(2, Integer.valueOf(iA));
    }

    public final int c(String str, String str2, String str3, Ya ya2) {
        InterfaceC3028m9 interfaceC3028m9 = this.f23635g;
        if (interfaceC3028m9 != null) {
            ck.p.i("Ua", "TAG");
            ((C3053n9) interfaceC3028m9).a("Ua", "In processInternalNativeRequest");
        }
        try {
            return d(str, str2, str3, ya2);
        } catch (Exception e10) {
            Ma ma2 = this.f23632d;
            if (ma2 != null) {
                ma2.a(str2, "Unexpected error", "open");
            }
            Kb.a((byte) 1, "InMobi", "Failed to open URL SDK encountered unexpected error");
            InterfaceC3028m9 interfaceC3028m10 = this.f23635g;
            if (interfaceC3028m10 == null) {
                return 9;
            }
            ck.p.i("Ua", "TAG");
            ((C3053n9) interfaceC3028m10).b("Ua", "SDK encountered unexpected error in handling open() request from creative " + e10.getMessage());
            return 9;
        }
    }

    public Ua(Context context, Va va2, Rh rh2, Ma ma2, InterfaceC3061nh interfaceC3061nh, Za za2, InterfaceC3028m9 interfaceC3028m9, WeakReference weakReference) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(va2, "landingPageState");
        ck.p.j(interfaceC3061nh, "redirectionValidator");
        this.f23629a = context;
        this.f23630b = va2;
        this.f23631c = rh2;
        this.f23632d = ma2;
        this.f23633e = interfaceC3061nh;
        this.f23634f = za2;
        this.f23635g = interfaceC3028m9;
        this.f23636h = weakReference;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d8  */
    public final Ta a(String str, String str2, String str3, Ya ya2, boolean z10) {
        Ya ya3;
        InterfaceC3028m9 interfaceC3028m9;
        int iC;
        InterfaceC3028m9 interfaceC3028m10;
        InterfaceC3028m9 interfaceC3028m11;
        ck.p.j(str, "api");
        InterfaceC3028m9 interfaceC3028m12 = this.f23635g;
        if (interfaceC3028m12 != null) {
            ck.p.i("Ua", "TAG");
            ((C3053n9) interfaceC3028m12).c("Ua", "processing URL - " + str3);
        }
        if (ya2 == null) {
            Za za2 = this.f23634f;
            if (za2 == null || this.f23630b.f23694a || z10) {
                ya3 = null;
            } else {
                String strA = Pa.a(str3);
                int i10 = this.f23637i + 1;
                this.f23637i = i10;
                ya3 = new Ya(za2, strA, i10, SystemClock.elapsedRealtime());
            }
        } else {
            ya3 = ya2;
        }
        a(Na.LPClickStart, ya3, (Integer) null);
        if (str3 == null || str3.length() == 0) {
            InterfaceC3028m9 interfaceC3028m13 = this.f23635g;
            if (interfaceC3028m13 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m13).c("Ua", "url is empty");
            }
            a(Na.LPStartFailed, ya3, (Integer) 2);
            b(str, str2, str3);
            return new Ta(3, 2);
        }
        Uri uri = Uri.parse(str3);
        String scheme = uri.getScheme();
        if (scheme == null || scheme.length() == 0) {
            InterfaceC3028m9 interfaceC3028m14 = this.f23635g;
            if (interfaceC3028m14 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m14).c("Ua", "url scheme is empty");
            }
            a(Na.LPStartFailed, ya3, (Integer) 4);
            b(str, str2, str3);
            return new Ta(3, 4);
        }
        if (ck.p.e(this.f23630b.f23695b, "SKSTORE")) {
            InterfaceC3028m9 interfaceC3028m15 = this.f23635g;
            if (interfaceC3028m15 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m15).c("Ua", "inline installer");
            }
            return a(str, str2, this.f23630b.f23698e, str3, ya3);
        }
        if (ck.p.e(uri.getScheme(), "inmobinativebrowser")) {
            InterfaceC3028m9 interfaceC3028m16 = this.f23635g;
            if (interfaceC3028m16 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m16).c("Ua", "inmobi native browser scheme");
            }
            return b(str, str2, str3, ya3);
        }
        if (ck.p.e(uri.getScheme(), "inmobideeplink")) {
            InterfaceC3028m9 interfaceC3028m17 = this.f23635g;
            if (interfaceC3028m17 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m17).c("Ua", "inmobi deeplink scheme");
            }
            return a(str, str2, str3, ya3);
        }
        if (F1.a(this.f23629a, str3, this.f23633e, str, this.f23635g) || AbstractC2999l5.a(str3, this.f23629a, this.f23633e, this.f23635g)) {
            InterfaceC3028m9 interfaceC3028m18 = this.f23635g;
            if (interfaceC3028m18 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m18).c("Ua", "appstore link");
            }
            c(str, str2, str3);
            if (ya3 != null) {
                ya3.f23836f = "EX_NATIVE";
            }
            a(Na.LPStartSuccess, ya3, (Integer) null);
            return new Ta(1);
        }
        ck.p.g(uri);
        if (!AbstractC3296x3.a(uri)) {
            int iA = AbstractC2999l5.a(this.f23629a, str3, this.f23633e, str, this.f23635g);
            if (ya3 != null) {
                ya3.f23836f = "EX_NATIVE";
            }
            if (iA == 0 || iA == 1) {
                a(Na.LPStartSuccess, ya3, (Integer) null);
                c(str, str2, str3);
                InterfaceC3028m9 interfaceC3028m19 = this.f23635g;
                if (interfaceC3028m19 != null) {
                    ck.p.i("Ua", "TAG");
                    ((C3053n9) interfaceC3028m19).c("Ua", "Deeplink url handled successfully");
                }
                return new Ta(1);
            }
            InterfaceC3028m9 interfaceC3028m20 = this.f23635g;
            if (interfaceC3028m20 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m20).c("Ua", "In processOpenRequest else");
            }
            b(str, str2, str3);
            a(Na.LPBrowserOpenFailed, ya3, Integer.valueOf(iA));
            return new Ta(2, Integer.valueOf(iA));
        }
        InterfaceC3028m9 interfaceC3028m21 = this.f23635g;
        if (interfaceC3028m21 != null) {
            ck.p.i("Ua", "TAG");
            ((C3053n9) interfaceC3028m21).c("Ua", "http link");
        }
        Va va2 = this.f23630b;
        if (va2.f23694a) {
            return new Ta(0);
        }
        String str4 = va2.f23695b;
        int iHashCode = str4.hashCode();
        if (iHashCode != -2032180703) {
            if (iHashCode != -702637789) {
                if (iHashCode != 112775115) {
                    if (iHashCode == 409244785 && str4.equals("IN_NATIVE")) {
                        interfaceC3028m10 = this.f23635g;
                        if (interfaceC3028m10 != null) {
                            ck.p.i("Ua", "TAG");
                            ((C3053n9) interfaceC3028m10).c("Ua", "default - internal native");
                        }
                        iC = c(str, str2, str3, ya3);
                    }
                } else if (str4.equals("IN_CUSTOM")) {
                    InterfaceC3028m9 interfaceC3028m22 = this.f23635g;
                    if (interfaceC3028m22 != null) {
                        ck.p.i("Ua", "TAG");
                        ((C3053n9) interfaceC3028m22).c("Ua", "open internal custom");
                    }
                    InterfaceC3028m9 interfaceC3028m23 = this.f23635g;
                    if (interfaceC3028m23 != null) {
                        ck.p.i("Ua", "TAG");
                        ((C3053n9) interfaceC3028m23).a("Ua", "In processOpenInternalCustomRequest");
                    }
                    iC = a(str3, str, ya3);
                    if ((iC == 0 || iC == 1) && (interfaceC3028m11 = this.f23635g) != null) {
                        ck.p.i("Ua", "TAG");
                        ((C3053n9) interfaceC3028m11).c("Ua", "Internal Custom handled successfully");
                    }
                }
                interfaceC3028m9 = this.f23635g;
                if (interfaceC3028m9 != null) {
                    ck.p.i("Ua", "TAG");
                    ((C3053n9) interfaceC3028m9).c("Ua", "invalid scheme - open internal native");
                }
                iC = c(str, str2, str3, ya3);
            } else if (str4.equals("EX_NATIVE")) {
                InterfaceC3028m9 interfaceC3028m24 = this.f23635g;
                if (interfaceC3028m24 != null) {
                    ck.p.i("Ua", "TAG");
                    ((C3053n9) interfaceC3028m24).c("Ua", "open external native");
                }
                iC = e(str, str2, str3, ya3);
            } else {
                interfaceC3028m9 = this.f23635g;
                if (interfaceC3028m9 != null) {
                    ck.p.i("Ua", "TAG");
                    ((C3053n9) interfaceC3028m9).c("Ua", "invalid scheme - open internal native");
                }
                iC = c(str, str2, str3, ya3);
            }
        } else if (str4.equals("DEFAULT")) {
            interfaceC3028m10 = this.f23635g;
            if (interfaceC3028m10 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m10).c("Ua", "default - internal native");
            }
            iC = c(str, str2, str3, ya3);
        } else {
            interfaceC3028m9 = this.f23635g;
            if (interfaceC3028m9 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m9).c("Ua", "invalid scheme - open internal native");
            }
            iC = c(str, str2, str3, ya3);
        }
        if (iC == 0 || iC == 1) {
            return new Ta(1);
        }
        if (ya3 != null) {
            ya3.f23836f = this.f23630b.f23695b;
        }
        a(Na.LPBrowserOpenFailed, ya3, Integer.valueOf(iC));
        return new Ta(2, Integer.valueOf(iC));
    }

    public final int d(String str, String str2, String str3, Ya ya2) {
        String strA;
        ck.p.j(str, "api");
        InterfaceC3028m9 interfaceC3028m9 = this.f23635g;
        if (interfaceC3028m9 != null) {
            ck.p.i("Ua", "TAG");
            ((C3053n9) interfaceC3028m9).c("Ua", "processOpenCCTRequest - url - " + str3);
        }
        if (ya2 != null) {
            ya2.f23836f = "IN_NATIVE";
        }
        if (str3 == null || (lk.x.R(str3, "http", false, 2, null) && !URLUtil.isValidUrl(str3))) {
            InterfaceC3028m9 interfaceC3028m10 = this.f23635g;
            if (interfaceC3028m10 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m10).c("Ua", str + " called with invalid url (" + str3 + ")");
            }
            Ma ma2 = this.f23632d;
            if (ma2 != null) {
                ma2.a(str2, "Invalid URL", str);
            }
            a(Na.LPStartFailed, ya2, (Integer) 3);
            return 3;
        }
        String strA2 = AbstractC2875g5.a(this.f23629a);
        try {
            try {
                boolean z10 = this.f23630b.f23696c;
                if (strA2 != null && z10) {
                    R2 r10 = new R2(str3, null, this.f23629a, this.f23631c, this.f23633e, ya2, str);
                    C2823e5 c2823e5 = r10.f23425e;
                    Context context = r10.f23426f;
                    if (c2823e5.f24292a == null && context != null && (strA = AbstractC2875g5.a(context)) != null) {
                        C2772c5 c2772c5 = new C2772c5(c2823e5);
                        c2823e5.f24293b = c2772c5;
                        CustomTabsClient.bindCustomTabsService(context, strA, c2772c5);
                    }
                    InterfaceC3028m9 interfaceC3028m11 = this.f23635g;
                    if (interfaceC3028m11 != null) {
                        ck.p.i("Ua", "TAG");
                        ((C3053n9) interfaceC3028m11).c("Ua", "Default and Internal Native handled successfully");
                    }
                    return 0;
                }
                InterfaceC3028m9 interfaceC3028m12 = this.f23635g;
                if (interfaceC3028m12 != null) {
                    ck.p.i("Ua", "TAG");
                    ((C3053n9) interfaceC3028m12).a("Ua", "ChromeCustomTab fallback to Embedded");
                }
                if (ya2 != null) {
                    ya2.f23836f = "IN_CUSTOM";
                }
                return a(str3, str, ya2);
            } catch (Exception unused) {
                int iA = AbstractC3296x3.a(this.f23629a, str3, this.f23633e, str);
                if (iA != 0 && iA != 1) {
                    return iA;
                }
                c(str, str2, str3);
                if (ya2 != null) {
                    ya2.f23836f = "EX_NATIVE";
                }
                a(Na.LPStartSuccess, ya2, (Integer) null);
                return iA;
            }
        } catch (Exception e10) {
            InterfaceC3028m9 interfaceC3028m13 = this.f23635g;
            if (interfaceC3028m13 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m13).a("Ua", "Exception occurred while opening External ", e10);
            }
            return 9;
        }
    }

    public final int e(String str, String str2, String str3, Ya ya2) {
        InterfaceC3028m9 interfaceC3028m9 = this.f23635g;
        if (interfaceC3028m9 != null) {
            ck.p.i("Ua", "TAG");
            ((C3053n9) interfaceC3028m9).a("Ua", "In processOpenExternalNativeRequest");
        }
        int iA = AbstractC2999l5.a(this.f23629a, str3, this.f23633e, str, this.f23635g);
        if (iA != 0 && iA != 1) {
            return d(str, str2, str3, ya2);
        }
        if (ya2 != null) {
            ya2.f23836f = "EX_NATIVE";
        }
        a(Na.LPStartSuccess, ya2, (Integer) null);
        c(str, str2, str3);
        InterfaceC3028m9 interfaceC3028m10 = this.f23635g;
        if (interfaceC3028m10 == null) {
            return 0;
        }
        ck.p.i("Ua", "TAG");
        ((C3053n9) interfaceC3028m10).c("Ua", "External Native handled successfully");
        return 0;
    }

    public final void f(String str, String str2, String str3, Ya ya2) {
        String strEncode;
        try {
            int iA = AbstractC3296x3.a(this.f23629a, str2, this.f23633e, "openExternal");
            if (iA != 0 && iA != 1) {
                a(Na.LPBrowserOpenFailed, ya2, Integer.valueOf(iA));
                Ma ma2 = this.f23632d;
                if (ma2 != null) {
                    try {
                        strEncode = URLEncoder.encode(str2, "UTF-8");
                        ck.p.g(strEncode);
                    } catch (UnsupportedEncodingException unused) {
                        strEncode = str2;
                    }
                    ma2.a(str, "Cannot resolve URI (" + strEncode + ")", "openExternal");
                    return;
                }
                return;
            }
            a(Na.LPStartSuccess, ya2, (Integer) null);
            c("openExternal", str, str2);
        } catch (ActivityNotFoundException e10) {
            a(this, str, str2, str3, ya2, e10);
        } catch (NullPointerException e11) {
            a(this, str, str2, str3, ya2, e11);
        } catch (URISyntaxException e12) {
            a(this, str, str2, str3, ya2, e12);
        } catch (Exception e13) {
            a(Na.LPBrowserOpenFailed, ya2, (Integer) 9);
            Ma ma3 = this.f23632d;
            if (ma3 != null) {
                ma3.a(str, "Unexpected error", "openExternal");
            }
            ck.p.i("Ua", "TAG");
            Kb.a((byte) 1, "Ua", "Could not open URL SDK encountered an unexpected error");
            InterfaceC3028m9 interfaceC3028m9 = this.f23635g;
            if (interfaceC3028m9 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m9).b("Ua", "SDK encountered unexpected error in handling openExternal() request from creative " + e13.getMessage());
            }
        }
    }

    public final void c(String str, String str2, String str3) {
        Ma ma2 = this.f23632d;
        if (ma2 != null) {
            ma2.a();
        }
        Ma ma3 = this.f23632d;
        if (ma3 != null) {
            ma3.b(str, str2, str3);
        }
    }

    public final void b(String str, String str2, String str3) {
        InterfaceC3028m9 interfaceC3028m9 = this.f23635g;
        if (interfaceC3028m9 != null) {
            ck.p.i("Ua", "TAG");
            ((C3053n9) interfaceC3028m9).c("Ua", str + " called with invalid url (" + str3 + ")");
        }
        Ma ma2 = this.f23632d;
        if (ma2 != null) {
            ma2.a(str2, "Invalid URL", str);
        }
    }

    public final boolean a(String str, String str2, Ya ya2, P2 p10) {
        String strA;
        try {
            if (this.f23630b.f23697d && p10 != null) {
                String strA2 = AbstractC2875g5.a(this.f23629a);
                if (strA2 != null) {
                    try {
                        if (Ef.b(Ef.a(J5.g()))) {
                            CustomTabsIntent.Builder.class.getDeclaredMethod("setInitialActivityWidthPx", Integer.TYPE);
                        } else {
                            CustomTabsIntent.Builder.class.getDeclaredMethod("setInitialActivityHeightPx", Integer.TYPE);
                        }
                        R2 r10 = new R2(str2, p10, this.f23629a, this.f23631c, this.f23633e, ya2, str);
                        C2823e5 c2823e5 = r10.f23425e;
                        Context context = r10.f23426f;
                        if (c2823e5.f24292a == null && context != null && (strA = AbstractC2875g5.a(context)) != null) {
                            C2772c5 c2772c5 = new C2772c5(c2823e5);
                            c2823e5.f24293b = c2772c5;
                            CustomTabsClient.bindCustomTabsService(context, strA, c2772c5);
                        }
                        return true;
                    } catch (Error | Exception unused) {
                    }
                }
                InterfaceC3028m9 interfaceC3028m9 = this.f23635g;
                if (interfaceC3028m9 != null) {
                    ck.p.i("Ua", "TAG");
                    ((C3053n9) interfaceC3028m9).c("Ua", "Partial tabs not supported: packageName - " + strA2);
                }
            }
        } catch (Exception e10) {
            InterfaceC3028m9 interfaceC3028m10 = this.f23635g;
            if (interfaceC3028m10 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m10).c("Ua", "Error while opening partial tab: " + e10.getMessage());
            }
        }
        return false;
    }

    public final int a(String str, String str2, String str3, Ya ya2, P2 p10) {
        ck.p.j(str, "api");
        if (str3 != null && str3.length() != 0) {
            Uri uri = Uri.parse(str3);
            String scheme = uri.getScheme();
            if (scheme != null && scheme.length() != 0) {
                if (ck.p.e(uri.getScheme(), "inmobinativebrowser")) {
                    b(str, str2, str3, ya2);
                    return 2;
                }
                if (ck.p.e(uri.getScheme(), "inmobideeplink")) {
                    return a(str, str2, str3, ya2).f23554a == 1 ? 2 : 4;
                }
                if (F1.a(this.f23629a, str3, this.f23633e, str, this.f23635g) | AbstractC2999l5.a(str3, this.f23629a, this.f23633e, this.f23635g)) {
                    c(str, str2, str3);
                    if (ya2 != null) {
                        ya2.f23836f = "EX_NATIVE";
                    }
                    a(Na.LPStartSuccess, ya2, (Integer) null);
                    return 2;
                }
                ck.p.g(uri);
                if (AbstractC3296x3.a(uri) && a(str, str3, ya2, p10)) {
                    return 5;
                }
                if (AbstractC3296x3.a(uri)) {
                    return 3;
                }
                int iA = AbstractC2999l5.a(this.f23629a, str3, this.f23633e, str, this.f23635g);
                if (ya2 != null) {
                    ya2.f23836f = "EX_NATIVE";
                }
                if (iA != 0 && iA != 1) {
                    InterfaceC3028m9 interfaceC3028m9 = this.f23635g;
                    if (interfaceC3028m9 != null) {
                        ck.p.i("Ua", "TAG");
                        ((C3053n9) interfaceC3028m9).b("Ua", "CustomExpand handling failed");
                    }
                    a(Na.LPCompleteFailed, ya2, (Integer) null);
                    return 4;
                }
                c(str, str2, str3);
                a(Na.LPStartSuccess, ya2, (Integer) null);
                InterfaceC3028m9 interfaceC3028m10 = this.f23635g;
                if (interfaceC3028m10 != null) {
                    ck.p.i("Ua", "TAG");
                    ((C3053n9) interfaceC3028m10).c("Ua", "Deeplink url handled successfully");
                }
                return 2;
            }
            b(str, str2, str3);
            a(Na.LPStartFailed, ya2, (Integer) 4);
            return 1;
        }
        b(str, str2, str3);
        a(Na.LPStartFailed, ya2, (Integer) 2);
        return 1;
    }

    public final Ta a(String str, String str2, String str3, Ya ya2) {
        InterfaceC3028m9 interfaceC3028m9 = this.f23635g;
        if (interfaceC3028m9 != null) {
            ck.p.i("Ua", "TAG");
            ((C3053n9) interfaceC3028m9).a("Ua", "In processInMobiDeepLinkScheme");
        }
        Uri uri = Uri.parse(str3);
        int iA = a(str, uri.getQueryParameter("primaryUrl"), uri.getQueryParameter("primaryTrackingUrl"));
        if (iA != 0 && iA != 1) {
            int iA2 = a(str, uri.getQueryParameter("fallbackUrl"), uri.getQueryParameter("fallbackTrackingUrl"));
            if (ya2 != null) {
                ya2.f23836f = "EX_NATIVE";
            }
            if (iA2 != 0 && iA2 != 1) {
                Ma ma2 = this.f23632d;
                if (ma2 != null) {
                    ma2.a(str2, "Invalid URL", str);
                }
                InterfaceC3028m9 interfaceC3028m10 = this.f23635g;
                if (interfaceC3028m10 != null) {
                    ck.p.i("Ua", "TAG");
                    ((C3053n9) interfaceC3028m10).c("Ua", "InMobiDeepLinkScheme Fallback Url handling failed");
                }
                a(Na.LPBrowserOpenFailed, ya2, Integer.valueOf(iA2));
                return new Ta(2, Integer.valueOf(iA2));
            }
            InterfaceC3028m9 interfaceC3028m11 = this.f23635g;
            if (interfaceC3028m11 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m11).c("Ua", "InMobiDeepLinkScheme Fallback Url handled successfully");
            }
            a(Na.LPStartSuccess, ya2, (Integer) null);
            c(str, str2, str3);
            return new Ta(1);
        }
        InterfaceC3028m9 interfaceC3028m12 = this.f23635g;
        if (interfaceC3028m12 != null) {
            ck.p.i("Ua", "TAG");
            ((C3053n9) interfaceC3028m12).c("Ua", "InMobiDeepLinkScheme Primary Url handled successfully");
        }
        if (ya2 != null) {
            ya2.f23836f = "EX_NATIVE";
        }
        a(Na.LPStartSuccess, ya2, (Integer) null);
        c(str, str2, str3);
        return new Ta(1);
    }

    public final int a(String str, String str2, String str3) {
        InterfaceC3028m9 interfaceC3028m9 = this.f23635g;
        if (interfaceC3028m9 != null) {
            ck.p.i("Ua", "TAG");
            ((C3053n9) interfaceC3028m9).c("Ua", "inMobiDeepLinkSchemeUrlHandled - url - " + str2 + " trackingUrl " + str3);
        }
        if (str2 != null && str2.length() != 0) {
            if (AbstractC2999l5.a(str2, this.f23629a, this.f23633e, this.f23635g)) {
                if (F3.a(str3)) {
                    C3271w3 c3271w3 = C3271w3.f25610a;
                    ck.p.g(str3);
                    InterfaceC3028m9 interfaceC3028m10 = this.f23635g;
                    ck.p.j(str3, "url");
                    C3271w3.a(str3, true, interfaceC3028m10);
                } else {
                    InterfaceC3028m9 interfaceC3028m11 = this.f23635g;
                    if (interfaceC3028m11 != null) {
                        ck.p.i("Ua", "TAG");
                        ((C3053n9) interfaceC3028m11).b("Ua", "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                    }
                }
                InterfaceC3028m9 interfaceC3028m12 = this.f23635g;
                if (interfaceC3028m12 != null) {
                    ck.p.i("Ua", "TAG");
                    ((C3053n9) interfaceC3028m12).c("Ua", "InMobiDeepLinkScheme scheme applink/http url handled successfully");
                }
                return 0;
            }
            int iA = AbstractC2999l5.a(this.f23629a, str2, this.f23633e, str, this.f23635g);
            if (iA != 0 && iA != 1) {
                InterfaceC3028m9 interfaceC3028m13 = this.f23635g;
                if (interfaceC3028m13 != null) {
                    ck.p.i("Ua", "TAG");
                    ((C3053n9) interfaceC3028m13).c("Ua", "InMobiDeepLinkScheme scheme applink/http url handling failed");
                }
                return iA;
            }
            if (F3.a(str3)) {
                C3271w3 c3271w4 = C3271w3.f25610a;
                ck.p.g(str3);
                InterfaceC3028m9 interfaceC3028m14 = this.f23635g;
                ck.p.j(str3, "url");
                C3271w3.a(str3, true, interfaceC3028m14);
            } else {
                InterfaceC3028m9 interfaceC3028m15 = this.f23635g;
                if (interfaceC3028m15 != null) {
                    ck.p.i("Ua", "TAG");
                    ((C3053n9) interfaceC3028m15).b("Ua", "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                }
            }
            InterfaceC3028m9 interfaceC3028m16 = this.f23635g;
            if (interfaceC3028m16 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m16).c("Ua", "InMobiDeepLinkScheme scheme applink/http url handled successfully");
            }
            return 0;
        }
        InterfaceC3028m9 interfaceC3028m17 = this.f23635g;
        if (interfaceC3028m17 == null) {
            return 2;
        }
        ck.p.i("Ua", "TAG");
        ((C3053n9) interfaceC3028m17).b("Ua", "InMobiDeepLinkScheme url is Empty or null");
        return 2;
    }

    public final int a(String str, String str2, Ya ya2) {
        Ya yaA;
        Ya yaA2;
        ck.p.j(str, "url");
        ck.p.j(str2, "api");
        if (ya2 != null) {
            ya2.f23836f = "IN_CUSTOM";
        }
        if (str.length() == 0) {
            InterfaceC3028m9 interfaceC3028m9 = this.f23635g;
            if (interfaceC3028m9 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m9).b("Ua", "processOpenEmbeddedRequest failed due to empty URL");
            }
            a(Na.LPStartFailed, ya2, (Integer) null);
            return 2;
        }
        Uri uri = Uri.parse(str);
        ck.p.i(uri, "Uri.parse(this)");
        if (AbstractC3296x3.a(uri)) {
            Intent intent = new Intent(this.f23629a, (Class<?>) InMobiAdActivity.class);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", str);
            intent.putExtra("viewTouchTimestamp", this.f23633e.getViewTouchTimestamp());
            if (ya2 != null) {
                yaA = Ya.a(ya2);
                Na na2 = Na.LPClickStart;
                yaA.f23835e = 2;
                mj.r rVar = mj.r.f64562a;
            } else {
                yaA = null;
            }
            intent.putExtra("lpTelemetryControlInfo", yaA);
            if (ya2 != null) {
                yaA2 = Ya.a(ya2);
                Na na3 = Na.LPClickStart;
                yaA2.f23835e = 2;
                mj.r rVar2 = mj.r.f64562a;
            } else {
                yaA2 = null;
            }
            intent.putExtra("lpTelemetryControlInfo", yaA2);
            InterfaceC3028m9 interfaceC3028m10 = this.f23635g;
            if (interfaceC3028m10 != null) {
                String string = UUID.randomUUID().toString();
                ck.p.i(string, "toString(...)");
                HashMap map = P8.f23320a;
                String string2 = string.toString();
                ck.p.j(string2, C3426d4.i.W);
                ck.p.j(interfaceC3028m10, IconCompat.EXTRA_OBJ);
                P8.f23320a.put(string2, new WeakReference(interfaceC3028m10));
                intent.putExtra("loggerCacheKey", string);
            }
            Ma ma2 = this.f23632d;
            if (ma2 != null) {
                ma2.a(intent);
            }
            a(Na.LPStartSuccess, ya2, (Integer) null);
            Ma ma3 = this.f23632d;
            if (ma3 == null) {
                return 1;
            }
            ma3.b(null, null, str);
            return 1;
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f23635g;
        if (interfaceC3028m11 == null) {
            return 10;
        }
        ck.p.i("Ua", "TAG");
        ((C3053n9) interfaceC3028m11).b("Ua", "Embedded request unable to handle " + str);
        return 10;
    }

    public final Ta a(String str, String str2, InlineParams inlineParams, String str3, Ya ya2) {
        ck.p.j(str, "api");
        ck.p.j(str3, "url");
        InterfaceC3028m9 interfaceC3028m9 = this.f23635g;
        if (interfaceC3028m9 != null) {
            ck.p.i("Ua", "TAG");
            ((C3053n9) interfaceC3028m9).a("Ua", "inline installer called with URL: " + str3);
        }
        if (ya2 != null) {
            ya2.f23836f = "SKSTORE";
        }
        Sa saA = a(inlineParams);
        if (saA instanceof Ra) {
            return a(str, str2, ya2, str3, (Ra) saA, inlineParams != null && inlineParams.getPingInWebView());
        }
        if (saA instanceof Qa) {
            return a(str3, str, str2, ya2, ((Qa) saA).f23380a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Sa a(InlineParams inlineParams) {
        Activity fullScreenActivity;
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci;
        if (inlineParams == null) {
            return new Qa(8700);
        }
        WeakReference weakReference = this.f23636h;
        if (weakReference == null || (gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) weakReference.get()) == null) {
            fullScreenActivity = null;
        } else {
            fullScreenActivity = gestureDetectorOnGestureListenerC2785ci.getFullScreenActivity();
            if (fullScreenActivity == null) {
                fullScreenActivity = gestureDetectorOnGestureListenerC2785ci.getBannerHolderActivity().get();
            }
        }
        String packageName = this.f23629a.getPackageName();
        String targetBundleId = inlineParams.getTargetBundleId();
        boolean overlay = inlineParams.getOverlay();
        String url = inlineParams.getUrl();
        if (targetBundleId != null && targetBundleId.length() != 0) {
            ck.p.g(packageName);
            if (packageName.length() == 0) {
                return new Qa(8703);
            }
            if (fullScreenActivity == null) {
                return new Qa(8704);
            }
            if (url != null && url.length() != 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(url);
                sb2.append("id=" + targetBundleId);
                String referrer = inlineParams.getReferrer();
                String listing = inlineParams.getListing();
                if (referrer != null && !lk.a0.n0(referrer)) {
                    sb2.append('&');
                    sb2.append("referrer=" + referrer);
                }
                if (listing != null && !lk.a0.n0(listing)) {
                    sb2.append('&');
                    sb2.append("listing=" + listing);
                }
                return new Ra(fullScreenActivity, sb2.toString(), packageName, overlay);
            }
            return new Qa(2);
        }
        return new Qa(8702);
    }

    public final Ta a(String str, String str2, String str3, Ya ya2, int i10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f23635g;
        if (interfaceC3028m9 != null) {
            ck.p.i("Ua", "TAG");
            ((C3053n9) interfaceC3028m9).a("Ua", "Executing inline installer fallback flow for URL: " + str);
        }
        a(i10, ya2);
        if (ya2 != null) {
            ya2.f23836f = "EX_NATIVE";
        }
        if (F1.a(this.f23629a, str, this.f23633e, str2, this.f23635g)) {
            a(Na.LPStartSuccess, ya2, (Integer) null);
            c(str2, str3, str);
            return new Ta(1);
        }
        if (AbstractC2999l5.a(str, this.f23629a, this.f23633e, this.f23635g)) {
            a(Na.LPStartSuccess, ya2, (Integer) null);
            c(str2, str3, str);
            return new Ta(1);
        }
        int iE = e(str2, str3, str, ya2);
        if (iE != 0 && iE != 1) {
            a(Na.LPBrowserOpenFailed, ya2, Integer.valueOf(iE));
            Ma ma2 = this.f23632d;
            if (ma2 != null) {
                ma2.a(str3, "Launch failed", str2);
            }
            return new Ta(2, Integer.valueOf(iE));
        }
        return new Ta(1);
    }

    public final Ta a(String str, String str2, Ya ya2, String str3, Ra ra2, boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f23635g;
        if (interfaceC3028m9 != null) {
            ck.p.i("Ua", "TAG");
            ((C3053n9) interfaceC3028m9).a("Ua", "Executing inline installer flow for URL: " + str3);
        }
        int iA = AbstractC3296x3.a(ra2, this.f23633e, str);
        if (iA != 0 && iA != 1) {
            InterfaceC3028m9 interfaceC3028m10 = this.f23635g;
            if (interfaceC3028m10 != null) {
                ck.p.i("Ua", "TAG");
                ((C3053n9) interfaceC3028m10).a("Ua", "Inline installer launch failed; executing fallback for URL: " + str3 + ", errorCode: " + iA);
            }
            return a(str3, str, str2, ya2, iA);
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f23635g;
        if (interfaceC3028m11 != null) {
            ck.p.i("Ua", "TAG");
            ((C3053n9) interfaceC3028m11).a("Ua", "Inline installer launch succeeded for URL: " + str3);
        }
        if (z10) {
            C3271w3 c3271w3 = C3271w3.f25610a;
            InterfaceC3028m9 interfaceC3028m12 = this.f23635g;
            ck.p.j(str3, "url");
            Dg.a(Ag.REGULAR, new C3097p3(str3, true, interfaceC3028m12, null));
        } else {
            C3271w3 c3271w4 = C3271w3.f25610a;
            InterfaceC3028m9 interfaceC3028m13 = this.f23635g;
            ck.p.j(str3, "url");
            C3271w3.a(str3, true, interfaceC3028m13);
        }
        a(Na.LPStartSuccess, ya2, (Integer) null);
        Ma ma2 = this.f23632d;
        if (ma2 != null) {
            ma2.b(str, str2, str3);
        }
        return new Ta(1);
    }

    public final void a(int i10, Ya ya2) {
        Object objM3458constructorimpl;
        InterfaceC3028m9 interfaceC3028m9;
        Za za2;
        try {
            Result.a aVar = Result.Companion;
            if (ya2 == null || (za2 = ya2.f23831a) == null) {
                za2 = this.f23634f;
            }
            Map mapO = kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)));
            if (za2 != null) {
                mapO.put("plType", za2.f23902c);
                mapO.put("impressionId", za2.f23901b);
                mapO.put("plId", Long.valueOf(za2.f23900a));
                mapO.put("adType", za2.f23903d);
                mapO.put("markupType", za2.f23904e);
                mapO.put("creativeType", za2.f23905f);
                mapO.put("metadataBlob", za2.f23906g);
                mapO.put("isRewarded", Boolean.valueOf(za2.f23907h));
            }
            if (ya2 != null) {
                String str = ya2.f23836f;
                if (str == null) {
                    str = ya2.f23831a.f23908i;
                }
                mapO.put("trigger", str);
                mapO.put("urlType", ya2.f23832b);
                long j10 = ya2.f23834d;
                if (j10 != 0) {
                    nk.l0 l0Var = AbstractC2940il.f24565a;
                    mapO.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
                }
            }
            mapO.put("networkType", C3298x5.m());
            Wj wj2 = Wj.f23753a;
            Wj.b("InlineInstallFailed", mapO, EnumC2735ak.SDK);
            objM3458constructorimpl = Result.m3458constructorimpl(mj.r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        if (thM3461exceptionOrNullimpl == null || (interfaceC3028m9 = this.f23635g) == null) {
            return;
        }
        ck.p.i("Ua", "TAG");
        ((C3053n9) interfaceC3028m9).b("Ua", "Failed to submit inline install failed telemetry: " + thM3461exceptionOrNullimpl.getMessage());
    }

    public static final void a(Ua ua2, String str, String str2, String str3, Ya ya2, Exception exc) {
        InterfaceC3028m9 interfaceC3028m9 = ua2.f23635g;
        if (interfaceC3028m9 != null) {
            ck.p.i("Ua", "TAG");
            ((C3053n9) interfaceC3028m9).b("Ua", "Error message in processing openExternal: " + exc.getMessage());
        }
        Ma ma2 = ua2.f23632d;
        if (ma2 != null) {
            try {
                String strEncode = URLEncoder.encode(str2, "UTF-8");
                ck.p.g(strEncode);
                str2 = strEncode;
            } catch (UnsupportedEncodingException unused) {
            }
            ma2.a(str, "Cannot resolve URI (" + str2 + ")", "openExternal");
        }
        if (str3 != null) {
            ua2.f(str, str3, null, ya2);
        }
    }

    public final void a(Na na2, Ya ya2, Integer num) {
        ck.p.j(na2, "funnelState");
        Pa.a(na2, ya2, num, new bk.p() { // from class: b7.l4
            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo1invoke(Object obj, Object obj2) {
                return Ua.a(this.f5036b, (String) obj, (Map) obj2);
            }
        });
    }

    public static final mj.r a(Ua ua2, String str, Map map) {
        ck.p.j(str, "trackerName");
        ck.p.j(map, "macros");
        Ma ma2 = ua2.f23632d;
        if (ma2 != null) {
            ma2.a(str, map);
        }
        return mj.r.f64562a;
    }
}
