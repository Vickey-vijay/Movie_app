package yads;

import android.webkit.WebView;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class zw3 extends uv3 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.gw3, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        nw3 nw3Var = nw3.f80846c;
        if (nw3Var != null) {
            for (wv3 wv3Var : Collections.unmodifiableCollection(nw3Var.f80847a)) {
                if (this.f83674c.contains(wv3Var.f84358h)) {
                    ka kaVar = wv3Var.f84355e;
                    if (this.f83676e >= kaVar.f79347f && kaVar.f79346e != 3) {
                        kaVar.f79346e = 3;
                        ix3.f78850a.a((WebView) kaVar.f79343b.get(), "setNativeViewHierarchy", str, kaVar.f79342a);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        return this.f83675d.toString();
    }

    public zw3(fw3 fw3Var, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(fw3Var, hashSet, jSONObject, j10);
    }
}
