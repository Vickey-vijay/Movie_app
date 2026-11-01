package rh;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.ImageData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.nativead.NativeAdRequestParameters;
import io.bidmachine.nativead.NativeData;
import io.bidmachine.nativead.NativeMediaPrivateData;
import io.bidmachine.nativead.tasks.DownloadImageTask;
import io.bidmachine.nativead.tasks.DownloadVastVideoTask;
import io.bidmachine.nativead.tasks.DownloadVideoTask;
import io.bidmachine.nativead.utils.NativeNetworkExecutor;
import io.bidmachine.utils.BMError;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: AssetLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    private static final String DIR_NAME = "native_cache_image";
    private final NativeAdRequestParameters adRequestParameters;
    private final AdProcessCallback callback;
    private final NativeData nativeData;
    private final NativeMediaPrivateData nativeMediaData;
    private final List<Runnable> pendingTasks = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: rh.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AssetLoader.java */
    public class C0629a implements DownloadImageTask.OnCacheImageListener {
        public C0629a() {
        }

        @Override // io.bidmachine.nativead.tasks.DownloadImageTask.OnCacheImageListener
        public void onFail(@NonNull DownloadImageTask downloadImageTask) {
            a.this.removePendingTask(downloadImageTask);
        }

        @Override // io.bidmachine.nativead.tasks.DownloadImageTask.OnCacheImageListener
        public void onImageSuccess(@NonNull DownloadImageTask downloadImageTask, Bitmap bitmap) {
            a.this.nativeMediaData.setIconBitmap(bitmap);
            a.this.removePendingTask(downloadImageTask);
        }

        @Override // io.bidmachine.nativead.tasks.DownloadImageTask.OnCacheImageListener
        public void onPathSuccess(@NonNull DownloadImageTask downloadImageTask, Uri uri) {
            a.this.nativeMediaData.setIconUri(uri);
            a.this.removePendingTask(downloadImageTask);
        }
    }

    /* JADX INFO: compiled from: AssetLoader.java */
    public class b implements DownloadImageTask.OnCacheImageListener {
        public b() {
        }

        @Override // io.bidmachine.nativead.tasks.DownloadImageTask.OnCacheImageListener
        public void onFail(@NonNull DownloadImageTask downloadImageTask) {
            a.this.removePendingTask(downloadImageTask);
        }

        @Override // io.bidmachine.nativead.tasks.DownloadImageTask.OnCacheImageListener
        public void onImageSuccess(@NonNull DownloadImageTask downloadImageTask, Bitmap bitmap) {
            a.this.nativeMediaData.setImageBitmap(bitmap);
            a.this.removePendingTask(downloadImageTask);
        }

        @Override // io.bidmachine.nativead.tasks.DownloadImageTask.OnCacheImageListener
        public void onPathSuccess(@NonNull DownloadImageTask downloadImageTask, Uri uri) {
            a.this.nativeMediaData.setImageUri(uri);
            a.this.removePendingTask(downloadImageTask);
        }
    }

    /* JADX INFO: compiled from: AssetLoader.java */
    public class c implements DownloadVideoTask.OnLoadedListener {
        public final /* synthetic */ Context val$context;

        public c(Context context) {
            this.val$context = context;
        }

        @Override // io.bidmachine.nativead.tasks.DownloadVideoTask.OnLoadedListener
        public void onVideoLoaded(@NonNull DownloadVideoTask downloadVideoTask, Uri uri) {
            a.this.nativeMediaData.setVideoUri(uri);
            a.this.retrieveAndSaveImageFrame(this.val$context, uri);
            a.this.removePendingTask(downloadVideoTask);
        }

        @Override // io.bidmachine.nativead.tasks.DownloadVideoTask.OnLoadedListener
        public void onVideoLoadingError(@NonNull DownloadVideoTask downloadVideoTask) {
            a.this.removePendingTask(downloadVideoTask);
        }
    }

    /* JADX INFO: compiled from: AssetLoader.java */
    public class d implements DownloadVastVideoTask.OnLoadedListener {
        public final /* synthetic */ Context val$context;

        public d(Context context) {
            this.val$context = context;
        }

        @Override // io.bidmachine.nativead.tasks.DownloadVastVideoTask.OnLoadedListener
        public void onVideoLoaded(@NonNull DownloadVastVideoTask downloadVastVideoTask, Uri uri, VastRequest vastRequest) {
            a.this.nativeMediaData.setVideoUri(uri);
            a.this.nativeMediaData.setVastRequest(vastRequest);
            a.this.retrieveAndSaveImageFrame(this.val$context, uri);
            a.this.removePendingTask(downloadVastVideoTask);
        }

        @Override // io.bidmachine.nativead.tasks.DownloadVastVideoTask.OnLoadedListener
        public void onVideoLoadingError(@NonNull DownloadVastVideoTask downloadVastVideoTask) {
            a.this.removePendingTask(downloadVastVideoTask);
        }
    }

    private boolean isAssetsValid() {
        try {
            return isIconValid() && isImageValid() && isVideoValid();
        } catch (Exception e10) {
            Logger.w(e10);
            return false;
        }
    }

    private synchronized void notifyNativeCallback() {
        if (!this.adRequestParameters.isValidateAssets() || isAssetsValid()) {
            this.callback.processLoadSuccess();
        } else {
            this.callback.processLoadFail(BMError.internal("Native assets are invalid"));
        }
    }

    private void checkTasksCount() {
        if (this.pendingTasks.isEmpty()) {
            notifyNativeCallback();
        }
    }

    private void createIconTask(@NonNull Context context, @Nullable ImageData imageData) {
        if (imageData != null && imageData.getImage() == null) {
            String remoteUrl = imageData.getRemoteUrl();
            if (TextUtils.isEmpty(remoteUrl)) {
                return;
            }
            this.pendingTasks.add(DownloadImageTask.newBuilder(context, remoteUrl).setOnCacheImageListener(new C0629a()).build());
        }
    }

    private void createImageTask(@NonNull Context context, @Nullable ImageData imageData) {
        if (imageData != null && imageData.getImage() == null) {
            String remoteUrl = imageData.getRemoteUrl();
            if (TextUtils.isEmpty(remoteUrl)) {
                return;
            }
            this.pendingTasks.add(DownloadImageTask.newBuilder(context, remoteUrl).setOnCacheImageListener(new b()).build());
        }
    }

    private boolean isIconValid() {
        return (this.adRequestParameters.containsAssetType(MediaAssetType.Icon) && this.nativeMediaData.getIconUri() == null && this.nativeMediaData.getIconDrawable() == null) ? false : true;
    }

    private boolean isImageValid() {
        return (this.adRequestParameters.containsAssetType(MediaAssetType.Image) && this.nativeMediaData.getImageUri() == null && this.nativeMediaData.getImageDrawable() == null) ? false : true;
    }

    private boolean isVideoValid() {
        if (this.adRequestParameters.containsAssetType(MediaAssetType.Video)) {
            return this.nativeData.hasVideo();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePendingTask(@NonNull Runnable runnable) {
        this.pendingTasks.remove(runnable);
        checkTasksCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void retrieveAndSaveImageFrame(@NonNull Context context, @Nullable Uri uri) {
        ImageData mainImage = this.nativeData.getMainImage();
        if (!TextUtils.isEmpty(mainImage != null ? mainImage.getRemoteUrl() : null) || uri == null || uri.getPath() == null || !new File(uri.getPath()).exists()) {
            return;
        }
        this.nativeMediaData.setImageUri(Uri.parse(Utils.retrieveAndSaveFrame(context, uri, DIR_NAME)));
    }

    private void startDownloadTask(@NonNull Context context) {
        String videoUrl = this.nativeData.getVideoUrl();
        String videoAdm = this.nativeData.getVideoAdm();
        if (this.adRequestParameters.containsAssetType(MediaAssetType.Icon)) {
            createIconTask(context, this.nativeData.getIcon());
        }
        if (this.adRequestParameters.containsAssetType(MediaAssetType.Image)) {
            createImageTask(context, this.nativeData.getMainImage());
        }
        if (this.adRequestParameters.containsAssetType(MediaAssetType.Video)) {
            if (!TextUtils.isEmpty(videoUrl)) {
                createVideoTask(context, videoUrl);
            } else if (!TextUtils.isEmpty(videoAdm)) {
                createVastVideoTask(context, videoAdm);
            }
        }
        if (this.pendingTasks.isEmpty()) {
            checkTasksCount();
            return;
        }
        Iterator<Runnable> it = this.pendingTasks.iterator();
        while (it.hasNext()) {
            NativeNetworkExecutor.getInstance().execute(it.next());
        }
    }

    public a(@NonNull NativeAdRequestParameters nativeAdRequestParameters, @NonNull AdProcessCallback adProcessCallback, @NonNull NativeData nativeData, @NonNull NativeMediaPrivateData nativeMediaPrivateData) {
        this.adRequestParameters = nativeAdRequestParameters;
        this.callback = adProcessCallback;
        this.nativeData = nativeData;
        this.nativeMediaData = nativeMediaPrivateData;
    }

    private void createVastVideoTask(@NonNull Context context, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.pendingTasks.add(new DownloadVastVideoTask(context, new d(context), str));
    }

    private void createVideoTask(@NonNull Context context, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.pendingTasks.add(new DownloadVideoTask(context, new c(context), str));
    }

    public void downloadNativeAdsImages(@NonNull Context context) {
        startDownloadTask(context);
        checkTasksCount();
    }
}
