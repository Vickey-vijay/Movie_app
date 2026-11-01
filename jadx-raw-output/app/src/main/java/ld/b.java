package ld;

import android.content.Context;
import android.net.Uri;
import ck.i;
import com.yandex.android.beacon.SendBeaconWorkerImpl;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: SendBeaconManager.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f63524b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendBeaconWorkerImpl f63525a;

    /* JADX INFO: compiled from: SendBeaconManager.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public final void a(Uri uri, Map<String, String> map, JSONObject jSONObject) {
        this.f63525a.i(uri, map, jSONObject, true);
    }

    public b(Context context, ld.a aVar) {
        this.f63525a = new SendBeaconWorkerImpl(context, aVar);
    }
}
