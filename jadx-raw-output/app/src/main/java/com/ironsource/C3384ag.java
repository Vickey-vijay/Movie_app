package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3384ag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NetworkSettings f28197b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<String> f28196a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f28198c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28199d = true;

    public void a(NetworkSettings networkSettings) {
        this.f28197b = networkSettings;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f28196a.add(str);
    }

    public JSONObject b() {
        return this.f28198c;
    }

    public NetworkSettings c() {
        return this.f28197b;
    }

    public ArrayList<String> d() {
        return this.f28196a;
    }

    public boolean e() {
        return this.f28199d;
    }

    public void a(JSONObject jSONObject) {
        this.f28198c = jSONObject;
    }

    public void a(boolean z10) {
        this.f28199d = z10;
    }

    public static C3384ag a() {
        return new C3384ag();
    }
}
