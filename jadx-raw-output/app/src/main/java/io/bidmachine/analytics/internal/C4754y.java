package io.bidmachine.analytics.internal;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.BytesValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, d2 = {"Lio/bidmachine/analytics/internal/y;", "Lio/bidmachine/analytics/internal/g0$a;", "Lio/bidmachine/analytics/internal/h0$a;", "rule", "Lcom/explorestack/protobuf/BytesValue;", "a", "(Lio/bidmachine/analytics/internal/h0$a;)Lcom/explorestack/protobuf/BytesValue;", "Ljava/io/File;", "Ljava/io/File;", "appRootDir", "<init>", "(Ljava/io/File;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class C4754y implements g0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final File appRootDir;

    public C4754y(File file) {
        this.appRootDir = file;
    }

    @Override // io.bidmachine.analytics.internal.g0.a
    public BytesValue a(ReaderRecord.Rule rule) throws IOException {
        BytesValue.Builder builderNewBuilder = BytesValue.newBuilder();
        FileInputStream fileInputStream = new FileInputStream(new File(this.appRootDir, s0.b(rule.getPath())));
        try {
            ByteString from = ByteString.readFrom(fileInputStream);
            yj.b.a(fileInputStream, null);
            return builderNewBuilder.setValue(from).build();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                yj.b.a(fileInputStream, th2);
                throw th3;
            }
        }
    }
}
