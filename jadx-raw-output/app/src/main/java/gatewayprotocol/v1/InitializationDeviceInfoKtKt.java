package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: InitializationDeviceInfoKt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class InitializationDeviceInfoKtKt {
    /* JADX INFO: renamed from: -initializeinitializationDeviceInfo, reason: not valid java name */
    public static final InitializationRequestOuterClass.InitializationDeviceInfo m3422initializeinitializationDeviceInfo(l<? super InitializationDeviceInfoKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        InitializationDeviceInfoKt.Dsl.Companion companion = InitializationDeviceInfoKt.Dsl.Companion;
        InitializationRequestOuterClass.InitializationDeviceInfo.Builder builderNewBuilder = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        InitializationDeviceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final InitializationRequestOuterClass.InitializationDeviceInfo copy(InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfo, l<? super InitializationDeviceInfoKt.Dsl, r> lVar) {
        p.j(initializationDeviceInfo, "<this>");
        p.j(lVar, "block");
        InitializationDeviceInfoKt.Dsl.Companion companion = InitializationDeviceInfoKt.Dsl.Companion;
        InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder = initializationDeviceInfo.toBuilder();
        p.i(builder, "this.toBuilder()");
        InitializationDeviceInfoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
