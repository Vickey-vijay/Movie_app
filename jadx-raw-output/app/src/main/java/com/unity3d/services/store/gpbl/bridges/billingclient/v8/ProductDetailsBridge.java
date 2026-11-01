package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import ck.i;
import ck.p;
import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.BillingOriginalJsonResponse;
import kotlin.collections.a;
import lk.a0;
import lk.x;
import mj.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProductDetailsBridge.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ProductDetailsBridge extends GenericBridge implements BillingOriginalJsonResponse {
    public static final Companion Companion = new Companion(null);
    private static final String TO_STRING_METHOD = "toString";
    private final Object internalRef;

    /* JADX INFO: compiled from: ProductDetailsBridge.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    private final String parseOriginalJson(String str) {
        try {
            int iL0 = a0.l0(str, "jsonString='", 0, false, 6, null) + 12;
            int iL1 = a0.l0(str, "', parsedJson=", 0, false, 6, null);
            boolean z10 = false;
            if (1 <= iL0 && iL0 < iL1) {
                z10 = true;
            }
            if (!z10) {
                return null;
            }
            String strSubstring = str.substring(iL0, iL1);
            p.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return x.N(strSubstring, "\\/", "/", false, 4, null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.ProductDetails";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsBridge(Object obj) {
        super(a.l(h.a(TO_STRING_METHOD, new Class[0])));
        p.j(obj, "internalRef");
        this.internalRef = obj;
    }

    public String toString() {
        Object objCallNonVoidMethod = callNonVoidMethod(TO_STRING_METHOD, this.internalRef, new Object[0]);
        p.h(objCallNonVoidMethod, "null cannot be cast to non-null type kotlin.String");
        return (String) objCallNonVoidMethod;
    }

    @Override // com.unity3d.services.store.gpbl.BillingOriginalJsonResponse
    public JSONObject getOriginalJson() {
        JSONObject jSONObject;
        try {
            String originalJson = parseOriginalJson(toString());
            if (originalJson != null) {
                jSONObject = new JSONObject(originalJson);
            } else {
                jSONObject = new JSONObject();
            }
            return jSONObject;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }
}
