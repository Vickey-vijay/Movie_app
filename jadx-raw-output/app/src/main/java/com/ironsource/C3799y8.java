package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.y8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C3799y8 implements InterfaceC3663q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Object> f31628a = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.y8$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f31629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f31630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f31631c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Context f31632d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f31633e;

        public a a(String str) {
            this.f31630b = str;
            return this;
        }

        public a a(Context context) {
            this.f31632d = context;
            return this;
        }

        public a b(String str) {
            this.f31631c = str;
            return this;
        }

        public a c(String str) {
            this.f31629a = str;
            return this;
        }

        public a d(String str) {
            this.f31633e = str;
            return this;
        }

        public C3799y8 a() {
            return new C3799y8(this);
        }
    }

    private C3799y8(a aVar) {
        a(aVar);
        a(aVar.f31632d);
    }

    private void a(Context context) {
        f31628a.put(G5.f26594e, C3372a4.b(context));
        f31628a.put(G5.f26595f, C3372a4.d(context));
    }

    public static void b(String str) {
        f31628a.put(G5.f26595f, SDKUtils.encodeString(str));
    }

    private void a(a aVar) {
        Context context = aVar.f31632d;
        C3409c5 c3409c5B = C3409c5.b(context);
        f31628a.put(G5.f26599j, SDKUtils.encodeString(c3409c5B.e()));
        f31628a.put(G5.f26600k, SDKUtils.encodeString(c3409c5B.f()));
        f31628a.put(G5.f26601l, Integer.valueOf(c3409c5B.a()));
        f31628a.put(G5.f26602m, SDKUtils.encodeString(c3409c5B.d()));
        f31628a.put(G5.f26603n, SDKUtils.encodeString(c3409c5B.c()));
        f31628a.put(G5.f26593d, SDKUtils.encodeString(context.getPackageName()));
        f31628a.put(G5.f26596g, SDKUtils.encodeString(aVar.f31630b));
        f31628a.put("sessionid", SDKUtils.encodeString(aVar.f31629a));
        f31628a.put(G5.f26591b, SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f31628a.put(G5.f26604o, G5.f26609t);
        f31628a.put("origin", "n");
        if (TextUtils.isEmpty(aVar.f31633e)) {
            return;
        }
        f31628a.put(G5.f26598i, SDKUtils.encodeString(aVar.f31633e));
    }

    @Override // com.ironsource.InterfaceC3663q7
    public Map<String, Object> a() {
        return f31628a;
    }

    public static void a(String str) {
        f31628a.put(G5.f26594e, SDKUtils.encodeString(str));
    }
}
