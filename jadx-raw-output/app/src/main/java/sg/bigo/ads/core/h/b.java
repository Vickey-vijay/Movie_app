package sg.bigo.ads.core.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3426d4;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.a.i;

/* JADX INFO: loaded from: classes6.dex */
public class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f71535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private sg.bigo.ads.core.h.c f71536b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f71537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0738b f71538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f71539i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final b f71540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final C0738b f71541b;

        public a(@NonNull b bVar, @NonNull C0738b c0738b) {
            this.f71540a = bVar;
            this.f71541b = c0738b;
        }

        @JavascriptInterface
        public final void onCustomJSEventCallback(String str, String str2) {
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "onCustomJSEventCallback, eventType: " + str + ", eventJson: " + str2);
            sg.bigo.ads.core.h.c customWebChromeClient = this.f71540a.getCustomWebChromeClient();
            if (customWebChromeClient != null) {
                customWebChromeClient.a(this.f71540a, str, str2);
            }
        }

        @JavascriptInterface
        public final void webCollect(String str) {
            String string;
            C0738b c0738b = this.f71541b;
            if (c0738b.f71542a == null) {
                c0738b.f71542a = new ArrayList();
            }
            if (!str.contains("notify") || str.startsWith(C3426d4.j.f28586d)) {
                string = str;
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put(BidResponsed.KEY_CUR, SystemClock.elapsedRealtime());
                    string = jSONObject.toString();
                } catch (Exception unused) {
                    string = str;
                }
            }
            c0738b.f71542a.add(string);
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "webCollect: ".concat(str));
        }

        @JavascriptInterface
        public final void webStat(String str, String str2) {
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "statUniversalInfo, eventId: " + str + ", msgJson: " + str2);
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.core.h.b$b, reason: collision with other inner class name */
    public static class C0738b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<String> f71542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<String> f71543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Boolean f71544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Boolean f71545d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f71546e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f71547f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f71548g = -1;

        public final boolean a(String str) {
            List<String> list = this.f71543b;
            if (str != null && list != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Boolean f71550b;

        private c() {
        }

        public /* synthetic */ c(b bVar, byte b10) {
            this();
        }

        private static boolean a(int[] iArr) {
            if (iArr.length <= 0) {
                return false;
            }
            int length = iArr.length;
            int i10 = length - 1;
            int i11 = 0;
            while (true) {
                int i12 = length / 2;
                if (i11 >= i12 || i10 < i12) {
                    return true;
                }
                if (iArr[i11] != iArr[i10]) {
                    return false;
                }
                i11++;
                i10--;
            }
        }

        public final Boolean a() {
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "Try to check not blank by bit");
            if (this.f71550b != null) {
                sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "Has result for checking not blank by bit");
                return this.f71550b;
            }
            b bVar = b.this;
            if (bVar.f71552j) {
                sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "WebView is destroyed stop checking not blank by bit");
                return null;
            }
            int width = bVar.getWidth();
            int height = b.this.getHeight();
            if (width > 0 && height > 0) {
                try {
                    int[] iArr = new int[width * height];
                    Bitmap bitmapA = sg.bigo.ads.common.utils.d.a(width, height, Bitmap.Config.RGB_565);
                    if (bitmapA == null) {
                        return null;
                    }
                    b.this.draw(new Canvas(bitmapA));
                    bitmapA.getPixels(iArr, 0, width, 0, 0, width, height);
                    bitmapA.recycle();
                    this.f71550b = Boolean.valueOf(!a(iArr));
                    sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "The result of current banner checking not blank by bit: " + this.f71550b);
                    return this.f71550b;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    public b(Context context) {
        super(context);
        this.f71537g = false;
        C0738b c0738b = new C0738b();
        this.f71538h = c0738b;
        a aVar = new a(this, c0738b);
        this.f71535a = aVar;
        addJavascriptInterface(aVar, "bigossp");
    }

    public static void a(@NonNull C0738b c0738b) {
        List<String> list;
        JSONObject jSONObjectOptJSONObject;
        if (!i.f69318a.n().a(0) || (list = c0738b.f71542a) == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : list) {
            if (str.startsWith(C3426d4.j.f28586d)) {
                sb2.append(str.substring(1, str.length() - 1));
                sb2.append(StringUtils.COMMA);
            }
            sb2.append(str);
            sb2.append(StringUtils.COMMA);
        }
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray(C3426d4.j.f28586d + sb2.substring(0, sb2.length() - 1) + C3426d4.j.f28588e);
            int length = jSONArray2.length();
            JSONObject jSONObject = null;
            JSONObject jSONObject2 = null;
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i10);
                if (jSONObjectOptJSONObject2 != null) {
                    String strOptString = jSONObjectOptJSONObject2.optString("type");
                    if ("render_start".equals(strOptString)) {
                        jSONObject = jSONObjectOptJSONObject2;
                    }
                    if ("render".equals(strOptString) && jSONObject2 == null) {
                        jSONObject2 = jSONObjectOptJSONObject2;
                    }
                    if (!"mayError".equals(strOptString) || ((jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("params")) != null && c0738b.a(jSONObjectOptJSONObject.optString("url")))) {
                        jSONArray.put(jSONObjectOptJSONObject2);
                    }
                }
            }
            if (jSONArray.length() > 0) {
                sg.bigo.ads.core.d.b.a(3002, 10113, jSONArray.toString());
            }
            if (jSONObject != null) {
                if (jSONObject2 != null) {
                    c0738b.f71544c = Boolean.TRUE;
                    c0738b.f71546e = jSONObject2.optLong(BidResponsed.KEY_CUR);
                } else {
                    c0738b.f71544c = Boolean.FALSE;
                    c0738b.f71546e = SystemClock.elapsedRealtime();
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void a(int i10, WebResourceRequest webResourceRequest, int i11, CharSequence charSequence) {
        if (webResourceRequest != null) {
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "dispatchResourceError, type: " + i10 + ", url: " + webResourceRequest.getUrl() + ", errorCode: " + i11 + ", desc: " + ((Object) charSequence));
            C0738b c0738b = this.f71538h;
            String strValueOf = String.valueOf(webResourceRequest.getUrl());
            if (c0738b.f71543b == null) {
                c0738b.f71543b = new ArrayList();
            }
            c0738b.f71543b.add(strValueOf);
        }
    }

    @Nullable
    public sg.bigo.ads.core.h.c getCustomWebChromeClient() {
        return this.f71536b;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(@Nullable WebChromeClient webChromeClient) {
        this.f71536b = webChromeClient instanceof sg.bigo.ads.core.h.c ? (sg.bigo.ads.core.h.c) webChromeClient : null;
        super.setWebChromeClient(webChromeClient);
    }
}
