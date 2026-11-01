package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ironsource.C3;
import com.ironsource.C3497h3;
import com.ironsource.C3676r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.J9;
import com.ironsource.Y7;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f29838a = "BANNER";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f29839b = "LARGE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f29840c = "RECTANGLE";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f29841d = "LEADERBOARD";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f29842e = "SMART";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f29843f = "CUSTOM";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f29844g = "MEDIUM_RECTANGLE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f29845h = "bannerAdSize";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f29846i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f29847j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f29848k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f29849l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f29850m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f29851n = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f29852o = 6;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f29853p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f29854q = "Adaptive=true";

    public interface a {
        void a(Map<String, Object> map, List<String> list, StringBuilder sb2);
    }

    public interface b {
        void a();

        void a(String str);
    }

    public static void a(q qVar, C3497h3 c3497h3, b bVar) {
        String str;
        if (c(qVar)) {
            str = null;
        } else {
            str = String.format("can't load banner - %s", qVar == null ? "banner is null" : "banner is destroyed");
        }
        if (c3497h3 == null || TextUtils.isEmpty(c3497h3.c())) {
            str = String.format("can't load banner - %s", c3497h3 == null ? "placement is null" : "placement name is empty");
        }
        if (TextUtils.isEmpty(str)) {
            bVar.a();
        } else {
            IronLog.INTERNAL.error(str);
            bVar.a(str);
        }
    }

    public static ISBannerSize b() {
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            a(f29842e, 728, 90);
        }
        return a(f29842e, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    }

    public static boolean c(q qVar) {
        return (qVar == null || qVar.b()) ? false : true;
    }

    public static int b(int i10) {
        if (!r.m().O()) {
            IronLog.API.error("The mediation must be successfully initiated before calling this API");
            return -1;
        }
        return a(i10);
    }

    public static void b(q qVar) {
        ISBannerSize size;
        if (qVar == null || (size = qVar.getSize()) == null || !size.isSmart()) {
            return;
        }
        ISBannerSize iSBannerSizeB = b();
        o.f29923a.a(iSBannerSizeB, size.f29524e);
        iSBannerSizeB.setAdaptive(size.isAdaptive());
        qVar.setBannerSize(iSBannerSizeB);
    }

    public static void a(q qVar, b bVar) {
        if (qVar != null && !qVar.b()) {
            bVar.a();
        } else {
            bVar.a(String.format("can't destroy banner - %s", qVar == null ? "banner is null" : "banner is destroyed"));
        }
    }

    public static long a(long j10, long j11) {
        return j11 - (new Date().getTime() - j10);
    }

    public static ISBannerSize a(String str, int i10, int i11) {
        return new ISBannerSize(str, i10, i11);
    }

    public static ISBannerSize a() {
        return new ISBannerSize(f29841d, 728, 90);
    }

    public static void a(q qVar) {
        if (qVar != null) {
            qVar.a();
        }
    }

    public static void a(final q qVar, final View view, final FrameLayout.LayoutParams layoutParams, final C3 c10) {
        if (qVar == null || view == null || layoutParams == null) {
            return;
        }
        final Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        final ISBannerSize size = qVar.getSize();
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new Runnable() { // from class: com.ironsource.mediationsdk.e0
            @Override // java.lang.Runnable
            public final void run() {
                l.a(qVar, view, size, applicationContext, layoutParams, c10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(q qVar, View view, ISBannerSize iSBannerSize, Context context, FrameLayout.LayoutParams layoutParams, C3 c10) {
        try {
            qVar.removeAllViews();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            if (iSBannerSize != null) {
                if (iSBannerSize.isAdaptive()) {
                    a(qVar, view, context, iSBannerSize);
                } else {
                    qVar.addView(view, 0, layoutParams);
                }
            }
            if (c10 != null) {
                c10.a();
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error("Error while binding a banner - " + Log.getStackTraceString(e10));
        }
    }

    public static void a(q qVar, View view, FrameLayout.LayoutParams layoutParams) {
        a(qVar, view, layoutParams, (C3) null);
    }

    private static void a(q qVar, View view, Context context, ISBannerSize iSBannerSize) {
        int iDpToPixels = AdapterUtils.dpToPixels(context, iSBannerSize.f29524e.d());
        int iDpToPixels2 = AdapterUtils.dpToPixels(context, iSBannerSize.f29524e.c());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iDpToPixels, iDpToPixels2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setGravity(17);
        relativeLayout.addView(view, 0);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) qVar.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iDpToPixels, iDpToPixels2);
        }
        layoutParams2.height = iDpToPixels2;
        layoutParams2.width = iDpToPixels;
        layoutParams2.gravity = 17;
        qVar.setLayoutParams(layoutParams2);
        IronLog.INTERNAL.verbose("containerParams height - " + iSBannerSize.f29524e.c() + " width - " + iSBannerSize.f29524e.d());
        qVar.addView(relativeLayout, 0, layoutParams2);
    }

    public static int a(int i10) {
        int iA = -1;
        try {
            iA = a(a(c.b()), i10);
            a(i10, iA);
            IronLog.API.verbose("Maximal height - " + iA + " for width - " + i10);
            return iA;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error("Failed to get adaptive height: " + e10.getMessage());
            return iA;
        }
    }

    private static Map<String, Object> a(c cVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(cVar.a());
        concurrentHashMap.putAll(cVar.c());
        return concurrentHashMap;
    }

    private static int a(Map<String, Object> map, int i10) {
        int iMax = -1;
        for (Object obj : map.values()) {
            try {
                iMax = Math.max(iMax, a(obj, i10));
            } catch (Throwable th2) {
                a(obj, th2);
            }
        }
        return iMax;
    }

    private static int a(Object obj, int i10) {
        if (obj instanceof AbstractAdapter) {
            return ((AbstractAdapter) obj).getAdaptiveHeight(i10);
        }
        if (obj instanceof LevelPlayBaseAdapter) {
            return ((LevelPlayBaseAdapter) obj).getAdaptiveHeight(i10);
        }
        return -1;
    }

    private static void a(Object obj, Throwable th2) {
        String simpleName = obj != null ? obj.getClass().getSimpleName() : "unknown";
        C3676r4.d().a(th2);
        IronLog.INTERNAL.error("Exception while calling getAdaptiveHeight for adapter - " + simpleName + ": " + th2.getMessage());
    }

    private static void a(int i10, int i11) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (i11 == -1) {
                jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_ERROR_CODE, 2);
                jSONObjectJsonObjectInit.put("reason", "No networks found supporting adaptive banners");
            } else {
                jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, "w:" + i10 + ",h:" + i11);
            }
            J9.i().a(new C5(D5.BN_GET_MAXIMAL_ADAPTIVE_HEIGHT, jSONObjectJsonObjectInit));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void a(Map<String, Object> map, ISBannerSize iSBannerSize) {
        if (iSBannerSize != null) {
            try {
                String description = iSBannerSize.getDescription();
                byte b10 = -1;
                switch (description.hashCode()) {
                    case -387072689:
                        if (description.equals(f29840c)) {
                            b10 = 2;
                        }
                        break;
                    case 72205083:
                        if (description.equals(f29839b)) {
                            b10 = 1;
                        }
                        break;
                    case 79011241:
                        if (description.equals(f29842e)) {
                            b10 = 4;
                        }
                        break;
                    case 446888797:
                        if (description.equals(f29841d)) {
                            b10 = 3;
                        }
                        break;
                    case 1951953708:
                        if (description.equals("BANNER")) {
                            b10 = 0;
                        }
                        break;
                    case 1999208305:
                        if (description.equals("CUSTOM")) {
                            b10 = 5;
                        }
                        break;
                }
                if (b10 == 0) {
                    map.put(f29845h, 1);
                } else if (b10 == 1) {
                    map.put(f29845h, 2);
                } else if (b10 == 2) {
                    map.put(f29845h, 3);
                } else if (b10 == 3) {
                    map.put(f29845h, 4);
                } else if (b10 == 4) {
                    map.put(f29845h, 5);
                } else if (b10 == 5) {
                    map.put(f29845h, 6);
                    map.put("custom_banner_size", iSBannerSize.getWidth() + VastAttributes.HORIZONTAL_POSITION + iSBannerSize.getHeight());
                }
                if (iSBannerSize.isAdaptive()) {
                    String strA = a(iSBannerSize);
                    if (map.containsKey(IronSourceConstants.EVENTS_EXT1)) {
                        strA = map.get(IronSourceConstants.EVENTS_EXT1) + " , " + a(iSBannerSize);
                    }
                    map.put(IronSourceConstants.EVENTS_EXT1, strA);
                }
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(Log.getStackTraceString(e10));
            }
        }
    }

    public static String a(ISBannerSize iSBannerSize) {
        return "Adaptive=true, size: " + iSBannerSize.f29524e.d() + VastAttributes.HORIZONTAL_POSITION + iSBannerSize.f29524e.c() + "; fallback: " + iSBannerSize.getDescription() + ", size: " + iSBannerSize.getWidth() + VastAttributes.HORIZONTAL_POSITION + iSBannerSize.getHeight() + ";";
    }

    public static boolean a(Y7 y10, int i10, int i11) {
        if (y10 != null && y10.d() > 0 && y10.c() > 0) {
            if (y10.d() >= i10 && y10.c() >= i11) {
                return true;
            }
            IronLog.API.warning("Container size too small: Banner may not display correctly.");
            return true;
        }
        IronLog.API.warning("Container size is invalid: Default banner size will be used.");
        return false;
    }
}
