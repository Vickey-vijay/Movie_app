package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: AllowedPiiKt.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AllowedPiiKtKt {
    /* JADX INFO: renamed from: -initializeallowedPii, reason: not valid java name */
    public static final AllowedPiiOuterClass.AllowedPii m3397initializeallowedPii(l<? super AllowedPiiKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
        AllowedPiiOuterClass.AllowedPii.Builder builderNewBuilder = AllowedPiiOuterClass.AllowedPii.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        AllowedPiiKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AllowedPiiOuterClass.AllowedPii copy(AllowedPiiOuterClass.AllowedPii allowedPii, l<? super AllowedPiiKt.Dsl, r> lVar) {
        p.j(allowedPii, "<this>");
        p.j(lVar, "block");
        AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
        AllowedPiiOuterClass.AllowedPii.Builder builder = allowedPii.toBuilder();
        p.i(builder, "this.toBuilder()");
        AllowedPiiKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
