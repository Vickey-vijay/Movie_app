package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: FloatValueKt.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class FloatValueKt {
    public static final FloatValueKt INSTANCE = new FloatValueKt();

    /* JADX INFO: compiled from: FloatValueKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final FloatValue.Builder _builder;

        /* JADX INFO: compiled from: FloatValueKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(FloatValue.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(FloatValue.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(FloatValue.Builder builder, ck.i iVar) {
            this(builder);
        }

        public final /* synthetic */ FloatValue _build() {
            FloatValue floatValueBuild = this._builder.build();
            ck.p.i(floatValueBuild, "_builder.build()");
            return floatValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final float getValue() {
            return this._builder.getValue();
        }

        public final void setValue(float f10) {
            this._builder.setValue(f10);
        }
    }

    private FloatValueKt() {
    }
}
