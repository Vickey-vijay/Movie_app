package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.core.NetworkRequest;
import io.bidmachine.utils.BMError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: NetworkRequestManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class z4 {
    private static volatile z4 instance;
    private final Object lock = new Object();

    @VisibleForTesting
    public final Map<String, NetworkRequest<?, Response, BMError>> networkRequestMap = new HashMap();

    @NonNull
    public static z4 get() {
        z4 z4Var = instance;
        if (z4Var == null) {
            synchronized (z4.class) {
                z4Var = instance;
                if (z4Var == null) {
                    z4Var = new z4();
                    instance = z4Var;
                }
            }
        }
        return z4Var;
    }

    public void add(@NonNull String str, @NonNull NetworkRequest<?, Response, BMError> networkRequest) {
        synchronized (this.lock) {
            this.networkRequestMap.put(str, networkRequest);
        }
    }

    public boolean contains(@NonNull String str) {
        boolean zContainsKey;
        synchronized (this.lock) {
            zContainsKey = this.networkRequestMap.containsKey(str);
        }
        return zContainsKey;
    }

    public NetworkRequest<?, Response, BMError> remove(@NonNull String str) {
        NetworkRequest<?, Response, BMError> networkRequestRemove;
        synchronized (this.lock) {
            networkRequestRemove = this.networkRequestMap.remove(str);
        }
        return networkRequestRemove;
    }
}
