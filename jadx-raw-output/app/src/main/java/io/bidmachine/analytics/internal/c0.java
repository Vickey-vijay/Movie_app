package io.bidmachine.analytics.internal;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.BytesValue;
import com.ironsource.C3426d4;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, d2 = {"Lio/bidmachine/analytics/internal/c0;", "Lio/bidmachine/analytics/internal/g0$a;", "Lio/bidmachine/analytics/internal/h0$a;", "rule", "Lcom/explorestack/protobuf/BytesValue;", "a", "(Lio/bidmachine/analytics/internal/h0$a;)Lcom/explorestack/protobuf/BytesValue;", "Lio/bidmachine/analytics/internal/e0;", "Lio/bidmachine/analytics/internal/e0;", C3426d4.a.f28418k, "<init>", "(Lio/bidmachine/analytics/internal/e0;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class c0 implements g0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e0 storage;

    @Override // io.bidmachine.analytics.internal.g0.a
    public BytesValue a(ReaderRecord.Rule rule) throws FileNotFoundException {
        C4744n billingData = this.storage.getBillingData();
        if (billingData == null) {
            throw new FileNotFoundException("No data received yet");
        }
        if (billingData.e()) {
            throw new FileNotFoundException("Empty data");
        }
        return BytesValue.newBuilder().setValue(ByteString.readFrom(new ByteArrayInputStream(billingData.toString().getBytes(lk.c.f63591b)))).build();
    }

    public c0(e0 e0Var) {
        this.storage = e0Var;
    }
}
