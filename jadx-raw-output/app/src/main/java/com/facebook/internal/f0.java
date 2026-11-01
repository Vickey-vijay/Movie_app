package com.facebook.internal;

import com.ironsource.C3426d4;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProfileInformationCache.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/facebook/internal/f0;", "", "", "accessToken", "Lorg/json/JSONObject;", "a", C3426d4.i.W, "value", "Lmj/r;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "infoCache", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f14391a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final ConcurrentHashMap<String, JSONObject> infoCache = new ConcurrentHashMap<>();

    public static final JSONObject a(String accessToken) {
        ck.p.j(accessToken, "accessToken");
        return infoCache.get(accessToken);
    }

    public static final void b(String str, JSONObject jSONObject) {
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(jSONObject, "value");
        infoCache.put(str, jSONObject);
    }
}
