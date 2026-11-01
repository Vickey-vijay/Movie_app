package io.bidmachine.util.network;

import android.content.Context;
import android.net.Uri;
import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.util.file.FileUtilsKt;
import java.io.File;
import java.net.URLConnection;
import kotlin.Metadata;

/* JADX INFO: compiled from: FileUriResponseProcessor.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/bidmachine/util/network/FileUriResponseProcessor;", "Lio/bidmachine/util/network/ResponseProcessor;", "Landroid/net/Uri;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", C3426d4.i.f28530b, "Ljava/io/File;", "tempDir", "(Landroid/content/Context;Ljava/io/File;Ljava/io/File;)V", "fileResponseProcessor", "Lio/bidmachine/util/network/FileResponseProcessor;", "process", "urlConnection", "Ljava/net/URLConnection;", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FileUriResponseProcessor implements ResponseProcessor<Uri> {
    private final FileResponseProcessor fileResponseProcessor;

    public FileUriResponseProcessor(Context context, File file, File file2) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(file, C3426d4.i.f28530b);
        this.fileResponseProcessor = new FileResponseProcessor(context, file, file2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.util.network.ResponseProcessor
    public Uri process(URLConnection urlConnection) throws Throwable {
        p.j(urlConnection, "urlConnection");
        return FileUtilsKt.toUri(this.fileResponseProcessor.process(urlConnection));
    }

    public /* synthetic */ FileUriResponseProcessor(Context context, File file, File file2, int i10, i iVar) {
        this(context, file, (i10 & 4) != 0 ? null : file2);
    }
}
