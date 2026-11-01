package gatewayprotocol.v1;

import ck.i;
import ck.p;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: PiiKt.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class PiiKt {
    public static final PiiKt INSTANCE = new PiiKt();

    /* JADX INFO: compiled from: PiiKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final PiiOuterClass.Pii.Builder _builder;

        /* JADX INFO: compiled from: PiiKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(PiiOuterClass.Pii.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(PiiOuterClass.Pii.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(PiiOuterClass.Pii.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ PiiOuterClass.Pii _build() {
            PiiOuterClass.Pii piiBuild = this._builder.build();
            p.i(piiBuild, "_builder.build()");
            return piiBuild;
        }

        public final void clearAdvertisingId() {
            this._builder.clearAdvertisingId();
        }

        public final void clearAppsetId() {
            this._builder.clearAppsetId();
        }

        public final void clearFid() {
            this._builder.clearFid();
        }

        public final void clearOpenAdvertisingTrackingId() {
            this._builder.clearOpenAdvertisingTrackingId();
        }

        public final void clearVendorId() {
            this._builder.clearVendorId();
        }

        public final ByteString getAdvertisingId() {
            ByteString advertisingId = this._builder.getAdvertisingId();
            p.i(advertisingId, "_builder.getAdvertisingId()");
            return advertisingId;
        }

        public final String getAppsetId() {
            String appsetId = this._builder.getAppsetId();
            p.i(appsetId, "_builder.getAppsetId()");
            return appsetId;
        }

        public final String getFid() {
            String fid = this._builder.getFid();
            p.i(fid, "_builder.getFid()");
            return fid;
        }

        public final ByteString getOpenAdvertisingTrackingId() {
            ByteString openAdvertisingTrackingId = this._builder.getOpenAdvertisingTrackingId();
            p.i(openAdvertisingTrackingId, "_builder.getOpenAdvertisingTrackingId()");
            return openAdvertisingTrackingId;
        }

        public final ByteString getVendorId() {
            ByteString vendorId = this._builder.getVendorId();
            p.i(vendorId, "_builder.getVendorId()");
            return vendorId;
        }

        public final boolean hasAppsetId() {
            return this._builder.hasAppsetId();
        }

        public final boolean hasFid() {
            return this._builder.hasFid();
        }

        public final void setAdvertisingId(ByteString byteString) {
            p.j(byteString, "value");
            this._builder.setAdvertisingId(byteString);
        }

        public final void setAppsetId(String str) {
            p.j(str, "value");
            this._builder.setAppsetId(str);
        }

        public final void setFid(String str) {
            p.j(str, "value");
            this._builder.setFid(str);
        }

        public final void setOpenAdvertisingTrackingId(ByteString byteString) {
            p.j(byteString, "value");
            this._builder.setOpenAdvertisingTrackingId(byteString);
        }

        public final void setVendorId(ByteString byteString) {
            p.j(byteString, "value");
            this._builder.setVendorId(byteString);
        }
    }

    private PiiKt() {
    }
}
