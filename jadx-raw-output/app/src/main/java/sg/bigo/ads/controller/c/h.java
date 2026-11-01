package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements sg.bigo.ads.api.core.h.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f70653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f70654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f70655c;

    public h(@NonNull JSONObject jSONObject) {
        this.f70653a = jSONObject.optInt("w");
        this.f70654b = jSONObject.optInt("h");
        this.f70655c = jSONObject.optString("data");
    }

    @Override // sg.bigo.ads.api.core.h.b
    public final int a() {
        return this.f70653a;
    }

    @Override // sg.bigo.ads.api.core.h.b
    public final int b() {
        return this.f70654b;
    }

    @Override // sg.bigo.ads.api.core.h.b
    public final String c() {
        return this.f70655c;
    }
}
