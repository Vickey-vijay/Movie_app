package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import ck.i;
import ck.p;
import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationTargetException;
import kotlin.collections.a;

/* JADX INFO: compiled from: ProductBridge.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ProductBridge extends GenericBridge {
    public static final Companion Companion = new Companion(null);
    public static final String NEW_BUILDER_METHOD = "newBuilder";
    private final Object productInternalInstance;

    /* JADX INFO: compiled from: ProductBridge.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final Class<?> getClassForParams() throws ClassNotFoundException {
            Class<?> cls = Class.forName("com.android.billingclient.api.QueryProductDetailsParams$Product");
            p.i(cls, "forName(\"com.android.bil…tDetailsParams\\$Product\")");
            return cls;
        }

        public final ProductBuilderBridge newBuilder() {
            return new ProductBuilderBridge(callNonVoidStaticMethod("newBuilder"));
        }

        private final Object callNonVoidStaticMethod(String str) throws IllegalAccessException, InvocationTargetException {
            Object objInvoke = getClassForParams().getMethod(str, new Class[0]).invoke(null, new Object[0]);
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new IllegalStateException("Static method " + str + " returned null");
        }
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams$Product";
    }

    public final Object getInternalClass() {
        return this.productInternalInstance;
    }

    public ProductBridge(Object obj) {
        super(a.j());
        this.productInternalInstance = obj;
    }
}
