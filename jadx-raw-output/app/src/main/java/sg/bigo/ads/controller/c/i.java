package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements sg.bigo.ads.api.core.n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f70656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f70657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f70658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f70659d;

    public i(@NonNull JSONObject jSONObject) {
        this.f70656a = jSONObject.optInt("w");
        this.f70657b = jSONObject.optInt("h");
        this.f70658c = jSONObject.optString("url");
        this.f70659d = jSONObject.optString("md5");
    }

    @Override // sg.bigo.ads.api.core.n.a
    public final int a() {
        return this.f70656a;
    }

    @Override // sg.bigo.ads.api.core.n.a
    public final int b() {
        return this.f70657b;
    }

    @Override // sg.bigo.ads.api.core.n.a
    public final String c() {
        return this.f70658c;
    }
}
