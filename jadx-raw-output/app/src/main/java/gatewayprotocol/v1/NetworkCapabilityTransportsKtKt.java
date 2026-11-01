package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: NetworkCapabilityTransportsKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class NetworkCapabilityTransportsKtKt {
    /* JADX INFO: renamed from: -initializenetworkCapabilityTransports, reason: not valid java name */
    public static final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports m3429initializenetworkCapabilityTransports(l<? super NetworkCapabilityTransportsKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        NetworkCapabilityTransportsKt.Dsl.Companion companion = NetworkCapabilityTransportsKt.Dsl.Companion;
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builderNewBuilder = NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        NetworkCapabilityTransportsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports copy(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports, l<? super NetworkCapabilityTransportsKt.Dsl, r> lVar) {
        p.j(networkCapabilityTransports, "<this>");
        p.j(lVar, "block");
        NetworkCapabilityTransportsKt.Dsl.Companion companion = NetworkCapabilityTransportsKt.Dsl.Companion;
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builder = networkCapabilityTransports.toBuilder();
        p.i(builder, "this.toBuilder()");
        NetworkCapabilityTransportsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
