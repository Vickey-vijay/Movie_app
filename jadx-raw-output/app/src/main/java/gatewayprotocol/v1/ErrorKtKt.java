package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: ErrorKt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ErrorKtKt {
    /* JADX INFO: renamed from: -initializeerror, reason: not valid java name */
    public static final ErrorOuterClass.Error m3415initializeerror(l<? super ErrorKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        ErrorKt.Dsl.Companion companion = ErrorKt.Dsl.Companion;
        ErrorOuterClass.Error.Builder builderNewBuilder = ErrorOuterClass.Error.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        ErrorKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ErrorOuterClass.Error copy(ErrorOuterClass.Error error, l<? super ErrorKt.Dsl, r> lVar) {
        p.j(error, "<this>");
        p.j(lVar, "block");
        ErrorKt.Dsl.Companion companion = ErrorKt.Dsl.Companion;
        ErrorOuterClass.Error.Builder builder = error.toBuilder();
        p.i(builder, "this.toBuilder()");
        ErrorKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
