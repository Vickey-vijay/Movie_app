package com.google.protobuf;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;

/* JADX INFO: compiled from: FieldMaskKt.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class FieldMaskKt {
    public static final FieldMaskKt INSTANCE = new FieldMaskKt();

    /* JADX INFO: compiled from: FieldMaskKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final FieldMask.Builder _builder;

        /* JADX INFO: compiled from: FieldMaskKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(FieldMask.Builder builder) {
                ck.p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(FieldMask.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(FieldMask.Builder builder, ck.i iVar) {
            this(builder);
        }

        /* JADX INFO: compiled from: FieldMaskKt.kt */
        public static final class PathsProxy extends DslProxy {
            private PathsProxy() {
            }
        }

        public final /* synthetic */ FieldMask _build() {
            FieldMask fieldMaskBuild = this._builder.build();
            ck.p.i(fieldMaskBuild, "_builder.build()");
            return fieldMaskBuild;
        }

        public final /* synthetic */ void addAllPaths(DslList dslList, Iterable iterable) {
            ck.p.j(dslList, "<this>");
            ck.p.j(iterable, "values");
            this._builder.addAllPaths(iterable);
        }

        public final /* synthetic */ void addPaths(DslList dslList, String str) {
            ck.p.j(dslList, "<this>");
            ck.p.j(str, "value");
            this._builder.addPaths(str);
        }

        public final /* synthetic */ void clearPaths(DslList dslList) {
            ck.p.j(dslList, "<this>");
            this._builder.clearPaths();
        }

        public final DslList<String, PathsProxy> getPaths() {
            List<String> pathsList = this._builder.getPathsList();
            ck.p.i(pathsList, "_builder.getPathsList()");
            return new DslList<>(pathsList);
        }

        public final /* synthetic */ void plusAssignAllPaths(DslList<String, PathsProxy> dslList, Iterable<String> iterable) {
            ck.p.j(dslList, "<this>");
            ck.p.j(iterable, "values");
            addAllPaths(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignPaths(DslList<String, PathsProxy> dslList, String str) {
            ck.p.j(dslList, "<this>");
            ck.p.j(str, "value");
            addPaths(dslList, str);
        }

        public final /* synthetic */ void setPaths(DslList dslList, int i10, String str) {
            ck.p.j(dslList, "<this>");
            ck.p.j(str, "value");
            this._builder.setPaths(i10, str);
        }
    }

    private FieldMaskKt() {
    }
}
