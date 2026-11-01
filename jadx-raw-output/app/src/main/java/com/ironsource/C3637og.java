package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3637og {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30368b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30369c = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Boolean> f30367a = new a();

    /* JADX INFO: renamed from: com.ironsource.og$a */
    public class a extends HashMap<String, Boolean> {
        public a() {
            put(C3537j8.f29257k, Boolean.valueOf(C3637og.this.f30368b == 0));
            put(C3537j8.f29258l, Boolean.valueOf(C3637og.this.f30369c == 0));
            Boolean bool = Boolean.FALSE;
            put(C3537j8.f29259m, bool);
            put(C3537j8.f29260n, bool);
        }
    }

    public void a(String str, int i10, boolean z10) {
        if (this.f30367a.containsKey(str)) {
            this.f30367a.put(str, Boolean.valueOf(i10 == 0));
        }
        this.f30367a.put(C3537j8.f29259m, Boolean.valueOf(z10));
        this.f30367a.put(C3537j8.f29260n, Boolean.valueOf((this.f30367a.get(C3537j8.f29258l).booleanValue() || this.f30367a.get(C3537j8.f29257k).booleanValue()) && this.f30367a.get(C3537j8.f29259m).booleanValue()));
    }

    public JSONObject a() {
        return new JSONObject(this.f30367a);
    }
}
