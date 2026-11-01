package com.unity3d.services.ads.offerwall;

import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.j;
import nk.l0;
import qk.e;
import qk.k;
import qk.p;
import qk.q;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: OfferwallAdapterBridge.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class OfferwallAdapterBridge {
    private final k<OfferwallEventData> _offerwallEventFlow;
    private final p<OfferwallEventData> offerwallEventFlow;
    private final HashMap<String, Object> placementsMap;
    private final l0 scope;

    public final boolean isConnected() {
        try {
            Boolean bool = (Boolean) Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("isConnected", new Class[0]).invoke(null, new Object[0]);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$showAd$1, reason: invalid class name */
    /* JADX INFO: compiled from: OfferwallAdapterBridge.kt */
    @d(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$showAd$1", f = "OfferwallAdapterBridge.kt", l = {56}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements bk.p<l0, c<? super r>, Object> {
        public final /* synthetic */ String $placementName;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$placementName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return OfferwallAdapterBridge.this.new AnonymousClass1(this.$placementName, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                k kVar = OfferwallAdapterBridge.this._offerwallEventFlow;
                OfferwallEventData offerwallEventData = new OfferwallEventData(OfferwallEvent.SHOW_FAILED, this.$placementName, null, null, 12, null);
                this.label = 1;
                if (kVar.emit(offerwallEventData, this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    public OfferwallAdapterBridge(l0 l0Var) {
        ck.p.j(l0Var, "scope");
        this.scope = l0Var;
        k<OfferwallEventData> kVarB = q.b(0, 0, null, 7, null);
        this._offerwallEventFlow = kVarB;
        this.offerwallEventFlow = e.a(kVarB);
        this.placementsMap = new HashMap<>();
    }

    private final Object getPlacement(String str) {
        return Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("getPlacement", String.class, Class.forName("com.tapjoy.TJPlacementListener")).invoke(null, str, Proxy.newProxyInstance(Class.forName("com.tapjoy.TJPlacementListener").getClassLoader(), new Class[]{Class.forName("com.tapjoy.TJPlacementListener")}, tapjoyPlacementListener()));
    }

    private final InvocationHandler tapjoyPlacementListener() {
        return new InvocationHandler() { // from class: com.unity3d.services.ads.offerwall.a
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return OfferwallAdapterBridge.tapjoyPlacementListener$lambda$0(this.f45374a, obj, method, objArr);
            }
        };
    }

    public final p<OfferwallEventData> getOfferwallEventFlow() {
        return this.offerwallEventFlow;
    }

    public final String getVersion() {
        try {
            String str = (String) Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("getVersion", new Class[0]).invoke(null, new Object[0]);
            return str == null ? "0.0.0" : str;
        } catch (Exception unused) {
            return "0.0.0";
        }
    }

    public final boolean isAdReady(String str) {
        ck.p.j(str, "placementName");
        Object placement = getPlacement(str);
        Method declaredMethod = placement != null ? placement.getClass().getDeclaredMethod("isContentReady", new Class[0]) : null;
        Boolean bool = (Boolean) (declaredMethod != null ? declaredMethod.invoke(placement, new Object[0]) : null);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void loadAd(String str) throws IllegalAccessException, InvocationTargetException {
        ck.p.j(str, "placementName");
        Object placement = getPlacement(str);
        this.placementsMap.put(str, placement);
        Method declaredMethod = placement != null ? placement.getClass().getDeclaredMethod("requestContent", new Class[0]) : null;
        if (declaredMethod != null) {
            declaredMethod.invoke(placement, new Object[0]);
        }
    }

    public final void showAd(String str) throws IllegalAccessException, InvocationTargetException {
        ck.p.j(str, "placementName");
        Object obj = this.placementsMap.get(str);
        Method declaredMethod = obj != null ? obj.getClass().getDeclaredMethod("isContentAvailable", new Class[0]) : null;
        Boolean bool = (Boolean) (declaredMethod != null ? declaredMethod.invoke(obj, new Object[0]) : null);
        if (bool != null ? bool.booleanValue() : false) {
            Method declaredMethod2 = obj != null ? obj.getClass().getDeclaredMethod("showContent", new Class[0]) : null;
            if (declaredMethod2 != null) {
                declaredMethod2.invoke(obj, new Object[0]);
            }
        } else {
            j.d(this.scope, null, null, new AnonymousClass1(str, null), 3, null);
        }
        this.placementsMap.remove(str);
    }

    private final String getPlacementName(Object obj) {
        return (String) obj.getClass().getDeclaredMethod("getName", new Class[0]).invoke(obj, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object tapjoyPlacementListener$lambda$0(OfferwallAdapterBridge offerwallAdapterBridge, Object obj, Method method, Object[] objArr) {
        String str;
        ck.p.j(offerwallAdapterBridge, "this$0");
        String name = method.getName();
        if (name != null) {
            boolean zBooleanValue = false;
            switch (name.hashCode()) {
                case -1508301783:
                    if (name.equals("onContentReady")) {
                        Object obj2 = objArr[0];
                        ck.p.i(obj2, "args[0]");
                        String placementName = offerwallAdapterBridge.getPlacementName(obj2);
                        DeviceLog.debug("Placement content ready: " + placementName);
                        j.d(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$3(offerwallAdapterBridge, placementName, null), 3, null);
                    }
                    break;
                case -1482787952:
                    if (name.equals("onContentDismiss")) {
                        Object obj3 = objArr[0];
                        ck.p.i(obj3, "args[0]");
                        String placementName2 = offerwallAdapterBridge.getPlacementName(obj3);
                        DeviceLog.debug("Placement content dismissed: " + placementName2);
                        j.d(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$5(offerwallAdapterBridge, placementName2, null), 3, null);
                    }
                    break;
                case 89925559:
                    if (name.equals("onContentShow")) {
                        Object obj4 = objArr[0];
                        ck.p.i(obj4, "args[0]");
                        String placementName3 = offerwallAdapterBridge.getPlacementName(obj4);
                        DeviceLog.debug("Placement content shown: " + placementName3);
                        j.d(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$4(offerwallAdapterBridge, placementName3, null), 3, null);
                    }
                    break;
                case 1356881459:
                    if (name.equals("onRequestSuccess")) {
                        Object obj5 = objArr[0];
                        ck.p.i(obj5, "placementObj");
                        String placementName4 = offerwallAdapterBridge.getPlacementName(obj5);
                        Boolean bool = (Boolean) obj5.getClass().getDeclaredMethod("isContentAvailable", new Class[0]).invoke(obj5, new Object[0]);
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                        DeviceLog.debug("Placement request succeeded: " + placementName4 + " - isContentAvailable: " + zBooleanValue);
                        j.d(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$1(zBooleanValue, offerwallAdapterBridge, placementName4, null), 3, null);
                    }
                    break;
                case 2137477050:
                    if (name.equals("onRequestFailure")) {
                        Object obj6 = objArr[0];
                        ck.p.i(obj6, "args[0]");
                        String placementName5 = offerwallAdapterBridge.getPlacementName(obj6);
                        HashMap<String, Object> map = offerwallAdapterBridge.placementsMap;
                        if (placementName5 == null) {
                            str = "";
                        } else {
                            str = placementName5;
                        }
                        map.remove(str);
                        Object obj7 = objArr[1];
                        DeviceLog.error("Placement request failed: " + placementName5 + " - errorCode: " + ((Integer) obj7.getClass().getField("code").get(obj7)) + ", errorMessage: " + ((String) obj7.getClass().getField("message").get(obj7)));
                        j.d(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$2(offerwallAdapterBridge, placementName5, null), 3, null);
                    }
                    break;
            }
        }
        return null;
    }
}
