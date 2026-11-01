package gatewayprotocol.v1;

import ck.i;
import ck.p;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;

/* JADX INFO: compiled from: DeveloperConsentKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DeveloperConsentKt {
    public static final DeveloperConsentKt INSTANCE = new DeveloperConsentKt();

    /* JADX INFO: compiled from: DeveloperConsentKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DeveloperConsentOuterClass.DeveloperConsent.Builder _builder;

        /* JADX INFO: compiled from: DeveloperConsentKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DeveloperConsentOuterClass.DeveloperConsent.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(DeveloperConsentOuterClass.DeveloperConsent.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(DeveloperConsentOuterClass.DeveloperConsent.Builder builder, i iVar) {
            this(builder);
        }

        /* JADX INFO: compiled from: DeveloperConsentKt.kt */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public final /* synthetic */ DeveloperConsentOuterClass.DeveloperConsent _build() {
            DeveloperConsentOuterClass.DeveloperConsent developerConsentBuild = this._builder.build();
            p.i(developerConsentBuild, "_builder.build()");
            return developerConsentBuild;
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable iterable) {
            p.j(dslList, "<this>");
            p.j(iterable, "values");
            this._builder.addAllOptions(iterable);
        }

        public final /* synthetic */ void addOptions(DslList dslList, DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption) {
            p.j(dslList, "<this>");
            p.j(developerConsentOption, "value");
            this._builder.addOptions(developerConsentOption);
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            p.j(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final /* synthetic */ DslList getOptions() {
            List<DeveloperConsentOuterClass.DeveloperConsentOption> optionsList = this._builder.getOptionsList();
            p.i(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<DeveloperConsentOuterClass.DeveloperConsentOption, OptionsProxy> dslList, Iterable<DeveloperConsentOuterClass.DeveloperConsentOption> iterable) {
            p.j(dslList, "<this>");
            p.j(iterable, "values");
            addAllOptions(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<DeveloperConsentOuterClass.DeveloperConsentOption, OptionsProxy> dslList, DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption) {
            p.j(dslList, "<this>");
            p.j(developerConsentOption, "value");
            addOptions(dslList, developerConsentOption);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i10, DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption) {
            p.j(dslList, "<this>");
            p.j(developerConsentOption, "value");
            this._builder.setOptions(i10, developerConsentOption);
        }
    }

    private DeveloperConsentKt() {
    }
}
