package com.unity3d.ads.datastore;

import ck.i;
import ck.p;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.C3426d4;
import java.util.Map;

/* JADX INFO: compiled from: UniversalRequestStoreKt.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class UniversalRequestStoreKt {
    public static final UniversalRequestStoreKt INSTANCE = new UniversalRequestStoreKt();

    /* JADX INFO: compiled from: UniversalRequestStoreKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UniversalRequestStoreOuterClass.UniversalRequestStore.Builder _builder;

        /* JADX INFO: compiled from: UniversalRequestStoreKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder, i iVar) {
            this(builder);
        }

        /* JADX INFO: compiled from: UniversalRequestStoreKt.kt */
        public static final class UniversalRequestMapProxy extends DslProxy {
            private UniversalRequestMapProxy() {
            }
        }

        public final /* synthetic */ UniversalRequestStoreOuterClass.UniversalRequestStore _build() {
            UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStoreBuild = this._builder.build();
            p.i(universalRequestStoreBuild, "_builder.build()");
            return universalRequestStoreBuild;
        }

        public final /* synthetic */ void clearUniversalRequestMap(DslMap dslMap) {
            p.j(dslMap, "<this>");
            this._builder.clearUniversalRequestMap();
        }

        public final /* synthetic */ DslMap getUniversalRequestMapMap() {
            Map<String, ByteString> universalRequestMapMap = this._builder.getUniversalRequestMapMap();
            p.i(universalRequestMapMap, "_builder.getUniversalRequestMapMap()");
            return new DslMap(universalRequestMapMap);
        }

        public final /* synthetic */ void putAllUniversalRequestMap(DslMap dslMap, Map map) {
            p.j(dslMap, "<this>");
            p.j(map, "map");
            this._builder.putAllUniversalRequestMap(map);
        }

        public final void putUniversalRequestMap(DslMap<String, ByteString, UniversalRequestMapProxy> dslMap, String str, ByteString byteString) {
            p.j(dslMap, "<this>");
            p.j(str, C3426d4.i.W);
            p.j(byteString, "value");
            this._builder.putUniversalRequestMap(str, byteString);
        }

        public final /* synthetic */ void removeUniversalRequestMap(DslMap dslMap, String str) {
            p.j(dslMap, "<this>");
            p.j(str, C3426d4.i.W);
            this._builder.removeUniversalRequestMap(str);
        }

        public final /* synthetic */ void setUniversalRequestMap(DslMap<String, ByteString, UniversalRequestMapProxy> dslMap, String str, ByteString byteString) {
            p.j(dslMap, "<this>");
            p.j(str, C3426d4.i.W);
            p.j(byteString, "value");
            putUniversalRequestMap(dslMap, str, byteString);
        }
    }

    private UniversalRequestStoreKt() {
    }
}
