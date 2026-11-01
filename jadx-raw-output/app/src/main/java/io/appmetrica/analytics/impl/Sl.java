package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class Sl implements NetworkResponseHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zl f55875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W2 f55876b;

    public Sl() {
        this(new Zl(), new W2());
    }

    public Sl(Zl zl2, W2 w10) {
        this.f55875a = zl2;
        this.f55876b = w10;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4174em handle(@NonNull ResponseDataHolder responseDataHolder) {
        List list;
        String strOptString;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            if (responseHeaders != null) {
                list = (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding");
            } else {
                list = null;
            }
            if (!mo.a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.f55876b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                Zl zl2 = this.f55875a;
                zl2.getClass();
                C4174em c4174em = new C4174em();
                int i10 = 1;
                try {
                    zl2.f56306h.getClass();
                    C4215gb c4215gb = new C4215gb(new String(responseData, "UTF-8"));
                    JSONObject jSONObjectOptJSONObject = c4215gb.optJSONObject("device_id");
                    String strOptString2 = "";
                    if (jSONObjectOptJSONObject == null) {
                        strOptString = "";
                    } else {
                        strOptString2 = jSONObjectOptJSONObject.optString("hash");
                        strOptString = jSONObjectOptJSONObject.optString("value");
                    }
                    c4174em.f56682h = strOptString;
                    c4174em.f56683i = strOptString2;
                    zl2.a(c4174em, c4215gb);
                    if (!TextUtils.isEmpty(c4174em.f56683i)) {
                        i10 = 2;
                    }
                    c4174em.f56675a = i10;
                } catch (Throwable unused) {
                    c4174em = new C4174em();
                    c4174em.f56675a = 1;
                }
                if (2 == c4174em.f56675a) {
                    return c4174em;
                }
            }
        }
        return null;
    }
}
