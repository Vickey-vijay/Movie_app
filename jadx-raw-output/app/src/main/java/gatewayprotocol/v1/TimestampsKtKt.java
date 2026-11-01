package gatewayprotocol.v1;

import bk.l;
import ck.p;
import com.google.protobuf.Timestamp;
import mj.r;

/* JADX INFO: compiled from: TimestampsKt.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class TimestampsKtKt {
    /* JADX INFO: renamed from: -initializetimestamps, reason: not valid java name */
    public static final TimestampsOuterClass.Timestamps m3445initializetimestamps(l<? super TimestampsKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        TimestampsKt.Dsl.Companion companion = TimestampsKt.Dsl.Companion;
        TimestampsOuterClass.Timestamps.Builder builderNewBuilder = TimestampsOuterClass.Timestamps.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        TimestampsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final TimestampsOuterClass.Timestamps copy(TimestampsOuterClass.Timestamps timestamps, l<? super TimestampsKt.Dsl, r> lVar) {
        p.j(timestamps, "<this>");
        p.j(lVar, "block");
        TimestampsKt.Dsl.Companion companion = TimestampsKt.Dsl.Companion;
        TimestampsOuterClass.Timestamps.Builder builder = timestamps.toBuilder();
        p.i(builder, "this.toBuilder()");
        TimestampsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Timestamp getTimestampOrNull(TimestampsOuterClass.TimestampsOrBuilder timestampsOrBuilder) {
        p.j(timestampsOrBuilder, "<this>");
        if (timestampsOrBuilder.hasTimestamp()) {
            return timestampsOrBuilder.getTimestamp();
        }
        return null;
    }
}
