package androidx.media3.datasource;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BitmapLoader;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.Suppliers;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import m5.p;
import q5.i;
import q5.k;

/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public final class DataSourceBitmapLoader implements BitmapLoader {
    public static final p<k> DEFAULT_EXECUTOR_SERVICE = Suppliers.a(new p() { // from class: androidx.media3.datasource.c
        @Override // m5.p
        public final Object get() {
            return DataSourceBitmapLoader.lambda$static$0();
        }
    });
    private final DataSource.Factory dataSourceFactory;
    private final k listeningExecutorService;

    @Nullable
    private final BitmapFactory.Options options;

    public DataSourceBitmapLoader(Context context) {
        this((k) Assertions.checkStateNotNull(DEFAULT_EXECUTOR_SERVICE.get()), new DefaultDataSource.Factory(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap lambda$decodeBitmap$1(byte[] bArr) throws Exception {
        return BitmapUtil.decode(bArr, bArr.length, this.options);
    }

    public DataSourceBitmapLoader(k kVar, DataSource.Factory factory) {
        this(kVar, factory, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap lambda$loadBitmap$2(Uri uri) throws Exception {
        return load(this.dataSourceFactory.createDataSource(), uri, this.options);
    }

    private static Bitmap load(DataSource dataSource, Uri uri, @Nullable BitmapFactory.Options options) throws IOException {
        try {
            dataSource.open(new DataSpec(uri));
            byte[] toEnd = DataSourceUtil.readToEnd(dataSource);
            return BitmapUtil.decode(toEnd, toEnd.length, options);
        } finally {
            dataSource.close();
        }
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public i<Bitmap> decodeBitmap(final byte[] bArr) {
        return this.listeningExecutorService.submit(new Callable() { // from class: androidx.media3.datasource.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4071b.lambda$decodeBitmap$1(bArr);
            }
        });
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public i<Bitmap> loadBitmap(final Uri uri) {
        return this.listeningExecutorService.submit(new Callable() { // from class: androidx.media3.datasource.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4074b.lambda$loadBitmap$2(uri);
            }
        });
    }

    public DataSourceBitmapLoader(k kVar, DataSource.Factory factory, @Nullable BitmapFactory.Options options) {
        this.listeningExecutorService = kVar;
        this.dataSourceFactory = factory;
        this.options = options;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k lambda$static$0() {
        return com.google.common.util.concurrent.c.b(Executors.newSingleThreadExecutor());
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public boolean supportsMimeType(String str) {
        return Util.isBitmapFactorySupportedMimeType(str);
    }
}
