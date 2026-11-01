package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends b implements sg.bigo.ads.api.core.h {

    @Nullable
    public sg.bigo.ads.api.core.h.b A;

    @NonNull
    public final sg.bigo.ads.api.core.h.a B;
    private boolean C;
    private boolean D;

    public d(long j10, @NonNull sg.bigo.ads.api.core.g gVar, @NonNull sg.bigo.ads.api.a.l lVar, @NonNull JSONObject jSONObject) {
        super(j10, gVar, lVar, jSONObject);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("display");
        if (jSONObjectOptJSONObject != null) {
            this.A = new h(jSONObjectOptJSONObject);
        }
        this.B = new e(jSONObject);
    }

    @Override // sg.bigo.ads.api.core.h
    public final void aA() {
        this.D = true;
    }

    @Override // sg.bigo.ads.api.core.h
    public final boolean aB() {
        return this.D;
    }

    @Override // sg.bigo.ads.api.core.h
    public final boolean av() {
        return a(32);
    }

    @Override // sg.bigo.ads.api.core.h
    @Nullable
    public final sg.bigo.ads.api.core.h.b aw() {
        return this.A;
    }

    @Override // sg.bigo.ads.api.core.h
    @NonNull
    public final sg.bigo.ads.api.core.h.a ax() {
        return this.B;
    }

    @Override // sg.bigo.ads.api.core.h
    public final void ay() {
        this.C = true;
    }

    @Override // sg.bigo.ads.api.core.h
    public final boolean az() {
        return this.C;
    }
}
