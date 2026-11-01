package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import ck.i;
import ck.p;
import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationTargetException;
import kotlin.collections.a;
import mj.h;

/* JADX INFO: compiled from: QueryProductDetailsParamsBridge.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class QueryProductDetailsParamsBridge extends GenericBridge {
    public static final Companion Companion = new Companion(null);
    private static final String NEW_BUILDER_METHOD = "newBuilder";
    private final Object queryProductDetailsParamsInternalInstance;

    /* JADX INFO: compiled from: QueryProductDetailsParamsBridge.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final Class<?> getClassForParams() throws ClassNotFoundException {
            Class<?> cls = Class.forName("com.android.billingclient.api.QueryProductDetailsParams");
            p.i(cls, "forName(\"com.android.bil…eryProductDetailsParams\")");
            return cls;
        }

        public final QueryProductDetailsParamsBuilderBridge newBuilder() {
            return new QueryProductDetailsParamsBuilderBridge(callNonVoidStaticMethod("newBuilder"));
        }

        private final Object callNonVoidStaticMethod(String str) throws IllegalAccessException, InvocationTargetException {
            Object objInvoke = getClassForParams().getMethod(str, new Class[0]).invoke(null, new Object[0]);
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new IllegalStateException("Static method " + str + " returned null");
        }
    }

    public QueryProductDetailsParamsBridge(Object obj) {
        super(a.l(h.a("newBuilder", new Class[0])));
        this.queryProductDetailsParamsInternalInstance = obj;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams";
    }

    public final Object getQueryProductDetailsParamsInternalInstance() {
        return this.queryProductDetailsParamsInternalInstance;
    }
}
