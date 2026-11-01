package mf;

import android.content.Context;
import androidx.annotation.NonNull;
import io.bidmachine.Executable;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.mraid.MraidView;
import io.bidmachine.iab.mraid.MraidViewListener;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.utils.UrlHandler;
import io.bidmachine.rendering.view.PrivacySheetDialog;
import io.bidmachine.unified.UnifiedBannerAdCallback;
import io.bidmachine.util.SafeExecutable;
import io.bidmachine.utils.IabUtils;

/* JADX INFO: compiled from: MraidBannerAdListener.java */
/* JADX INFO: loaded from: classes3.dex */
public class f implements MraidViewListener {

    @NonNull
    private final UnifiedBannerAdCallback callback;

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onClose(@NonNull MraidView mraidView) {
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onExpand(@NonNull MraidView mraidView) {
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onPlayVideo(@NonNull MraidView mraidView, @NonNull String str) {
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onCalendarEvent(@NonNull MraidView mraidView, @NonNull String str, @NonNull final IabClickCallback iabClickCallback) {
        this.callback.onAdClicked();
        UrlHandler.openCalendar(mraidView.getContext(), str, new SafeExecutable() { // from class: mf.d
            @Override // io.bidmachine.util.SafeExecutable
            public final void onExecute(Object obj) {
                iabClickCallback.clickHandled();
            }
        });
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onExpired(@NonNull MraidView mraidView, @NonNull IabError iabError) {
        this.callback.onAdExpired();
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onLoadFailed(@NonNull MraidView mraidView, @NonNull IabError iabError) {
        this.callback.onAdLoadFailed(IabUtils.mapError(iabError));
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onLoaded(@NonNull MraidView mraidView) {
        this.callback.onAdLoaded(mraidView);
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onOpenUrl(@NonNull MraidView mraidView, @NonNull String str, @NonNull final IabClickCallback iabClickCallback) {
        this.callback.onAdClicked();
        UrlHandler.openUrl(mraidView.getContext(), str, new SafeExecutable() { // from class: mf.b
            @Override // io.bidmachine.util.SafeExecutable
            public final void onExecute(Object obj) {
                iabClickCallback.clickHandled();
            }
        });
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onShowFailed(@NonNull MraidView mraidView, @NonNull IabError iabError) {
        this.callback.onAdShowFailed(IabUtils.mapError(iabError));
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onShown(@NonNull MraidView mraidView) {
        this.callback.onAdShown();
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onStorePicture(@NonNull MraidView mraidView, @NonNull String str, @NonNull final IabClickCallback iabClickCallback) {
        this.callback.onAdClicked();
        UrlHandler.storePicture(mraidView.getContext(), str, new SafeExecutable() { // from class: mf.e
            @Override // io.bidmachine.util.SafeExecutable
            public final void onExecute(Object obj) {
                iabClickCallback.clickHandled();
            }
        });
    }

    public f(@NonNull UnifiedBannerAdCallback unifiedBannerAdCallback) {
        this.callback = unifiedBannerAdCallback;
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onOpenPrivacySheet(@NonNull MraidView mraidView, @NonNull final PrivacySheetParams privacySheetParams) {
        Utils.ifNotNull(Utils.findDialogContext(mraidView.peekContext(), mraidView), new Executable() { // from class: mf.c
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                PrivacySheetDialog.show((Context) obj, privacySheetParams);
            }
        });
    }
}
