package com.vungle.ads.internal.util;

import ck.p;
import cl.i;
import com.ironsource.C3426d4;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: JsonUtil.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/util/JsonUtil;", "", "()V", "getContentStringValue", "", "json", "Lkotlinx/serialization/json/JsonObject;", C3426d4.i.W, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class JsonUtil {
    public static final JsonUtil INSTANCE = new JsonUtil();

    private JsonUtil() {
    }

    public final String getContentStringValue(JsonObject json, String key) {
        p.j(json, "json");
        p.j(key, C3426d4.i.W);
        try {
            return i.l((kotlinx.serialization.json.b) kotlin.collections.a.k(json, key)).e();
        } catch (Exception unused) {
            return null;
        }
    }
}
