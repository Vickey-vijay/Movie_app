package yads;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class a93 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a93 f75439b = new a93();

    public a93() {
        super(0);
    }

    @Override // bk.a
    public final Object invoke() {
        try {
            return CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
        } catch (CertificateException unused) {
            return null;
        }
    }
}
