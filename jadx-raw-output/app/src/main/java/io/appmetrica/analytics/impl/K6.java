package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@DoNotInline
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lio/appmetrica/analytics/impl/K6;", "Lio/appmetrica/analytics/impl/J6;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "", "simpleName", "Ljava/io/File;", "a", "Lio/appmetrica/analytics/impl/Kg;", "Lio/appmetrica/analytics/impl/Kg;", "relativePathFormer", "<init>", "(Lio/appmetrica/analytics/impl/Kg;)V", "analytics_binaryProdRelease"}, k = 1, mv = {1, 6, 0})
public final class K6 implements J6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Kg relativePathFormer;

    @Override // io.appmetrica.analytics.impl.J6
    public File a(Context context, String simpleName) {
        return new File(context.getNoBackupFilesDir(), this.relativePathFormer.a(simpleName));
    }

    public K6(Kg kg2) {
        this.relativePathFormer = kg2;
    }
}
