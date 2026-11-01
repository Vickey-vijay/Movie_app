package gatewayprotocol.v1;

import ck.i;
import ck.p;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: CampaignKt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class CampaignKt {
    public static final CampaignKt INSTANCE = new CampaignKt();

    /* JADX INFO: compiled from: CampaignKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CampaignStateOuterClass.Campaign.Builder _builder;

        /* JADX INFO: compiled from: CampaignKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignStateOuterClass.Campaign.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(CampaignStateOuterClass.Campaign.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(CampaignStateOuterClass.Campaign.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ CampaignStateOuterClass.Campaign _build() {
            CampaignStateOuterClass.Campaign campaignBuild = this._builder.build();
            p.i(campaignBuild, "_builder.build()");
            return campaignBuild;
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final void clearDataVersion() {
            this._builder.clearDataVersion();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearLoadTimestamp() {
            this._builder.clearLoadTimestamp();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearShowTimestamp() {
            this._builder.clearShowTimestamp();
        }

        public final ByteString getData() {
            ByteString data = this._builder.getData();
            p.i(data, "_builder.getData()");
            return data;
        }

        public final int getDataVersion() {
            return this._builder.getDataVersion();
        }

        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            p.i(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        public final TimestampsOuterClass.Timestamps getLoadTimestamp() {
            TimestampsOuterClass.Timestamps loadTimestamp = this._builder.getLoadTimestamp();
            p.i(loadTimestamp, "_builder.getLoadTimestamp()");
            return loadTimestamp;
        }

        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            p.i(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final TimestampsOuterClass.Timestamps getShowTimestamp() {
            TimestampsOuterClass.Timestamps showTimestamp = this._builder.getShowTimestamp();
            p.i(showTimestamp, "_builder.getShowTimestamp()");
            return showTimestamp;
        }

        public final TimestampsOuterClass.Timestamps getShowTimestampOrNull(Dsl dsl) {
            p.j(dsl, "<this>");
            return CampaignKtKt.getShowTimestampOrNull(dsl._builder);
        }

        public final boolean hasLoadTimestamp() {
            return this._builder.hasLoadTimestamp();
        }

        public final boolean hasShowTimestamp() {
            return this._builder.hasShowTimestamp();
        }

        public final void setData(ByteString byteString) {
            p.j(byteString, "value");
            this._builder.setData(byteString);
        }

        public final void setDataVersion(int i10) {
            this._builder.setDataVersion(i10);
        }

        public final void setImpressionOpportunityId(ByteString byteString) {
            p.j(byteString, "value");
            this._builder.setImpressionOpportunityId(byteString);
        }

        public final void setLoadTimestamp(TimestampsOuterClass.Timestamps timestamps) {
            p.j(timestamps, "value");
            this._builder.setLoadTimestamp(timestamps);
        }

        public final void setPlacementId(String str) {
            p.j(str, "value");
            this._builder.setPlacementId(str);
        }

        public final void setShowTimestamp(TimestampsOuterClass.Timestamps timestamps) {
            p.j(timestamps, "value");
            this._builder.setShowTimestamp(timestamps);
        }
    }

    private CampaignKt() {
    }
}
