package yads;

import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class hc extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f78173b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(JSONObject jSONObject) {
        super(0);
        this.f78173b = jSONObject;
    }

    @Override // bk.a
    public final Object invoke() {
        return he1.a("skuId", this.f78173b);
    }
}
