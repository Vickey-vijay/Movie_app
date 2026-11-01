package gatewayprotocol.v1;

import ck.i;
import ck.p;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;

/* JADX INFO: compiled from: CampaignStateKt.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class CampaignStateKt {
    public static final CampaignStateKt INSTANCE = new CampaignStateKt();

    /* JADX INFO: compiled from: CampaignStateKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CampaignStateOuterClass.CampaignState.Builder _builder;

        /* JADX INFO: compiled from: CampaignStateKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignStateOuterClass.CampaignState.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(CampaignStateOuterClass.CampaignState.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(CampaignStateOuterClass.CampaignState.Builder builder, i iVar) {
            this(builder);
        }

        /* JADX INFO: compiled from: CampaignStateKt.kt */
        public static final class LoadedCampaignsProxy extends DslProxy {
            private LoadedCampaignsProxy() {
            }
        }

        /* JADX INFO: compiled from: CampaignStateKt.kt */
        public static final class ShownCampaignsProxy extends DslProxy {
            private ShownCampaignsProxy() {
            }
        }

        public final /* synthetic */ CampaignStateOuterClass.CampaignState _build() {
            CampaignStateOuterClass.CampaignState campaignStateBuild = this._builder.build();
            p.i(campaignStateBuild, "_builder.build()");
            return campaignStateBuild;
        }

        public final /* synthetic */ void addAllLoadedCampaigns(DslList dslList, Iterable iterable) {
            p.j(dslList, "<this>");
            p.j(iterable, "values");
            this._builder.addAllLoadedCampaigns(iterable);
        }

        public final /* synthetic */ void addAllShownCampaigns(DslList dslList, Iterable iterable) {
            p.j(dslList, "<this>");
            p.j(iterable, "values");
            this._builder.addAllShownCampaigns(iterable);
        }

        public final /* synthetic */ void addLoadedCampaigns(DslList dslList, CampaignStateOuterClass.Campaign campaign) {
            p.j(dslList, "<this>");
            p.j(campaign, "value");
            this._builder.addLoadedCampaigns(campaign);
        }

        public final /* synthetic */ void addShownCampaigns(DslList dslList, CampaignStateOuterClass.Campaign campaign) {
            p.j(dslList, "<this>");
            p.j(campaign, "value");
            this._builder.addShownCampaigns(campaign);
        }

        public final /* synthetic */ void clearLoadedCampaigns(DslList dslList) {
            p.j(dslList, "<this>");
            this._builder.clearLoadedCampaigns();
        }

        public final /* synthetic */ void clearShownCampaigns(DslList dslList) {
            p.j(dslList, "<this>");
            this._builder.clearShownCampaigns();
        }

        public final /* synthetic */ DslList getLoadedCampaigns() {
            List<CampaignStateOuterClass.Campaign> loadedCampaignsList = this._builder.getLoadedCampaignsList();
            p.i(loadedCampaignsList, "_builder.getLoadedCampaignsList()");
            return new DslList(loadedCampaignsList);
        }

        public final /* synthetic */ DslList getShownCampaigns() {
            List<CampaignStateOuterClass.Campaign> shownCampaignsList = this._builder.getShownCampaignsList();
            p.i(shownCampaignsList, "_builder.getShownCampaignsList()");
            return new DslList(shownCampaignsList);
        }

        public final /* synthetic */ void plusAssignAllLoadedCampaigns(DslList<CampaignStateOuterClass.Campaign, LoadedCampaignsProxy> dslList, Iterable<CampaignStateOuterClass.Campaign> iterable) {
            p.j(dslList, "<this>");
            p.j(iterable, "values");
            addAllLoadedCampaigns(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllShownCampaigns(DslList<CampaignStateOuterClass.Campaign, ShownCampaignsProxy> dslList, Iterable<CampaignStateOuterClass.Campaign> iterable) {
            p.j(dslList, "<this>");
            p.j(iterable, "values");
            addAllShownCampaigns(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignLoadedCampaigns(DslList<CampaignStateOuterClass.Campaign, LoadedCampaignsProxy> dslList, CampaignStateOuterClass.Campaign campaign) {
            p.j(dslList, "<this>");
            p.j(campaign, "value");
            addLoadedCampaigns(dslList, campaign);
        }

        public final /* synthetic */ void plusAssignShownCampaigns(DslList<CampaignStateOuterClass.Campaign, ShownCampaignsProxy> dslList, CampaignStateOuterClass.Campaign campaign) {
            p.j(dslList, "<this>");
            p.j(campaign, "value");
            addShownCampaigns(dslList, campaign);
        }

        public final /* synthetic */ void setLoadedCampaigns(DslList dslList, int i10, CampaignStateOuterClass.Campaign campaign) {
            p.j(dslList, "<this>");
            p.j(campaign, "value");
            this._builder.setLoadedCampaigns(i10, campaign);
        }

        public final /* synthetic */ void setShownCampaigns(DslList dslList, int i10, CampaignStateOuterClass.Campaign campaign) {
            p.j(dslList, "<this>");
            p.j(campaign, "value");
            this._builder.setShownCampaigns(i10, campaign);
        }
    }

    private CampaignStateKt() {
    }
}
