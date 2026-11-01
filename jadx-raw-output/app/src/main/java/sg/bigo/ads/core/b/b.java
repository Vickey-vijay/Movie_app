package sg.bigo.ads.core.b;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.g;
import sg.bigo.ads.core.b.b.j;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final b f71124i = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sg.bigo.ads.core.b.b.a f71125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f71126b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f71127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public sg.bigo.ads.core.b.a.a f71128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f71129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sg.bigo.ads.common.j f71130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public sg.bigo.ads.common.j f71131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f71132h;

    private b() {
    }

    public static b a() {
        return f71124i;
    }

    public final void a(String str, @NonNull Map<String, Object> map) {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        if (!this.f71126b.get()) {
            sg.bigo.ads.common.t.a.a(0, 3, "Callback", "please execute init first");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONObject.putOpt(entry.getKey(), entry.getValue());
            }
        } catch (JSONException unused) {
        }
        sg.bigo.ads.core.b.a.a aVar = this.f71128d;
        if (aVar != null && aVar.f71122d) {
            if (this.f71127c == null) {
                this.f71127c = new j(this.f71129e, aVar, this.f71130f, this.f71131g, this.f71132h);
            }
            this.f71127c.a(str, jSONObject);
        } else {
            sg.bigo.ads.core.b.b.a aVar2 = this.f71125a;
            if (aVar2 != null) {
                aVar2.a(str, jSONObject);
            }
        }
    }
}
