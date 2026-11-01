package yads;

import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class cx3 extends uv3 {
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (lw3.c(this.f83675d, this.f77963b.f77531a)) {
            return null;
        }
        fw3 fw3Var = this.f77963b;
        JSONObject jSONObject = this.f83675d;
        fw3Var.f77531a = jSONObject;
        return jSONObject.toString();
    }

    public cx3(fw3 fw3Var, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(fw3Var, hashSet, jSONObject, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.gw3, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        nw3 nw3Var;
        if (!TextUtils.isEmpty(str) && (nw3Var = nw3.f80846c) != null) {
            for (wv3 wv3Var : Collections.unmodifiableCollection(nw3Var.f80847a)) {
                if (this.f83674c.contains(wv3Var.f84358h)) {
                    ka kaVar = wv3Var.f84355e;
                    if (this.f83676e >= kaVar.f79347f) {
                        kaVar.f79346e = 2;
                        ix3.f78850a.a((WebView) kaVar.f79343b.get(), "setNativeViewHierarchy", str, kaVar.f79342a);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }
}
