package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements sg.bigo.ads.api.core.n.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f70721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f70722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f70723c;

    public r(@NonNull JSONObject jSONObject) {
        this.f70721a = jSONObject.optInt("w");
        this.f70722b = jSONObject.optInt("h");
        this.f70723c = jSONObject.optString("data");
    }

    @Override // sg.bigo.ads.api.core.n.c
    public final int a() {
        return this.f70721a;
    }

    @Override // sg.bigo.ads.api.core.n.c
    public final int b() {
        return this.f70722b;
    }

    @Override // sg.bigo.ads.api.core.n.c
    public final String c() {
        return this.f70723c;
    }
}
