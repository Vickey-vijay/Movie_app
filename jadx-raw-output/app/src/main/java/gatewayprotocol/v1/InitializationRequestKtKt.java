package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: InitializationRequestKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class InitializationRequestKtKt {
    /* JADX INFO: renamed from: -initializeinitializationRequest, reason: not valid java name */
    public static final InitializationRequestOuterClass.InitializationRequest m3423initializeinitializationRequest(l<? super InitializationRequestKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        InitializationRequestKt.Dsl.Companion companion = InitializationRequestKt.Dsl.Companion;
        InitializationRequestOuterClass.InitializationRequest.Builder builderNewBuilder = InitializationRequestOuterClass.InitializationRequest.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        InitializationRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final InitializationRequestOuterClass.InitializationRequest copy(InitializationRequestOuterClass.InitializationRequest initializationRequest, l<? super InitializationRequestKt.Dsl, r> lVar) {
        p.j(initializationRequest, "<this>");
        p.j(lVar, "block");
        InitializationRequestKt.Dsl.Companion companion = InitializationRequestKt.Dsl.Companion;
        InitializationRequestOuterClass.InitializationRequest.Builder builder = initializationRequest.toBuilder();
        p.i(builder, "this.toBuilder()");
        InitializationRequestKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ClientInfoOuterClass.ClientInfo getClientInfoOrNull(InitializationRequestOuterClass.InitializationRequestOrBuilder initializationRequestOrBuilder) {
        p.j(initializationRequestOrBuilder, "<this>");
        if (initializationRequestOrBuilder.hasClientInfo()) {
            return initializationRequestOrBuilder.getClientInfo();
        }
        return null;
    }

    public static final InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfoOrNull(InitializationRequestOuterClass.InitializationRequestOrBuilder initializationRequestOrBuilder) {
        p.j(initializationRequestOrBuilder, "<this>");
        if (initializationRequestOrBuilder.hasDeviceInfo()) {
            return initializationRequestOrBuilder.getDeviceInfo();
        }
        return null;
    }
}
