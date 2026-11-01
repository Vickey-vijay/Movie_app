package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.ads.network.common.model.InlineParams;
import com.ironsource.C3537j8;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko f23580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3028m9 f23581b;

    public final GestureDetectorOnGestureListenerC2785ci a() {
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a("default");
        if (gestureDetectorOnGestureListenerC2785ciA != null) {
            return gestureDetectorOnGestureListenerC2785ciA;
        }
        InterfaceC3028m9 interfaceC3028m9 = this.f23581b;
        if (interfaceC3028m9 != null) {
            ck.p.i("Ti", "TAG");
            ((C3053n9) interfaceC3028m9).b("Ti", "AdRenderView is null, cannot initialize webview.");
        }
        return null;
    }

    public final void b(String str, String str2) throws JSONException {
        Object next;
        Integer numA;
        ck.p.j(str, "sourceId");
        ck.p.j(str2, "targetId");
        InterfaceC3028m9 interfaceC3028m9 = this.f23581b;
        if (interfaceC3028m9 != null) {
            ck.p.i("Ti", "TAG");
            ((C3053n9) interfaceC3028m9).a("Ti", "showWebView " + this);
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a(str);
        if (gestureDetectorOnGestureListenerC2785ciA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA2 = a(str2);
        if (gestureDetectorOnGestureListenerC2785ciA2 == null) {
            mj.g gVar = AbstractC3211ti.f25397a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 304);
            gestureDetectorOnGestureListenerC2785ciA.a("showWebView", jSONObjectA);
            return;
        }
        if (ck.p.e(str2, "default")) {
            a(gestureDetectorOnGestureListenerC2785ciA, str2, "showWebView");
            return;
        }
        if (!(gestureDetectorOnGestureListenerC2785ciA2 instanceof C2987ki)) {
            mj.g gVar2 = AbstractC3211ti.f25397a;
            JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, 305);
            gestureDetectorOnGestureListenerC2785ciA.a("showWebView", jSONObjectA2);
            return;
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA3 = a();
        if (gestureDetectorOnGestureListenerC2785ciA3 != null && !gestureDetectorOnGestureListenerC2785ciA3.isAttachedToWindow()) {
            mj.g gVar3 = AbstractC3211ti.f25397a;
            JSONObject jSONObjectA3 = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA3.put(IronSourceConstants.EVENTS_ERROR_CODE, 305);
            gestureDetectorOnGestureListenerC2785ciA.a("showWebView", jSONObjectA3);
            return;
        }
        Integer numA2 = gestureDetectorOnGestureListenerC2785ciA2.getWvStateMachine().a(5);
        if (numA2 != null) {
            int iIntValue = numA2.intValue();
            mj.g gVar4 = AbstractC3211ti.f25397a;
            JSONObject jSONObjectA4 = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA4.put(IronSourceConstants.EVENTS_ERROR_CODE, iIntValue);
            gestureDetectorOnGestureListenerC2785ciA.a("showWebView", jSONObjectA4);
            return;
        }
        Iterator it = kotlin.collections.a.x(this.f23580a.f24705b).values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) next;
            if (gestureDetectorOnGestureListenerC2785ci.getWvStateMachine().f24448b == 105 && !ck.p.e(gestureDetectorOnGestureListenerC2785ci, gestureDetectorOnGestureListenerC2785ciA2) && !ck.p.e(gestureDetectorOnGestureListenerC2785ci.getRoute().f22535b, "default")) {
                break;
            }
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = (GestureDetectorOnGestureListenerC2785ci) next;
        if (gestureDetectorOnGestureListenerC2785ci2 != null && (numA = gestureDetectorOnGestureListenerC2785ci2.getWvStateMachine().a(7)) != null) {
            int iIntValue2 = numA.intValue();
            mj.g gVar5 = AbstractC3211ti.f25397a;
            JSONObject jSONObjectA5 = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA5.put(IronSourceConstants.EVENTS_ERROR_CODE, iIntValue2);
            gestureDetectorOnGestureListenerC2785ciA.a("showWebView", jSONObjectA5);
        }
        C2987ki c2987ki = (C2987ki) gestureDetectorOnGestureListenerC2785ciA2;
        if (c2987ki.isAttachedToWindow()) {
            a(gestureDetectorOnGestureListenerC2785ciA2, gestureDetectorOnGestureListenerC2785ciA, str2);
            return;
        }
        a(gestureDetectorOnGestureListenerC2785ciA, c2987ki);
        a(gestureDetectorOnGestureListenerC2785ciA2);
        Fn viewableAd = c2987ki.getViewableAd();
        Map<View, FriendlyObstructionPurpose> friendlyViews = gestureDetectorOnGestureListenerC2785ciA2.getFriendlyViews();
        if (friendlyViews == null) {
            friendlyViews = new HashMap<>();
        }
        viewableAd.a(friendlyViews);
    }

    public Ti(ko koVar, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(koVar, "wvFactory");
        this.f23580a = koVar;
        this.f23581b = interfaceC3028m9;
    }

    public final GestureDetectorOnGestureListenerC2785ci a(String str) {
        ko koVar = this.f23580a;
        koVar.getClass();
        ck.p.j(str, "id");
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) koVar.f24705b.get(str);
        if (gestureDetectorOnGestureListenerC2785ci != null) {
            return gestureDetectorOnGestureListenerC2785ci;
        }
        InterfaceC3028m9 interfaceC3028m9 = this.f23581b;
        if (interfaceC3028m9 == null) {
            return null;
        }
        ck.p.i("Ti", "TAG");
        ((C3053n9) interfaceC3028m9).b("Ti", "View with ID: " + str + " not found.");
        return null;
    }

    public final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, C2987ki c2987ki) {
        InterfaceC3028m9 interfaceC3028m9 = this.f23581b;
        if (interfaceC3028m9 != null) {
            ck.p.i("Ti", "TAG");
            ((C3053n9) interfaceC3028m9).a("Ti", "setUpLayoutForAd " + this);
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a();
        Context containerContext = gestureDetectorOnGestureListenerC2785ciA != null ? gestureDetectorOnGestureListenerC2785ciA.getContainerContext() : null;
        if (containerContext == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f23581b;
            if (interfaceC3028m10 != null) {
                ck.p.i("Ti", "TAG");
                ((C3053n9) interfaceC3028m10).b("Ti", "Context is null, cannot initialize webview.");
            }
            containerContext = null;
        }
        if (containerContext == null) {
            return;
        }
        if (!(containerContext instanceof InMobiAdActivity)) {
            InterfaceC3028m9 interfaceC3028m11 = this.f23581b;
            if (interfaceC3028m11 != null) {
                ck.p.i("Ti", "TAG");
                ((C3053n9) interfaceC3028m11).b("Ti", "Context is not an instance of InMobiAdActivity.");
            }
            a(gestureDetectorOnGestureListenerC2785ci, c2987ki.getRoute().f22535b, "loadWebView");
            return;
        }
        c2987ki.setFullScreenActivityContext((Activity) containerContext);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        InterfaceC3028m9 interfaceC3028m12 = this.f23581b;
        if (interfaceC3028m12 != null) {
            ck.p.i("Ti", "TAG");
            ((C3053n9) interfaceC3028m12).a("Ti", "target View's Viewable ad - " + c2987ki.getViewableAd());
        }
        View viewC = c2987ki.getViewableAd().c();
        ViewGroup viewGroup = (ViewGroup) ((InMobiAdActivity) containerContext).findViewById(65534);
        Context context = viewGroup.getContext();
        ck.p.i(context, "getContext(...)");
        RelativeLayout relativeLayout = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if ((viewC != null ? viewC.getParent() : null) != null) {
            ViewParent parent = viewC.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewC);
            }
        }
        relativeLayout.addView(viewC, layoutParams2);
        viewGroup.addView(relativeLayout, layoutParams);
        c2987ki.a(relativeLayout);
        InterfaceC3028m9 interfaceC3028m13 = this.f23581b;
        if (interfaceC3028m13 != null) {
            ck.p.i("Ti", "TAG");
            ((C3053n9) interfaceC3028m13).a("Ti", "Target View added - the inflatedView is - " + viewC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.inmobi.media.Fn] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.inmobi.media.ci] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ?? viewableAd;
        InterfaceC3028m9 interfaceC3028m9 = this.f23581b;
        if (interfaceC3028m9 != null) {
            ck.p.i("Ti", "TAG");
            ((C3053n9) interfaceC3028m9).a("Ti", "Add renderViewSibling as friendlyView for omsdkTracking  " + this);
        }
        ViewParent parent = gestureDetectorOnGestureListenerC2785ci.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            gestureDetectorOnGestureListenerC2785ci = viewGroup;
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a();
        if (gestureDetectorOnGestureListenerC2785ciA == null || (viewableAd = gestureDetectorOnGestureListenerC2785ciA.getViewableAd()) == 0) {
            return;
        }
        viewableAd.a(gestureDetectorOnGestureListenerC2785ci, FriendlyObstructionPurpose.OTHER);
    }

    public final void a(String str, String str2, String str3) throws JSONException {
        Context context;
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA;
        ck.p.j(str, "sourceId");
        ck.p.j(str2, "targetId");
        ck.p.j(str3, CreativeInfo.f44315al);
        InterfaceC3028m9 interfaceC3028m9 = this.f23581b;
        if (interfaceC3028m9 != null) {
            ck.p.i("Ti", "TAG");
            ((C3053n9) interfaceC3028m9).a("Ti", "loadWebView " + this);
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA2 = a();
        Context containerContext = gestureDetectorOnGestureListenerC2785ciA2 != null ? gestureDetectorOnGestureListenerC2785ciA2.getContainerContext() : null;
        if (containerContext == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f23581b;
            if (interfaceC3028m10 != null) {
                ck.p.i("Ti", "TAG");
                ((C3053n9) interfaceC3028m10).b("Ti", "Context is null, cannot initialize webview.");
            }
            context = null;
        } else {
            context = containerContext;
        }
        if (context == null || (gestureDetectorOnGestureListenerC2785ciA = a(str)) == null) {
            return;
        }
        if (ck.p.e(str2, "default")) {
            a(gestureDetectorOnGestureListenerC2785ciA, str2, "loadWebView");
            return;
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA3 = a();
        if (gestureDetectorOnGestureListenerC2785ciA3 == null) {
            gestureDetectorOnGestureListenerC2785ciA.a("loadWebView", AbstractC3211ti.a(str2, 304));
            return;
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA4 = a(str2);
        if (gestureDetectorOnGestureListenerC2785ciA4 != null) {
            int i10 = gestureDetectorOnGestureListenerC2785ciA4.getWvStateMachine().f24448b;
            mj.g gVar = AbstractC3211ti.f25397a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
            gestureDetectorOnGestureListenerC2785ciA.a("loadWebView", jSONObjectA);
            return;
        }
        C2987ki c2987kiA = a(gestureDetectorOnGestureListenerC2785ciA3, str2, this, gestureDetectorOnGestureListenerC2785ciA, context, SystemClock.elapsedRealtime());
        if (c2987kiA != null) {
            c2987kiA.h(str3);
        }
    }

    public final void b(String str, String str2, String str3) throws JSONException {
        ck.p.j(str, "sourceId");
        ck.p.j(str2, "targetId");
        ck.p.j(str3, "message");
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a(str);
        if (gestureDetectorOnGestureListenerC2785ciA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA2 = a(str2);
        if (gestureDetectorOnGestureListenerC2785ciA2 == null) {
            mj.g gVar = AbstractC3211ti.f25397a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 304);
            gestureDetectorOnGestureListenerC2785ciA.a(C3537j8.f29256j, jSONObjectA);
            return;
        }
        int i10 = gestureDetectorOnGestureListenerC2785ciA2.getWvStateMachine().f24448b;
        if (!ck.p.e(gestureDetectorOnGestureListenerC2785ciA2.getRoute().f22535b, "default") && nj.s.n(101, 104, 107).contains(Integer.valueOf(i10))) {
            InterfaceC3028m9 interfaceC3028m9 = this.f23581b;
            if (interfaceC3028m9 != null) {
                ck.p.i("Ti", "TAG");
                ((C3053n9) interfaceC3028m9).b("Ti", "WebView is not in state to receive messages: " + str2);
            }
            int i11 = gestureDetectorOnGestureListenerC2785ciA2.getWvStateMachine().f24448b;
            mj.g gVar2 = AbstractC3211ti.f25397a;
            JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, i11);
            gestureDetectorOnGestureListenerC2785ciA.a(C3537j8.f29256j, jSONObjectA2);
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f23581b;
        if (interfaceC3028m10 != null) {
            ck.p.i("Ti", "TAG");
            ((C3053n9) interfaceC3028m10).a("Ti", "Sending message to WebView ID: " + str2);
        }
        gestureDetectorOnGestureListenerC2785ciA2.g(str3);
    }

    public static final C2987ki a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, String str, Ti ti2, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2, Context context, long j10) {
        C3069o0 c3069o0A;
        C2888gi c2888gi;
        C3069o0 adMetaData = gestureDetectorOnGestureListenerC2785ci.getAdMetaData();
        if (adMetaData != null) {
            C2888gi c2888gi2 = gestureDetectorOnGestureListenerC2785ci.getAdMetaData().f24935s;
            if (c2888gi2 != null) {
                C3243v0 c3243v0 = c2888gi2.f24434a;
                String str2 = c2888gi2.f24435b;
                String str3 = c2888gi2.f24436c;
                String str4 = c2888gi2.f24437d;
                int i10 = c2888gi2.f24438e;
                String str5 = c2888gi2.f24439f;
                String str6 = c2888gi2.f24440g;
                boolean z10 = c2888gi2.f24441h;
                int i11 = c2888gi2.f24442i;
                C3120q1 c3120q1 = c2888gi2.f24443j;
                C3012li c3012li = c2888gi2.f24444k;
                InlineParams inlineParams = c2888gi2.f24446m;
                ck.p.j(c3243v0, "placement");
                ck.p.j(str2, "markupType");
                ck.p.j(str3, "impressionId");
                ck.p.j(str4, "telemetryMetadataBlob");
                ck.p.j(str5, "creativeType");
                ck.p.j(str6, "creativeId");
                c2888gi = new C2888gi(c3243v0, str2, str3, str4, i10, str5, str6, z10, i11, c3120q1, c3012li, str, inlineParams);
            } else {
                c2888gi = null;
            }
            c3069o0A = C3069o0.a(adMetaData, c2888gi, 3665663);
        } else {
            c3069o0A = null;
        }
        if (c3069o0A == null) {
            InterfaceC3028m9 interfaceC3028m9 = ti2.f23581b;
            if (interfaceC3028m9 != null) {
                ck.p.i("Ti", "TAG");
                ((C3053n9) interfaceC3028m9).b("Ti", "AdMetaData is null, cannot initialize webview.");
            }
            return null;
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = ti2.f23580a.a(new Di(gestureDetectorOnGestureListenerC2785ci2.getRoute().f22535b, str), context, (short) 1, c3069o0A, gestureDetectorOnGestureListenerC2785ci.getAdConfig());
        C2987ki c2987ki = gestureDetectorOnGestureListenerC2785ciA instanceof C2987ki ? (C2987ki) gestureDetectorOnGestureListenerC2785ciA : null;
        if (c2987ki == null) {
            InterfaceC3028m9 interfaceC3028m10 = ti2.f23581b;
            if (interfaceC3028m10 != null) {
                ck.p.i("Ti", "TAG");
                ((C3053n9) interfaceC3028m10).b("Ti", "Failed to create Sibling WebView with ID: " + str);
            }
            gestureDetectorOnGestureListenerC2785ci2.a("loadWebView", AbstractC3211ti.a(str, 313));
            return null;
        }
        Integer numA = c2987ki.getWvStateMachine().a(1);
        if (numA != null) {
            gestureDetectorOnGestureListenerC2785ci2.a("loadWebView", AbstractC3211ti.a(str, numA.intValue()));
        }
        c2987ki.Z();
        C3037mi renderViewTelemetry = c2987ki.getRenderViewTelemetry();
        if (renderViewTelemetry != null) {
            renderViewTelemetry.f24836b = j10;
        }
        return c2987ki;
    }

    public final void a(String str, String str2) throws JSONException {
        ck.p.j(str, "sourceId");
        ck.p.j(str2, "targetId");
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA = a(str);
        if (gestureDetectorOnGestureListenerC2785ciA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciA2 = a(str2);
        if (gestureDetectorOnGestureListenerC2785ciA2 == null) {
            mj.g gVar = AbstractC3211ti.f25397a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 304);
            gestureDetectorOnGestureListenerC2785ciA.a("destroyWebView", jSONObjectA);
            return;
        }
        if (ck.p.e(str2, "default")) {
            a(gestureDetectorOnGestureListenerC2785ciA, str2, "destroyWebView");
            return;
        }
        Integer numA = gestureDetectorOnGestureListenerC2785ciA2.getWvStateMachine().a(8);
        if (numA != null) {
            int iIntValue = numA.intValue();
            mj.g gVar2 = AbstractC3211ti.f25397a;
            JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, iIntValue);
            gestureDetectorOnGestureListenerC2785ciA.a("destroyWebView", jSONObjectA2);
            return;
        }
        gestureDetectorOnGestureListenerC2785ciA2.b();
        gestureDetectorOnGestureListenerC2785ciA.a(gestureDetectorOnGestureListenerC2785ciA, str2);
        InterfaceC3028m9 interfaceC3028m9 = this.f23581b;
        if (interfaceC3028m9 != null) {
            ck.p.i("Ti", "TAG");
            ((C3053n9) interfaceC3028m9).a("Ti", "WebView with ID: " + str2 + " removed from parent.");
        }
    }

    public final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, String str, String str2) {
        InterfaceC3028m9 interfaceC3028m9 = this.f23581b;
        if (interfaceC3028m9 != null) {
            ck.p.i("Ti", "TAG");
            ((C3053n9) interfaceC3028m9).b("Ti", "Cannot perform operations on default WebView with ID: " + str);
        }
        gestureDetectorOnGestureListenerC2785ci.a(str2, AbstractC3211ti.a(str, 303));
    }

    public final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2, String str) throws JSONException {
        ViewParent parent = gestureDetectorOnGestureListenerC2785ci.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            viewGroup = gestureDetectorOnGestureListenerC2785ci;
        }
        ViewParent parent2 = viewGroup.getParent();
        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup2 == null) {
            gestureDetectorOnGestureListenerC2785ci2.a("showWebView", AbstractC3211ti.a(str, 307));
            return;
        }
        if (viewGroup2.indexOfChild(viewGroup) != -1) {
            viewGroup2.bringChildToFront(viewGroup);
            InterfaceC3028m9 interfaceC3028m9 = this.f23581b;
            if (interfaceC3028m9 != null) {
                ck.p.i("Ti", "TAG");
                ((C3053n9) interfaceC3028m9).a("Ti", "Sibling view brought to front: " + gestureDetectorOnGestureListenerC2785ci);
            }
        } else {
            InterfaceC3028m9 interfaceC3028m10 = this.f23581b;
            if (interfaceC3028m10 != null) {
                ck.p.i("Ti", "TAG");
                ((C3053n9) interfaceC3028m10).b("Ti", "Sibling view not found in parent: " + gestureDetectorOnGestureListenerC2785ci);
            }
        }
        gestureDetectorOnGestureListenerC2785ci2.c(gestureDetectorOnGestureListenerC2785ci2, str);
    }
}
