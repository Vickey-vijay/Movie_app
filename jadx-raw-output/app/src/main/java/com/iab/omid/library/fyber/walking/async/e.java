package com.iab.omid.library.fyber.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class e extends a {
    public e(b.InterfaceC0224b interfaceC0224b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0224b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.fyber.internal.c cVarC = com.iab.omid.library.fyber.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.fyber.adsession.a aVar : cVarC.b()) {
                if (this.f21577c.contains(aVar.c())) {
                    aVar.d().a(str, this.f21579e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f21578d.toString();
    }

    @Override // com.iab.omid.library.fyber.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
