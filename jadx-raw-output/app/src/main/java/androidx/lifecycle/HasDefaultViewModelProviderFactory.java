package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;

/* JADX INFO: compiled from: HasDefaultViewModelProviderFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface HasDefaultViewModelProviderFactory {
    ViewModelProvider.Factory getDefaultViewModelProviderFactory();

    default CreationExtras getDefaultViewModelCreationExtras() {
        return CreationExtras.Empty.INSTANCE;
    }
}
