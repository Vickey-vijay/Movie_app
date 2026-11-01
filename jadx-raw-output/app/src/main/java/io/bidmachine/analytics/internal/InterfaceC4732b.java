package io.bidmachine.analytics.internal;

import com.ironsource.C3426d4;
import java.security.Key;
import kotlin.Metadata;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lio/bidmachine/analytics/internal/b;", "", "Ljava/security/Key;", C3426d4.i.W, "", "messageBytes", "a", "(Ljava/security/Key;[B)[B", "", "getName", "()Ljava/lang/String;", "name", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public interface InterfaceC4732b {
    byte[] a(Key key, byte[] messageBytes);

    String getName();
}
