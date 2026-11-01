package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: EmptyKt.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class EmptyKt {
    public static final EmptyKt INSTANCE = new EmptyKt();

    /* JADX INFO: compiled from: EmptyKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Empty.Builder _builder;

        /* JADX INFO: compiled from: EmptyKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Empty.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Empty.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Empty.Builder builder, ck.i iVar) {
            this(builder);
        }

        public final /* synthetic */ Empty _build() {
            Empty emptyBuild = this._builder.build();
            ck.p.i(emptyBuild, "_builder.build()");
            return emptyBuild;
        }
    }

    private EmptyKt() {
    }
}
