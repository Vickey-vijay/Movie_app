package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: SourceContextKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class SourceContextKt {
    public static final SourceContextKt INSTANCE = new SourceContextKt();

    /* JADX INFO: compiled from: SourceContextKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final SourceContext.Builder _builder;

        /* JADX INFO: compiled from: SourceContextKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(SourceContext.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(SourceContext.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(SourceContext.Builder builder, ck.i iVar) {
            this(builder);
        }

        public final /* synthetic */ SourceContext _build() {
            SourceContext sourceContextBuild = this._builder.build();
            ck.p.i(sourceContextBuild, "_builder.build()");
            return sourceContextBuild;
        }

        public final void clearFileName() {
            this._builder.clearFileName();
        }

        public final String getFileName() {
            String fileName = this._builder.getFileName();
            ck.p.i(fileName, "_builder.getFileName()");
            return fileName;
        }

        public final void setFileName(String str) {
            ck.p.j(str, "value");
            this._builder.setFileName(str);
        }
    }

    private SourceContextKt() {
    }
}
