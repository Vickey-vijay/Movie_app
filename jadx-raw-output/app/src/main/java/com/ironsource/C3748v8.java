package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.v8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3748v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Object> f31456a = new HashMap<>();

    public HashMap<String, Object> a() {
        return this.f31456a;
    }

    public C3748v8 a(String str, Object obj) {
        if (obj != null) {
            this.f31456a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}
