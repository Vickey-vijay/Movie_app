package yads;

import android.util.Log;
import android.webkit.WebView;
import com.ironsource.C3426d4;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wv3 f76907a;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        wv3 wv3Var = this.f76907a;
        boolean z10 = wv3Var.f84357g;
        if (z10) {
            throw new IllegalStateException("AdSession is finished");
        }
        if (eb2.f77007c != wv3Var.f84352b.f78146a) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
        if (!wv3Var.f84356f || z10) {
            try {
                wv3Var.c();
            } catch (Exception unused) {
            }
        }
        wv3 wv3Var2 = this.f76907a;
        if (!wv3Var2.f84356f || wv3Var2.f84357g) {
            return;
        }
        if (wv3Var2.f84359i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
        ka kaVar = wv3Var2.f84355e;
        ix3.f78850a.a((WebView) kaVar.f79343b.get(), "publishImpressionEvent", kaVar.f79342a);
        wv3Var2.f84359i = true;
    }

    public e4(wv3 wv3Var) {
        this.f76907a = wv3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(nc3 nc3Var) {
        ex3.a(this.f76907a);
        wv3 wv3Var = this.f76907a;
        if (eb2.f77007c == wv3Var.f84352b.f78146a) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("skippable", nc3Var.f80636a);
                if (nc3Var.f80636a) {
                    jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, nc3Var.f80637b);
                }
                jSONObject.put("autoPlay", nc3Var.f80638c);
                jSONObject.put(C3426d4.i.L, nc3Var.f80639d);
            } catch (JSONException e10) {
                Log.e("OMIDLIB", "VastProperties: JSON error", e10);
            }
            if (!wv3Var.f84360j) {
                ka kaVar = wv3Var.f84355e;
                ix3.f78850a.a((WebView) kaVar.f79343b.get(), "publishLoadedEvent", jSONObject, kaVar.f79342a);
                wv3Var.f84360j = true;
                return;
            }
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }
}
