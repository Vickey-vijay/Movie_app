package com.iab.omid.library.appodeal.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f21194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0213b f21195b;

    public interface a {
        void a(b bVar);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.appodeal.walking.async.b$b, reason: collision with other inner class name */
    public interface InterfaceC0213b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0213b interfaceC0213b) {
        this.f21195b = interfaceC0213b;
    }

    public void a(a aVar) {
        this.f21194a = aVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f21194a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
