package com.bytedance.sdk.component.adexpress.fkw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.od;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class fkw {
    private static volatile fkw bly = null;
    private static final byte[] fkw = new byte[0];

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static int f11487le = 10;
    private static int pno = 10;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final AtomicBoolean f11489ra = new AtomicBoolean(false);
    private List<le> vt = new ArrayList();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private List<le> f11488lh = new ArrayList();
    private Map<Integer, lh> yu = new HashMap();
    public Map<Integer, yu> ouw = new HashMap();

    public static boolean lh(le leVar) {
        if (leVar == null) {
            return false;
        }
        ko.vt("WebViewPool", "WebView render fail and abandon");
        try {
            Context context = leVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            leVar.bly();
        } catch (Throwable th2) {
            ko.ouw("WebViewPool", "WebView abandon failed ", th2.getMessage());
        }
        return true;
    }

    public static fkw ouw() {
        if (bly == null) {
            synchronized (fkw.class) {
                if (bly == null) {
                    bly = new fkw();
                }
            }
        }
        return bly;
    }

    private void yu(le leVar) {
        if (leVar == null) {
            return;
        }
        if (od.vt(leVar.getScene())) {
            od.ouw(leVar);
            return;
        }
        if (this.f11488lh.size() >= pno) {
            ko.vt("WebViewPool", "WebView newengine pool is full，destroy webview");
            try {
                Context context = leVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                leVar.bly();
                return;
            } catch (Throwable th2) {
                ko.ouw("WebViewPool", "WebView newengine pool is full，destroy webview ", th2.getMessage());
                return;
            }
        }
        if (this.f11488lh.contains(leVar)) {
            return;
        }
        try {
            Context context2 = leVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                leVar.setRecycler(true);
                this.f11488lh.add(leVar);
                ko.ouw("WebViewPool", "recycle WebView newengine，current available count: ", Integer.valueOf(yu()));
            }
        } catch (Throwable th3) {
            ko.ouw("WebViewPool", "recycle WebView newengine fail，current available count: ", Integer.valueOf(yu()), "exception is ", th3.getMessage());
        }
    }

    @Nullable
    public final le vt(Context context, String str) {
        le.lh lhVar = le.lh.ADS;
        if (od.vt(lhVar)) {
            if (!com.bytedance.sdk.component.adexpress.yu.fkw.ouw(str) || od.ouw(lhVar) > 1) {
                return od.ouw(context, null, lhVar);
            }
            return null;
        }
        if (lh() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.yu.fkw.ouw(str) && lh() <= 1) {
            ko.ouw("WebViewPool", "get WebView from pool; but ad type is does not meet the requirement ", Integer.valueOf(lh()));
            return null;
        }
        le leVarRemove = this.vt.remove(0);
        if (leVarRemove == null) {
            return null;
        }
        try {
            Context context2 = leVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                leVarRemove.setRecycler(false);
                ko.ouw("WebViewPool", "get WebView from pool; current available count: ", Integer.valueOf(lh()));
            }
            return leVarRemove;
        } catch (Throwable unused) {
            ko.ouw("WebViewPool", "get WebView from pool exception; current available count: ", Integer.valueOf(lh()));
            return null;
        }
    }

    private void fkw(le leVar) {
        if (leVar == null) {
            return;
        }
        if (od.vt(leVar.getScene())) {
            od.ouw(leVar);
            return;
        }
        if (this.vt.size() >= f11487le) {
            ko.vt("WebViewPool", "WebView pool is full，destroy webview");
            try {
                Context context = leVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                leVar.bly();
                return;
            } catch (Throwable th2) {
                ko.ouw("WebViewPool", "WebView pool is full，destroy webview ", th2.getMessage());
                return;
            }
        }
        if (this.vt.contains(leVar)) {
            return;
        }
        try {
            Context context2 = leVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                leVar.setRecycler(true);
                this.vt.add(leVar);
                ko.ouw("WebViewPool", "recycle WebView，current available count: ", Integer.valueOf(lh()));
            }
        } catch (Throwable th3) {
            ko.ouw("WebViewPool", "recycle WebView fail，current available count: ", Integer.valueOf(lh()), "exception is ", th3.getMessage());
        }
    }

    private void le(le leVar) {
        WebView webView;
        if (leVar == null || (webView = leVar.getWebView()) == null) {
            return;
        }
        lh lhVar = this.yu.get(Integer.valueOf(webView.hashCode()));
        if (lhVar != null) {
            lhVar.ouw(null);
        }
        leVar.b_("SDK_INJECT_GLOBAL");
    }

    private fkw() {
        com.bytedance.sdk.component.adexpress.ouw.ouw.lh lhVar = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh;
        if (lhVar != null) {
            f11487le = lhVar.bly();
            pno = lhVar.tlj();
        }
    }

    public final int lh() {
        return this.vt.size();
    }

    @Nullable
    public final le ouw(Context context, String str) {
        le.lh lhVar = le.lh.ADS_V3;
        if (od.vt(lhVar)) {
            if (!com.bytedance.sdk.component.adexpress.yu.fkw.ouw(str) || od.ouw(lhVar) > 1) {
                return od.ouw(context, null, lhVar);
            }
            return null;
        }
        if (yu() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.yu.fkw.ouw(str) && yu() <= 1) {
            ko.ouw("WebViewPool", "get WebView from newengine pool; but ad type is does not meet the requirement ", Integer.valueOf(yu()));
            return null;
        }
        le leVarRemove = this.f11488lh.remove(0);
        if (leVarRemove == null) {
            return null;
        }
        try {
            Context context2 = leVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                leVarRemove.setRecycler(false);
                ko.ouw("WebViewPool", "get WebView from newengine pool; current available count: ", Integer.valueOf(yu()));
            }
            return leVarRemove;
        } catch (Throwable unused) {
            ko.ouw("WebViewPool", "get WebView from newengine pool exception; current available count: ", Integer.valueOf(yu()));
            return null;
        }
    }

    @UiThread
    public final void vt(le leVar) {
        if (leVar == null) {
            return;
        }
        od.vt(leVar);
        leVar.b_("SDK_INJECT_GLOBAL");
        le(leVar);
        fkw(leVar);
    }

    public final void vt() {
        for (le leVar : this.vt) {
            if (leVar != null) {
                try {
                    Context context = leVar.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    leVar.bly();
                } catch (Throwable th2) {
                    ko.ouw("WebViewPool", "WebView clear failed ", th2.getMessage());
                }
            }
        }
        this.vt.clear();
        for (le leVar2 : this.f11488lh) {
            if (leVar2 != null) {
                try {
                    Context context2 = leVar2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    leVar2.bly();
                } catch (Throwable th3) {
                    ko.ouw("WebViewPool", "WebView newengine clear failed ", th3.getMessage());
                }
            }
        }
        this.f11488lh.clear();
    }

    public final int yu() {
        return this.f11488lh.size();
    }

    @UiThread
    public final void ouw(le leVar) {
        if (leVar == null) {
            return;
        }
        od.vt(leVar);
        leVar.b_("SDK_INJECT_GLOBAL");
        le(leVar);
        yu(leVar);
    }

    @SuppressLint({"JavascriptInterface"})
    public final void ouw(le leVar, vt vtVar) {
        WebView webView;
        if (leVar == null || vtVar == null || (webView = leVar.getWebView()) == null) {
            return;
        }
        lh lhVar = this.yu.get(Integer.valueOf(webView.hashCode()));
        if (lhVar != null) {
            lhVar.ouw(vtVar);
        } else {
            lhVar = new lh(vtVar);
            this.yu.put(Integer.valueOf(webView.hashCode()), lhVar);
        }
        try {
            PangleNetworkBridge.onAddedJavascriptInterface(leVar.ouw, lhVar, "SDK_INJECT_GLOBAL");
        } catch (Throwable unused) {
        }
    }

    public static void ouw(int i10) {
        synchronized (fkw) {
            f11487le = i10;
        }
    }

    public static void vt(int i10) {
        synchronized (fkw) {
            pno = i10;
        }
    }
}
