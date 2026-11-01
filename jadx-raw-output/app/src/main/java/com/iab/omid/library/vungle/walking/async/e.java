package com.iab.omid.library.vungle.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class e extends a {
    public e(b.InterfaceC0246b interfaceC0246b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0246b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.vungle.internal.c cVarC = com.iab.omid.library.vungle.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.vungle.adsession.a aVar : cVarC.b()) {
                if (this.f22257c.contains(aVar.c())) {
                    aVar.d().a(str, this.f22259e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f22258d.toString();
    }

    @Override // com.iab.omid.library.vungle.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
