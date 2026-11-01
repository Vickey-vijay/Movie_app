package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: MediationInfoKt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class MediationInfoKtKt {
    /* JADX INFO: renamed from: -initializemediationInfo, reason: not valid java name */
    public static final MediationInfoOuterClass.MediationInfo m3426initializemediationInfo(l<? super MediationInfoKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        MediationInfoKt.Dsl.Companion companion = MediationInfoKt.Dsl.Companion;
        MediationInfoOuterClass.MediationInfo.Builder builderNewBuilder = MediationInfoOuterClass.MediationInfo.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        MediationInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MediationInfoOuterClass.MediationInfo copy(MediationInfoOuterClass.MediationInfo mediationInfo, l<? super MediationInfoKt.Dsl, r> lVar) {
        p.j(mediationInfo, "<this>");
        p.j(lVar, "block");
        MediationInfoKt.Dsl.Companion companion = MediationInfoKt.Dsl.Companion;
        MediationInfoOuterClass.MediationInfo.Builder builder = mediationInfo.toBuilder();
        p.i(builder, "this.toBuilder()");
        MediationInfoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
