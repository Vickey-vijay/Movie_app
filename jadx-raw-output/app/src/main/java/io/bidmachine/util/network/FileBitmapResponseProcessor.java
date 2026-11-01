package io.bidmachine.util.network;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.util.ImageUtilsKt;
import java.io.File;
import java.net.URLConnection;
import kotlin.Metadata;

/* JADX INFO: compiled from: FileBitmapResponseProcessor.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/bidmachine/util/network/FileBitmapResponseProcessor;", "Lio/bidmachine/util/network/ResponseProcessor;", "Landroid/graphics/Bitmap;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", C3426d4.i.f28530b, "Ljava/io/File;", "tempDir", "bitmapFactoryOptions", "Landroid/graphics/BitmapFactory$Options;", "(Landroid/content/Context;Ljava/io/File;Ljava/io/File;Landroid/graphics/BitmapFactory$Options;)V", "fileResponseProcessor", "Lio/bidmachine/util/network/FileResponseProcessor;", "process", "urlConnection", "Ljava/net/URLConnection;", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FileBitmapResponseProcessor implements ResponseProcessor<Bitmap> {
    private final BitmapFactory.Options bitmapFactoryOptions;
    private final FileResponseProcessor fileResponseProcessor;

    public FileBitmapResponseProcessor(Context context, File file, File file2, BitmapFactory.Options options) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(file, C3426d4.i.f28530b);
        p.j(options, "bitmapFactoryOptions");
        this.bitmapFactoryOptions = options;
        this.fileResponseProcessor = new FileResponseProcessor(context, file, file2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.util.network.ResponseProcessor
    public Bitmap process(URLConnection urlConnection) throws Throwable {
        p.j(urlConnection, "urlConnection");
        return ImageUtilsKt.decodeToBitmap(this.fileResponseProcessor.process(urlConnection), this.bitmapFactoryOptions);
    }

    public /* synthetic */ FileBitmapResponseProcessor(Context context, File file, File file2, BitmapFactory.Options options, int i10, i iVar) {
        this(context, file, (i10 & 4) != 0 ? null : file2, options);
    }
}
