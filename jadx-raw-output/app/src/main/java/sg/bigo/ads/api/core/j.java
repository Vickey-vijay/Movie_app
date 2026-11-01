package sg.bigo.ads.api.core;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements sg.bigo.ads.api.a.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f69401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f69402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f69403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f69404d;

    public j(@NonNull JSONObject jSONObject) {
        this.f69401a = jSONObject.optInt("w");
        this.f69402b = jSONObject.optInt("h");
        this.f69403c = jSONObject.optString("url");
        this.f69404d = jSONObject.optString("md5");
    }

    @Override // sg.bigo.ads.api.a.f
    public final int a() {
        return this.f69401a;
    }

    @Override // sg.bigo.ads.api.a.f
    public final int b() {
        return this.f69402b;
    }

    @Override // sg.bigo.ads.api.a.f
    public final String c() {
        return this.f69403c;
    }
}
