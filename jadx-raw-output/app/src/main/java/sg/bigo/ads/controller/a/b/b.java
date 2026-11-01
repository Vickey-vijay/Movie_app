package sg.bigo.ads.controller.a.b;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.g;
import sg.bigo.ads.controller.b.h;
import sg.bigo.ads.controller.g.m;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    public b(sg.bigo.ads.controller.a.b bVar, g gVar, sg.bigo.ads.controller.b.d dVar, h hVar) {
        super(bVar, gVar, dVar, hVar);
    }

    @Override // sg.bigo.ads.controller.a.b.c
    public final sg.bigo.ads.common.n.e a() {
        return sg.bigo.ads.common.u.a.e.c();
    }

    @Override // sg.bigo.ads.controller.a.b.c
    public final void a(final Pair<String, Integer> pair) {
        if (this.f70454b == null || this.f70455c == null || pair == null) {
            return;
        }
        this.f70460h.set(true);
        HashMap map = new HashMap();
        try {
            HashMap map2 = new HashMap();
            map2.put("type", "1");
            map2.put("host", pair.first);
            map2.put("retry_times", String.valueOf(i.f69318a.y()));
            map2.put("retry_interval", String.valueOf(i.f69318a.z()));
            map2.put("next_retry_interval", String.valueOf(i.f69318a.A()));
            map2.put("cur_retry_time", String.valueOf(pair.second));
            map2.put(CommonUrlParts.UUID, this.f70455c.X());
            map2.put("action", "2");
            sg.bigo.ads.common.g.b.b bVarA = sg.bigo.ads.core.d.b.b.b("06002067", map2).a(this.f70455c, 0L);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_id", bVarA.f69645b);
            jSONObject.put("event_info", bVarA.f69646c);
            jSONArray.put(jSONObject);
            map.put("sdk_events", jSONArray);
        } catch (Exception unused) {
        }
        m mVar = new m(map, this.f70455c, this.f70454b, new sg.bigo.ads.controller.b() { // from class: sg.bigo.ads.controller.a.b.b.1
            @Override // sg.bigo.ads.controller.e
            public final void a(int i10, int i11, int i12, @NonNull String str, @Nullable Object obj) {
                b.this.f70460h.set(false);
                b.this.a(pair, c.a(i12));
            }

            @Override // sg.bigo.ads.controller.b
            public final void a(int i10, @NonNull String str) {
                b.this.f70460h.set(false);
                b.this.a(pair, false);
            }
        });
        mVar.f70901i = (String) pair.first;
        mVar.b();
    }

    @Override // sg.bigo.ads.controller.a.b.c
    public final sg.bigo.ads.controller.a.a.b b() {
        return this.f70454b.f70407a.f70335h;
    }
}
