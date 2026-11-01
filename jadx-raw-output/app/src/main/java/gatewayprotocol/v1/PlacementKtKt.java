package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: PlacementKt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PlacementKtKt {
    /* JADX INFO: renamed from: -initializeplacement, reason: not valid java name */
    public static final InitializationResponseOuterClass.Placement m3433initializeplacement(l<? super PlacementKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.Companion;
        InitializationResponseOuterClass.Placement.Builder builderNewBuilder = InitializationResponseOuterClass.Placement.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        PlacementKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final InitializationResponseOuterClass.Placement copy(InitializationResponseOuterClass.Placement placement, l<? super PlacementKt.Dsl, r> lVar) {
        p.j(placement, "<this>");
        p.j(lVar, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.Companion;
        InitializationResponseOuterClass.Placement.Builder builder = placement.toBuilder();
        p.i(builder, "this.toBuilder()");
        PlacementKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
