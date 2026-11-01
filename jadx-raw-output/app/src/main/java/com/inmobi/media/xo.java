package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class xo implements so {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final WeakHashMap f25747g = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uo f25748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3028m9 f25749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f25750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f25751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f25752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Df f25753f;

    public xo(Activity activity, uo uoVar, InterfaceC3028m9 interfaceC3028m9) {
        Window window;
        ck.p.j(uoVar, "windowInsetListener");
        this.f25748a = uoVar;
        this.f25749b = interfaceC3028m9;
        this.f25751d = new ConcurrentHashMap();
        WeakReference weakReference = new WeakReference(activity);
        this.f25752e = weakReference;
        C3298x5.f25687a.getClass();
        if (!C3298x5.u()) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        Activity activity2 = (Activity) weakReference.get();
        View decorView = (activity2 == null || (window = activity2.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            this.f25750c = decorView;
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a("WindowInsetsHandler", "startListeningToInsets");
            }
            WeakHashMap weakHashMap = f25747g;
            Object toVar = weakHashMap.get(decorView);
            if (toVar == null) {
                toVar = new to(decorView);
                weakHashMap.put(decorView, toVar);
            }
            ck.p.j(this, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            ((to) toVar).f25416a.add(this);
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
            }
        }
    }

    public final void a(WindowInsets windowInsets) {
        try {
            Activity activity = (Activity) this.f25752e.get();
            if (!this.f25748a.a()) {
                InterfaceC3028m9 interfaceC3028m9 = this.f25749b;
                if (interfaceC3028m9 != null) {
                    ((C3053n9) interfaceC3028m9).a("WindowInsetsHandler", "listener is not interested in computing insets, skipping");
                    return;
                }
                return;
            }
            if (activity == null) {
                InterfaceC3028m9 interfaceC3028m10 = this.f25749b;
                if (interfaceC3028m10 != null) {
                    ((C3053n9) interfaceC3028m10).b("WindowInsetsHandler", "Activity is null, skipping safeArea computation");
                    return;
                }
                return;
            }
            vo voVarB = F3.a(activity) ? AbstractC3211ti.b(windowInsets) : AbstractC3211ti.a(windowInsets);
            Integer numF = J5.f();
            int iIntValue = numF != null ? numF.intValue() : J5.a(windowInsets);
            J5.a(Integer.valueOf(iIntValue));
            a(voVarB, iIntValue);
        } catch (Error e10) {
            InterfaceC3028m9 interfaceC3028m11 = this.f25749b;
            if (interfaceC3028m11 != null) {
                ((C3053n9) interfaceC3028m11).b("WindowInsetsHandler", "Error in getting safeArea " + e10.getMessage());
            }
        } catch (Exception e11) {
            InterfaceC3028m9 interfaceC3028m12 = this.f25749b;
            if (interfaceC3028m12 != null) {
                ((C3053n9) interfaceC3028m12).a("WindowInsetsHandler", "Exception in getting safeArea", e11);
            }
        }
    }

    public final void a(vo voVar, int i10) {
        Df dfA = Ef.a(J5.g());
        wo woVar = (wo) this.f25751d.get(Integer.valueOf(i10));
        if (woVar == null) {
            woVar = new wo();
            this.f25751d.put(Integer.valueOf(i10), woVar);
        }
        ck.p.j(dfA, "orientation");
        vo voVar2 = (vo) woVar.f25675a.get(dfA);
        if (voVar2 != null && ck.p.e(voVar, voVar2)) {
            InterfaceC3028m9 interfaceC3028m9 = this.f25749b;
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a("WindowInsetsHandler", "SafeArea - Same value, no need to update");
            }
        } else {
            InterfaceC3028m9 interfaceC3028m10 = this.f25749b;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a("WindowInsetsHandler", "safeArea - New value, updating to KV store");
            }
            ck.p.j(dfA, "orientation");
            ck.p.j(voVar, "insets");
            woVar.f25675a.put(dfA, voVar);
            ConcurrentHashMap concurrentHashMap = this.f25751d;
            LinkedHashMap linkedHashMap = new LinkedHashMap(nj.l0.f(concurrentHashMap.size()));
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((wo) entry.getValue()).a());
            }
            J5.a(linkedHashMap);
        }
        if (this.f25753f != dfA) {
            this.f25753f = dfA;
            uo uoVar = this.f25748a;
            Object obj = this.f25751d.get(Integer.valueOf(i10));
            ck.p.g(obj);
            uoVar.a(dfA, (wo) obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xo(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, uo uoVar, InterfaceC3028m9 interfaceC3028m9) {
        this((Activity) null, uoVar, interfaceC3028m9);
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(uoVar, "windowInsetListener");
        C3298x5.f25687a.getClass();
        if (!C3298x5.u()) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        this.f25750c = gestureDetectorOnGestureListenerC2785ci;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("WindowInsetsHandler", "startListeningToInsets");
        }
        WeakHashMap weakHashMap = f25747g;
        Object toVar = weakHashMap.get(gestureDetectorOnGestureListenerC2785ci);
        if (toVar == null) {
            toVar = new to(gestureDetectorOnGestureListenerC2785ci);
            weakHashMap.put(gestureDetectorOnGestureListenerC2785ci, toVar);
        }
        ck.p.j(this, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ((to) toVar).f25416a.add(this);
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
        }
    }

    public final void a() {
        View view = this.f25750c;
        if (view != null) {
            WeakHashMap weakHashMap = f25747g;
            to toVar = (to) weakHashMap.get(view);
            if (toVar != null) {
                ck.p.j(this, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                toVar.f25416a.remove(this);
                if (toVar.f25416a.isEmpty()) {
                    toVar.a();
                    weakHashMap.remove(view);
                }
            }
            InterfaceC3028m9 interfaceC3028m9 = this.f25749b;
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a("WindowInsetsHandler_INSTANCE", this + " destroy - " + weakHashMap.size());
            }
        }
        this.f25750c = null;
        this.f25751d.clear();
    }
}
