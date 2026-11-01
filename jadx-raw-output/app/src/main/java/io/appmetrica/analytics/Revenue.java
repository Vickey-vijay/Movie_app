package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.C4115ce;
import io.appmetrica.analytics.impl.Fn;
import java.util.Currency;

/* JADX INFO: loaded from: classes7.dex */
public class Revenue {

    @NonNull
    public final Currency currency;

    @Nullable
    public final String payload;
    public final long priceMicros;

    @Nullable
    public final String productID;

    @Nullable
    public final Integer quantity;

    @Nullable
    public final Receipt receipt;

    public static class Builder {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Fn f54391g = new Fn(new C4115ce("revenue currency"));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f54392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Currency f54393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f54394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f54395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f54396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Receipt f54397f;

        public /* synthetic */ Builder(long j10, Currency currency, int i10) {
            this(j10, currency);
        }

        private Builder(long j10, Currency currency) {
            f54391g.a(currency);
            this.f54392a = j10;
            this.f54393b = currency;
        }

        @NonNull
        public Revenue build() {
            return new Revenue(this, 0);
        }

        @NonNull
        public Builder withPayload(@Nullable String str) {
            this.f54396e = str;
            return this;
        }

        @NonNull
        public Builder withProductID(@Nullable String str) {
            this.f54395d = str;
            return this;
        }

        @NonNull
        public Builder withQuantity(@Nullable Integer num) {
            this.f54394c = num;
            return this;
        }

        @NonNull
        public Builder withReceipt(@Nullable Receipt receipt) {
            this.f54397f = receipt;
            return this;
        }
    }

    public static class Receipt {

        @Nullable
        public final String data;

        @Nullable
        public final String signature;

        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f54398a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f54399b;

            public /* synthetic */ Builder(int i10) {
                this();
            }

            private Builder() {
            }

            @NonNull
            public Receipt build() {
                return new Receipt(this, 0);
            }

            @NonNull
            public Builder withData(@Nullable String str) {
                this.f54398a = str;
                return this;
            }

            @NonNull
            public Builder withSignature(@Nullable String str) {
                this.f54399b = str;
                return this;
            }
        }

        public /* synthetic */ Receipt(Builder builder, int i10) {
            this(builder);
        }

        private Receipt(Builder builder) {
            this.data = builder.f54398a;
            this.signature = builder.f54399b;
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(0);
        }
    }

    public /* synthetic */ Revenue(Builder builder, int i10) {
        this(builder);
    }

    private Revenue(Builder builder) {
        this.priceMicros = builder.f54392a;
        this.currency = builder.f54393b;
        this.quantity = builder.f54394c;
        this.productID = builder.f54395d;
        this.payload = builder.f54396e;
        this.receipt = builder.f54397f;
    }

    @NonNull
    public static Builder newBuilder(long j10, @NonNull Currency currency) {
        return new Builder(j10, currency, 0);
    }
}
