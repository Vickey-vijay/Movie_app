package com.unity3d.services.store.gpbl.proxies;

import ck.i;
import ck.p;
import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ProductDetailsResponseListenerProxy.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ProductDetailsResponseListenerProxy extends GenericListenerProxy {
    public static final Companion Companion = new Companion(null);
    public static final String onProductDetailsResponseMethodName = "onProductDetailsResponse";
    private final ProductDetailsResponseListener productDetailsResponseListener;

    /* JADX INFO: compiled from: ProductDetailsResponseListenerProxy.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final Class<?> getProxyListenerClass() throws ClassNotFoundException {
            Class<?> cls = Class.forName("com.android.billingclient.api.ProductDetailsResponseListener");
            p.i(cls, "forName(\"com.android.bil…DetailsResponseListener\")");
            return cls;
        }
    }

    private final void onPurchasesUpdated(Object obj, Object obj2) {
        QueryProductDetailsResultsBridge queryProductDetailsResultsBridge = new QueryProductDetailsResultsBridge(obj2);
        ProductDetailsResponseListener productDetailsResponseListener = this.productDetailsResponseListener;
        if (productDetailsResponseListener != null) {
            productDetailsResponseListener.onProductDetailsResponse(new BillingResultBridge(obj), queryProductDetailsResultsBridge);
        }
    }

    public final ProductDetailsResponseListener getProductDetailsResponseListener() {
        return this.productDetailsResponseListener;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class<?> getProxyClass() {
        return Companion.getProxyListenerClass();
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        p.j(obj, "proxy");
        p.j(method, "method");
        if (!p.e(method.getName(), onProductDetailsResponseMethodName)) {
            return super.invoke(obj, method, objArr);
        }
        if (objArr != null && (obj2 = objArr[1]) != null) {
            onPurchasesUpdated(objArr[0], obj2);
        }
        return null;
    }

    public ProductDetailsResponseListenerProxy(ProductDetailsResponseListener productDetailsResponseListener) {
        this.productDetailsResponseListener = productDetailsResponseListener;
    }
}
