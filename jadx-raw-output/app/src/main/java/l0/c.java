package l0;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f63356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f63357c;

    public c(e eVar, d dVar) {
        this.f63357c = eVar;
        this.f63356b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m0.a aVarA;
        e eVar = this.f63357c;
        if (eVar.a()) {
            try {
                aVarA = s0.a.a(new JSONObject(eVar.f63370k.version()));
            } catch (Exception e10) {
                n0.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_GENERAL_ERROR, e10);
                r0.b.b("%s: resolveIgniteServiceVersion : unable to resolve version : %s", "IgniteAuthenticationComponent", e10.toString());
                aVarA = new m0.a(false, "");
            }
        } else {
            aVarA = new m0.a(false, "");
        }
        eVar.f63369j = aVarA;
        t0.c.f72106b.post(this.f63356b);
    }
}
