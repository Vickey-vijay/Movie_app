package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface p30 extends l30 {
    long a(u30 u30Var);

    void a(r83 r83Var);

    void close();

    Uri getUri();

    default Map getResponseHeaders() {
        return Collections.emptyMap();
    }
}
