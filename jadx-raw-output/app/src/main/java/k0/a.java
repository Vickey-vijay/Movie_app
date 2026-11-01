package k0;

import com.digitalturbine.ignite.authenticator.events.d;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends IIgniteServiceCallback.Stub {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0.a f62045c;

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        this.f62045c.a(str);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        String string;
        try {
            string = new JSONObject(str).getJSONObject("data").getString("token");
        } catch (Exception e10) {
            n0.b.a(d.ONE_DT_GENERAL_ERROR, e10);
            r0.b.b("%s : resolveClientToken : %s", "IgniteAuthenticationCallback", e10.toString());
            string = null;
        }
        this.f62045c.c(string);
    }

    public a(l0.a aVar) {
        this.f62045c = aVar;
    }
}
