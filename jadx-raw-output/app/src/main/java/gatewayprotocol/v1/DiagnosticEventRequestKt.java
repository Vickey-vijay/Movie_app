package gatewayprotocol.v1;

import ck.i;
import ck.p;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;

/* JADX INFO: compiled from: DiagnosticEventRequestKt.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DiagnosticEventRequestKt {
    public static final DiagnosticEventRequestKt INSTANCE = new DiagnosticEventRequestKt();

    /* JADX INFO: compiled from: DiagnosticEventRequestKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder _builder;

        /* JADX INFO: compiled from: DiagnosticEventRequestKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder, i iVar) {
            this(builder);
        }

        /* JADX INFO: compiled from: DiagnosticEventRequestKt.kt */
        public static final class BatchProxy extends DslProxy {
            private BatchProxy() {
            }
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticEventRequest _build() {
            DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequestBuild = this._builder.build();
            p.i(diagnosticEventRequestBuild, "_builder.build()");
            return diagnosticEventRequestBuild;
        }

        public final /* synthetic */ void addAllBatch(DslList dslList, Iterable iterable) {
            p.j(dslList, "<this>");
            p.j(iterable, "values");
            this._builder.addAllBatch(iterable);
        }

        public final /* synthetic */ void addBatch(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
            p.j(dslList, "<this>");
            p.j(diagnosticEvent, "value");
            this._builder.addBatch(diagnosticEvent);
        }

        public final /* synthetic */ void clearBatch(DslList dslList) {
            p.j(dslList, "<this>");
            this._builder.clearBatch();
        }

        public final /* synthetic */ DslList getBatch() {
            List<DiagnosticEventRequestOuterClass.DiagnosticEvent> batchList = this._builder.getBatchList();
            p.i(batchList, "_builder.getBatchList()");
            return new DslList(batchList);
        }

        public final /* synthetic */ void plusAssignAllBatch(DslList<DiagnosticEventRequestOuterClass.DiagnosticEvent, BatchProxy> dslList, Iterable<DiagnosticEventRequestOuterClass.DiagnosticEvent> iterable) {
            p.j(dslList, "<this>");
            p.j(iterable, "values");
            addAllBatch(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignBatch(DslList<DiagnosticEventRequestOuterClass.DiagnosticEvent, BatchProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
            p.j(dslList, "<this>");
            p.j(diagnosticEvent, "value");
            addBatch(dslList, diagnosticEvent);
        }

        public final /* synthetic */ void setBatch(DslList dslList, int i10, DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
            p.j(dslList, "<this>");
            p.j(diagnosticEvent, "value");
            this._builder.setBatch(i10, diagnosticEvent);
        }
    }

    private DiagnosticEventRequestKt() {
    }
}
