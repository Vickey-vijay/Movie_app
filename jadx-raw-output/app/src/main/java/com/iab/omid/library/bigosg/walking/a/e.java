package com.iab.omid.library.bigosg.walking.a;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class e extends a {
    public e(b.InterfaceC0216b interfaceC0216b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0216b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.bigosg.b.a aVarA = com.iab.omid.library.bigosg.b.a.a();
        if (aVarA != null) {
            for (com.iab.omid.library.bigosg.adsession.a aVar : aVarA.b()) {
                if (((a) this).f21312a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f21314c);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f21313b.toString();
    }

    @Override // com.iab.omid.library.bigosg.walking.a.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
