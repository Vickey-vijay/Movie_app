package yads;

import com.ironsource.C3426d4;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class il1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wv3 f78696a;

    public final void a(float f10, float f11) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
        if (f11 < 0.0f || f11 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
        ex3.a(this.f78696a);
        JSONObject jSONObject = new JSONObject();
        lw3.a(jSONObject, "duration", Float.valueOf(f10));
        lw3.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f11));
        lw3.a(jSONObject, C3426d4.j.P, Float.valueOf(jx3.a().f79232a));
        this.f78696a.f84355e.a("start", jSONObject);
    }

    public il1(wv3 wv3Var) {
        this.f78696a = wv3Var;
    }

    public final void a(float f10) {
        if (f10 >= 0.0f && f10 <= 1.0f) {
            ex3.a(this.f78696a);
            JSONObject jSONObject = new JSONObject();
            lw3.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f10));
            lw3.a(jSONObject, C3426d4.j.P, Float.valueOf(jx3.a().f79232a));
            this.f78696a.f84355e.a("volumeChange", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media volume");
    }
}
