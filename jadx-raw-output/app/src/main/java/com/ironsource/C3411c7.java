package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3411c7 implements Y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f28330a;

    /* JADX INFO: renamed from: com.ironsource.c7$a */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f28332b = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f28334d = 24;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28331a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f28333c = EnumC3429d7.SendEvent.b();

        public final int a() {
            return f28333c;
        }

        private a() {
        }
    }

    @Override // com.ironsource.Y6
    public long a() {
        return ((long) this.f28330a.optInt("timeout", 24)) * 1000;
    }

    @Override // com.ironsource.X5
    public boolean b() {
        return this.f28330a.optBoolean(com.ironsource.mediationsdk.metadata.a.f29888j, false);
    }

    @Override // com.ironsource.Y6
    public EnumC3429d7 c() {
        return EnumC3429d7.f28655b.a(this.f28330a.optInt(C3426d4.f.f28486e, a.f28331a.a()));
    }

    public C3411c7(JSONObject jSONObject) {
        this.f28330a = jSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObject;
    }
}
