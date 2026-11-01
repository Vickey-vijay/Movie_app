package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: DoubleValueKt.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DoubleValueKt {
    public static final DoubleValueKt INSTANCE = new DoubleValueKt();

    /* JADX INFO: compiled from: DoubleValueKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DoubleValue.Builder _builder;

        /* JADX INFO: compiled from: DoubleValueKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DoubleValue.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(DoubleValue.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(DoubleValue.Builder builder, ck.i iVar) {
            this(builder);
        }

        public final /* synthetic */ DoubleValue _build() {
            DoubleValue doubleValueBuild = this._builder.build();
            ck.p.i(doubleValueBuild, "_builder.build()");
            return doubleValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final double getValue() {
            return this._builder.getValue();
        }

        public final void setValue(double d10) {
            this._builder.setValue(d10);
        }
    }

    private DoubleValueKt() {
    }
}
