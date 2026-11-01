package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import ck.i;
import ck.p;
import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationTargetException;
import kotlin.collections.a;
import mj.h;

/* JADX INFO: compiled from: PendingPurchasesParamsBridge.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class PendingPurchasesParamsBridge extends GenericBridge {
    public static final Companion Companion = new Companion(null);
    public static final String NEW_BUILDER_METHOD_NAME = "newBuilder";
    private final Object pendingPurchasesParamsInternalInstance;

    /* JADX INFO: compiled from: PendingPurchasesParamsBridge.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final Class<?> getClassForParams() throws ClassNotFoundException {
            Class<?> cls = Class.forName("com.android.billingclient.api.PendingPurchasesParams");
            p.i(cls, "forName(\"com.android.bil….PendingPurchasesParams\")");
            return cls;
        }

        public final PendingPurchasesParamsBuilderBridge newBuilder() {
            return new PendingPurchasesParamsBuilderBridge(callNonVoidStaticMethod("newBuilder"));
        }

        private final Object callNonVoidStaticMethod(String str) throws IllegalAccessException, InvocationTargetException {
            Object objInvoke = getClassForParams().getMethod(str, new Class[0]).invoke(null, new Object[0]);
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new IllegalStateException("Static method " + str + " returned null");
        }
    }

    public PendingPurchasesParamsBridge(Object obj) {
        super(a.l(h.a("newBuilder", new Class[0])));
        this.pendingPurchasesParamsInternalInstance = obj;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.PendingPurchasesParams";
    }

    public final Object getInternalClass() {
        return this.pendingPurchasesParamsInternalInstance;
    }
}
