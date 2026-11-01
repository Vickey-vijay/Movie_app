package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements sg.bigo.ads.api.core.n.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f70660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f70661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f70662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f70663d;

    public j(@NonNull JSONObject jSONObject) {
        this.f70660a = jSONObject.optInt("video_impression_area_rate", 0);
        this.f70661b = jSONObject.optLong("video_impression_time", 0L);
        this.f70662c = jSONObject.optInt("image_impression_area_rate", 0);
        this.f70663d = jSONObject.optLong("image_impression_time", 0L);
    }

    @Override // sg.bigo.ads.api.core.n.b
    public final int a() {
        return this.f70660a;
    }

    @Override // sg.bigo.ads.api.core.n.b
    public final long b() {
        return this.f70661b;
    }

    @Override // sg.bigo.ads.api.core.n.b
    public final int c() {
        return this.f70662c;
    }

    @Override // sg.bigo.ads.api.core.n.b
    public final long d() {
        return this.f70663d;
    }
}
