package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: MixinKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class MixinKt {
    public static final MixinKt INSTANCE = new MixinKt();

    /* JADX INFO: compiled from: MixinKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Mixin.Builder _builder;

        /* JADX INFO: compiled from: MixinKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Mixin.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Mixin.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Mixin.Builder builder, ck.i iVar) {
            this(builder);
        }

        public final /* synthetic */ Mixin _build() {
            Mixin mixinBuild = this._builder.build();
            ck.p.i(mixinBuild, "_builder.build()");
            return mixinBuild;
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearRoot() {
            this._builder.clearRoot();
        }

        public final String getName() {
            String name = this._builder.getName();
            ck.p.i(name, "_builder.getName()");
            return name;
        }

        public final String getRoot() {
            String root = this._builder.getRoot();
            ck.p.i(root, "_builder.getRoot()");
            return root;
        }

        public final void setName(String str) {
            ck.p.j(str, "value");
            this._builder.setName(str);
        }

        public final void setRoot(String str) {
            ck.p.j(str, "value");
            this._builder.setRoot(str);
        }
    }

    private MixinKt() {
    }
}
