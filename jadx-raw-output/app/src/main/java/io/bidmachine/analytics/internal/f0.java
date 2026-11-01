package io.bidmachine.analytics.internal;

import java.security.SecureRandom;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0005\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\u000f"}, d2 = {"Lio/bidmachine/analytics/internal/f0;", "", "Ljava/security/SecureRandom;", "b", "()Ljava/security/SecureRandom;", "a", "", "size", "", "(I)[B", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal;", "LOCAL_SECURE_RANDOM", "<init>", "()V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f58826a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final ThreadLocal<SecureRandom> LOCAL_SECURE_RANDOM = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/bidmachine/analytics/internal/f0$a", "Ljava/lang/ThreadLocal;", "Ljava/security/SecureRandom;", "initialValue", "()Ljava/security/SecureRandom;", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class a extends ThreadLocal<SecureRandom> {
        @Override // java.lang.ThreadLocal
        public SecureRandom initialValue() {
            return f0.f58826a.a();
        }
    }

    private f0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    private final SecureRandom b() {
        SecureRandom secureRandom = LOCAL_SECURE_RANDOM.get();
        return secureRandom == null ? a() : secureRandom;
    }

    public final byte[] a(int size) {
        byte[] bArr = new byte[size];
        f58826a.b().nextBytes(bArr);
        return bArr;
    }
}
