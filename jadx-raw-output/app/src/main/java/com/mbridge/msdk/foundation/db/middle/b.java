package com.mbridge.msdk.foundation.db.middle;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.k;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: ReplaceTempDaoMiddle.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.buffer.a f34671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f34672b;

    /* JADX INFO: compiled from: ReplaceTempDaoMiddle.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f34673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.foundation.same.buffer.a f34674b;

        public a(boolean z10, com.mbridge.msdk.foundation.same.buffer.a aVar) {
            this.f34673a = z10;
            this.f34674b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f34673a || b.this.f34672b == null) {
                return;
            }
            for (String str : this.f34674b.a()) {
                b.this.f34672b.a(str, b.this.f34671a.a(str));
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.middle.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ReplaceTempDaoMiddle.java */
    public static class C0324b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static b f34676a = new b(null);
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    private b() {
        this.f34671a = new com.mbridge.msdk.foundation.same.buffer.a(1000);
        try {
            k kVarA = k.a(g.a(c.n().d()));
            this.f34672b = kVarA;
            a(kVarA.d(), false);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            com.mbridge.msdk.foundation.same.buffer.a aVar = new com.mbridge.msdk.foundation.same.buffer.a(100);
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                this.f34671a.a(next, jSONObjectOptJSONObject);
                aVar.a(next, jSONObjectOptJSONObject);
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(z10, aVar));
        }
    }

    public JSONArray b() {
        return new JSONArray((Collection) this.f34671a.a());
    }

    public static b a() {
        return C0324b.f34676a;
    }

    public JSONObject a(String str) {
        k kVar;
        JSONObject jSONObjectA = this.f34671a.a(str);
        if (jSONObjectA != null || (kVar = this.f34672b) == null) {
            return jSONObjectA;
        }
        JSONObject jSONObjectB = kVar.b(str);
        if (jSONObjectB != null) {
            this.f34671a.a(str, jSONObjectB);
        }
        return jSONObjectB;
    }
}
