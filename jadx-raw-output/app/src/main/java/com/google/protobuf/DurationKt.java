package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: DurationKt.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DurationKt {
    public static final DurationKt INSTANCE = new DurationKt();

    /* JADX INFO: compiled from: DurationKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Duration.Builder _builder;

        /* JADX INFO: compiled from: DurationKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Duration.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Duration.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Duration.Builder builder, ck.i iVar) {
            this(builder);
        }

        public final /* synthetic */ Duration _build() {
            Duration durationBuild = this._builder.build();
            ck.p.i(durationBuild, "_builder.build()");
            return durationBuild;
        }

        public final void clearNanos() {
            this._builder.clearNanos();
        }

        public final void clearSeconds() {
            this._builder.clearSeconds();
        }

        public final int getNanos() {
            return this._builder.getNanos();
        }

        public final long getSeconds() {
            return this._builder.getSeconds();
        }

        public final void setNanos(int i10) {
            this._builder.setNanos(i10);
        }

        public final void setSeconds(long j10) {
            this._builder.setSeconds(j10);
        }
    }

    private DurationKt() {
    }
}
