package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class C4 implements F4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f26074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences.Editor f26075b;

    @Override // com.ironsource.F4
    public String a(String str, String str2) {
        ck.p.j(str, C3426d4.i.W);
        try {
            return this.f26074a.getString(str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public C4(Context context, String str) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, Y5.c.f27928b);
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        this.f26074a = sharedPreferences;
        this.f26075b = sharedPreferences.edit();
    }

    @Override // com.ironsource.F4
    public void a(String str) {
        ck.p.j(str, C3426d4.i.W);
        this.f26075b.remove(str).apply();
    }

    @Override // com.ironsource.F4
    public Map<String, ?> allData() {
        Map<String, ?> all = this.f26074a.getAll();
        ck.p.i(all, "sharedPreferences.all");
        return all;
    }

    @Override // com.ironsource.F4
    public void b(String str, String str2) {
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(str2, "value");
        this.f26075b.putString(str, str2).apply();
    }
}
