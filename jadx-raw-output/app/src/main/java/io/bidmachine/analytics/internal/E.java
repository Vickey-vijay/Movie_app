package io.bidmachine.analytics.internal;

import com.explorestack.protobuf.BytesValue;
import com.ironsource.C3426d4;
import io.bidmachine.protobuf.sdk.OSLog;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lio/bidmachine/analytics/internal/E;", "Lio/bidmachine/analytics/internal/g0$a;", "Lio/bidmachine/analytics/internal/h0$a;", "rule", "Lcom/explorestack/protobuf/BytesValue;", "a", "(Lio/bidmachine/analytics/internal/h0$a;)Lcom/explorestack/protobuf/BytesValue;", "Lio/bidmachine/analytics/internal/J;", "Lio/bidmachine/analytics/internal/J;", C3426d4.a.f28418k, "Lio/bidmachine/analytics/internal/F;", "b", "Lio/bidmachine/analytics/internal/F;", "lineExtractor", "<init>", "(Lio/bidmachine/analytics/internal/J;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class E implements g0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final J storage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final F lineExtractor = new F();

    @Override // io.bidmachine.analytics.internal.g0.a
    public BytesValue a(ReaderRecord.Rule rule) throws IOException {
        ArrayList arrayList = new ArrayList();
        InputStream inputStreamA = this.storage.a(rule.getPath());
        if (inputStreamA != null) {
            Reader inputStreamReader = new InputStreamReader(inputStreamA, lk.c.f63591b);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                Iterator<String> it = yj.k.d(bufferedReader).iterator();
                while (it.hasNext()) {
                    F.b bVarA = this.lineExtractor.a(it.next());
                    if (bVarA != null) {
                        arrayList.add(OSLog.Record.newBuilder().setTimestamp(b0.a(bVarA.getTimestamp())).setTag(bVarA.getTag()).setLevel(bVarA.getCom.applovin.sdk.AppLovinEventTypes.USER_COMPLETED_LEVEL java.lang.String()).setMessage(bVarA.getMessage()).setSource("").build());
                    }
                }
                mj.r rVar = mj.r.f64562a;
                yj.b.a(bufferedReader, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    yj.b.a(bufferedReader, th2);
                    throw th3;
                }
            }
        }
        if (arrayList.isEmpty()) {
            throw new FileNotFoundException("No records found");
        }
        return BytesValue.newBuilder().setValue(OSLog.newBuilder().addAllRecords(arrayList).build().toByteString()).build();
    }

    public E(J j10) {
        this.storage = j10;
    }
}
