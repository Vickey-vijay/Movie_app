package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3756w implements Cif<JSONObject>, InterfaceC3491gf<C3722u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, H0> f31499a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31500b;

    private final void b(C3722u c3722u) {
        int i10;
        int i11 = a.f31501a[c3722u.f().ordinal()];
        if (i11 == 2) {
            this.f31500b++;
        } else if ((i11 == 3 || i11 == 4 || i11 == 5) && (i10 = this.f31500b) > 0) {
            this.f31500b = i10 - 1;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.w$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31501a;

        static {
            int[] iArr = new int[EnumC3473ff.values().length];
            try {
                iArr[EnumC3473ff.LoadRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3473ff.LoadSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3473ff.ShowSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3473ff.ShowFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3473ff.Destroyed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f31501a = iArr;
        }
    }

    public final int a() {
        return this.f31500b;
    }

    @Override // com.ironsource.InterfaceC3491gf
    public void a(C3722u c3722u) {
        ck.p.j(c3722u, "record");
        String strC = c3722u.c();
        Map<String, H0> map = this.f31499a;
        H0 h10 = map.get(strC);
        if (h10 == null) {
            h10 = new H0();
            map.put(strC, h10);
        }
        h10.a(c3722u.a(new C3739v()));
        b(c3722u);
    }

    @Override // com.ironsource.InterfaceC3501h7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC3509hf enumC3509hf) throws JSONException {
        ck.p.j(enumC3509hf, C3426d4.a.f28427t);
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        for (Map.Entry<String, H0> entry : this.f31499a.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObjectA = entry.getValue().a(enumC3509hf);
            if (jSONObjectA.length() > 0) {
                jSONObjectJsonObjectInit.put(key, jSONObjectA);
            }
        }
        return jSONObjectJsonObjectInit;
    }

    public final boolean b() {
        return !this.f31499a.isEmpty();
    }
}
