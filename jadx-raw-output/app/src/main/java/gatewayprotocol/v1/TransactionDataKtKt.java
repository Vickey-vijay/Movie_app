package gatewayprotocol.v1;

import bk.l;
import ck.p;
import com.google.protobuf.Timestamp;
import mj.r;

/* JADX INFO: compiled from: TransactionDataKt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TransactionDataKtKt {
    /* JADX INFO: renamed from: -initializetransactionData, reason: not valid java name */
    public static final TransactionEventRequestOuterClass.TransactionData m3447initializetransactionData(l<? super TransactionDataKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        TransactionDataKt.Dsl.Companion companion = TransactionDataKt.Dsl.Companion;
        TransactionEventRequestOuterClass.TransactionData.Builder builderNewBuilder = TransactionEventRequestOuterClass.TransactionData.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        TransactionDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final TransactionEventRequestOuterClass.TransactionData copy(TransactionEventRequestOuterClass.TransactionData transactionData, l<? super TransactionDataKt.Dsl, r> lVar) {
        p.j(transactionData, "<this>");
        p.j(lVar, "block");
        TransactionDataKt.Dsl.Companion companion = TransactionDataKt.Dsl.Companion;
        TransactionEventRequestOuterClass.TransactionData.Builder builder = transactionData.toBuilder();
        p.i(builder, "this.toBuilder()");
        TransactionDataKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Timestamp getTimestampOrNull(TransactionEventRequestOuterClass.TransactionDataOrBuilder transactionDataOrBuilder) {
        p.j(transactionDataOrBuilder, "<this>");
        if (transactionDataOrBuilder.hasTimestamp()) {
            return transactionDataOrBuilder.getTimestamp();
        }
        return null;
    }
}
