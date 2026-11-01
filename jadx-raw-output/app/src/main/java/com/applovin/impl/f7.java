package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class f7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f7502c;

    public void a(String str) {
        if (StringUtils.isValidString(str)) {
            a(Collections.singletonList(str));
        } else {
            a((List) null);
        }
    }

    private void e() {
        com.applovin.impl.sdk.j jVarT = this.f7500a.t();
        if (this.f7501b) {
            jVarT.b(this.f7502c);
        } else {
            jVarT.a(this.f7502c);
        }
    }

    public List b() {
        return this.f7502c;
    }

    public boolean c() {
        return this.f7501b;
    }

    public boolean d() {
        List list = this.f7502c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public f7(com.applovin.impl.sdk.k kVar) {
        boolean z10;
        this.f7500a = kVar;
        z4 z4Var = z4.I;
        if (!((Boolean) kVar.a(z4Var, Boolean.FALSE)).booleanValue() && !y.a(com.applovin.impl.sdk.k.o()).a("applovin.sdk.is_test_environment") && !AppLovinSdkUtils.isEmulator() && !kVar.A().U()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f7501b = z10;
        kVar.c(z4Var);
    }

    public void a(List list) {
        if (list == null && this.f7502c == null) {
            return;
        }
        if (list == null || !list.equals(this.f7502c)) {
            this.f7502c = list;
            e();
        }
    }

    public void a() {
        this.f7500a.b(z4.I, Boolean.TRUE);
    }

    public void a(JSONObject jSONObject) {
        if (this.f7501b) {
            return;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray());
        com.applovin.impl.sdk.l lVarA = this.f7500a.A();
        boolean zU = lVarA.U();
        String strA = lVarA.f().a();
        com.applovin.impl.sdk.l.b bVarH = lVarA.H();
        this.f7501b = zU || JsonUtils.containsCaseInsensitiveString(strA, jSONArray) || JsonUtils.containsCaseInsensitiveString(bVarH != null ? bVarH.f9367a : null, jSONArray);
    }
}
