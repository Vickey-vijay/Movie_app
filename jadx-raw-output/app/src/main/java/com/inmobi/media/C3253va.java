package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import com.inmobi.media.C3253va;
import com.inmobi.media.GestureDetectorOnGestureListenerC2785ci;
import com.inmobi.media.Ne;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.ironsource.C3426d4;
import com.ironsource.C3537j8;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3253va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC2785ci f25558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC3028m9 f25560c;

    public static final void b(C3253va c3253va, String str, String str2) {
        Ua.a(c3253va.f25558a.getLandingPageHandler(), "open", str, str2, (Ya) null, 24);
    }

    public static final void c(C3253va c3253va, String str, String str2) {
        Ya ya2;
        try {
            Za za2 = c3253va.f25558a.getLandingPageHandler().f23634f;
            if (za2 != null) {
                String strA = Pa.a(str2);
                Ua landingPageHandler = c3253va.f25558a.getLandingPageHandler();
                int i10 = landingPageHandler.f23637i + 1;
                landingPageHandler.f23637i = i10;
                ya2 = new Ya(za2, strA, i10, SystemClock.elapsedRealtime());
            } else {
                ya2 = null;
            }
            if (ya2 != null) {
                ya2.f23836f = "IN_NATIVE";
            }
            c3253va.f25558a.getLandingPageHandler().d("openEmbedded", str, str2, ya2);
        } catch (Exception e10) {
            c3253va.f25558a.a(str, "Unexpected error", "openEmbedded");
            Kb.a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
            InterfaceC3028m9 interfaceC3028m9 = c3253va.f25560c;
            if (interfaceC3028m9 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).b(str3, "SDK encountered unexpected error in handling openEmbedded() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void e(C3253va c3253va, String str, String str2) {
        try {
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = c3253va.f25558a;
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = ck.p.l(str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            gestureDetectorOnGestureListenerC2785ci.b(str, str2.subSequence(i10, length + 1).toString());
        } catch (Exception e10) {
            c3253va.f25558a.a(str, "Unexpected error", "playVideo");
            Kb.a((byte) 1, "InMobi", "Error playing video; SDK encountered an unexpected error");
            InterfaceC3028m9 interfaceC3028m9 = c3253va.f25560c;
            if (interfaceC3028m9 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).b(str3, "SDK encountered unexpected error in handling playVideo() request from creative; " + e10.getMessage());
            }
        }
    }

    public final Pm a(String str) {
        try {
            for (Object obj : Pm.f23349c) {
                if (ck.p.e(((Pm) obj).f23350a, str)) {
                    return (Pm) obj;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Exception unused) {
            InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
            if (interfaceC3028m9 == null) {
                return null;
            }
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "No matching action found for - " + str);
            return null;
        }
    }

    @JavascriptInterface
    public final void customExpand(String str, String str2, int i10, float f10, boolean z10, boolean z11) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/va;->customExpand(Ljava/lang/String;Ljava/lang/String;IFZZ)V");
        safedk_va_customExpand_ffb33700094ade89f7204b785950f1d7(str, str2, i10, f10, z10, z11);
        BrandSafetyUtils.onMraidExpand(com.safedk.android.utils.g.f44963i, str, str2, this.f25558a, "imraid.customExpand");
    }

    @JavascriptInterface
    public final void open(String str, String str2) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/va;->open(Ljava/lang/String;Ljava/lang/String;)V");
        safedk_va_open_d4dd02313feb7f67e616c97d2eecb9ee(str, str2);
        BrandSafetyUtils.onMraidOpen(com.safedk.android.utils.g.f44963i, str, str2, this.f25558a, "mraid.open");
    }

    @JavascriptInterface
    public final void openEmbedded(String str, String str2) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/va;->openEmbedded(Ljava/lang/String;Ljava/lang/String;)V");
        safedk_va_openEmbedded_f47467373bd0e5cac3aeae18b14e1452(str, str2);
        BrandSafetyUtils.onMraidOpen(com.safedk.android.utils.g.f44963i, str, str2, this.f25558a, "imraid.openEmbedded");
    }

    @JavascriptInterface
    public final void openExternal(String str, String str2, String str3) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/va;->openExternal(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        safedk_va_openExternal_72f8e5a70a71c6d1565e9355b2555faf(str, str2, str3);
        BrandSafetyUtils.onMraidOpen(com.safedk.android.utils.g.f44963i, str, str2, this.f25558a, "imraid.openExternal");
    }

    @JavascriptInterface
    public final void openWithoutTracker(String str, String str2) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/va;->openWithoutTracker(Ljava/lang/String;Ljava/lang/String;)V");
        safedk_va_openWithoutTracker_1e6cb2fa0a1d7f976f93c8793be65293(str, str2);
        BrandSafetyUtils.onMraidOpen(com.safedk.android.utils.g.f44963i, str, str2, this.f25558a, "imraid.openWithoutTracker");
    }

    public C3253va(int i10, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "mRenderView");
        this.f25558a = gestureDetectorOnGestureListenerC2785ci;
        this.f25559b = i10;
    }

    public static final void b(C3253va c3253va) {
        try {
            c3253va.f25558a.H();
        } catch (Exception e10) {
            InterfaceC3028m9 interfaceC3028m9 = c3253va.f25560c;
            if (interfaceC3028m9 != null) {
                String str = AbstractC3278wa.f25629a;
                ck.p.i(str, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).b(str, "SDK encountered unexpected error in getting/setting current position; " + e10.getMessage());
            }
        }
    }

    public static final void d(C3253va c3253va, String str, String str2) {
        Ua.a(c3253va.f25558a.getLandingPageHandler(), "openWithoutTracker", str, str2, (Ya) null, 8);
    }

    public static final void f(C3253va c3253va, String str, String str2) {
        try {
            c3253va.f25558a.getSiblingWebviewManager().b(c3253va.f25558a.getRoute().f22535b, str, str2);
        } catch (Exception e10) {
            c3253va.f25558a.a(C3537j8.f29256j, AbstractC3211ti.a(str, 310));
            InterfaceC3028m9 interfaceC3028m9 = c3253va.f25560c;
            if (interfaceC3028m9 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).b(str3, "SDK encountered unexpected error in handling sendMessage() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void asyncPing(String str, String str2) {
        ck.p.j(str2, "url");
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "asyncPing called: " + str2);
        }
        if (!URLUtil.isValidUrl(str2)) {
            this.f25558a.a(str, "Invalid url", "asyncPing");
            return;
        }
        try {
            nk.p0 p0VarA = ((C3227u9) He.f22812c.getValue()).a(new Je(str2, null, null, null, null, false, 62));
            bk.l lVar = new bk.l() { // from class: b7.jb
                @Override // bk.l
                public final Object invoke(Object obj) {
                    return C3253va.a(this.f5005b, (Ne) obj);
                }
            };
            ck.p.j(p0VarA, "<this>");
            ck.p.j(lVar, "onCompleted");
            nk.j.d(A9.f22351c, null, null, new A3(p0VarA, lVar, null), 3, null);
        } catch (Exception e10) {
            this.f25558a.a(str, "Unexpected error", "asyncPing");
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str4 = AbstractC3278wa.f25629a;
                ck.p.i(str4, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str4, "SDK encountered internal error in handling asyncPing() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void cancelSaveContent(String str, String str2) {
        ck.p.j(str2, "mediaId");
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "cancelSaveContent called. mediaId:" + str2);
        }
    }

    @JavascriptInterface
    public final void close(final String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "close called");
        }
        final GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a();
        if (gestureDetectorOnGestureListenerC2785ciA == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).a(str3, "webview not present cannot be closed");
                return;
            }
            return;
        }
        if (!gestureDetectorOnGestureListenerC2785ciA.O0) {
            Wb wb2 = (Wb) AbstractC3075o6.f24960e.getValue();
            Runnable runnable = new Runnable() { // from class: b7.kb
                @Override // java.lang.Runnable
                public final void run() {
                    C3253va.a(gestureDetectorOnGestureListenerC2785ciA, this, str);
                }
            };
            wb2.getClass();
            ck.p.j(runnable, "runnable");
            wb2.f23740a.post(runnable);
            return;
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
        if (interfaceC3028m11 != null) {
            String str4 = AbstractC3278wa.f25629a;
            ck.p.i(str4, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m11).b(str4, "close called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void closeAll(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "closeAll is called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a();
        if (gestureDetectorOnGestureListenerC2785ciA != null) {
            gestureDetectorOnGestureListenerC2785ciA.g();
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
        if (interfaceC3028m10 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void closeCustomExpand(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "closeCustomExpand called.");
        }
        if (this.f25559b == 1) {
            if (this.f25558a != null) {
                new Handler(this.f25558a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: b7.xa
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3253va.a(this.f5254b);
                    }
                });
                return;
            }
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
        if (interfaceC3028m11 != null) {
            String str4 = AbstractC3278wa.f25629a;
            ck.p.i(str4, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m11).b(str4, "closeCustomExpand called in incorrect Ad type: " + this.f25559b);
        }
    }

    @JavascriptInterface
    public final void createVideoPlayer(String str, String str2) throws JSONException {
        Object objD;
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "createVideoPlayer is called with config - " + str2);
        }
        EnumC2723a8[] enumC2723a8Arr = EnumC2723a8.f23967a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMessage", "Invalid config");
        jSONObject.put("jsCommand", "createVideoPlayer");
        jSONObject.put("params", "null");
        if (str2 != null) {
            Object obj = null;
            try {
                JSONObject jSONObject2 = new JSONObject(str2);
                ck.p.j(jSONObject2, "jsonObject");
                ck.p.j(HtmlVideoPlayerRequest.class, "type");
                HtmlVideoPlayerRequest htmlVideoPlayerRequest = (HtmlVideoPlayerRequest) HtmlVideoPlayerRequest.class.cast(AbstractC3029ma.a(jSONObject2, HtmlVideoPlayerRequest.class, null, null));
                if (htmlVideoPlayerRequest == null || (objD = nk.j.d(A9.f22354f, null, null, new C3104pa(this, htmlVideoPlayerRequest, null), 3, null)) == null) {
                    EnumC3102p8 enumC3102p8 = EnumC3102p8.VIDEO_READY;
                    a(str, jSONObject);
                    obj = mj.r.f64562a;
                } else {
                    obj = objD;
                }
            } catch (JSONException e10) {
                EnumC3102p8 enumC3102p9 = EnumC3102p8.VIDEO_READY;
                a(str, jSONObject);
                InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
                if (interfaceC3028m10 != null) {
                    String str4 = AbstractC3278wa.f25629a;
                    ck.p.i(str4, "access$getTAG$p(...)");
                    ((C3053n9) interfaceC3028m10).a(str4, "Error while creating config Json.", e10);
                    obj = mj.r.f64562a;
                }
            }
            if (obj != null) {
                return;
            }
        }
        EnumC3102p8 enumC3102p10 = EnumC3102p8.VIDEO_READY;
        a(str, jSONObject);
        mj.r rVar = mj.r.f64562a;
    }

    @JavascriptInterface
    public final void customExpandInNative(String str, String str2, float f10, boolean z10) {
        Ya ya2;
        ck.p.j(str2, "url");
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "customExpandInNative called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
        if (gestureDetectorOnGestureListenerC2785ci.O0) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str4 = AbstractC3278wa.f25629a;
                ck.p.i(str4, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str4, "customExpandInNative called on unloaded ad");
                return;
            }
            return;
        }
        if (this.f25559b != 1) {
            InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
            if (interfaceC3028m11 != null) {
                String str5 = AbstractC3278wa.f25629a;
                ck.p.i(str5, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m11).b(str5, "customExpandInNative called in incorrect Ad type: " + this.f25559b);
                return;
            }
            return;
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            gestureDetectorOnGestureListenerC2785ci.a(str, "Invalid screenPercentage", "customExpandInNative");
            return;
        }
        Za za2 = gestureDetectorOnGestureListenerC2785ci.getLandingPageHandler().f23634f;
        if (za2 != null) {
            String strA = Pa.a(str2);
            Ua landingPageHandler = this.f25558a.getLandingPageHandler();
            int i10 = landingPageHandler.f23637i + 1;
            landingPageHandler.f23637i = i10;
            ya2 = new Ya(za2, strA, i10, SystemClock.elapsedRealtime());
        } else {
            ya2 = null;
        }
        Ya ya3 = ya2;
        if (ya3 != null) {
            ya3.f23836f = "IN_NATIVE";
        }
        this.f25558a.getLandingPageHandler().a(Na.LPClickStart, ya3, (Integer) 8010);
        int iA = this.f25558a.getLandingPageHandler().a("customExpandInNative", str, str2, ya3, new P2(f10, z10));
        InterfaceC3028m9 interfaceC3028m12 = this.f25560c;
        if (interfaceC3028m12 != null) {
            String str6 = AbstractC3278wa.f25629a;
            ck.p.i(str6, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m12).a(str6, "customExpandInNativeRequest: " + iA);
        }
        if (iA == 3) {
            R5 r10 = R5.URL;
            a(str, str2, 0, f10, !z10, ya3);
        }
    }

    @JavascriptInterface
    public final void destroyVideoPlayer(String str) {
        nk.j.d(A9.f22354f, null, null, new C3129qa(this, null), 3, null);
    }

    @JavascriptInterface
    public final void destroyWebView(String str, final String str2) throws JSONException {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "destroyWebView called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a();
        if (gestureDetectorOnGestureListenerC2785ciA != null && gestureDetectorOnGestureListenerC2785ciA.O0) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str4 = AbstractC3278wa.f25629a;
                ck.p.i(str4, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str4, "destroyWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
            if (str2 == null) {
                str2 = "";
            }
            mj.g gVar = AbstractC3211ti.f25397a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC2785ci.a("destroyWebView", jSONObjectA);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            Wb wb2 = (Wb) AbstractC3075o6.f24960e.getValue();
            Runnable runnable = new Runnable() { // from class: b7.ib
                @Override // java.lang.Runnable
                public final void run() {
                    C3253va.a(this.f4991b, str2);
                }
            };
            wb2.getClass();
            ck.p.j(runnable, "runnable");
            wb2.f23740a.post(runnable);
            return;
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = this.f25558a;
        if (str2 == null) {
            str2 = "";
        }
        mj.g gVar2 = AbstractC3211ti.f25397a;
        JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
        jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, 302);
        gestureDetectorOnGestureListenerC2785ci2.a("destroyWebView", jSONObjectA2);
    }

    @JavascriptInterface
    public final void disableBackButton(String str, final boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "disableBackButton called");
        }
        this.f25558a.getWebViewFactory().a(new bk.l() { // from class: b7.gb
            @Override // bk.l
            public final Object invoke(Object obj) {
                return C3253va.a(z10, (GestureDetectorOnGestureListenerC2785ci) obj);
            }
        });
    }

    @JavascriptInterface
    public final void disableCloseRegion(final String str, final boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "disableCloseRegion called");
        }
        Wb wb2 = (Wb) AbstractC3075o6.f24960e.getValue();
        Runnable runnable = new Runnable() { // from class: b7.wa
            @Override // java.lang.Runnable
            public final void run() {
                C3253va.a(this.f5236b, z10, str);
            }
        };
        wb2.getClass();
        ck.p.j(runnable, "runnable");
        wb2.f23740a.post(runnable);
    }

    @JavascriptInterface
    public final void enableNativeGestures(String str, boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "enableNativeGestures called with enabled: " + z10);
        }
        this.f25558a.setEnableNativeGestures(z10);
    }

    @JavascriptInterface
    public final void enableTouchBeginCallback(String str, boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "enableTouchBeginCallback called with enabled: " + z10);
        }
        this.f25558a.setEnableTouchBeginCallback(z10);
    }

    @JavascriptInterface
    public final void enableTouchEndCallback(String str, boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "enableTouchEndCallback called with enabled: " + z10);
        }
        this.f25558a.setEnableTouchEndCallback(z10);
    }

    @JavascriptInterface
    public final void executeVideoPlayerActions(String str, String str2, String str3) throws JSONException {
        ck.p.j(str2, "action");
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str4 = AbstractC3278wa.f25629a;
            ck.p.i(str4, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str4, "executeVideoPlayerActions is called with action - " + str2 + ", " + str3);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoCommand", str2);
        jSONObject.put("config", str3);
        EnumC2723a8[] enumC2723a8Arr = EnumC2723a8.f23967a;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("errorMessage", "Invalid action");
        jSONObject2.put("jsCommand", "executeVideoPlayerActions");
        jSONObject2.put("params", String.valueOf(jSONObject));
        try {
            Pm pmA = a(str2);
            if (pmA == null || nk.j.d(A9.f22354f, null, null, new C3153ra(this, pmA, jSONObject, null), 3, null) == null) {
                EnumC3102p8 enumC3102p8 = EnumC3102p8.VIDEO_READY;
                a(str, jSONObject2);
                mj.r rVar = mj.r.f64562a;
            }
        } catch (JSONException e10) {
            EnumC3102p8 enumC3102p9 = EnumC3102p8.VIDEO_READY;
            a(str, jSONObject2);
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str5 = AbstractC3278wa.f25629a;
                ck.p.i(str5, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).a(str5, "Error while creating action Json.", e10);
            }
        }
    }

    @JavascriptInterface
    public final void fireAdFailed(String str) {
        try {
            InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
            if (interfaceC3028m9 != null) {
                String str2 = AbstractC3278wa.f25629a;
                ck.p.i(str2, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).a(str2, "fireAdFailed called.");
            }
            this.f25558a.p();
        } catch (Exception e10) {
            this.f25558a.a(str, "Unexpected error", "fireAdFailed");
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str3, "SDK encountered unexpected error in handling fireAdFailed() signal from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void fireAdReady(String str) {
        try {
            InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
            if (interfaceC3028m9 != null) {
                String str2 = AbstractC3278wa.f25629a;
                ck.p.i(str2, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).a(str2, "fireAdReady called.");
            }
            this.f25558a.q();
        } catch (Exception e10) {
            this.f25558a.a(str, "Unexpected error", "fireAdReady");
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str3, "SDK encountered unexpected error in handling fireAdReady() signal from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void fireComplete(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "fireComplete is called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
        if (gestureDetectorOnGestureListenerC2785ci != null) {
            gestureDetectorOnGestureListenerC2785ci.h();
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
        if (interfaceC3028m10 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of render view!");
        }
    }

    @JavascriptInterface
    public final void fireSkip(String str) {
        InterfaceC3028m9 interfaceC3028m9;
        InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
        if (interfaceC3028m10 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m10).a(str2, "fireSkip is called");
        }
        if (this.f25558a == null && (interfaceC3028m9 = this.f25560c) != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).b(str3, "Found a null instance of render view!");
        }
        this.f25558a.P();
    }

    @JavascriptInterface
    public final String getAdContext(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "getAdContext is called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a();
        if (gestureDetectorOnGestureListenerC2785ciA != null) {
            InterfaceC3268w0 adPodHandler = gestureDetectorOnGestureListenerC2785ciA.getAdPodHandler();
            if (adPodHandler != null) {
                return ((AbstractC2995l1) adPodHandler).u();
            }
            return null;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
        if (interfaceC3028m10 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of ad render view!");
        }
        return null;
    }

    @JavascriptInterface
    public final void getBlob(String str, String str2) {
        E2 e10;
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "getBlob is called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
        if (gestureDetectorOnGestureListenerC2785ci == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str4 = AbstractC3278wa.f25629a;
                ck.p.i(str4, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m11 = gestureDetectorOnGestureListenerC2785ci.f24162i;
        if (interfaceC3028m11 != null) {
            String str5 = GestureDetectorOnGestureListenerC2785ci.f24141g1;
            ck.p.i(str5, "TAG");
            ((C3053n9) interfaceC3028m11).a(str5, "getBlob");
        }
        if (str == null || str2 == null || (e10 = gestureDetectorOnGestureListenerC2785ci.f24165j0) == null) {
            return;
        }
        ((AbstractC2995l1) e10).a(str, str2, gestureDetectorOnGestureListenerC2785ci, gestureDetectorOnGestureListenerC2785ci.getImpressionId());
    }

    @JavascriptInterface
    public final String getCurrentPosition(String str) {
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci;
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "getCurrentPosition called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = this.f25558a;
        if (gestureDetectorOnGestureListenerC2785ci2 == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 == null) {
                return "";
            }
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of render view!");
            return "";
        }
        synchronized (gestureDetectorOnGestureListenerC2785ci2.getCurrentPositionMonitor()) {
            this.f25558a.F = true;
            new Handler(this.f25558a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: b7.nb
                @Override // java.lang.Runnable
                public final void run() {
                    C3253va.b(this.f5085b);
                }
            });
            while (true) {
                gestureDetectorOnGestureListenerC2785ci = this.f25558a;
                if (gestureDetectorOnGestureListenerC2785ci.F) {
                    try {
                        gestureDetectorOnGestureListenerC2785ci.getCurrentPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    mj.r rVar = mj.r.f64562a;
                }
            }
        }
        return gestureDetectorOnGestureListenerC2785ci.getCurrentPosition();
    }

    @JavascriptInterface
    public final int getCurrentRenderingIndex(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "getCurrentRenderingIndex is called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a();
        if (gestureDetectorOnGestureListenerC2785ciA != null) {
            return gestureDetectorOnGestureListenerC2785ciA.getCurrentRenderingPodAdIndex();
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
        if (interfaceC3028m10 == null) {
            return 0;
        }
        String str3 = AbstractC3278wa.f25629a;
        ck.p.i(str3, "access$getTAG$p(...)");
        ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of ad render view!");
        return 0;
    }

    @JavascriptInterface
    public final String getDefaultPosition(String str) {
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci;
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "getDefaultPosition called");
        }
        synchronized (this.f25558a.getDefaultPositionMonitor()) {
            this.f25558a.E = true;
            new Handler(this.f25558a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: b7.cb
                @Override // java.lang.Runnable
                public final void run() {
                    C3253va.c(this.f4883b);
                }
            });
            while (true) {
                gestureDetectorOnGestureListenerC2785ci = this.f25558a;
                if (gestureDetectorOnGestureListenerC2785ci.E) {
                    try {
                        gestureDetectorOnGestureListenerC2785ci.getDefaultPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    mj.r rVar = mj.r.f64562a;
                }
            }
        }
        return gestureDetectorOnGestureListenerC2785ci.getDefaultPosition();
    }

    @JavascriptInterface
    public final int getDeviceVolume(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "getDeviceVolume called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
        if (gestureDetectorOnGestureListenerC2785ci == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of render view!");
            }
            return -1;
        }
        try {
            C3280wc mediaProcessor = gestureDetectorOnGestureListenerC2785ci.getMediaProcessor();
            if (mediaProcessor != null) {
                return mediaProcessor.a();
            }
        } catch (Exception e10) {
            this.f25558a.a(str, "Unexpected error", "getDeviceVolume");
            InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
            if (interfaceC3028m11 != null) {
                String str4 = AbstractC3278wa.f25629a;
                ck.p.i(str4, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m11).b(str4, "SDK encountered unexpected error in handling getDeviceVolume() request from creative; " + e10.getMessage());
            }
        }
        return -1;
    }

    @JavascriptInterface
    public final int getMaxDeviceVolume(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "getMaxDeviceVolume called");
        }
        try {
            C3298x5 c3298x5 = C3298x5.f25687a;
            c3298x5.getClass();
            return ((Number) C3298x5.f25692f.getValue(c3298x5, C3298x5.f25688b[0])).intValue();
        } catch (Exception e10) {
            this.f25558a.a(str, "Unexpected error", "getMaxDeviceVolume");
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str3, "SDK encountered unexpected error in handling getMaxDeviceVolume() request from creative; " + e10.getMessage());
            }
            return 0;
        }
    }

    @JavascriptInterface
    public final String getMaxSize(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "getMaxSize called");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Activity fullScreenActivity = this.f25558a.getFullScreenActivity();
            if (fullScreenActivity == null) {
                Context containerContext = this.f25558a.getContainerContext();
                if ((containerContext instanceof Activity ? (Activity) containerContext : null) == null) {
                    return getScreenSize(str);
                }
                Context containerContext2 = this.f25558a.getContainerContext();
                ck.p.h(containerContext2, "null cannot be cast to non-null type android.app.Activity");
                fullScreenActivity = (Activity) containerContext2;
            }
            FrameLayout frameLayout = (FrameLayout) fullScreenActivity.findViewById(R.id.content);
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = F3.b(frameLayout.getWidth() / J5.b());
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            ref$IntRef2.element = F3.b(frameLayout.getHeight() / J5.b());
            if (this.f25558a.getFullScreenActivity() != null && (ref$IntRef.element == 0 || ref$IntRef2.element == 0)) {
                ck.p.g(frameLayout);
                ViewTreeObserverOnGlobalLayoutListenerC3079oa viewTreeObserverOnGlobalLayoutListenerC3079oa = new ViewTreeObserverOnGlobalLayoutListenerC3079oa(frameLayout, this.f25560c);
                frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3079oa);
                nk.j.d(A9.f22351c, null, null, new C3178sa(viewTreeObserverOnGlobalLayoutListenerC3079oa, ref$IntRef, ref$IntRef2, null), 3, null);
            }
            try {
                jSONObject.put("width", ref$IntRef.element);
                jSONObject.put("height", ref$IntRef2.element);
            } catch (JSONException e10) {
                InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
                if (interfaceC3028m10 != null) {
                    String str3 = AbstractC3278wa.f25629a;
                    ck.p.i(str3, "access$getTAG$p(...)");
                    ((C3053n9) interfaceC3028m10).a(str3, "Error while creating max size Json.", e10);
                }
            }
            InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
            if (interfaceC3028m11 != null) {
                String str4 = AbstractC3278wa.f25629a;
                ck.p.i(str4, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m11).a(str4, "getMaxSize called:" + jSONObject);
            }
        } catch (Exception e11) {
            this.f25558a.a(str, "Unexpected error", "getMaxSize");
            InterfaceC3028m9 interfaceC3028m12 = this.f25560c;
            if (interfaceC3028m12 != null) {
                String str5 = AbstractC3278wa.f25629a;
                ck.p.i(str5, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m12).b(str5, "SDK encountered unexpected error in handling getMaxSize() request from creative; " + e11.getMessage());
            }
        }
        String string = jSONObject.toString();
        ck.p.i(string, "toString(...)");
        return string;
    }

    @JavascriptInterface
    public final String getOrientation(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "getOrientation called");
        }
        byte bG = J5.g();
        if (bG == 1) {
            return "0";
        }
        if (bG == 3) {
            return "90";
        }
        if (bG == 2) {
            return "180";
        }
        return bG == 4 ? "270" : com.ironsource.Y1.f27894f;
    }

    @JavascriptInterface
    public final String getPlacementType(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "getPlacementType called");
        }
        return 1 == this.f25559b ? "interstitial" : "inline";
    }

    @JavascriptInterface
    public final String getPlatform(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 == null) {
            return "android";
        }
        String str2 = AbstractC3278wa.f25629a;
        ck.p.i(str2, "access$getTAG$p(...)");
        ((C3053n9) interfaceC3028m9).a(str2, "getPlatform. Platform:android");
        return "android";
    }

    @JavascriptInterface
    public final String getPlatformVersion(String str) {
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "getPlatformVersion. Version:" + strValueOf);
        }
        return strValueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public final String getPlaybackState(String str) {
        InterfaceC3028m9 interfaceC3028m9;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        nk.j.d(A9.f22354f, null, null, new C3203ta(this, ref$ObjectRef, countDownLatch, null), 3, null);
        if (!countDownLatch.await(1L, TimeUnit.SECONDS) && (interfaceC3028m9 = this.f25560c) != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).b(str2, "getPlaybackState timed out waiting on main thread");
        }
        JSONObject jSONObject = (JSONObject) ref$ObjectRef.element;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return null;
    }

    @JavascriptInterface
    public final String getRenderableAdIndexes(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "getRenderableAdIndexes is called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a();
        if (gestureDetectorOnGestureListenerC2785ciA == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of ad render view!");
            }
            String string = new JSONArray().toString();
            ck.p.i(string, "toString(...)");
            return string;
        }
        JSONArray renderableAdIndexes = gestureDetectorOnGestureListenerC2785ciA.getRenderableAdIndexes();
        InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
        if (interfaceC3028m11 != null) {
            String str4 = AbstractC3278wa.f25629a;
            ck.p.i(str4, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m11).a(str4, "renderableAdIndexes called:" + renderableAdIndexes);
        }
        String string2 = renderableAdIndexes.toString();
        ck.p.i(string2, "toString(...)");
        return string2;
    }

    @JavascriptInterface
    public final String getSafeArea(String str) {
        JSONObject safeArea = this.f25558a.getSafeArea();
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "getSafeArea called:" + safeArea);
        }
        if (safeArea != null) {
            return safeArea.toString();
        }
        return null;
    }

    @JavascriptInterface
    public final String getScreenSize(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", J5.h().f23059a);
            jSONObject.put("height", J5.h().f23060b);
            InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
            if (interfaceC3028m9 != null) {
                String str2 = AbstractC3278wa.f25629a;
                ck.p.i(str2, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).c(str2, "Message:Width x Height : " + J5.h().f23059a + VastAttributes.HORIZONTAL_POSITION + J5.h().f23060b);
            }
        } catch (JSONException unused) {
        } catch (Exception e10) {
            this.f25558a.a(str, "Unexpected error", "getScreenSize");
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str3, "SDK encountered unexpected error while getting screen dimensions; " + e10.getMessage());
            }
        }
        String string = jSONObject.toString();
        ck.p.i(string, "toString(...)");
        InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
        if (interfaceC3028m11 != null) {
            String str4 = AbstractC3278wa.f25629a;
            ck.p.i(str4, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m11).a(str4, "getScreenSize called:" + string);
        }
        return string;
    }

    @JavascriptInterface
    public final String getSdkVersion(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 == null) {
            return "11.1.0";
        }
        String str2 = AbstractC3278wa.f25629a;
        ck.p.i(str2, "access$getTAG$p(...)");
        ((C3053n9) interfaceC3028m9).a(str2, "getSdkVersion called. Version:11.1.0");
        return "11.1.0";
    }

    @JavascriptInterface
    public final long getShowTimeStamp(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "getShowTimeStamp is called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a();
        if (gestureDetectorOnGestureListenerC2785ciA == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 == null) {
                return 0L;
            }
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of ad render view!");
            return 0L;
        }
        long showTimeStamp = gestureDetectorOnGestureListenerC2785ciA.getShowTimeStamp();
        InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
        if (interfaceC3028m11 != null) {
            String str4 = AbstractC3278wa.f25629a;
            ck.p.i(str4, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m11).a(str4, "getShowTimeStamp is " + showTimeStamp);
        }
        return showTimeStamp;
    }

    @JavascriptInterface
    public final String getState(String str) {
        String viewState = this.f25558a.getViewState();
        Locale locale = Locale.ENGLISH;
        ck.p.i(locale, "ENGLISH");
        String lowerCase = viewState.toLowerCase(locale);
        ck.p.i(lowerCase, "toLowerCase(...)");
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).c(str2, "getState called:" + lowerCase);
        }
        return lowerCase;
    }

    @JavascriptInterface
    public final String getVersion(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 == null) {
            return "2.0";
        }
        String str2 = AbstractC3278wa.f25629a;
        ck.p.i(str2, "access$getTAG$p(...)");
        ((C3053n9) interfaceC3028m9).a(str2, "getVersion called. Version:2.0");
        return "2.0";
    }

    @JavascriptInterface
    public final void impressionFired(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "impressionFired is called");
        }
        this.f25558a.C();
    }

    @JavascriptInterface
    public final void incentCompleted(String str, String str2) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "incentCompleted called. IncentData:" + str2);
        }
        if (str2 == null) {
            try {
                this.f25558a.getListener().b(new HashMap());
                return;
            } catch (Exception e10) {
                this.f25558a.a(str, "Unexpected error", "incentCompleted");
                InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
                if (interfaceC3028m10 != null) {
                    String str4 = AbstractC3278wa.f25629a;
                    ck.p.i(str4, "access$getTAG$p(...)");
                    ((C3053n9) interfaceC3028m10).b(str4, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e10.getMessage());
                    return;
                }
                return;
            }
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                ck.p.i(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    ck.p.h(next, "null cannot be cast to non-null type kotlin.String");
                    String str5 = next;
                    map.put(str5, jSONObject.get(str5));
                }
                try {
                    this.f25558a.getListener().b(map);
                    mj.r rVar = mj.r.f64562a;
                } catch (Exception e11) {
                    this.f25558a.a(str, "Unexpected error", "incentCompleted");
                    InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
                    if (interfaceC3028m11 != null) {
                        String str6 = AbstractC3278wa.f25629a;
                        ck.p.i(str6, "access$getTAG$p(...)");
                        ((C3053n9) interfaceC3028m11).b(str6, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e11.getMessage());
                        mj.r rVar2 = mj.r.f64562a;
                    }
                }
            } catch (JSONException unused) {
                this.f25558a.getListener().b(new HashMap());
                mj.r rVar3 = mj.r.f64562a;
            }
        } catch (Exception e12) {
            this.f25558a.a(str, "Unexpected error", "incentCompleted");
            InterfaceC3028m9 interfaceC3028m12 = this.f25560c;
            if (interfaceC3028m12 != null) {
                String str7 = AbstractC3278wa.f25629a;
                ck.p.i(str7, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m12).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e12.getMessage());
                mj.r rVar4 = mj.r.f64562a;
            }
        }
    }

    @JavascriptInterface
    public final boolean isBackButtonDisabled(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "isBackButtonDisabled called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a();
        if (gestureDetectorOnGestureListenerC2785ciA == null) {
            gestureDetectorOnGestureListenerC2785ciA = this.f25558a;
        }
        return gestureDetectorOnGestureListenerC2785ciA.K;
    }

    @JavascriptInterface
    public final String isDeviceMuted(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "isDeviceMuted called");
        }
        if (this.f25558a == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 == null) {
                return com.ironsource.mediationsdk.metadata.a.f29886h;
            }
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of render view!");
            return com.ironsource.mediationsdk.metadata.a.f29886h;
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
        if (interfaceC3028m11 != null) {
            String str4 = AbstractC3278wa.f25629a;
            ck.p.i(str4, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m11).a(str4, "JavaScript called: isDeviceMuted()");
        }
        boolean z10 = false;
        try {
            C3280wc mediaProcessor = this.f25558a.getMediaProcessor();
            ck.p.g(mediaProcessor);
            InterfaceC3028m9 interfaceC3028m12 = mediaProcessor.f25634b;
            if (interfaceC3028m12 != null) {
                ((C3053n9) interfaceC3028m12).c("MraidMediaProcessor", "isVolumeMuted");
            }
            Context context = Ji.f22951a;
            if (context != null) {
                Object systemService = context.getSystemService("audio");
                AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
                if (audioManager != null && 2 != audioManager.getRingerMode()) {
                    z10 = true;
                }
            }
        } catch (Exception e10) {
            InterfaceC3028m9 interfaceC3028m13 = this.f25560c;
            if (interfaceC3028m13 != null) {
                String str5 = AbstractC3278wa.f25629a;
                ck.p.i(str5, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m13).b(str5, "SDK encountered unexpected error in checking if device is muted; " + e10.getMessage());
            }
        }
        return String.valueOf(z10);
    }

    @JavascriptInterface
    public final String isHeadphonePlugged(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "isHeadphonePlugged called");
        }
        if (this.f25558a == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 == null) {
                return com.ironsource.mediationsdk.metadata.a.f29886h;
            }
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of render view!");
            return com.ironsource.mediationsdk.metadata.a.f29886h;
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
        if (interfaceC3028m11 != null) {
            String str4 = AbstractC3278wa.f25629a;
            ck.p.i(str4, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m11).a(str4, "JavaScript called: isHeadphonePlugged()");
        }
        boolean zB = false;
        try {
            C3280wc mediaProcessor = this.f25558a.getMediaProcessor();
            ck.p.g(mediaProcessor);
            mediaProcessor.getClass();
            zB = C3280wc.b();
        } catch (Exception e10) {
            InterfaceC3028m9 interfaceC3028m12 = this.f25560c;
            if (interfaceC3028m12 != null) {
                String str5 = AbstractC3278wa.f25629a;
                ck.p.i(str5, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m12).b(str5, "SDK encountered unexpected error in checking if headphones are plugged-in; " + e10.getMessage());
            }
        }
        return String.valueOf(zB);
    }

    @JavascriptInterface
    public final boolean isViewable(String str) {
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
        if (gestureDetectorOnGestureListenerC2785ci != null) {
            return gestureDetectorOnGestureListenerC2785ci.I == Hn.VISIBLE;
        }
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).b(str2, "Found a null instance of render view!");
        }
        return false;
    }

    @JavascriptInterface
    public final void loadAd(String str, int i10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "loadAd is called with index - " + i10);
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a();
        if (gestureDetectorOnGestureListenerC2785ciA != null) {
            gestureDetectorOnGestureListenerC2785ciA.b(i10);
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
        if (interfaceC3028m10 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void loadWebView(String str, final String str2, final String str3) throws JSONException {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str4 = AbstractC3278wa.f25629a;
            ck.p.i(str4, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str4, "loadWebView called with html: " + str3);
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a();
        if (gestureDetectorOnGestureListenerC2785ciA != null && gestureDetectorOnGestureListenerC2785ciA.O0) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str5 = AbstractC3278wa.f25629a;
                ck.p.i(str5, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str5, "loadWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
            if (str2 == null) {
                str2 = "";
            }
            mj.g gVar = AbstractC3211ti.f25397a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC2785ci.a("loadWebView", jSONObjectA);
            return;
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA2 = a();
        if (gestureDetectorOnGestureListenerC2785ciA2 == null || gestureDetectorOnGestureListenerC2785ciA2.getPlacementType() != 1) {
            InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
            if (interfaceC3028m11 != null) {
                String str6 = AbstractC3278wa.f25629a;
                ck.p.i(str6, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m11).b(str6, "sibling creation not allowed for inline placement type");
            }
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = this.f25558a;
            if (str2 == null) {
                str2 = "";
            }
            mj.g gVar2 = AbstractC3211ti.f25397a;
            JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, 312);
            gestureDetectorOnGestureListenerC2785ci2.a("loadWebView", jSONObjectA2);
            return;
        }
        if (str2 == null || lk.a0.n0(str2)) {
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci3 = this.f25558a;
            mj.g gVar3 = AbstractC3211ti.f25397a;
            JSONObject jSONObjectA3 = Si.a("", "targetViewId", "id", "");
            jSONObjectA3.put(IronSourceConstants.EVENTS_ERROR_CODE, 302);
            gestureDetectorOnGestureListenerC2785ci3.a("loadWebView", jSONObjectA3);
            return;
        }
        if (str3 == null || str3.length() == 0) {
            this.f25558a.a("loadWebView", AbstractC3211ti.a(str2, 301));
            return;
        }
        Wb wb2 = (Wb) AbstractC3075o6.f24960e.getValue();
        Runnable runnable = new Runnable() { // from class: b7.db
            @Override // java.lang.Runnable
            public final void run() {
                C3253va.a(this.f4898b, str2, str3);
            }
        };
        wb2.getClass();
        ck.p.j(runnable, "runnable");
        wb2.f23740a.post(runnable);
    }

    @JavascriptInterface
    public final void log(String str, String str2) {
        ck.p.j(str2, "message");
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).c(str3, "Log called. Message:" + str2);
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
        gestureDetectorOnGestureListenerC2785ci.getClass();
        Mh mh2 = GestureDetectorOnGestureListenerC2785ci.f24139e1;
        mh2.getClass();
        if (!((Boolean) GestureDetectorOnGestureListenerC2785ci.f24142h1.getValue(mh2, Mh.f23172a[0])).booleanValue() || str2 == null) {
            return;
        }
        gestureDetectorOnGestureListenerC2785ci.getListener().a(str2);
    }

    @JavascriptInterface
    public final void logTelemetryEvent(String str, String str2, String str3) {
        if (str2 == null) {
            InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
            if (interfaceC3028m9 != null) {
                String str4 = AbstractC3278wa.f25629a;
                ck.p.i(str4, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).b(str4, "eventType is null");
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
        if (interfaceC3028m10 != null) {
            String str5 = AbstractC3278wa.f25629a;
            ck.p.i(str5, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m10).a(str5, "logTelemetryEvent is called: " + str2);
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
        gestureDetectorOnGestureListenerC2785ci.getClass();
        ck.p.j(str2, "eventType");
        C3037mi c3037mi = gestureDetectorOnGestureListenerC2785ci.f24152d0;
        if (c3037mi != null) {
            c3037mi.a(str2, str3);
        }
    }

    @JavascriptInterface
    public final void onAudioStateChanged(String str, int i10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "onAudioStateChanged is called: " + i10);
        }
        V1.f23663b.getClass();
        V1 v10 = (V1) V1.f23664c.get(i10);
        if (v10 == null) {
            v10 = V1.f23665d;
        }
        if (v10 != V1.f23665d) {
            this.f25558a.getListener().a(v10);
        }
    }

    @JavascriptInterface
    public final void onOrientationChange(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, ">>> onOrientationChange() >>> This API is deprecated!");
        }
    }

    @JavascriptInterface
    public final void onUserAudioMuteInteraction(String str, boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "onAudioMuteInteraction is called: " + z10);
        }
        this.f25558a.getListener().a(z10);
    }

    @JavascriptInterface
    public final void onUserInteraction(String str, String str2) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "onUserInteraction called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
        if (gestureDetectorOnGestureListenerC2785ci != null && !gestureDetectorOnGestureListenerC2785ci.a()) {
            this.f25558a.a("onUserInteraction");
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
        if (interfaceC3028m10 != null) {
            String str4 = AbstractC3278wa.f25629a;
            ck.p.i(str4, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m10).a(str4, "onUserInteraction called. Params:" + str2);
        }
        if (str2 == null) {
            try {
                this.f25558a.a(new HashMap());
                return;
            } catch (Exception e10) {
                this.f25558a.a(str, "Unexpected error", "onUserInteraction");
                InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
                if (interfaceC3028m11 != null) {
                    String str5 = AbstractC3278wa.f25629a;
                    ck.p.i(str5, "access$getTAG$p(...)");
                    ((C3053n9) interfaceC3028m11).b(str5, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e10.getMessage());
                    return;
                }
                return;
            }
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                ck.p.i(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    ck.p.h(next, "null cannot be cast to non-null type kotlin.String");
                    String str6 = next;
                    map.put(str6, jSONObject.get(str6));
                }
                try {
                    this.f25558a.a(map);
                    mj.r rVar = mj.r.f64562a;
                } catch (Exception e11) {
                    this.f25558a.a(str, "Unexpected error", "onUserInteraction");
                    InterfaceC3028m9 interfaceC3028m12 = this.f25560c;
                    if (interfaceC3028m12 != null) {
                        String str7 = AbstractC3278wa.f25629a;
                        ck.p.i(str7, "access$getTAG$p(...)");
                        ((C3053n9) interfaceC3028m12).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e11.getMessage());
                        mj.r rVar2 = mj.r.f64562a;
                    }
                }
            } catch (Exception e12) {
                this.f25558a.a(str, "Unexpected error", "onUserInteraction");
                InterfaceC3028m9 interfaceC3028m13 = this.f25560c;
                if (interfaceC3028m13 != null) {
                    String str8 = AbstractC3278wa.f25629a;
                    ck.p.i(str8, "access$getTAG$p(...)");
                    ((C3053n9) interfaceC3028m13).b(str8, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e12.getMessage());
                    mj.r rVar3 = mj.r.f64562a;
                }
            }
        } catch (JSONException unused) {
            this.f25558a.a(new HashMap());
            mj.r rVar4 = mj.r.f64562a;
        }
    }

    @JavascriptInterface
    public final void ping(String str, String str2, boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "ping called");
        }
        if (this.f25558a == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str4 = AbstractC3278wa.f25629a;
                ck.p.i(str4, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z11 = false;
            while (i10 <= length) {
                boolean z12 = ck.p.l(str2.charAt(!z11 ? i10 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z12) {
                    i10++;
                } else {
                    z11 = true;
                }
            }
            if (str2.subSequence(i10, length + 1).toString().length() != 0 && URLUtil.isValidUrl(str2)) {
                InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
                if (interfaceC3028m11 != null) {
                    String str5 = AbstractC3278wa.f25629a;
                    ck.p.i(str5, "access$getTAG$p(...)");
                    ((C3053n9) interfaceC3028m11).a(str5, "JavaScript called ping() URL: >>> " + str2 + " <<<");
                }
                try {
                    C3271w3 c3271w3 = C3271w3.f25610a;
                    InterfaceC3028m9 interfaceC3028m12 = this.f25560c;
                    ck.p.j(str2, "url");
                    C3271w3.a(str2, z10, interfaceC3028m12);
                    return;
                } catch (Exception e10) {
                    this.f25558a.a(str, "Unexpected error", "ping");
                    Kb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    InterfaceC3028m9 interfaceC3028m13 = this.f25560c;
                    if (interfaceC3028m13 != null) {
                        String str6 = AbstractC3278wa.f25629a;
                        ck.p.i(str6, "access$getTAG$p(...)");
                        ((C3053n9) interfaceC3028m13).b(str6, "SDK encountered unexpected error in handling ping() request from creative; " + e10.getMessage());
                        return;
                    }
                    return;
                }
            }
        }
        this.f25558a.a(str, "Invalid URL:" + str2, "ping");
    }

    @JavascriptInterface
    public final void pingInWebView(String str, String str2, boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "openInWebView called");
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z11 = false;
            while (i10 <= length) {
                boolean z12 = ck.p.l(str2.charAt(!z11 ? i10 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z12) {
                    i10++;
                } else {
                    z11 = true;
                }
            }
            if (str2.subSequence(i10, length + 1).toString().length() != 0 && URLUtil.isValidUrl(str2)) {
                InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
                if (interfaceC3028m10 != null) {
                    String str4 = AbstractC3278wa.f25629a;
                    ck.p.i(str4, "access$getTAG$p(...)");
                    ((C3053n9) interfaceC3028m10).a(str4, "JavaScript called pingInWebView() URL: >>> " + str2 + " <<<");
                }
                try {
                    C3271w3 c3271w3 = C3271w3.f25610a;
                    InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
                    ck.p.j(str2, "url");
                    Dg.a(Ag.REGULAR, new C3097p3(str2, z10, interfaceC3028m11, null));
                    return;
                } catch (Exception e10) {
                    this.f25558a.a(str, "Unexpected error", "pingInWebView");
                    Kb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    InterfaceC3028m9 interfaceC3028m12 = this.f25560c;
                    if (interfaceC3028m12 != null) {
                        String str5 = AbstractC3278wa.f25629a;
                        ck.p.i(str5, "access$getTAG$p(...)");
                        ((C3053n9) interfaceC3028m12).b(str5, "SDK encountered unexpected error in handling pingInWebView() request from creative; " + e10.getMessage());
                        return;
                    }
                    return;
                }
            }
        }
        this.f25558a.a(str, "Invalid URL:" + str2, "pingInWebView");
    }

    @JavascriptInterface
    public final void pingV2(String str, String str2) {
        ck.p.j(str2, "pingJson");
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "pingV2 called with JSON: >>> " + str2 + " <<<");
        }
        try {
            this.f25558a.f(str2);
        } catch (Exception e10) {
            this.f25558a.a(str, "Unexpected error", "ping");
            this.f25558a.a(e10);
            Kb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str4 = AbstractC3278wa.f25629a;
                ck.p.i(str4, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str4, "SDK encountered unexpected error in handling ping() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void playVideo(final String str, final String str2) {
        if (this.f25558a == null) {
            InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
            if (interfaceC3028m9 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = ck.p.l(str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str2.subSequence(i10, length + 1).toString().length() != 0 && lk.x.R(str2, "http", false, 2, null) && (lk.x.D(str2, "mp4", false, 2, null) || lk.x.D(str2, "avi", false, 2, null) || lk.x.D(str2, "m4v", false, 2, null))) {
                InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
                if (interfaceC3028m10 != null) {
                    String str4 = AbstractC3278wa.f25629a;
                    ck.p.i(str4, "access$getTAG$p(...)");
                    ((C3053n9) interfaceC3028m10).a(str4, "JavaScript called: playVideo (" + str2 + ")");
                }
                new Handler(this.f25558a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: b7.lb
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3253va.e(this.f5043b, str, str2);
                    }
                });
                return;
            }
        }
        this.f25558a.a(str, "Null or empty or invalid media playback URL supplied", "playVideo");
    }

    @JavascriptInterface
    public final void registerBackButtonPressedEventListener(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "registerBackButtonPressedEventListener called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
        if (gestureDetectorOnGestureListenerC2785ci == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            gestureDetectorOnGestureListenerC2785ci.k(str);
        } catch (Exception e10) {
            this.f25558a.a(str, "Unexpected error", "registerBackButtonPressedEventListener");
            InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
            if (interfaceC3028m11 != null) {
                String str4 = AbstractC3278wa.f25629a;
                ck.p.i(str4, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m11).b(str4, "SDK encountered unexpected error in handling registerBackButtonPressedEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceMuteEventListener(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "registerDeviceMuteEventListener called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
        if (gestureDetectorOnGestureListenerC2785ci == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str != null) {
            try {
                C3280wc mediaProcessor = gestureDetectorOnGestureListenerC2785ci.getMediaProcessor();
                if (mediaProcessor != null) {
                    ck.p.j(str, "jsCallbackNamespace");
                    if (mediaProcessor.f25636d == null) {
                        C2727ac c2727ac = new C2727ac(new C3180sc(mediaProcessor, str));
                        mediaProcessor.f25636d = c2727ac;
                        c2727ac.b();
                    }
                }
            } catch (Exception e10) {
                this.f25558a.a(str, "Unexpected error", "registerDeviceMuteEventListener");
                InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
                if (interfaceC3028m11 != null) {
                    String str4 = AbstractC3278wa.f25629a;
                    ck.p.i(str4, "access$getTAG$p(...)");
                    ((C3053n9) interfaceC3028m11).b(str4, "SDK encountered unexpected error in handling registerDeviceMuteEventListener() request from creative; " + e10.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceVolumeChangeEventListener(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "registerDeviceVolumeChangeEventListener called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
        if (gestureDetectorOnGestureListenerC2785ci == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str != null) {
            try {
                C3280wc mediaProcessor = gestureDetectorOnGestureListenerC2785ci.getMediaProcessor();
                if (mediaProcessor != null) {
                    ck.p.j(str, "jsCallbackNamespace");
                    Context context = Ji.f22951a;
                    if (context != null && mediaProcessor.f25637e == null) {
                        C2727ac c2727ac = new C2727ac(new C3230uc(mediaProcessor, str, context, new Handler(Looper.getMainLooper())));
                        mediaProcessor.f25637e = c2727ac;
                        c2727ac.b();
                    }
                }
            } catch (Exception e10) {
                this.f25558a.a(str, "Unexpected error", "registerDeviceVolumeChangeEventListener");
                InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
                if (interfaceC3028m11 != null) {
                    String str4 = AbstractC3278wa.f25629a;
                    ck.p.i(str4, "access$getTAG$p(...)");
                    ((C3053n9) interfaceC3028m11).b(str4, "SDK encountered unexpected error in handling registerDeviceVolumeChangeEventListener() request from creative; " + e10.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerHeadphonePluggedEventListener(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "registerHeadphonePluggedEventListener called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
        if (gestureDetectorOnGestureListenerC2785ci == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str != null) {
            try {
                C3280wc mediaProcessor = gestureDetectorOnGestureListenerC2785ci.getMediaProcessor();
                if (mediaProcessor != null) {
                    ck.p.j(str, "jsCallbackNamespace");
                    if (mediaProcessor.f25638f == null) {
                        C2727ac c2727ac = new C2727ac(new C3155rc(mediaProcessor, str));
                        mediaProcessor.f25638f = c2727ac;
                        c2727ac.b();
                    }
                }
            } catch (Exception e10) {
                this.f25558a.a(str, "Unexpected error", "registerHeadphonePluggedEventListener");
                InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
                if (interfaceC3028m11 != null) {
                    String str4 = AbstractC3278wa.f25629a;
                    ck.p.i(str4, "access$getTAG$p(...)");
                    ((C3053n9) interfaceC3028m11).b(str4, "SDK encountered unexpected error in handling registerHeadphonePluggedEventListener() request from creative; " + e10.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public void safedk_va_customExpand_ffb33700094ade89f7204b785950f1d7(String p10, String p11, int p12, float p13, boolean p14, boolean p15) {
        Ya ya2;
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str = AbstractC3278wa.f25629a;
            ck.p.i(str, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str, "customExpand called");
        }
        boolean p16 = this.f25558a.O0;
        if (p16) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String p17 = AbstractC3278wa.f25629a;
                ck.p.i(p17, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(p17, "customExpand called on unloaded ad");
                return;
            }
            return;
        }
        if (this.f25559b != 1) {
            InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
            if (interfaceC3028m11 != null) {
                String p18 = AbstractC3278wa.f25629a;
                ck.p.i(p18, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m11).b(p18, "customExpand called in incorrect Ad type: " + this.f25559b);
                return;
            }
            return;
        }
        if (p11 != null) {
            int length = p11.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = ck.p.l(p11.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (p11.subSequence(i10, length + 1).toString().length() != 0) {
                if (p12 < 0 || p12 >= R5.values().length) {
                    this.f25558a.a(p10, "Invalid inputType", "customExpand");
                    return;
                }
                if (p13 < 0.0f || p13 > 1.0f) {
                    this.f25558a.a(p10, "Invalid screenPercentage", "customExpand");
                    return;
                }
                Za za2 = this.f25558a.getLandingPageHandler().f23634f;
                if (za2 != null) {
                    String strA = Pa.a(p11);
                    Ua landingPageHandler = this.f25558a.getLandingPageHandler();
                    int i11 = landingPageHandler.f23637i + 1;
                    landingPageHandler.f23637i = i11;
                    ya2 = new Ya(za2, strA, i11, SystemClock.elapsedRealtime());
                } else {
                    ya2 = null;
                }
                Ya ya3 = ya2;
                if (ya3 != null) {
                    ya3.f23836f = "IN_CUSTOM";
                }
                this.f25558a.getLandingPageHandler().a(Na.LPClickStart, ya3, (Integer) 8008);
                a(p10, p11, p12, p13, p15, ya3);
                return;
            }
        }
        this.f25558a.a(p10, "Invalid " + p12, "customExpand");
    }

    @JavascriptInterface
    public void safedk_va_openEmbedded_f47467373bd0e5cac3aeae18b14e1452(final String p10, final String p11) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str = AbstractC3278wa.f25629a;
            ck.p.i(str, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str, "openEmbedded called");
        }
        if (!this.f25558a.a()) {
            this.f25558a.a("openEmbedded");
            return;
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
        if (!gestureDetectorOnGestureListenerC2785ci.O0) {
            gestureDetectorOnGestureListenerC2785ci.s();
            Oj.a(new Runnable() { // from class: b7.fb
                @Override // java.lang.Runnable
                public final void run() {
                    C3253va.c(this.f4928b, p10, p11);
                }
            });
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
        if (interfaceC3028m10 != null) {
            String p12 = AbstractC3278wa.f25629a;
            ck.p.i(p12, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m10).b(p12, "openEmbedded called on unloaded ad");
        }
    }

    @JavascriptInterface
    public void safedk_va_openExternal_72f8e5a70a71c6d1565e9355b2555faf(String p10, String p11, String p12) {
        Ya ya2;
        ck.p.j(p11, "url");
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str = AbstractC3278wa.f25629a;
            ck.p.i(str, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str, "open External");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
        if (gestureDetectorOnGestureListenerC2785ci == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String p13 = AbstractC3278wa.f25629a;
                ck.p.i(p13, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(p13, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (gestureDetectorOnGestureListenerC2785ci.O0) {
            InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
            if (interfaceC3028m11 != null) {
                String p14 = AbstractC3278wa.f25629a;
                ck.p.i(p14, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m11).b(p14, "open called on unloaded ad");
                return;
            }
            return;
        }
        if (!gestureDetectorOnGestureListenerC2785ci.a()) {
            this.f25558a.a("openExternal");
            return;
        }
        this.f25558a.s();
        InterfaceC3028m9 interfaceC3028m12 = this.f25560c;
        if (interfaceC3028m12 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m12).a(str2, "openExternal called with url: " + p11 + " , schema: " + Pa.a(p11) + ", fallback - " + p12);
        }
        Za za2 = this.f25558a.getLandingPageHandler().f23634f;
        if (za2 != null) {
            String strA = Pa.a(p11);
            Ua landingPageHandler = this.f25558a.getLandingPageHandler();
            int i10 = landingPageHandler.f23637i + 1;
            landingPageHandler.f23637i = i10;
            ya2 = new Ya(za2, strA, i10, SystemClock.elapsedRealtime());
        } else {
            ya2 = null;
        }
        if (ya2 != null) {
            ya2.f23836f = "EX_NATIVE";
        }
        this.f25558a.getLandingPageHandler().a(Na.LPClickStart, ya2, (Integer) null);
        Ua landingPageHandler2 = this.f25558a.getLandingPageHandler();
        landingPageHandler2.getClass();
        ck.p.j("openExternal", "api");
        if (p11 != null) {
            landingPageHandler2.f(p10, p11, p12, ya2);
            return;
        }
        if (p12 != null) {
            landingPageHandler2.f(p10, p12, null, ya2);
            return;
        }
        landingPageHandler2.a(Na.LPStartFailed, ya2, (Integer) 2);
        Ma ma2 = landingPageHandler2.f23632d;
        if (ma2 != null) {
            ma2.a(p10, "Empty url and fallback url", "openExternal");
        }
        InterfaceC3028m9 interfaceC3028m13 = landingPageHandler2.f23635g;
        if (interfaceC3028m13 != null) {
            ck.p.i("Ua", "TAG");
            ((C3053n9) interfaceC3028m13).b("Ua", "Empty deeplink and fallback urls");
        }
    }

    @JavascriptInterface
    public void safedk_va_openWithoutTracker_1e6cb2fa0a1d7f976f93c8793be65293(final String p10, final String p11) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str = AbstractC3278wa.f25629a;
            ck.p.i(str, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str, "openWithoutTracker called");
        }
        if (!this.f25558a.a()) {
            this.f25558a.a("openWithoutTracker");
            return;
        }
        if (!this.f25558a.O0) {
            Oj.a(new Runnable() { // from class: b7.mb
                @Override // java.lang.Runnable
                public final void run() {
                    C3253va.d(this.f5063b, p10, p11);
                }
            });
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
        if (interfaceC3028m10 != null) {
            String p12 = AbstractC3278wa.f25629a;
            ck.p.i(p12, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m10).b(p12, "openWithoutTracker called on unloaded ad");
        }
    }

    @JavascriptInterface
    public void safedk_va_open_d4dd02313feb7f67e616c97d2eecb9ee(final String p10, final String p11) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str = AbstractC3278wa.f25629a;
            ck.p.i(str, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str, "open called");
        }
        if (!this.f25558a.a()) {
            this.f25558a.a("open");
            return;
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
        if (!gestureDetectorOnGestureListenerC2785ci.O0) {
            gestureDetectorOnGestureListenerC2785ci.s();
            Oj.a(new Runnable() { // from class: b7.ab
                @Override // java.lang.Runnable
                public final void run() {
                    C3253va.b(this.f4846b, p10, p11);
                }
            });
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
        if (interfaceC3028m10 != null) {
            String p12 = AbstractC3278wa.f25629a;
            ck.p.i(p12, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m10).b(p12, "open called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void saveBlob(String str, String str2) {
        E2 e10;
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "saveBlob is called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
        if (gestureDetectorOnGestureListenerC2785ci == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str4 = AbstractC3278wa.f25629a;
                ck.p.i(str4, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m11 = gestureDetectorOnGestureListenerC2785ci.f24162i;
        if (interfaceC3028m11 != null) {
            String str5 = GestureDetectorOnGestureListenerC2785ci.f24141g1;
            ck.p.i(str5, "TAG");
            ((C3053n9) interfaceC3028m11).a(str5, "saveBlob");
        }
        if (str2 == null || (e10 = gestureDetectorOnGestureListenerC2785ci.f24165j0) == null) {
            return;
        }
        ((AbstractC2995l1) e10).a(str2, gestureDetectorOnGestureListenerC2785ci.getImpressionId());
    }

    @JavascriptInterface
    public final void sendMessage(String str, final String str2, final String str3) throws JSONException {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str4 = AbstractC3278wa.f25629a;
            ck.p.i(str4, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str4, "sendMessage called with message: " + str3);
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a();
        if (gestureDetectorOnGestureListenerC2785ciA != null && gestureDetectorOnGestureListenerC2785ciA.O0) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str5 = AbstractC3278wa.f25629a;
                ck.p.i(str5, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str5, "sendMessage called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
            if (str2 == null) {
                str2 = "";
            }
            mj.g gVar = AbstractC3211ti.f25397a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC2785ci.a(C3537j8.f29256j, jSONObjectA);
            return;
        }
        if (str2 == null || lk.a0.n0(str2)) {
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = this.f25558a;
            if (str2 == null) {
                str2 = "";
            }
            mj.g gVar2 = AbstractC3211ti.f25397a;
            JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, 302);
            gestureDetectorOnGestureListenerC2785ci2.a(C3537j8.f29256j, jSONObjectA2);
            return;
        }
        if (str3 == null || lk.a0.n0(str3)) {
            this.f25558a.a(C3537j8.f29256j, AbstractC3211ti.a(str2, 301));
            return;
        }
        Wb wb2 = (Wb) AbstractC3075o6.f24960e.getValue();
        Runnable runnable = new Runnable() { // from class: b7.pb
            @Override // java.lang.Runnable
            public final void run() {
                C3253va.f(this.f5131b, str2, str3);
            }
        };
        wb2.getClass();
        ck.p.j(runnable, "runnable");
        wb2.f23740a.post(runnable);
    }

    @JavascriptInterface
    public final void setAdContext(String str, String str2) {
        ck.p.j(str2, "podAdContext");
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "setAdContext is called " + str2);
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a();
        if (gestureDetectorOnGestureListenerC2785ciA != null) {
            InterfaceC3268w0 adPodHandler = gestureDetectorOnGestureListenerC2785ciA.getAdPodHandler();
            if (adPodHandler != null) {
                ((AbstractC2995l1) adPodHandler).b(str2);
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
        if (interfaceC3028m10 != null) {
            String str4 = AbstractC3278wa.f25629a;
            ck.p.i(str4, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m10).b(str4, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void setOrientationProperties(String str, final String str2) {
        ck.p.j(str2, "orientationPropertiesString");
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "setOrientationProperties called: " + str2);
        }
        Wb wb2 = (Wb) AbstractC3075o6.f24960e.getValue();
        Runnable runnable = new Runnable() { // from class: b7.ya
            @Override // java.lang.Runnable
            public final void run() {
                C3253va.b(this.f5270b, str2);
            }
        };
        wb2.getClass();
        ck.p.j(runnable, "runnable");
        wb2.f23740a.post(runnable);
    }

    @JavascriptInterface
    public final void showAd(String str, int i10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "showAd is called with index " + i10);
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a();
        if (gestureDetectorOnGestureListenerC2785ciA != null) {
            gestureDetectorOnGestureListenerC2785ciA.c(i10);
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
        if (interfaceC3028m10 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void showAlert(String str, String str2) {
        ck.p.j(str2, "alert");
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "showAlert: " + str2);
        }
    }

    @JavascriptInterface
    public final void showWebView(String str, final String str2) throws JSONException {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "showEndCard called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a();
        if (gestureDetectorOnGestureListenerC2785ciA != null && gestureDetectorOnGestureListenerC2785ciA.O0) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str4 = AbstractC3278wa.f25629a;
                ck.p.i(str4, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str4, "showWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
            if (str2 == null) {
                str2 = "";
            }
            mj.g gVar = AbstractC3211ti.f25397a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC2785ci.a("showWebView", jSONObjectA);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            Wb wb2 = (Wb) AbstractC3075o6.f24960e.getValue();
            Runnable runnable = new Runnable() { // from class: b7.eb
                @Override // java.lang.Runnable
                public final void run() {
                    C3253va.c(this.f4913b, str2);
                }
            };
            wb2.getClass();
            ck.p.j(runnable, "runnable");
            wb2.f23740a.post(runnable);
            return;
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = this.f25558a;
        if (str2 == null) {
            str2 = "";
        }
        mj.g gVar2 = AbstractC3211ti.f25397a;
        JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
        jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, 302);
        gestureDetectorOnGestureListenerC2785ci2.a("showWebView", jSONObjectA2);
    }

    @JavascriptInterface
    public final void storePicture(String str, String str2) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "storePicture is deprecated and no-op. ");
        }
    }

    @JavascriptInterface
    public final void submitAdReport(String str, String str2, String str3, String str4) {
        ck.p.j(str2, "adQualityUrl");
        ck.p.j(str3, "enableUserAdReportScreenshot");
        ck.p.j(str4, "templateInfo");
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str5 = AbstractC3278wa.f25629a;
            ck.p.i(str5, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str5, "submitAdReport called");
        }
        this.f25558a.a(str2, str4, ck.p.e(str3, "1"));
    }

    @JavascriptInterface
    public final String supports(String str, String str2) {
        ck.p.j(str2, "feature");
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "Checking support for: " + str2);
        }
        String strValueOf = String.valueOf(this.f25558a.m(str2));
        InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
        if (interfaceC3028m10 != null) {
            String str4 = AbstractC3278wa.f25629a;
            ck.p.i(str4, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m10).c(str4, "Message:" + str2 + " support: " + strValueOf);
        }
        return strValueOf;
    }

    @JavascriptInterface
    public final long timeSinceShow(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "timeSinceShow is called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a();
        if (gestureDetectorOnGestureListenerC2785ciA != null) {
            return gestureDetectorOnGestureListenerC2785ciA.V();
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
        if (interfaceC3028m10 == null) {
            return 0L;
        }
        String str3 = AbstractC3278wa.f25629a;
        ck.p.i(str3, "access$getTAG$p(...)");
        ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of ad render view!");
        return 0L;
    }

    @JavascriptInterface
    public final void unload(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "unload called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a();
        if (gestureDetectorOnGestureListenerC2785ciA == null) {
            gestureDetectorOnGestureListenerC2785ciA = this.f25558a;
        }
        try {
            gestureDetectorOnGestureListenerC2785ciA.E();
        } catch (Exception e10) {
            gestureDetectorOnGestureListenerC2785ciA.a(str, "Unexpected error", "unload");
            Kb.a((byte) 1, "InMobi", "Failed to unload ad; SDK encountered an unexpected error");
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str3, "SDK encountered an expected error in handling the unload() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterBackButtonPressedEventListener(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "unregisterBackButtonPressedEventListener called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25558a;
        if (gestureDetectorOnGestureListenerC2785ci == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            gestureDetectorOnGestureListenerC2785ci.X();
        } catch (Exception e10) {
            this.f25558a.a(str, "Unexpected error", "unregisterBackButtonPressedEventListener");
            InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
            if (interfaceC3028m11 != null) {
                String str4 = AbstractC3278wa.f25629a;
                ck.p.i(str4, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m11).b(str4, "SDK encountered unexpected error in handling unregisterBackButtonPressedEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceMuteEventListener(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "unregisterDeviceMuteEventListener called");
        }
        if (this.f25558a == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
        if (interfaceC3028m11 != null) {
            String str4 = AbstractC3278wa.f25629a;
            ck.p.i(str4, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m11).a(str4, "Unregister device mute event listener ...");
        }
        try {
            C3280wc mediaProcessor = this.f25558a.getMediaProcessor();
            if (mediaProcessor != null) {
                C2727ac c2727ac = mediaProcessor.f25636d;
                if (c2727ac != null) {
                    c2727ac.a();
                }
                mediaProcessor.f25636d = null;
            }
        } catch (Exception e10) {
            this.f25558a.a(str, "Unexpected error", "unRegisterDeviceMuteEventListener");
            InterfaceC3028m9 interfaceC3028m12 = this.f25560c;
            if (interfaceC3028m12 != null) {
                String str5 = AbstractC3278wa.f25629a;
                ck.p.i(str5, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m12).b(str5, "SDK encountered unexpected error in handling unregisterDeviceMuteEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceVolumeChangeEventListener(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "unregisterDeviceVolumeChangeEventListener called");
        }
        if (this.f25558a == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
        if (interfaceC3028m11 != null) {
            String str4 = AbstractC3278wa.f25629a;
            ck.p.i(str4, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m11).a(str4, "Unregister device volume change listener ...");
        }
        try {
            C3280wc mediaProcessor = this.f25558a.getMediaProcessor();
            if (mediaProcessor != null) {
                C2727ac c2727ac = mediaProcessor.f25637e;
                if (c2727ac != null) {
                    c2727ac.a();
                }
                mediaProcessor.f25637e = null;
            }
        } catch (Exception e10) {
            this.f25558a.a(str, "Unexpected error", "unregisterDeviceVolumeChangeEventListener");
            InterfaceC3028m9 interfaceC3028m12 = this.f25560c;
            if (interfaceC3028m12 != null) {
                String str5 = AbstractC3278wa.f25629a;
                ck.p.i(str5, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m12).b(str5, "SDK encountered unexpected error in handling unregisterDeviceVolumeChangeEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterHeadphonePluggedEventListener(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "unregisterHeadphonePluggedEventListener called");
        }
        if (this.f25558a == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
            if (interfaceC3028m10 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f25560c;
        if (interfaceC3028m11 != null) {
            String str4 = AbstractC3278wa.f25629a;
            ck.p.i(str4, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m11).a(str4, "Unregister headphone plugged event listener ...");
        }
        try {
            C3280wc mediaProcessor = this.f25558a.getMediaProcessor();
            if (mediaProcessor != null) {
                C2727ac c2727ac = mediaProcessor.f25638f;
                if (c2727ac != null) {
                    c2727ac.a();
                }
                mediaProcessor.f25638f = null;
            }
        } catch (Exception e10) {
            this.f25558a.a(str, "Unexpected error", "unregisterHeadphonePluggedEventListener");
            InterfaceC3028m9 interfaceC3028m12 = this.f25560c;
            if (interfaceC3028m12 != null) {
                String str5 = AbstractC3278wa.f25629a;
                ck.p.i(str5, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m12).b(str5, "SDK encountered unexpected error in handling unregisterHeadphonePluggedEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void updateVideoPosition(String str, String str2) throws JSONException {
        Object objD;
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "updateVideoPosition is called with position - " + str2);
        }
        EnumC2723a8[] enumC2723a8Arr = EnumC2723a8.f23967a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMessage", "Invalid position");
        jSONObject.put("jsCommand", "updateVideoPlayerPosition");
        jSONObject.put("params", "null");
        if (str2 != null) {
            Object obj = null;
            try {
                JSONObject jSONObject2 = new JSONObject(str2);
                ck.p.j(jSONObject2, "jsonObject");
                ck.p.j(VideoViewPosition.class, "type");
                VideoViewPosition videoViewPosition = (VideoViewPosition) VideoViewPosition.class.cast(AbstractC3029ma.a(jSONObject2, VideoViewPosition.class, null, null));
                if (videoViewPosition == null || (objD = nk.j.d(A9.f22354f, null, null, new C3228ua(this, videoViewPosition, str2, null), 3, null)) == null) {
                    EnumC3102p8 enumC3102p8 = EnumC3102p8.VIDEO_READY;
                    a(str, jSONObject);
                    obj = mj.r.f64562a;
                } else {
                    obj = objD;
                }
            } catch (JSONException e10) {
                EnumC3102p8 enumC3102p9 = EnumC3102p8.VIDEO_READY;
                a(str, jSONObject);
                InterfaceC3028m9 interfaceC3028m10 = this.f25560c;
                if (interfaceC3028m10 != null) {
                    String str4 = AbstractC3278wa.f25629a;
                    ck.p.i(str4, "access$getTAG$p(...)");
                    ((C3053n9) interfaceC3028m10).a(str4, "Error while creating position Json.", e10);
                    obj = mj.r.f64562a;
                }
            }
            if (obj != null) {
                return;
            }
        }
        EnumC3102p8 enumC3102p10 = EnumC3102p8.VIDEO_READY;
        a(str, jSONObject);
        mj.r rVar = mj.r.f64562a;
    }

    @JavascriptInterface
    public final void useCustomClose(final String str, final boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "useCustomClose called:" + z10);
        }
        new Handler(this.f25558a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: b7.ob
            @Override // java.lang.Runnable
            public final void run() {
                C3253va.b(this.f5107b, z10, str);
            }
        });
    }

    @JavascriptInterface
    public final void zoom(String str, final int i10) {
        ck.p.j(str, "jsCallbackNamespace");
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "zoom is called " + str + com.ironsource.Z7.f27998r + i10);
        }
        Oj.a(new Runnable() { // from class: b7.za
            @Override // java.lang.Runnable
            public final void run() {
                C3253va.a(this.f5281b, i10);
            }
        });
    }

    @JavascriptInterface
    public final String getOrientationProperties(String str) {
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a();
        if (gestureDetectorOnGestureListenerC2785ciA == null) {
            gestureDetectorOnGestureListenerC2785ciA = this.f25558a;
        }
        String str2 = gestureDetectorOnGestureListenerC2785ciA.getOrientationProperties().f22647d;
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str3 = AbstractC3278wa.f25629a;
            ck.p.i(str3, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str3, "getOrientationProperties called: " + str2);
        }
        ck.p.g(str2);
        return str2;
    }

    public static final void b(final C3253va c3253va, String str) {
        Ff orientationProperties = c3253va.f25558a.getOrientationProperties();
        ck.p.j(str, "json");
        ck.p.j(orientationProperties, "op");
        final Ff ff2 = new Ff();
        ff2.f22647d = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("forceOrientation", orientationProperties.f22645b);
            ck.p.i(strOptString, "optString(...)");
            ck.p.j(strOptString, "<set-?>");
            ff2.f22645b = strOptString;
            ff2.f22644a = jSONObject.optBoolean("allowOrientationChange", orientationProperties.f22644a);
            String strOptString2 = jSONObject.optString("direction", orientationProperties.f22646c);
            ck.p.i(strOptString2, "optString(...)");
            ck.p.j(strOptString2, "<set-?>");
            ff2.f22646c = strOptString2;
            if (!ck.p.e(ff2.f22645b, C3426d4.i.D) && !ck.p.e(ff2.f22645b, C3426d4.i.C)) {
                ck.p.j("none", "<set-?>");
                ff2.f22645b = "none";
            }
            if (!ck.p.e(ff2.f22646c, "left") && !ck.p.e(ff2.f22646c, "right")) {
                ck.p.j("right", "<set-?>");
                ff2.f22646c = "right";
            }
        } catch (JSONException unused) {
            ff2 = null;
        }
        if (ff2 != null) {
            c3253va.f25558a.getWebViewFactory().a(new bk.l() { // from class: b7.bb
                @Override // bk.l
                public final Object invoke(Object obj) {
                    return C3253va.a(this.f4863b, ff2, (GestureDetectorOnGestureListenerC2785ci) obj);
                }
            });
        }
    }

    public final GestureDetectorOnGestureListenerC2785ci a() {
        if (!ck.p.e(this.f25558a.getRoute().f22535b, "default")) {
            ko webViewFactory = this.f25558a.getWebViewFactory();
            webViewFactory.getClass();
            ck.p.j("default", "id");
            return (GestureDetectorOnGestureListenerC2785ci) webViewFactory.f24705b.get("default");
        }
        return this.f25558a;
    }

    public final void a(final String str, final String str2, final int i10, final float f10, final boolean z10, final Ya ya2) {
        if (ya2 != null) {
            ya2.f23836f = "IN_CUSTOM";
        }
        new Handler(this.f25558a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: b7.hb
            @Override // java.lang.Runnable
            public final void run() {
                C3253va.a(this.f4964b, ya2, str2, i10, str, f10, z10);
            }
        });
    }

    public static final void a(C3253va c3253va, Ya ya2, String str, int i10, String str2, float f10, boolean z10) {
        try {
            if (c3253va.f25558a.getEmbeddedBrowserJsCallbacks() == null) {
                InterfaceC3028m9 interfaceC3028m9 = c3253va.f25560c;
                if (interfaceC3028m9 != null) {
                    String str3 = AbstractC3278wa.f25629a;
                    ck.p.i(str3, "access$getTAG$p(...)");
                    ((C3053n9) interfaceC3028m9).b(str3, "Found a null instance of EmbeddedBrowserJSCallback instance to customExpand");
                }
                c3253va.f25558a.getLandingPageHandler().a(Na.LPStartFailed, ya2, (Integer) 8002);
                return;
            }
            InterfaceC3028m9 interfaceC3028m10 = c3253va.f25560c;
            if (interfaceC3028m10 != null) {
                String str4 = AbstractC3278wa.f25629a;
                ck.p.i(str4, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).a(str4, "Custom expand called. Url: " + str);
            }
            R5 r10 = R5.values()[i10];
            if (r10 == R5.URL) {
                int iA = c3253va.f25558a.getLandingPageHandler().a("customExpand", str2, str, ya2, (P2) null);
                InterfaceC3028m9 interfaceC3028m11 = c3253va.f25560c;
                if (interfaceC3028m11 != null) {
                    String str5 = AbstractC3278wa.f25629a;
                    ck.p.i(str5, "access$getTAG$p(...)");
                    ((C3053n9) interfaceC3028m11).a(str5, "processCustomExpandRequest: " + iA);
                }
                if (iA == 3) {
                    S5 embeddedBrowserJsCallbacks = c3253va.f25558a.getEmbeddedBrowserJsCallbacks();
                    if (embeddedBrowserJsCallbacks != null) {
                        ((K8) embeddedBrowserJsCallbacks).a(str, r10, f10, z10, c3253va.f25558a.getViewTouchTimestamp(), ya2);
                    }
                    c3253va.f25558a.getLandingPageHandler().a(Na.LPStartSuccess, ya2, (Integer) null);
                    Ma ma2 = c3253va.f25558a.getLandingPageHandler().f23632d;
                    if (ma2 != null) {
                        ma2.b("customExpand", str2, str);
                        return;
                    }
                    return;
                }
                S5 embeddedBrowserJsCallbacks2 = c3253va.f25558a.getEmbeddedBrowserJsCallbacks();
                if (embeddedBrowserJsCallbacks2 != null) {
                    M8.a(((K8) embeddedBrowserJsCallbacks2).f23006a);
                    return;
                }
                return;
            }
            S5 embeddedBrowserJsCallbacks3 = c3253va.f25558a.getEmbeddedBrowserJsCallbacks();
            if (embeddedBrowserJsCallbacks3 != null) {
                ((K8) embeddedBrowserJsCallbacks3).a(str, r10, f10, z10, c3253va.f25558a.getViewTouchTimestamp(), ya2);
            }
            c3253va.f25558a.getLandingPageHandler().a(Na.LPStartSuccess, ya2, (Integer) null);
            Ma ma3 = c3253va.f25558a.getLandingPageHandler().f23632d;
            if (ma3 != null) {
                ma3.b("customExpand", str2, str);
            }
        } catch (Exception e10) {
            c3253va.f25558a.a(str2, "Unexpected error", "customExpand");
            c3253va.f25558a.getLandingPageHandler().a(Na.LPStartFailed, ya2, (Integer) 9);
            Kb.a((byte) 1, "InMobi", "Failed to custom expand ad; SDK encountered an unexpected error");
            InterfaceC3028m9 interfaceC3028m12 = c3253va.f25560c;
            if (interfaceC3028m12 != null) {
                String str6 = AbstractC3278wa.f25629a;
                ck.p.i(str6, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m12).b(str6, "SDK encountered unexpected error in handling customExpand() request; " + e10.getMessage());
            }
        }
    }

    public static final void c(C3253va c3253va) {
        try {
            c3253va.f25558a.I();
        } catch (Exception e10) {
            InterfaceC3028m9 interfaceC3028m9 = c3253va.f25560c;
            if (interfaceC3028m9 != null) {
                String str = AbstractC3278wa.f25629a;
                ck.p.i(str, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).b(str, "SDK encountered unexpected error in getting/setting default position; " + e10.getMessage());
            }
        }
    }

    public static final void c(C3253va c3253va, String str) {
        try {
            c3253va.f25558a.getSiblingWebviewManager().b(c3253va.f25558a.getRoute().f22535b, str);
        } catch (Exception e10) {
            c3253va.f25558a.a("showWebView", AbstractC3211ti.a(str, 309));
            InterfaceC3028m9 interfaceC3028m9 = c3253va.f25560c;
            if (interfaceC3028m9 != null) {
                String str2 = AbstractC3278wa.f25629a;
                ck.p.i(str2, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).b(str2, "SDK encountered unexpected error in handling showEndCard() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void b(C3253va c3253va, boolean z10, String str) {
        try {
            c3253va.f25558a.f(z10);
        } catch (Exception e10) {
            c3253va.f25558a.a(str, "Unexpected error", "useCustomClose");
            InterfaceC3028m9 interfaceC3028m9 = c3253va.f25560c;
            if (interfaceC3028m9 != null) {
                String str2 = AbstractC3278wa.f25629a;
                ck.p.i(str2, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).b(str2, "SDK encountered internal error in handling useCustomClose() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void a(C3253va c3253va) {
        if (c3253va.f25558a.getEmbeddedBrowserJsCallbacks() == null) {
            InterfaceC3028m9 interfaceC3028m9 = c3253va.f25560c;
            if (interfaceC3028m9 != null) {
                String str = AbstractC3278wa.f25629a;
                ck.p.i(str, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).b(str, "Found a null instance of EmbeddedBrowserJSCallback instance to closeCustomExpand");
                return;
            }
            return;
        }
        S5 embeddedBrowserJsCallbacks = c3253va.f25558a.getEmbeddedBrowserJsCallbacks();
        if (embeddedBrowserJsCallbacks != null) {
            M8.a(((K8) embeddedBrowserJsCallbacks).f23006a);
        }
    }

    public static final mj.r a(C3253va c3253va, Ff ff2, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "it");
        if (gestureDetectorOnGestureListenerC2785ci.O0) {
            InterfaceC3028m9 interfaceC3028m9 = c3253va.f25560c;
            if (interfaceC3028m9 != null) {
                String str = AbstractC3278wa.f25629a;
                ck.p.i(str, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).b(str, "setOrientationProperties called on unloaded ad");
            }
            return mj.r.f64562a;
        }
        gestureDetectorOnGestureListenerC2785ci.a(ff2);
        return mj.r.f64562a;
    }

    public static final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, C3253va c3253va, String str) {
        try {
            gestureDetectorOnGestureListenerC2785ci.m();
        } catch (Exception e10) {
            c3253va.f25558a.a(str, "Unexpected error", "close");
            Kb.a((byte) 1, "InMobi", "Failed to close ad; SDK encountered an unexpected error");
            InterfaceC3028m9 interfaceC3028m9 = c3253va.f25560c;
            if (interfaceC3028m9 != null) {
                String str2 = AbstractC3278wa.f25629a;
                ck.p.i(str2, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).b(str2, "SDK encountered an expected error in handling the close() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final mj.r a(C3253va c3253va, Ne ne2) {
        ck.p.j(ne2, "response");
        if (AbstractC2891gl.a(ne2)) {
            InterfaceC3028m9 interfaceC3028m9 = c3253va.f25560c;
            if (interfaceC3028m9 != null) {
                String str = AbstractC3278wa.f25629a;
                ck.p.i(str, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).a(str, "asyncPing Successful");
            }
        } else {
            InterfaceC3028m9 interfaceC3028m10 = c3253va.f25560c;
            if (interfaceC3028m10 != null) {
                String str2 = AbstractC3278wa.f25629a;
                ck.p.i(str2, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str2, "asyncPing Failed");
            }
        }
        return mj.r.f64562a;
    }

    public static final void a(C3253va c3253va, boolean z10, String str) {
        try {
            c3253va.f25558a.e(z10);
        } catch (Exception e10) {
            c3253va.f25558a.a(str, "Unexpected error", "disableCloseRegion");
            InterfaceC3028m9 interfaceC3028m9 = c3253va.f25560c;
            if (interfaceC3028m9 != null) {
                String str2 = AbstractC3278wa.f25629a;
                ck.p.i(str2, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).b(str2, "SDK encountered unexpected error in handling disableCloseRegion() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final mj.r a(boolean z10, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "it");
        gestureDetectorOnGestureListenerC2785ci.setDisableBackButton(z10);
        return mj.r.f64562a;
    }

    public static final void a(C3253va c3253va, int i10) {
        c3253va.f25558a.setInitialScale(i10);
    }

    public static final void a(C3253va c3253va, String str, String str2) {
        try {
            c3253va.f25558a.getSiblingWebviewManager().a(c3253va.f25558a.getRoute().f22535b, str, str2);
        } catch (Exception e10) {
            c3253va.f25558a.a("loadWebView", AbstractC3211ti.a(str, 308));
            InterfaceC3028m9 interfaceC3028m9 = c3253va.f25560c;
            if (interfaceC3028m9 != null) {
                String str3 = AbstractC3278wa.f25629a;
                ck.p.i(str3, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).b(str3, "SDK encountered unexpected error in handling loadWebView() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void a(C3253va c3253va, String str) {
        try {
            c3253va.f25558a.getSiblingWebviewManager().a(c3253va.f25558a.getRoute().f22535b, str);
        } catch (Exception e10) {
            c3253va.f25558a.a("destroyWebView", AbstractC3211ti.a(str, 311));
            InterfaceC3028m9 interfaceC3028m9 = c3253va.f25560c;
            if (interfaceC3028m9 != null) {
                String str2 = AbstractC3278wa.f25629a;
                ck.p.i(str2, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).b(str2, "SDK encountered unexpected error in handling destroyWebView() request from creative; " + e10.getMessage());
            }
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25560c;
        if (interfaceC3028m9 != null) {
            String str2 = AbstractC3278wa.f25629a;
            ck.p.i(str2, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str2, "fireVideoError " + this + " - " + jSONObject);
        }
        if (str != null) {
            this.f25558a.a(str, "broadcastEvent('VideoCommandError'," + jSONObject + ")");
        }
    }
}
