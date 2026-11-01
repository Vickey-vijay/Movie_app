package yads;

import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.HttpDataSource;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes8.dex */
public final class mu2 implements DataSource.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SSLSocketFactory f80397b;

    @Override // androidx.media3.datasource.DataSource.Factory
    public final DataSource createDataSource() {
        return new ju2(this.f80396a, 8000, 8000, false, new HttpDataSource.RequestProperties(), this.f80397b);
    }

    public mu2(String str, SSLSocketFactory sSLSocketFactory) {
        this.f80396a = str;
        this.f80397b = sSLSocketFactory;
    }
}
