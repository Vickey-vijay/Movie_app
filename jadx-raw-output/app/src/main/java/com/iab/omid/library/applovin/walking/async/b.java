package com.iab.omid.library.applovin.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f21059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0209b f21060b;

    public interface a {
        void a(b bVar);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.async.b$b, reason: collision with other inner class name */
    public interface InterfaceC0209b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0209b interfaceC0209b) {
        this.f21060b = interfaceC0209b;
    }

    public void a(a aVar) {
        this.f21059a = aVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f21059a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
