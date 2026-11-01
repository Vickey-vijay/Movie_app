package yads;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public final class so1 {
    public static Map a(fo1 fo1Var) {
        MediatedAdapterInfo mediatedAdapterInfoB = fo1Var.b();
        Pair[] pairArr = new Pair[3];
        String adapterVersion = mediatedAdapterInfoB.getAdapterVersion();
        String str = "null";
        if (adapterVersion == null) {
            adapterVersion = "null";
        }
        pairArr[0] = mj.h.a("mediation_adapter_version", adapterVersion);
        String networkName = mediatedAdapterInfoB.getNetworkName();
        if (networkName == null) {
            networkName = "null";
        }
        pairArr[1] = mj.h.a("mediation_network_name", networkName);
        String networkSdkVersion = mediatedAdapterInfoB.getNetworkSdkVersion();
        if (networkSdkVersion != null) {
            str = networkSdkVersion;
        }
        pairArr[2] = mj.h.a("mediation_network_sdk_version", str);
        return kotlin.collections.a.m(pairArr);
    }
}
