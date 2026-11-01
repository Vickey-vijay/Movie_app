package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class Mg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f27066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C3480g4 f27067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Z4 f27068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C3534j5 f27070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f27072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f27073i = Mg.class.getSimpleName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f27074j;

    public enum a {
        NOT_RECOVERED,
        RECOVERED,
        IN_RECOVERING,
        NOT_ALLOWED
    }

    public boolean a(C3714t8.c cVar, C3714t8.b bVar) {
        Logger.i(this.f27073i, "shouldRecoverWebController: ");
        a aVar = this.f27074j;
        if (aVar == a.NOT_ALLOWED) {
            Logger.i(this.f27073i, "shouldRecoverWebController: false | recover is not allowed");
            return false;
        }
        if (cVar != C3714t8.c.Native) {
            Logger.i(this.f27073i, "shouldRecoverWebController: false | current controller type is: " + cVar);
            return false;
        }
        if (bVar == C3714t8.b.Loading || bVar == C3714t8.b.None) {
            Logger.i(this.f27073i, "shouldRecoverWebController: false | a Controller is currently loading");
            return false;
        }
        if (aVar == a.RECOVERED) {
            Logger.i(this.f27073i, "shouldRecoverWebController: false | already recovered");
            return false;
        }
        if (aVar == a.IN_RECOVERING) {
            Logger.i(this.f27073i, "shouldRecoverWebController: false | currently in recovering");
            return false;
        }
        if (this.f27066b == null || this.f27067c == null || this.f27068d == null) {
            Logger.i(this.f27073i, "shouldRecoverWebController: false | missing mandatory param");
            return false;
        }
        Logger.i(this.f27073i, "shouldRecoverWebController: true | allow recovering ");
        return true;
    }

    private void j() {
        if (this.f27071g != this.f27072h) {
            this.f27074j = a.NOT_RECOVERED;
            return;
        }
        Logger.i(this.f27073i, "handleRecoveringEndedFailed | Reached max trials");
        this.f27074j = a.NOT_ALLOWED;
        a();
    }

    public Context b() {
        return this.f27066b;
    }

    public String c() {
        return this.f27065a;
    }

    public C3480g4 d() {
        return this.f27067c;
    }

    public int e() {
        return this.f27069e;
    }

    public Z4 f() {
        return this.f27068d;
    }

    public C3534j5 g() {
        return this.f27070f;
    }

    public boolean l() {
        return this.f27074j == a.IN_RECOVERING;
    }

    public boolean m() {
        return this.f27074j == a.RECOVERED;
    }

    public void n() {
        a aVar = this.f27074j;
        a aVar2 = a.IN_RECOVERING;
        if (aVar != aVar2) {
            this.f27071g++;
            Logger.i(this.f27073i, "recoveringStarted - trial number " + this.f27071g);
            this.f27074j = aVar2;
        }
    }

    public Mg(Context context, C3480g4 c3480g4, Z4 z10, int i10, C3534j5 c3534j5, String str) {
        a aVarH = h();
        this.f27074j = aVarH;
        if (aVarH != a.NOT_ALLOWED) {
            this.f27066b = context;
            this.f27067c = c3480g4;
            this.f27068d = z10;
            this.f27069e = i10;
            this.f27070f = c3534j5;
            this.f27071g = 0;
        }
        this.f27065a = str;
    }

    private a h() {
        this.f27072h = FeaturesManager.getInstance().getInitRecoverTrials();
        Logger.i(this.f27073i, "getInitialState mMaxAllowedTrials: " + this.f27072h);
        if (this.f27072h <= 0) {
            Logger.i(this.f27073i, "recovery is not allowed by config");
            return a.NOT_ALLOWED;
        }
        return a.NOT_RECOVERED;
    }

    private void k() {
        a();
        this.f27074j = a.RECOVERED;
    }

    public JSONObject i() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(C3426d4.i.A0, m());
            jSONObjectJsonObjectInit.put(C3426d4.i.B0, this.f27071g);
            jSONObjectJsonObjectInit.put(C3426d4.i.C0, this.f27072h);
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectJsonObjectInit;
    }

    public void a() {
        this.f27066b = null;
        this.f27067c = null;
        this.f27068d = null;
        this.f27070f = null;
    }

    public void a(boolean z10) {
        if (this.f27074j != a.IN_RECOVERING) {
            return;
        }
        if (z10) {
            k();
        } else {
            j();
        }
    }
}
