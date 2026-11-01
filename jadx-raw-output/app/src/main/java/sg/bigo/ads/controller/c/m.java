package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements sg.bigo.ads.api.core.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f70686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f70687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f70688c;

    public m(@NonNull JSONObject jSONObject) {
        this.f70686a = jSONObject.optString("vendor_url");
        this.f70687b = jSONObject.optString("vendor_key");
        this.f70688c = jSONObject.optString("params");
    }

    @Override // sg.bigo.ads.api.core.b.c
    public final String a() {
        return this.f70686a;
    }

    @Override // sg.bigo.ads.api.core.b.c
    public final String b() {
        return this.f70687b;
    }

    @Override // sg.bigo.ads.api.core.b.c
    public final String c() {
        return this.f70688c;
    }
}
