package gatewayprotocol.v1;

import ck.i;
import ck.p;
import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: TransactionDataKt.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class TransactionDataKt {
    public static final TransactionDataKt INSTANCE = new TransactionDataKt();

    /* JADX INFO: compiled from: TransactionDataKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TransactionEventRequestOuterClass.TransactionData.Builder _builder;

        /* JADX INFO: compiled from: TransactionDataKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionData _build() {
            TransactionEventRequestOuterClass.TransactionData transactionDataBuild = this._builder.build();
            p.i(transactionDataBuild, "_builder.build()");
            return transactionDataBuild;
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearJwsRepresentation() {
            this._builder.clearJwsRepresentation();
        }

        public final void clearProduct() {
            this._builder.clearProduct();
        }

        public final void clearProductId() {
            this._builder.clearProductId();
        }

        public final void clearReceipt() {
            this._builder.clearReceipt();
        }

        public final void clearSignature() {
            this._builder.clearSignature();
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final void clearTransaction() {
            this._builder.clearTransaction();
        }

        public final void clearTransactionId() {
            this._builder.clearTransactionId();
        }

        public final void clearTransactionState() {
            this._builder.clearTransactionState();
        }

        public final ByteString getEventId() {
            ByteString eventId = this._builder.getEventId();
            p.i(eventId, "_builder.getEventId()");
            return eventId;
        }

        public final String getJwsRepresentation() {
            String jwsRepresentation = this._builder.getJwsRepresentation();
            p.i(jwsRepresentation, "_builder.getJwsRepresentation()");
            return jwsRepresentation;
        }

        public final String getProduct() {
            String product = this._builder.getProduct();
            p.i(product, "_builder.getProduct()");
            return product;
        }

        public final String getProductId() {
            String productId = this._builder.getProductId();
            p.i(productId, "_builder.getProductId()");
            return productId;
        }

        public final String getReceipt() {
            String receipt = this._builder.getReceipt();
            p.i(receipt, "_builder.getReceipt()");
            return receipt;
        }

        public final String getSignature() {
            String signature = this._builder.getSignature();
            p.i(signature, "_builder.getSignature()");
            return signature;
        }

        public final Timestamp getTimestamp() {
            Timestamp timestamp = this._builder.getTimestamp();
            p.i(timestamp, "_builder.getTimestamp()");
            return timestamp;
        }

        public final String getTransaction() {
            String transaction = this._builder.getTransaction();
            p.i(transaction, "_builder.getTransaction()");
            return transaction;
        }

        public final String getTransactionId() {
            String transactionId = this._builder.getTransactionId();
            p.i(transactionId, "_builder.getTransactionId()");
            return transactionId;
        }

        public final TransactionEventRequestOuterClass.TransactionState getTransactionState() {
            TransactionEventRequestOuterClass.TransactionState transactionState = this._builder.getTransactionState();
            p.i(transactionState, "_builder.getTransactionState()");
            return transactionState;
        }

        public final int getTransactionStateValue() {
            return this._builder.getTransactionStateValue();
        }

        public final boolean hasJwsRepresentation() {
            return this._builder.hasJwsRepresentation();
        }

        public final boolean hasReceipt() {
            return this._builder.hasReceipt();
        }

        public final boolean hasSignature() {
            return this._builder.hasSignature();
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        public final void setEventId(ByteString byteString) {
            p.j(byteString, "value");
            this._builder.setEventId(byteString);
        }

        public final void setJwsRepresentation(String str) {
            p.j(str, "value");
            this._builder.setJwsRepresentation(str);
        }

        public final void setProduct(String str) {
            p.j(str, "value");
            this._builder.setProduct(str);
        }

        public final void setProductId(String str) {
            p.j(str, "value");
            this._builder.setProductId(str);
        }

        public final void setReceipt(String str) {
            p.j(str, "value");
            this._builder.setReceipt(str);
        }

        public final void setSignature(String str) {
            p.j(str, "value");
            this._builder.setSignature(str);
        }

        public final void setTimestamp(Timestamp timestamp) {
            p.j(timestamp, "value");
            this._builder.setTimestamp(timestamp);
        }

        public final void setTransaction(String str) {
            p.j(str, "value");
            this._builder.setTransaction(str);
        }

        public final void setTransactionId(String str) {
            p.j(str, "value");
            this._builder.setTransactionId(str);
        }

        public final void setTransactionState(TransactionEventRequestOuterClass.TransactionState transactionState) {
            p.j(transactionState, "value");
            this._builder.setTransactionState(transactionState);
        }

        public final void setTransactionStateValue(int i10) {
            this._builder.setTransactionStateValue(i10);
        }
    }

    private TransactionDataKt() {
    }
}
