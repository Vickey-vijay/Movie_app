package gatewayprotocol.v1;

import ck.i;
import ck.p;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: TimestampsKt.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TimestampsKt {
    public static final TimestampsKt INSTANCE = new TimestampsKt();

    /* JADX INFO: compiled from: TimestampsKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TimestampsOuterClass.Timestamps.Builder _builder;

        /* JADX INFO: compiled from: TimestampsKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(TimestampsOuterClass.Timestamps.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(TimestampsOuterClass.Timestamps.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(TimestampsOuterClass.Timestamps.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ TimestampsOuterClass.Timestamps _build() {
            TimestampsOuterClass.Timestamps timestampsBuild = this._builder.build();
            p.i(timestampsBuild, "_builder.build()");
            return timestampsBuild;
        }

        public final void clearSessionTimestamp() {
            this._builder.clearSessionTimestamp();
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final long getSessionTimestamp() {
            return this._builder.getSessionTimestamp();
        }

        public final Timestamp getTimestamp() {
            Timestamp timestamp = this._builder.getTimestamp();
            p.i(timestamp, "_builder.getTimestamp()");
            return timestamp;
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        public final void setSessionTimestamp(long j10) {
            this._builder.setSessionTimestamp(j10);
        }

        public final void setTimestamp(Timestamp timestamp) {
            p.j(timestamp, "value");
            this._builder.setTimestamp(timestamp);
        }
    }

    private TimestampsKt() {
    }
}
