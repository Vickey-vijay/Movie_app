package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: DeveloperConsentOptionKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DeveloperConsentOptionKtKt {
    /* JADX INFO: renamed from: -initializedeveloperConsentOption, reason: not valid java name */
    public static final DeveloperConsentOuterClass.DeveloperConsentOption m3407initializedeveloperConsentOption(l<? super DeveloperConsentOptionKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsentOption.Builder builderNewBuilder = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        DeveloperConsentOptionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DeveloperConsentOuterClass.DeveloperConsentOption copy(DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption, l<? super DeveloperConsentOptionKt.Dsl, r> lVar) {
        p.j(developerConsentOption, "<this>");
        p.j(lVar, "block");
        DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder = developerConsentOption.toBuilder();
        p.i(builder, "this.toBuilder()");
        DeveloperConsentOptionKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
