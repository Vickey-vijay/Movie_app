package com.apm.insight.k;

import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: CrashUploadHandler.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f6520a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: compiled from: CrashUploadHandler.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f6522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JSONObject f6523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CrashType f6524c;

        @Nullable
        public final String a() {
            return this.f6522a.optString("crash_thread_name", null);
        }

        public final long b() {
            return this.f6522a.optInt("app_start_time", -1);
        }

        @Nullable
        public final String c() {
            int i10 = AnonymousClass1.f6521a[this.f6524c.ordinal()];
            if (i10 == 1) {
                return this.f6522a.optString("data", null);
            }
            if (i10 == 2) {
                return this.f6522a.optString("stack", null);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f6522a.optString("data", null);
        }

        public a(JSONObject jSONObject, CrashType crashType) {
            this.f6524c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f6522a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f6522a = jSONObject;
            }
            this.f6523b = jSONObject.optJSONObject("header");
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    /* JADX INFO: compiled from: CrashUploadHandler.java */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6521a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f6521a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6521a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6521a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f6520a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        new a(jSONObject, crashType);
        while (!f6520a.isEmpty()) {
            f6520a.poll();
        }
        f6520a = null;
    }
}
